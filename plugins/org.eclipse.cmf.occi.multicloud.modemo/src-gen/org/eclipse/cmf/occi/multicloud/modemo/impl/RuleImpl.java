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
package org.eclipse.cmf.occi.multicloud.modemo.impl;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.cmf.occi.core.Resource;

import org.eclipse.cmf.occi.core.impl.LinkImpl;

import org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage;
import org.eclipse.cmf.occi.multicloud.modemo.ModemoTables;
import org.eclipse.cmf.occi.multicloud.modemo.OperatorType;
import org.eclipse.cmf.occi.multicloud.modemo.Rule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.impl.RuleImpl#getRuleOperator <em>Rule Operator</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.impl.RuleImpl#getRuleThreshold <em>Rule Threshold</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.impl.RuleImpl#getRulePeriod <em>Rule Period</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.impl.RuleImpl#getRuleConsecutive <em>Rule Consecutive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends LinkImpl implements Rule {
	/**
	 * The default value of the '{@link #getRuleOperator() <em>Rule Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleOperator()
	 * @generated
	 * @ordered
	 */
	protected static final OperatorType RULE_OPERATOR_EDEFAULT = OperatorType.GREATER_THAN;

	/**
	 * The cached value of the '{@link #getRuleOperator() <em>Rule Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleOperator()
	 * @generated
	 * @ordered
	 */
	protected OperatorType ruleOperator = RULE_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuleThreshold() <em>Rule Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Float RULE_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuleThreshold() <em>Rule Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleThreshold()
	 * @generated
	 * @ordered
	 */
	protected Float ruleThreshold = RULE_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRulePeriod() <em>Rule Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int RULE_PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRulePeriod() <em>Rule Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePeriod()
	 * @generated
	 * @ordered
	 */
	protected int rulePeriod = RULE_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuleConsecutive() <em>Rule Consecutive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleConsecutive()
	 * @generated
	 * @ordered
	 */
	protected static final int RULE_CONSECUTIVE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRuleConsecutive() <em>Rule Consecutive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleConsecutive()
	 * @generated
	 * @ordered
	 */
	protected int ruleConsecutive = RULE_CONSECUTIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModemoPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorType getRuleOperator() {
		return ruleOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleOperator(OperatorType newRuleOperator) {
		OperatorType oldRuleOperator = ruleOperator;
		ruleOperator = newRuleOperator == null ? RULE_OPERATOR_EDEFAULT : newRuleOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModemoPackage.RULE__RULE_OPERATOR, oldRuleOperator, ruleOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getRuleThreshold() {
		return ruleThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleThreshold(Float newRuleThreshold) {
		Float oldRuleThreshold = ruleThreshold;
		ruleThreshold = newRuleThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModemoPackage.RULE__RULE_THRESHOLD, oldRuleThreshold, ruleThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRulePeriod() {
		return rulePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRulePeriod(int newRulePeriod) {
		int oldRulePeriod = rulePeriod;
		rulePeriod = newRulePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModemoPackage.RULE__RULE_PERIOD, oldRulePeriod, rulePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRuleConsecutive() {
		return ruleConsecutive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleConsecutive(int newRuleConsecutive) {
		int oldRuleConsecutive = ruleConsecutive;
		ruleConsecutive = newRuleConsecutive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModemoPackage.RULE__RULE_CONSECUTIVE, oldRuleConsecutive, ruleConsecutive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean sourceConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv sourceConstraint:
		 *   let severity : Integer[1] = 'Rule::sourceConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.source.oclIsKindOf(Elasticitycontroller)
		 *       in
		 *         'Rule::sourceConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ModemoTables.STR_Rule_c_c_sourceConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ModemoTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_modemo_c_c_Elasticitycontroller_0 = idResolver.getClass(ModemoTables.CLSSid_Elasticitycontroller, null);
			final /*@NonInvalid*/ Resource source = this.getSource();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, source, TYP_modemo_c_c_Elasticitycontroller_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ModemoTables.STR_Rule_c_c_sourceConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ModemoTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean targetConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv targetConstraint:
		 *   let severity : Integer[1] = 'Rule::targetConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.target.oclIsKindOf(Actiontrigger)
		 *       in
		 *         'Rule::targetConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ModemoTables.STR_Rule_c_c_targetConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ModemoTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_modemo_c_c_Actiontrigger = idResolver.getClass(ModemoTables.CLSSid_Actiontrigger, null);
			final /*@NonInvalid*/ Resource target = this.getTarget();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, target, TYP_modemo_c_c_Actiontrigger).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ModemoTables.STR_Rule_c_c_targetConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ModemoTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModemoPackage.RULE__RULE_OPERATOR:
				return getRuleOperator();
			case ModemoPackage.RULE__RULE_THRESHOLD:
				return getRuleThreshold();
			case ModemoPackage.RULE__RULE_PERIOD:
				return getRulePeriod();
			case ModemoPackage.RULE__RULE_CONSECUTIVE:
				return getRuleConsecutive();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModemoPackage.RULE__RULE_OPERATOR:
				setRuleOperator((OperatorType)newValue);
				return;
			case ModemoPackage.RULE__RULE_THRESHOLD:
				setRuleThreshold((Float)newValue);
				return;
			case ModemoPackage.RULE__RULE_PERIOD:
				setRulePeriod((Integer)newValue);
				return;
			case ModemoPackage.RULE__RULE_CONSECUTIVE:
				setRuleConsecutive((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModemoPackage.RULE__RULE_OPERATOR:
				setRuleOperator(RULE_OPERATOR_EDEFAULT);
				return;
			case ModemoPackage.RULE__RULE_THRESHOLD:
				setRuleThreshold(RULE_THRESHOLD_EDEFAULT);
				return;
			case ModemoPackage.RULE__RULE_PERIOD:
				setRulePeriod(RULE_PERIOD_EDEFAULT);
				return;
			case ModemoPackage.RULE__RULE_CONSECUTIVE:
				setRuleConsecutive(RULE_CONSECUTIVE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModemoPackage.RULE__RULE_OPERATOR:
				return ruleOperator != RULE_OPERATOR_EDEFAULT;
			case ModemoPackage.RULE__RULE_THRESHOLD:
				return RULE_THRESHOLD_EDEFAULT == null ? ruleThreshold != null : !RULE_THRESHOLD_EDEFAULT.equals(ruleThreshold);
			case ModemoPackage.RULE__RULE_PERIOD:
				return rulePeriod != RULE_PERIOD_EDEFAULT;
			case ModemoPackage.RULE__RULE_CONSECUTIVE:
				return ruleConsecutive != RULE_CONSECUTIVE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModemoPackage.RULE___SOURCE_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return sourceConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ModemoPackage.RULE___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return targetConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ruleOperator: ");
		result.append(ruleOperator);
		result.append(", ruleThreshold: ");
		result.append(ruleThreshold);
		result.append(", rulePeriod: ");
		result.append(rulePeriod);
		result.append(", ruleConsecutive: ");
		result.append(ruleConsecutive);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
