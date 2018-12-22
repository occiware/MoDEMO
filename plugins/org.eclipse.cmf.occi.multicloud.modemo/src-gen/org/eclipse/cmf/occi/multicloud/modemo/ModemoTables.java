/*******************************************************************************
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
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.eclipse.cmf.occi.multicloud.modemo/model/modemo.ecore
 * using:
 *   /org.eclipse.cmf.occi.multicloud.modemo/model/modemo.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.multicloud.modemo;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.multicloud.modemo.ModemoTables;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;

/**
 * ModemoTables provides the dispatch tables for the modemo for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class ModemoTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ModemoPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://org.eclipse.cmf.occi.multicloud.modemo/ecore", null, org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/infrastructure/ecore", null, org.eclipse.cmf.occi.infrastructure.InfrastructurePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Actiontrigger = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Actiontrigger", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Allocationpolicy = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Allocationpolicy", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Array = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Array", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ArrofRecStep = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("ArrofRecStep", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Compute = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Compute", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Creation = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Creation", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Elasticitycontroller = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Elasticitycontroller", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Elasticlink = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Elasticlink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Horizontalgroup = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Horizontalgroup", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Instancegrouplink = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Instancegrouplink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Loadbalancer = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Loadbalancer", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Loadbalancerlink = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Loadbalancerlink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Loadbalancerpolicy = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Loadbalancerpolicy", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Metric = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Metric", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Migrationpolicy = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Migrationpolicy", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Provider = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Provider", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Providerinstancelink = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Providerinstancelink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Providerlink = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Providerlink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_RecurrenceStep = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("RecurrenceStep", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Recurringschedulingpolicy = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Recurringschedulingpolicy", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Rule = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Rule", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Scalingpolicy = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Scalingpolicy", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Schedulingpolicy = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Schedulingpolicy", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Sourcemigrationpolicy = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Sourcemigrationpolicy", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Step = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Step", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Steplink = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Steplink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Swappingpolicy = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Swappingpolicy", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Targetmigrationpolicy = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getClassId("Targetmigrationpolicy", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Date = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getDataTypeId("Date", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EInt = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Float = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getDataTypeId("Float", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_ActionOperation = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getEnumerationId("ActionOperation");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_ActionType = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getEnumerationId("ActionType");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_MetricTargetTracking = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getEnumerationId("MetricTargetTracking");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_OperatorType = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getEnumerationId("OperatorType");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_Unit = org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_modemo_s_ecore.getEnumerationId("Unit");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Allocationpolicy_c_c_appliesConstraint = "Allocationpolicy::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Creation_c_c_appliesConstraint = "Creation::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Elasticlink_c_c_sourceConstraint = "Elasticlink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Elasticlink_c_c_targetConstraint = "Elasticlink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Instancegrouplink_c_c_sourceConstraint = "Instancegrouplink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Instancegrouplink_c_c_targetConstraint = "Instancegrouplink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Loadbalancerlink_c_c_sourceConstraint = "Loadbalancerlink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Loadbalancerlink_c_c_targetConstraint = "Loadbalancerlink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Loadbalancerpolicy_c_c_appliesConstraint = "Loadbalancerpolicy::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Metric_c_c_appliesConstraint = "Metric::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Migrationpolicy_c_c_appliesConstraint = "Migrationpolicy::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Providerinstancelink_c_c_sourceConstraint = "Providerinstancelink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Providerinstancelink_c_c_targetConstraint = "Providerinstancelink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Providerlink_c_c_sourceConstraint = "Providerlink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Providerlink_c_c_targetConstraint = "Providerlink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Rule_c_c_sourceConstraint = "Rule::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Rule_c_c_targetConstraint = "Rule::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Scalingpolicy_c_c_appliesConstraint = "Scalingpolicy::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Schedulingpolicy_c_c_appliesConstraint = "Schedulingpolicy::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Sourcemigrationpolicy_c_c_appliesConstraint = "Sourcemigrationpolicy::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Steplink_c_c_sourceConstraint = "Steplink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Steplink_c_c_targetConstraint = "Steplink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Swappingpolicy_c_c_appliesConstraint = "Swappingpolicy::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Targetmigrationpolicy_c_c_appliesConstraint = "Targetmigrationpolicy::appliesConstraint";
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_RecurrenceStep = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.CLSSid_RecurrenceStep);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_DATAid_EInt = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.cmf.occi.multicloud.modemo.ModemoTables.DATAid_EInt);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ModemoTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModemoTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorEnumeration _ActionOperation = new EcoreExecutorEnumeration(ModemoPackage.Literals.ACTION_OPERATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _ActionType = new EcoreExecutorEnumeration(ModemoPackage.Literals.ACTION_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Actiontrigger = new EcoreExecutorType(ModemoPackage.Literals.ACTIONTRIGGER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Allocationpolicy = new EcoreExecutorType(ModemoPackage.Literals.ALLOCATIONPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Amazonprovider = new EcoreExecutorType(ModemoPackage.Literals.AMAZONPROVIDER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Array = new EcoreExecutorType(ModemoPackage.Literals.ARRAY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ArrofRecStep = new EcoreExecutorType(ModemoPackage.Literals.ARROF_REC_STEP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Availableresources = new EcoreExecutorType(ModemoPackage.Literals.AVAILABLERESOURCES, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Availableresourcesorload = new EcoreExecutorType(ModemoPackage.Literals.AVAILABLERESOURCESORLOAD, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Azureprovider = new EcoreExecutorType(ModemoPackage.Literals.AZUREPROVIDER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Cost = new EcoreExecutorType(ModemoPackage.Literals.COST, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Cpuutilisation = new EcoreExecutorType(ModemoPackage.Literals.CPUUTILISATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Creation = new EcoreExecutorType(ModemoPackage.Literals.CREATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Date = new EcoreExecutorType("Date", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Dynamicadjustmentscalingpolicy = new EcoreExecutorType(ModemoPackage.Literals.DYNAMICADJUSTMENTSCALINGPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Dynamicmigrationpolicy = new EcoreExecutorType(ModemoPackage.Literals.DYNAMICMIGRATIONPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Dynamicscalingpolicy = new EcoreExecutorType(ModemoPackage.Literals.DYNAMICSCALINGPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Elasticitycontroller = new EcoreExecutorType(ModemoPackage.Literals.ELASTICITYCONTROLLER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Elasticlink = new EcoreExecutorType(ModemoPackage.Literals.ELASTICLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _First = new EcoreExecutorType(ModemoPackage.Literals.FIRST, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Float = new EcoreExecutorType("Float", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Horizontalgroup = new EcoreExecutorType(ModemoPackage.Literals.HORIZONTALGROUP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Instancegrouplink = new EcoreExecutorType(ModemoPackage.Literals.INSTANCEGROUPLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Leastconn = new EcoreExecutorType(ModemoPackage.Literals.LEASTCONN, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Leastlatency = new EcoreExecutorType(ModemoPackage.Literals.LEASTLATENCY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Leasttraffic = new EcoreExecutorType(ModemoPackage.Literals.LEASTTRAFFIC, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Livemigration = new EcoreExecutorType(ModemoPackage.Literals.LIVEMIGRATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Loadbalancer = new EcoreExecutorType(ModemoPackage.Literals.LOADBALANCER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Loadbalancerlink = new EcoreExecutorType(ModemoPackage.Literals.LOADBALANCERLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Loadbalancerpolicy = new EcoreExecutorType(ModemoPackage.Literals.LOADBALANCERPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Loadvolume = new EcoreExecutorType(ModemoPackage.Literals.LOADVOLUME, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Manualmigrationpolicy = new EcoreExecutorType(ModemoPackage.Literals.MANUALMIGRATIONPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Manualscalingpolicy = new EcoreExecutorType(ModemoPackage.Literals.MANUALSCALINGPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Manualtargetselection = new EcoreExecutorType(ModemoPackage.Literals.MANUALTARGETSELECTION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Memoryutilisation = new EcoreExecutorType(ModemoPackage.Literals.MEMORYUTILISATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Metric = new EcoreExecutorType(ModemoPackage.Literals.METRIC, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _MetricTargetTracking = new EcoreExecutorEnumeration(ModemoPackage.Literals.METRIC_TARGET_TRACKING, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Migrationpolicy = new EcoreExecutorType(ModemoPackage.Literals.MIGRATIONPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Nonlivemigration = new EcoreExecutorType(ModemoPackage.Literals.NONLIVEMIGRATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Openstackprovider = new EcoreExecutorType(ModemoPackage.Literals.OPENSTACKPROVIDER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _OperatorType = new EcoreExecutorEnumeration(ModemoPackage.Literals.OPERATOR_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Power = new EcoreExecutorType(ModemoPackage.Literals.POWER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Provider = new EcoreExecutorType(ModemoPackage.Literals.PROVIDER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Providerinstancelink = new EcoreExecutorType(ModemoPackage.Literals.PROVIDERINSTANCELINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Providerlink = new EcoreExecutorType(ModemoPackage.Literals.PROVIDERLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _RecurrenceStep = new EcoreExecutorType(ModemoPackage.Literals.RECURRENCE_STEP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Recurringschedulingpolicy = new EcoreExecutorType(ModemoPackage.Literals.RECURRINGSCHEDULINGPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Responsetime = new EcoreExecutorType(ModemoPackage.Literals.RESPONSETIME, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Responsetimemetric = new EcoreExecutorType(ModemoPackage.Literals.RESPONSETIMEMETRIC, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Roundrobin = new EcoreExecutorType(ModemoPackage.Literals.ROUNDROBIN, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Roundrobinalgo = new EcoreExecutorType(ModemoPackage.Literals.ROUNDROBINALGO, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Rule = new EcoreExecutorType(ModemoPackage.Literals.RULE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Scalingpolicy = new EcoreExecutorType(ModemoPackage.Literals.SCALINGPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Schedulingpolicy = new EcoreExecutorType(ModemoPackage.Literals.SCHEDULINGPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Simpledynamicscalingpolicy = new EcoreExecutorType(ModemoPackage.Literals.SIMPLEDYNAMICSCALINGPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Source = new EcoreExecutorType(ModemoPackage.Literals.SOURCE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Sourcemigrationpolicy = new EcoreExecutorType(ModemoPackage.Literals.SOURCEMIGRATIONPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Step = new EcoreExecutorType(ModemoPackage.Literals.STEP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Stepdynamicscalingpolicy = new EcoreExecutorType(ModemoPackage.Literals.STEPDYNAMICSCALINGPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Steplink = new EcoreExecutorType(ModemoPackage.Literals.STEPLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Swappingpolicy = new EcoreExecutorType(ModemoPackage.Literals.SWAPPINGPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Targetmigrationpolicy = new EcoreExecutorType(ModemoPackage.Literals.TARGETMIGRATIONPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Targetresponsetime = new EcoreExecutorType(ModemoPackage.Literals.TARGETRESPONSETIME, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Uniqueschedulingpolicy = new EcoreExecutorType(ModemoPackage.Literals.UNIQUESCHEDULINGPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _Unit = new EcoreExecutorEnumeration(ModemoPackage.Literals.UNIT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Vmwareprovider = new EcoreExecutorType(ModemoPackage.Literals.VMWAREPROVIDER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Wstaticrr = new EcoreExecutorType(ModemoPackage.Literals.WSTATICRR, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_ActionOperation,
			_ActionType,
			_Actiontrigger,
			_Allocationpolicy,
			_Amazonprovider,
			_Array,
			_ArrofRecStep,
			_Availableresources,
			_Availableresourcesorload,
			_Azureprovider,
			_Cost,
			_Cpuutilisation,
			_Creation,
			_Date,
			_Dynamicadjustmentscalingpolicy,
			_Dynamicmigrationpolicy,
			_Dynamicscalingpolicy,
			_Elasticitycontroller,
			_Elasticlink,
			_First,
			_Float,
			_Horizontalgroup,
			_Instancegrouplink,
			_Leastconn,
			_Leastlatency,
			_Leasttraffic,
			_Livemigration,
			_Loadbalancer,
			_Loadbalancerlink,
			_Loadbalancerpolicy,
			_Loadvolume,
			_Manualmigrationpolicy,
			_Manualscalingpolicy,
			_Manualtargetselection,
			_Memoryutilisation,
			_Metric,
			_MetricTargetTracking,
			_Migrationpolicy,
			_Nonlivemigration,
			_Openstackprovider,
			_OperatorType,
			_Power,
			_Provider,
			_Providerinstancelink,
			_Providerlink,
			_RecurrenceStep,
			_Recurringschedulingpolicy,
			_Responsetime,
			_Responsetimemetric,
			_Roundrobin,
			_Roundrobinalgo,
			_Rule,
			_Scalingpolicy,
			_Schedulingpolicy,
			_Simpledynamicscalingpolicy,
			_Source,
			_Sourcemigrationpolicy,
			_Step,
			_Stepdynamicscalingpolicy,
			_Steplink,
			_Swappingpolicy,
			_Targetmigrationpolicy,
			_Targetresponsetime,
			_Uniqueschedulingpolicy,
			_Unit,
			_Vmwareprovider,
			_Wstaticrr
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModemoTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _ActionOperation__ActionOperation = new ExecutorFragment(Types._ActionOperation, ModemoTables.Types._ActionOperation);
		private static final /*@NonNull*/ ExecutorFragment _ActionOperation__OclAny = new ExecutorFragment(Types._ActionOperation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ActionOperation__OclElement = new ExecutorFragment(Types._ActionOperation, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ActionOperation__OclEnumeration = new ExecutorFragment(Types._ActionOperation, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _ActionOperation__OclType = new ExecutorFragment(Types._ActionOperation, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _ActionType__ActionType = new ExecutorFragment(Types._ActionType, ModemoTables.Types._ActionType);
		private static final /*@NonNull*/ ExecutorFragment _ActionType__OclAny = new ExecutorFragment(Types._ActionType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ActionType__OclElement = new ExecutorFragment(Types._ActionType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ActionType__OclEnumeration = new ExecutorFragment(Types._ActionType, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _ActionType__OclType = new ExecutorFragment(Types._ActionType, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Actiontrigger__Actiontrigger = new ExecutorFragment(Types._Actiontrigger, ModemoTables.Types._Actiontrigger);
		private static final /*@NonNull*/ ExecutorFragment _Actiontrigger__Entity = new ExecutorFragment(Types._Actiontrigger, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Actiontrigger__OclAny = new ExecutorFragment(Types._Actiontrigger, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Actiontrigger__OclElement = new ExecutorFragment(Types._Actiontrigger, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Actiontrigger__Resource = new ExecutorFragment(Types._Actiontrigger, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Allocationpolicy__Allocationpolicy = new ExecutorFragment(Types._Allocationpolicy, ModemoTables.Types._Allocationpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Allocationpolicy__MixinBase = new ExecutorFragment(Types._Allocationpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Allocationpolicy__OclAny = new ExecutorFragment(Types._Allocationpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Allocationpolicy__OclElement = new ExecutorFragment(Types._Allocationpolicy, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Amazonprovider__Amazonprovider = new ExecutorFragment(Types._Amazonprovider, ModemoTables.Types._Amazonprovider);
		private static final /*@NonNull*/ ExecutorFragment _Amazonprovider__Entity = new ExecutorFragment(Types._Amazonprovider, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Amazonprovider__OclAny = new ExecutorFragment(Types._Amazonprovider, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Amazonprovider__OclElement = new ExecutorFragment(Types._Amazonprovider, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Amazonprovider__Provider = new ExecutorFragment(Types._Amazonprovider, ModemoTables.Types._Provider);
		private static final /*@NonNull*/ ExecutorFragment _Amazonprovider__Resource = new ExecutorFragment(Types._Amazonprovider, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Array__Array = new ExecutorFragment(Types._Array, ModemoTables.Types._Array);
		private static final /*@NonNull*/ ExecutorFragment _Array__OclAny = new ExecutorFragment(Types._Array, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Array__OclElement = new ExecutorFragment(Types._Array, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ArrofRecStep__ArrofRecStep = new ExecutorFragment(Types._ArrofRecStep, ModemoTables.Types._ArrofRecStep);
		private static final /*@NonNull*/ ExecutorFragment _ArrofRecStep__OclAny = new ExecutorFragment(Types._ArrofRecStep, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ArrofRecStep__OclElement = new ExecutorFragment(Types._ArrofRecStep, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Availableresources__Allocationpolicy = new ExecutorFragment(Types._Availableresources, ModemoTables.Types._Allocationpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Availableresources__Availableresources = new ExecutorFragment(Types._Availableresources, ModemoTables.Types._Availableresources);
		private static final /*@NonNull*/ ExecutorFragment _Availableresources__MixinBase = new ExecutorFragment(Types._Availableresources, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Availableresources__OclAny = new ExecutorFragment(Types._Availableresources, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Availableresources__OclElement = new ExecutorFragment(Types._Availableresources, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Availableresourcesorload__Availableresourcesorload = new ExecutorFragment(Types._Availableresourcesorload, ModemoTables.Types._Availableresourcesorload);
		private static final /*@NonNull*/ ExecutorFragment _Availableresourcesorload__MixinBase = new ExecutorFragment(Types._Availableresourcesorload, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Availableresourcesorload__OclAny = new ExecutorFragment(Types._Availableresourcesorload, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Availableresourcesorload__OclElement = new ExecutorFragment(Types._Availableresourcesorload, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Availableresourcesorload__Targetmigrationpolicy = new ExecutorFragment(Types._Availableresourcesorload, ModemoTables.Types._Targetmigrationpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Azureprovider__Azureprovider = new ExecutorFragment(Types._Azureprovider, ModemoTables.Types._Azureprovider);
		private static final /*@NonNull*/ ExecutorFragment _Azureprovider__Entity = new ExecutorFragment(Types._Azureprovider, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Azureprovider__OclAny = new ExecutorFragment(Types._Azureprovider, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Azureprovider__OclElement = new ExecutorFragment(Types._Azureprovider, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Azureprovider__Provider = new ExecutorFragment(Types._Azureprovider, ModemoTables.Types._Provider);
		private static final /*@NonNull*/ ExecutorFragment _Azureprovider__Resource = new ExecutorFragment(Types._Azureprovider, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Cost__Allocationpolicy = new ExecutorFragment(Types._Cost, ModemoTables.Types._Allocationpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Cost__Cost = new ExecutorFragment(Types._Cost, ModemoTables.Types._Cost);
		private static final /*@NonNull*/ ExecutorFragment _Cost__MixinBase = new ExecutorFragment(Types._Cost, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Cost__OclAny = new ExecutorFragment(Types._Cost, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cost__OclElement = new ExecutorFragment(Types._Cost, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Cpuutilisation__Cpuutilisation = new ExecutorFragment(Types._Cpuutilisation, ModemoTables.Types._Cpuutilisation);
		private static final /*@NonNull*/ ExecutorFragment _Cpuutilisation__Metric = new ExecutorFragment(Types._Cpuutilisation, ModemoTables.Types._Metric);
		private static final /*@NonNull*/ ExecutorFragment _Cpuutilisation__MixinBase = new ExecutorFragment(Types._Cpuutilisation, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Cpuutilisation__OclAny = new ExecutorFragment(Types._Cpuutilisation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cpuutilisation__OclElement = new ExecutorFragment(Types._Cpuutilisation, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Creation__Creation = new ExecutorFragment(Types._Creation, ModemoTables.Types._Creation);
		private static final /*@NonNull*/ ExecutorFragment _Creation__MixinBase = new ExecutorFragment(Types._Creation, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Creation__OclAny = new ExecutorFragment(Types._Creation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Creation__OclElement = new ExecutorFragment(Types._Creation, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Date__Date = new ExecutorFragment(Types._Date, ModemoTables.Types._Date);
		private static final /*@NonNull*/ ExecutorFragment _Date__OclAny = new ExecutorFragment(Types._Date, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Date__OclComparable = new ExecutorFragment(Types._Date, OCLstdlibTables.Types._OclComparable);

		private static final /*@NonNull*/ ExecutorFragment _Dynamicadjustmentscalingpolicy__Dynamicadjustmentscalingpolicy = new ExecutorFragment(Types._Dynamicadjustmentscalingpolicy, ModemoTables.Types._Dynamicadjustmentscalingpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicadjustmentscalingpolicy__Dynamicscalingpolicy = new ExecutorFragment(Types._Dynamicadjustmentscalingpolicy, ModemoTables.Types._Dynamicscalingpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicadjustmentscalingpolicy__MixinBase = new ExecutorFragment(Types._Dynamicadjustmentscalingpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicadjustmentscalingpolicy__OclAny = new ExecutorFragment(Types._Dynamicadjustmentscalingpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicadjustmentscalingpolicy__OclElement = new ExecutorFragment(Types._Dynamicadjustmentscalingpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicadjustmentscalingpolicy__Scalingpolicy = new ExecutorFragment(Types._Dynamicadjustmentscalingpolicy, ModemoTables.Types._Scalingpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Dynamicmigrationpolicy__Dynamicmigrationpolicy = new ExecutorFragment(Types._Dynamicmigrationpolicy, ModemoTables.Types._Dynamicmigrationpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicmigrationpolicy__MixinBase = new ExecutorFragment(Types._Dynamicmigrationpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicmigrationpolicy__OclAny = new ExecutorFragment(Types._Dynamicmigrationpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicmigrationpolicy__OclElement = new ExecutorFragment(Types._Dynamicmigrationpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicmigrationpolicy__Sourcemigrationpolicy = new ExecutorFragment(Types._Dynamicmigrationpolicy, ModemoTables.Types._Sourcemigrationpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Dynamicscalingpolicy__Dynamicscalingpolicy = new ExecutorFragment(Types._Dynamicscalingpolicy, ModemoTables.Types._Dynamicscalingpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicscalingpolicy__MixinBase = new ExecutorFragment(Types._Dynamicscalingpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicscalingpolicy__OclAny = new ExecutorFragment(Types._Dynamicscalingpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicscalingpolicy__OclElement = new ExecutorFragment(Types._Dynamicscalingpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicscalingpolicy__Scalingpolicy = new ExecutorFragment(Types._Dynamicscalingpolicy, ModemoTables.Types._Scalingpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Elasticitycontroller__Elasticitycontroller = new ExecutorFragment(Types._Elasticitycontroller, ModemoTables.Types._Elasticitycontroller);
		private static final /*@NonNull*/ ExecutorFragment _Elasticitycontroller__Entity = new ExecutorFragment(Types._Elasticitycontroller, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Elasticitycontroller__OclAny = new ExecutorFragment(Types._Elasticitycontroller, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Elasticitycontroller__OclElement = new ExecutorFragment(Types._Elasticitycontroller, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Elasticitycontroller__Resource = new ExecutorFragment(Types._Elasticitycontroller, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Elasticlink__Elasticlink = new ExecutorFragment(Types._Elasticlink, ModemoTables.Types._Elasticlink);
		private static final /*@NonNull*/ ExecutorFragment _Elasticlink__Entity = new ExecutorFragment(Types._Elasticlink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Elasticlink__Link = new ExecutorFragment(Types._Elasticlink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Elasticlink__OclAny = new ExecutorFragment(Types._Elasticlink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Elasticlink__OclElement = new ExecutorFragment(Types._Elasticlink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _First__First = new ExecutorFragment(Types._First, ModemoTables.Types._First);
		private static final /*@NonNull*/ ExecutorFragment _First__Loadbalancerpolicy = new ExecutorFragment(Types._First, ModemoTables.Types._Loadbalancerpolicy);
		private static final /*@NonNull*/ ExecutorFragment _First__MixinBase = new ExecutorFragment(Types._First, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _First__OclAny = new ExecutorFragment(Types._First, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _First__OclElement = new ExecutorFragment(Types._First, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Float__Float = new ExecutorFragment(Types._Float, ModemoTables.Types._Float);
		private static final /*@NonNull*/ ExecutorFragment _Float__OclAny = new ExecutorFragment(Types._Float, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _Horizontalgroup__Entity = new ExecutorFragment(Types._Horizontalgroup, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Horizontalgroup__Horizontalgroup = new ExecutorFragment(Types._Horizontalgroup, ModemoTables.Types._Horizontalgroup);
		private static final /*@NonNull*/ ExecutorFragment _Horizontalgroup__OclAny = new ExecutorFragment(Types._Horizontalgroup, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Horizontalgroup__OclElement = new ExecutorFragment(Types._Horizontalgroup, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Horizontalgroup__Resource = new ExecutorFragment(Types._Horizontalgroup, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Instancegrouplink__Entity = new ExecutorFragment(Types._Instancegrouplink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Instancegrouplink__Instancegrouplink = new ExecutorFragment(Types._Instancegrouplink, ModemoTables.Types._Instancegrouplink);
		private static final /*@NonNull*/ ExecutorFragment _Instancegrouplink__Link = new ExecutorFragment(Types._Instancegrouplink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Instancegrouplink__OclAny = new ExecutorFragment(Types._Instancegrouplink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Instancegrouplink__OclElement = new ExecutorFragment(Types._Instancegrouplink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Leastconn__Leastconn = new ExecutorFragment(Types._Leastconn, ModemoTables.Types._Leastconn);
		private static final /*@NonNull*/ ExecutorFragment _Leastconn__Loadbalancerpolicy = new ExecutorFragment(Types._Leastconn, ModemoTables.Types._Loadbalancerpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Leastconn__MixinBase = new ExecutorFragment(Types._Leastconn, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Leastconn__OclAny = new ExecutorFragment(Types._Leastconn, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Leastconn__OclElement = new ExecutorFragment(Types._Leastconn, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Leastlatency__Leastlatency = new ExecutorFragment(Types._Leastlatency, ModemoTables.Types._Leastlatency);
		private static final /*@NonNull*/ ExecutorFragment _Leastlatency__Loadbalancerpolicy = new ExecutorFragment(Types._Leastlatency, ModemoTables.Types._Loadbalancerpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Leastlatency__MixinBase = new ExecutorFragment(Types._Leastlatency, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Leastlatency__OclAny = new ExecutorFragment(Types._Leastlatency, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Leastlatency__OclElement = new ExecutorFragment(Types._Leastlatency, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Leasttraffic__Leasttraffic = new ExecutorFragment(Types._Leasttraffic, ModemoTables.Types._Leasttraffic);
		private static final /*@NonNull*/ ExecutorFragment _Leasttraffic__Loadbalancerpolicy = new ExecutorFragment(Types._Leasttraffic, ModemoTables.Types._Loadbalancerpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Leasttraffic__MixinBase = new ExecutorFragment(Types._Leasttraffic, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Leasttraffic__OclAny = new ExecutorFragment(Types._Leasttraffic, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Leasttraffic__OclElement = new ExecutorFragment(Types._Leasttraffic, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Livemigration__Livemigration = new ExecutorFragment(Types._Livemigration, ModemoTables.Types._Livemigration);
		private static final /*@NonNull*/ ExecutorFragment _Livemigration__Migrationpolicy = new ExecutorFragment(Types._Livemigration, ModemoTables.Types._Migrationpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Livemigration__MixinBase = new ExecutorFragment(Types._Livemigration, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Livemigration__OclAny = new ExecutorFragment(Types._Livemigration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Livemigration__OclElement = new ExecutorFragment(Types._Livemigration, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Loadbalancer__Entity = new ExecutorFragment(Types._Loadbalancer, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancer__Loadbalancer = new ExecutorFragment(Types._Loadbalancer, ModemoTables.Types._Loadbalancer);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancer__OclAny = new ExecutorFragment(Types._Loadbalancer, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancer__OclElement = new ExecutorFragment(Types._Loadbalancer, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancer__Resource = new ExecutorFragment(Types._Loadbalancer, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Loadbalancerlink__Entity = new ExecutorFragment(Types._Loadbalancerlink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancerlink__Link = new ExecutorFragment(Types._Loadbalancerlink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancerlink__Loadbalancerlink = new ExecutorFragment(Types._Loadbalancerlink, ModemoTables.Types._Loadbalancerlink);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancerlink__OclAny = new ExecutorFragment(Types._Loadbalancerlink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancerlink__OclElement = new ExecutorFragment(Types._Loadbalancerlink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Loadbalancerpolicy__Loadbalancerpolicy = new ExecutorFragment(Types._Loadbalancerpolicy, ModemoTables.Types._Loadbalancerpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancerpolicy__MixinBase = new ExecutorFragment(Types._Loadbalancerpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancerpolicy__OclAny = new ExecutorFragment(Types._Loadbalancerpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancerpolicy__OclElement = new ExecutorFragment(Types._Loadbalancerpolicy, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Loadvolume__Dynamicmigrationpolicy = new ExecutorFragment(Types._Loadvolume, ModemoTables.Types._Dynamicmigrationpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Loadvolume__Loadvolume = new ExecutorFragment(Types._Loadvolume, ModemoTables.Types._Loadvolume);
		private static final /*@NonNull*/ ExecutorFragment _Loadvolume__MixinBase = new ExecutorFragment(Types._Loadvolume, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Loadvolume__OclAny = new ExecutorFragment(Types._Loadvolume, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Loadvolume__OclElement = new ExecutorFragment(Types._Loadvolume, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Loadvolume__Sourcemigrationpolicy = new ExecutorFragment(Types._Loadvolume, ModemoTables.Types._Sourcemigrationpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Manualmigrationpolicy__Manualmigrationpolicy = new ExecutorFragment(Types._Manualmigrationpolicy, ModemoTables.Types._Manualmigrationpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Manualmigrationpolicy__MixinBase = new ExecutorFragment(Types._Manualmigrationpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Manualmigrationpolicy__OclAny = new ExecutorFragment(Types._Manualmigrationpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Manualmigrationpolicy__OclElement = new ExecutorFragment(Types._Manualmigrationpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Manualmigrationpolicy__Sourcemigrationpolicy = new ExecutorFragment(Types._Manualmigrationpolicy, ModemoTables.Types._Sourcemigrationpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Manualscalingpolicy__Manualscalingpolicy = new ExecutorFragment(Types._Manualscalingpolicy, ModemoTables.Types._Manualscalingpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Manualscalingpolicy__MixinBase = new ExecutorFragment(Types._Manualscalingpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Manualscalingpolicy__OclAny = new ExecutorFragment(Types._Manualscalingpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Manualscalingpolicy__OclElement = new ExecutorFragment(Types._Manualscalingpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Manualscalingpolicy__Scalingpolicy = new ExecutorFragment(Types._Manualscalingpolicy, ModemoTables.Types._Scalingpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Manualtargetselection__Manualtargetselection = new ExecutorFragment(Types._Manualtargetselection, ModemoTables.Types._Manualtargetselection);
		private static final /*@NonNull*/ ExecutorFragment _Manualtargetselection__MixinBase = new ExecutorFragment(Types._Manualtargetselection, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Manualtargetselection__OclAny = new ExecutorFragment(Types._Manualtargetselection, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Manualtargetselection__OclElement = new ExecutorFragment(Types._Manualtargetselection, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Manualtargetselection__Targetmigrationpolicy = new ExecutorFragment(Types._Manualtargetselection, ModemoTables.Types._Targetmigrationpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Memoryutilisation__Memoryutilisation = new ExecutorFragment(Types._Memoryutilisation, ModemoTables.Types._Memoryutilisation);
		private static final /*@NonNull*/ ExecutorFragment _Memoryutilisation__Metric = new ExecutorFragment(Types._Memoryutilisation, ModemoTables.Types._Metric);
		private static final /*@NonNull*/ ExecutorFragment _Memoryutilisation__MixinBase = new ExecutorFragment(Types._Memoryutilisation, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Memoryutilisation__OclAny = new ExecutorFragment(Types._Memoryutilisation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Memoryutilisation__OclElement = new ExecutorFragment(Types._Memoryutilisation, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Metric__Metric = new ExecutorFragment(Types._Metric, ModemoTables.Types._Metric);
		private static final /*@NonNull*/ ExecutorFragment _Metric__MixinBase = new ExecutorFragment(Types._Metric, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Metric__OclAny = new ExecutorFragment(Types._Metric, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Metric__OclElement = new ExecutorFragment(Types._Metric, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _MetricTargetTracking__MetricTargetTracking = new ExecutorFragment(Types._MetricTargetTracking, ModemoTables.Types._MetricTargetTracking);
		private static final /*@NonNull*/ ExecutorFragment _MetricTargetTracking__OclAny = new ExecutorFragment(Types._MetricTargetTracking, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _MetricTargetTracking__OclElement = new ExecutorFragment(Types._MetricTargetTracking, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _MetricTargetTracking__OclEnumeration = new ExecutorFragment(Types._MetricTargetTracking, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _MetricTargetTracking__OclType = new ExecutorFragment(Types._MetricTargetTracking, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Migrationpolicy__Migrationpolicy = new ExecutorFragment(Types._Migrationpolicy, ModemoTables.Types._Migrationpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Migrationpolicy__MixinBase = new ExecutorFragment(Types._Migrationpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Migrationpolicy__OclAny = new ExecutorFragment(Types._Migrationpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Migrationpolicy__OclElement = new ExecutorFragment(Types._Migrationpolicy, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Nonlivemigration__Migrationpolicy = new ExecutorFragment(Types._Nonlivemigration, ModemoTables.Types._Migrationpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Nonlivemigration__MixinBase = new ExecutorFragment(Types._Nonlivemigration, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Nonlivemigration__Nonlivemigration = new ExecutorFragment(Types._Nonlivemigration, ModemoTables.Types._Nonlivemigration);
		private static final /*@NonNull*/ ExecutorFragment _Nonlivemigration__OclAny = new ExecutorFragment(Types._Nonlivemigration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Nonlivemigration__OclElement = new ExecutorFragment(Types._Nonlivemigration, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Openstackprovider__Entity = new ExecutorFragment(Types._Openstackprovider, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Openstackprovider__OclAny = new ExecutorFragment(Types._Openstackprovider, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Openstackprovider__OclElement = new ExecutorFragment(Types._Openstackprovider, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Openstackprovider__Openstackprovider = new ExecutorFragment(Types._Openstackprovider, ModemoTables.Types._Openstackprovider);
		private static final /*@NonNull*/ ExecutorFragment _Openstackprovider__Provider = new ExecutorFragment(Types._Openstackprovider, ModemoTables.Types._Provider);
		private static final /*@NonNull*/ ExecutorFragment _Openstackprovider__Resource = new ExecutorFragment(Types._Openstackprovider, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _OperatorType__OclAny = new ExecutorFragment(Types._OperatorType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _OperatorType__OclElement = new ExecutorFragment(Types._OperatorType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _OperatorType__OclEnumeration = new ExecutorFragment(Types._OperatorType, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _OperatorType__OclType = new ExecutorFragment(Types._OperatorType, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _OperatorType__OperatorType = new ExecutorFragment(Types._OperatorType, ModemoTables.Types._OperatorType);

		private static final /*@NonNull*/ ExecutorFragment _Power__Dynamicmigrationpolicy = new ExecutorFragment(Types._Power, ModemoTables.Types._Dynamicmigrationpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Power__MixinBase = new ExecutorFragment(Types._Power, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Power__OclAny = new ExecutorFragment(Types._Power, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Power__OclElement = new ExecutorFragment(Types._Power, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Power__Power = new ExecutorFragment(Types._Power, ModemoTables.Types._Power);
		private static final /*@NonNull*/ ExecutorFragment _Power__Sourcemigrationpolicy = new ExecutorFragment(Types._Power, ModemoTables.Types._Sourcemigrationpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Provider__Entity = new ExecutorFragment(Types._Provider, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Provider__OclAny = new ExecutorFragment(Types._Provider, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Provider__OclElement = new ExecutorFragment(Types._Provider, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Provider__Provider = new ExecutorFragment(Types._Provider, ModemoTables.Types._Provider);
		private static final /*@NonNull*/ ExecutorFragment _Provider__Resource = new ExecutorFragment(Types._Provider, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Providerinstancelink__Entity = new ExecutorFragment(Types._Providerinstancelink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Providerinstancelink__Link = new ExecutorFragment(Types._Providerinstancelink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Providerinstancelink__OclAny = new ExecutorFragment(Types._Providerinstancelink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Providerinstancelink__OclElement = new ExecutorFragment(Types._Providerinstancelink, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Providerinstancelink__Providerinstancelink = new ExecutorFragment(Types._Providerinstancelink, ModemoTables.Types._Providerinstancelink);

		private static final /*@NonNull*/ ExecutorFragment _Providerlink__Entity = new ExecutorFragment(Types._Providerlink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Providerlink__Link = new ExecutorFragment(Types._Providerlink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Providerlink__OclAny = new ExecutorFragment(Types._Providerlink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Providerlink__OclElement = new ExecutorFragment(Types._Providerlink, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Providerlink__Providerlink = new ExecutorFragment(Types._Providerlink, ModemoTables.Types._Providerlink);

		private static final /*@NonNull*/ ExecutorFragment _RecurrenceStep__OclAny = new ExecutorFragment(Types._RecurrenceStep, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _RecurrenceStep__OclElement = new ExecutorFragment(Types._RecurrenceStep, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _RecurrenceStep__RecurrenceStep = new ExecutorFragment(Types._RecurrenceStep, ModemoTables.Types._RecurrenceStep);

		private static final /*@NonNull*/ ExecutorFragment _Recurringschedulingpolicy__MixinBase = new ExecutorFragment(Types._Recurringschedulingpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Recurringschedulingpolicy__OclAny = new ExecutorFragment(Types._Recurringschedulingpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Recurringschedulingpolicy__OclElement = new ExecutorFragment(Types._Recurringschedulingpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Recurringschedulingpolicy__Recurringschedulingpolicy = new ExecutorFragment(Types._Recurringschedulingpolicy, ModemoTables.Types._Recurringschedulingpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Recurringschedulingpolicy__Schedulingpolicy = new ExecutorFragment(Types._Recurringschedulingpolicy, ModemoTables.Types._Schedulingpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Responsetime__Allocationpolicy = new ExecutorFragment(Types._Responsetime, ModemoTables.Types._Allocationpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Responsetime__MixinBase = new ExecutorFragment(Types._Responsetime, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Responsetime__OclAny = new ExecutorFragment(Types._Responsetime, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Responsetime__OclElement = new ExecutorFragment(Types._Responsetime, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Responsetime__Responsetime = new ExecutorFragment(Types._Responsetime, ModemoTables.Types._Responsetime);

		private static final /*@NonNull*/ ExecutorFragment _Responsetimemetric__Metric = new ExecutorFragment(Types._Responsetimemetric, ModemoTables.Types._Metric);
		private static final /*@NonNull*/ ExecutorFragment _Responsetimemetric__MixinBase = new ExecutorFragment(Types._Responsetimemetric, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Responsetimemetric__OclAny = new ExecutorFragment(Types._Responsetimemetric, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Responsetimemetric__OclElement = new ExecutorFragment(Types._Responsetimemetric, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Responsetimemetric__Responsetimemetric = new ExecutorFragment(Types._Responsetimemetric, ModemoTables.Types._Responsetimemetric);

		private static final /*@NonNull*/ ExecutorFragment _Roundrobin__Allocationpolicy = new ExecutorFragment(Types._Roundrobin, ModemoTables.Types._Allocationpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Roundrobin__MixinBase = new ExecutorFragment(Types._Roundrobin, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Roundrobin__OclAny = new ExecutorFragment(Types._Roundrobin, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Roundrobin__OclElement = new ExecutorFragment(Types._Roundrobin, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Roundrobin__Roundrobin = new ExecutorFragment(Types._Roundrobin, ModemoTables.Types._Roundrobin);

		private static final /*@NonNull*/ ExecutorFragment _Roundrobinalgo__Loadbalancerpolicy = new ExecutorFragment(Types._Roundrobinalgo, ModemoTables.Types._Loadbalancerpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Roundrobinalgo__MixinBase = new ExecutorFragment(Types._Roundrobinalgo, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Roundrobinalgo__OclAny = new ExecutorFragment(Types._Roundrobinalgo, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Roundrobinalgo__OclElement = new ExecutorFragment(Types._Roundrobinalgo, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Roundrobinalgo__Roundrobinalgo = new ExecutorFragment(Types._Roundrobinalgo, ModemoTables.Types._Roundrobinalgo);

		private static final /*@NonNull*/ ExecutorFragment _Rule__Entity = new ExecutorFragment(Types._Rule, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Rule__Link = new ExecutorFragment(Types._Rule, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Rule__OclAny = new ExecutorFragment(Types._Rule, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Rule__OclElement = new ExecutorFragment(Types._Rule, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Rule__Rule = new ExecutorFragment(Types._Rule, ModemoTables.Types._Rule);

		private static final /*@NonNull*/ ExecutorFragment _Scalingpolicy__MixinBase = new ExecutorFragment(Types._Scalingpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Scalingpolicy__OclAny = new ExecutorFragment(Types._Scalingpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Scalingpolicy__OclElement = new ExecutorFragment(Types._Scalingpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Scalingpolicy__Scalingpolicy = new ExecutorFragment(Types._Scalingpolicy, ModemoTables.Types._Scalingpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Schedulingpolicy__MixinBase = new ExecutorFragment(Types._Schedulingpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Schedulingpolicy__OclAny = new ExecutorFragment(Types._Schedulingpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Schedulingpolicy__OclElement = new ExecutorFragment(Types._Schedulingpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Schedulingpolicy__Schedulingpolicy = new ExecutorFragment(Types._Schedulingpolicy, ModemoTables.Types._Schedulingpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Simpledynamicscalingpolicy__Dynamicscalingpolicy = new ExecutorFragment(Types._Simpledynamicscalingpolicy, ModemoTables.Types._Dynamicscalingpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Simpledynamicscalingpolicy__MixinBase = new ExecutorFragment(Types._Simpledynamicscalingpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Simpledynamicscalingpolicy__OclAny = new ExecutorFragment(Types._Simpledynamicscalingpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Simpledynamicscalingpolicy__OclElement = new ExecutorFragment(Types._Simpledynamicscalingpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Simpledynamicscalingpolicy__Scalingpolicy = new ExecutorFragment(Types._Simpledynamicscalingpolicy, ModemoTables.Types._Scalingpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Simpledynamicscalingpolicy__Simpledynamicscalingpolicy = new ExecutorFragment(Types._Simpledynamicscalingpolicy, ModemoTables.Types._Simpledynamicscalingpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Source__Loadbalancerpolicy = new ExecutorFragment(Types._Source, ModemoTables.Types._Loadbalancerpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Source__MixinBase = new ExecutorFragment(Types._Source, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Source__OclAny = new ExecutorFragment(Types._Source, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Source__OclElement = new ExecutorFragment(Types._Source, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Source__Source = new ExecutorFragment(Types._Source, ModemoTables.Types._Source);

		private static final /*@NonNull*/ ExecutorFragment _Sourcemigrationpolicy__MixinBase = new ExecutorFragment(Types._Sourcemigrationpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Sourcemigrationpolicy__OclAny = new ExecutorFragment(Types._Sourcemigrationpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Sourcemigrationpolicy__OclElement = new ExecutorFragment(Types._Sourcemigrationpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Sourcemigrationpolicy__Sourcemigrationpolicy = new ExecutorFragment(Types._Sourcemigrationpolicy, ModemoTables.Types._Sourcemigrationpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Step__Entity = new ExecutorFragment(Types._Step, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Step__OclAny = new ExecutorFragment(Types._Step, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Step__OclElement = new ExecutorFragment(Types._Step, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Step__Resource = new ExecutorFragment(Types._Step, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Step__Step = new ExecutorFragment(Types._Step, ModemoTables.Types._Step);

		private static final /*@NonNull*/ ExecutorFragment _Stepdynamicscalingpolicy__Dynamicscalingpolicy = new ExecutorFragment(Types._Stepdynamicscalingpolicy, ModemoTables.Types._Dynamicscalingpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Stepdynamicscalingpolicy__MixinBase = new ExecutorFragment(Types._Stepdynamicscalingpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Stepdynamicscalingpolicy__OclAny = new ExecutorFragment(Types._Stepdynamicscalingpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Stepdynamicscalingpolicy__OclElement = new ExecutorFragment(Types._Stepdynamicscalingpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Stepdynamicscalingpolicy__Scalingpolicy = new ExecutorFragment(Types._Stepdynamicscalingpolicy, ModemoTables.Types._Scalingpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Stepdynamicscalingpolicy__Stepdynamicscalingpolicy = new ExecutorFragment(Types._Stepdynamicscalingpolicy, ModemoTables.Types._Stepdynamicscalingpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Steplink__Entity = new ExecutorFragment(Types._Steplink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Steplink__Link = new ExecutorFragment(Types._Steplink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Steplink__OclAny = new ExecutorFragment(Types._Steplink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Steplink__OclElement = new ExecutorFragment(Types._Steplink, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Steplink__Steplink = new ExecutorFragment(Types._Steplink, ModemoTables.Types._Steplink);

		private static final /*@NonNull*/ ExecutorFragment _Swappingpolicy__MixinBase = new ExecutorFragment(Types._Swappingpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Swappingpolicy__OclAny = new ExecutorFragment(Types._Swappingpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Swappingpolicy__OclElement = new ExecutorFragment(Types._Swappingpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Swappingpolicy__Swappingpolicy = new ExecutorFragment(Types._Swappingpolicy, ModemoTables.Types._Swappingpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Targetmigrationpolicy__MixinBase = new ExecutorFragment(Types._Targetmigrationpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Targetmigrationpolicy__OclAny = new ExecutorFragment(Types._Targetmigrationpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Targetmigrationpolicy__OclElement = new ExecutorFragment(Types._Targetmigrationpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Targetmigrationpolicy__Targetmigrationpolicy = new ExecutorFragment(Types._Targetmigrationpolicy, ModemoTables.Types._Targetmigrationpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Targetresponsetime__MixinBase = new ExecutorFragment(Types._Targetresponsetime, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Targetresponsetime__OclAny = new ExecutorFragment(Types._Targetresponsetime, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Targetresponsetime__OclElement = new ExecutorFragment(Types._Targetresponsetime, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Targetresponsetime__Targetmigrationpolicy = new ExecutorFragment(Types._Targetresponsetime, ModemoTables.Types._Targetmigrationpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Targetresponsetime__Targetresponsetime = new ExecutorFragment(Types._Targetresponsetime, ModemoTables.Types._Targetresponsetime);

		private static final /*@NonNull*/ ExecutorFragment _Uniqueschedulingpolicy__MixinBase = new ExecutorFragment(Types._Uniqueschedulingpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Uniqueschedulingpolicy__OclAny = new ExecutorFragment(Types._Uniqueschedulingpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Uniqueschedulingpolicy__OclElement = new ExecutorFragment(Types._Uniqueschedulingpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Uniqueschedulingpolicy__Schedulingpolicy = new ExecutorFragment(Types._Uniqueschedulingpolicy, ModemoTables.Types._Schedulingpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Uniqueschedulingpolicy__Uniqueschedulingpolicy = new ExecutorFragment(Types._Uniqueschedulingpolicy, ModemoTables.Types._Uniqueschedulingpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Unit__OclAny = new ExecutorFragment(Types._Unit, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Unit__OclElement = new ExecutorFragment(Types._Unit, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Unit__OclEnumeration = new ExecutorFragment(Types._Unit, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _Unit__OclType = new ExecutorFragment(Types._Unit, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _Unit__Unit = new ExecutorFragment(Types._Unit, ModemoTables.Types._Unit);

		private static final /*@NonNull*/ ExecutorFragment _Vmwareprovider__Entity = new ExecutorFragment(Types._Vmwareprovider, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Vmwareprovider__OclAny = new ExecutorFragment(Types._Vmwareprovider, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Vmwareprovider__OclElement = new ExecutorFragment(Types._Vmwareprovider, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Vmwareprovider__Provider = new ExecutorFragment(Types._Vmwareprovider, ModemoTables.Types._Provider);
		private static final /*@NonNull*/ ExecutorFragment _Vmwareprovider__Resource = new ExecutorFragment(Types._Vmwareprovider, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Vmwareprovider__Vmwareprovider = new ExecutorFragment(Types._Vmwareprovider, ModemoTables.Types._Vmwareprovider);

		private static final /*@NonNull*/ ExecutorFragment _Wstaticrr__Loadbalancerpolicy = new ExecutorFragment(Types._Wstaticrr, ModemoTables.Types._Loadbalancerpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Wstaticrr__MixinBase = new ExecutorFragment(Types._Wstaticrr, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Wstaticrr__OclAny = new ExecutorFragment(Types._Wstaticrr, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Wstaticrr__OclElement = new ExecutorFragment(Types._Wstaticrr, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Wstaticrr__Wstaticrr = new ExecutorFragment(Types._Wstaticrr, ModemoTables.Types._Wstaticrr);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModemoTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final /*@NonNull*/ ParameterTypes _OclSelf = TypeUtil.createParameterTypes(OCLstdlibTables.Types._OclSelf);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModemoTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final /*@NonNull*/ ExecutorOperation _Date__compareTo = new ExecutorOperation("compareTo", Parameters._OclSelf, Types._Date,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Loadbalancer__addbackendserver = new ExecutorOperation("addbackendserver", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Loadbalancer,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Loadbalancer__removebackendserver = new ExecutorOperation("removebackendserver", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Loadbalancer,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Loadbalancerpolicy__start = new ExecutorOperation("start", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Loadbalancerpolicy,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Loadbalancerpolicy__stop = new ExecutorOperation("stop", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Loadbalancerpolicy,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Scalingpolicy__start = new ExecutorOperation("start", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Scalingpolicy,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Scalingpolicy__stop = new ExecutorOperation("stop", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Scalingpolicy,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Schedulingpolicy__start = new ExecutorOperation("start", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Schedulingpolicy,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Schedulingpolicy__stop = new ExecutorOperation("stop", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Schedulingpolicy,
			1, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModemoTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final /*@NonNull*/ ExecutorProperty _Actiontrigger__actiontriggerAction = new EcoreExecutorProperty(ModemoPackage.Literals.ACTIONTRIGGER__ACTIONTRIGGER_ACTION, Types._Actiontrigger, 0);
		public static final /*@NonNull*/ ExecutorProperty _Actiontrigger__actiontriggerActionType = new EcoreExecutorProperty(ModemoPackage.Literals.ACTIONTRIGGER__ACTIONTRIGGER_ACTION_TYPE, Types._Actiontrigger, 1);
		public static final /*@NonNull*/ ExecutorProperty _Actiontrigger__actiontriggerAmount = new EcoreExecutorProperty(ModemoPackage.Literals.ACTIONTRIGGER__ACTIONTRIGGER_AMOUNT, Types._Actiontrigger, 2);

		public static final /*@NonNull*/ ExecutorProperty _Array__values = new EcoreExecutorProperty(ModemoPackage.Literals.ARRAY__VALUES, Types._Array, 0);
		public static final /*@NonNull*/ ExecutorProperty _Array__RecurrenceStep__value = new ExecutorPropertyWithImplementation("RecurrenceStep", Types._Array, 1, new EcoreLibraryOppositeProperty(ModemoPackage.Literals.RECURRENCE_STEP__VALUE));

		public static final /*@NonNull*/ ExecutorProperty _ArrofRecStep__arrofrecstepValues = new EcoreExecutorProperty(ModemoPackage.Literals.ARROF_REC_STEP__ARROFRECSTEP_VALUES, Types._ArrofRecStep, 0);
		public static final /*@NonNull*/ ExecutorProperty _ArrofRecStep__Recurringschedulingpolicy__recurringschedulingpolicyRecurrence = new ExecutorPropertyWithImplementation("Recurringschedulingpolicy", Types._ArrofRecStep, 1, new EcoreLibraryOppositeProperty(ModemoPackage.Literals.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_RECURRENCE));

		public static final /*@NonNull*/ ExecutorProperty _Creation__occiComputeCreationDate = new EcoreExecutorProperty(ModemoPackage.Literals.CREATION__OCCI_COMPUTE_CREATION_DATE, Types._Creation, 0);

		public static final /*@NonNull*/ ExecutorProperty _Dynamicadjustmentscalingpolicy__dynamicadjustmentscalingpolicyDisableScaleIn = new EcoreExecutorProperty(ModemoPackage.Literals.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_DISABLE_SCALE_IN, Types._Dynamicadjustmentscalingpolicy, 0);
		public static final /*@NonNull*/ ExecutorProperty _Dynamicadjustmentscalingpolicy__dynamicadjustmentscalingpolicyMetric = new EcoreExecutorProperty(ModemoPackage.Literals.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_METRIC, Types._Dynamicadjustmentscalingpolicy, 1);
		public static final /*@NonNull*/ ExecutorProperty _Dynamicadjustmentscalingpolicy__dynamicadjustmentscalingpolicyTarget = new EcoreExecutorProperty(ModemoPackage.Literals.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_TARGET, Types._Dynamicadjustmentscalingpolicy, 2);

		public static final /*@NonNull*/ ExecutorProperty _Dynamicscalingpolicy__dynamicscalingpolicyCoolDuration = new EcoreExecutorProperty(ModemoPackage.Literals.DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_COOL_DURATION, Types._Dynamicscalingpolicy, 0);
		public static final /*@NonNull*/ ExecutorProperty _Dynamicscalingpolicy__dynamicscalingpolicyIterationWaitTime = new EcoreExecutorProperty(ModemoPackage.Literals.DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME, Types._Dynamicscalingpolicy, 1);

		public static final /*@NonNull*/ ExecutorProperty _Elasticitycontroller__ElasticitycontrollerMaximumLimit = new EcoreExecutorProperty(ModemoPackage.Literals.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MAXIMUM_LIMIT, Types._Elasticitycontroller, 0);
		public static final /*@NonNull*/ ExecutorProperty _Elasticitycontroller__ElasticitycontrollerMinimumLimit = new EcoreExecutorProperty(ModemoPackage.Literals.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MINIMUM_LIMIT, Types._Elasticitycontroller, 1);

		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__horizontalgroupGroupSize = new EcoreExecutorProperty(ModemoPackage.Literals.HORIZONTALGROUP__HORIZONTALGROUP_GROUP_SIZE, Types._Horizontalgroup, 0);
		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__horizontalgroupLoadBalancer = new EcoreExecutorProperty(ModemoPackage.Literals.HORIZONTALGROUP__HORIZONTALGROUP_LOAD_BALANCER, Types._Horizontalgroup, 1);
		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__horizontalgroupMaximum = new EcoreExecutorProperty(ModemoPackage.Literals.HORIZONTALGROUP__HORIZONTALGROUP_MAXIMUM, Types._Horizontalgroup, 2);
		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__horizontalgroupMinimum = new EcoreExecutorProperty(ModemoPackage.Literals.HORIZONTALGROUP__HORIZONTALGROUP_MINIMUM, Types._Horizontalgroup, 3);
		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__horizontalgroupName = new EcoreExecutorProperty(ModemoPackage.Literals.HORIZONTALGROUP__HORIZONTALGROUP_NAME, Types._Horizontalgroup, 4);
		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__horizontalgroupTemplateName = new EcoreExecutorProperty(ModemoPackage.Literals.HORIZONTALGROUP__HORIZONTALGROUP_TEMPLATE_NAME, Types._Horizontalgroup, 5);

		public static final /*@NonNull*/ ExecutorProperty _Loadbalancer__loadbalancerAddress = new EcoreExecutorProperty(ModemoPackage.Literals.LOADBALANCER__LOADBALANCER_ADDRESS, Types._Loadbalancer, 0);
		public static final /*@NonNull*/ ExecutorProperty _Loadbalancer__loadbalancerInstanceIP = new EcoreExecutorProperty(ModemoPackage.Literals.LOADBALANCER__LOADBALANCER_INSTANCE_IP, Types._Loadbalancer, 1);
		public static final /*@NonNull*/ ExecutorProperty _Loadbalancer__loadbalancerName = new EcoreExecutorProperty(ModemoPackage.Literals.LOADBALANCER__LOADBALANCER_NAME, Types._Loadbalancer, 2);

		public static final /*@NonNull*/ ExecutorProperty _Manualscalingpolicy__manualscalingpolicyComputeUnit = new EcoreExecutorProperty(ModemoPackage.Literals.MANUALSCALINGPOLICY__MANUALSCALINGPOLICY_COMPUTE_UNIT, Types._Manualscalingpolicy, 0);
		public static final /*@NonNull*/ ExecutorProperty _Manualscalingpolicy__manualscalingpolicyDesiredSize = new EcoreExecutorProperty(ModemoPackage.Literals.MANUALSCALINGPOLICY__MANUALSCALINGPOLICY_DESIRED_SIZE, Types._Manualscalingpolicy, 1);

		public static final /*@NonNull*/ ExecutorProperty _Metric__name = new EcoreExecutorProperty(ModemoPackage.Literals.METRIC__NAME, Types._Metric, 0);

		public static final /*@NonNull*/ ExecutorProperty _RecurrenceStep__unit = new EcoreExecutorProperty(ModemoPackage.Literals.RECURRENCE_STEP__UNIT, Types._RecurrenceStep, 0);
		public static final /*@NonNull*/ ExecutorProperty _RecurrenceStep__value = new EcoreExecutorProperty(ModemoPackage.Literals.RECURRENCE_STEP__VALUE, Types._RecurrenceStep, 1);
		public static final /*@NonNull*/ ExecutorProperty _RecurrenceStep__ArrofRecStep__arrofrecstepValues = new ExecutorPropertyWithImplementation("ArrofRecStep", Types._RecurrenceStep, 2, new EcoreLibraryOppositeProperty(ModemoPackage.Literals.ARROF_REC_STEP__ARROFRECSTEP_VALUES));

		public static final /*@NonNull*/ ExecutorProperty _Recurringschedulingpolicy__recurringschedulingpolicyEndDate = new EcoreExecutorProperty(ModemoPackage.Literals.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_END_DATE, Types._Recurringschedulingpolicy, 0);
		public static final /*@NonNull*/ ExecutorProperty _Recurringschedulingpolicy__recurringschedulingpolicyInterval = new EcoreExecutorProperty(ModemoPackage.Literals.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_INTERVAL, Types._Recurringschedulingpolicy, 1);
		public static final /*@NonNull*/ ExecutorProperty _Recurringschedulingpolicy__recurringschedulingpolicyRecurrence = new EcoreExecutorProperty(ModemoPackage.Literals.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_RECURRENCE, Types._Recurringschedulingpolicy, 2);
		public static final /*@NonNull*/ ExecutorProperty _Recurringschedulingpolicy__recurringschedulingpolicyStartDate = new EcoreExecutorProperty(ModemoPackage.Literals.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_START_DATE, Types._Recurringschedulingpolicy, 3);

		public static final /*@NonNull*/ ExecutorProperty _Rule__ruleConsecutive = new EcoreExecutorProperty(ModemoPackage.Literals.RULE__RULE_CONSECUTIVE, Types._Rule, 0);
		public static final /*@NonNull*/ ExecutorProperty _Rule__ruleOperator = new EcoreExecutorProperty(ModemoPackage.Literals.RULE__RULE_OPERATOR, Types._Rule, 1);
		public static final /*@NonNull*/ ExecutorProperty _Rule__rulePeriod = new EcoreExecutorProperty(ModemoPackage.Literals.RULE__RULE_PERIOD, Types._Rule, 2);
		public static final /*@NonNull*/ ExecutorProperty _Rule__ruleThreshold = new EcoreExecutorProperty(ModemoPackage.Literals.RULE__RULE_THRESHOLD, Types._Rule, 3);

		public static final /*@NonNull*/ ExecutorProperty _Step__stepLowerStepBound = new EcoreExecutorProperty(ModemoPackage.Literals.STEP__STEP_LOWER_STEP_BOUND, Types._Step, 0);
		public static final /*@NonNull*/ ExecutorProperty _Step__stepSize = new EcoreExecutorProperty(ModemoPackage.Literals.STEP__STEP_SIZE, Types._Step, 1);
		public static final /*@NonNull*/ ExecutorProperty _Step__stepUpperStepBound = new EcoreExecutorProperty(ModemoPackage.Literals.STEP__STEP_UPPER_STEP_BOUND, Types._Step, 2);

		public static final /*@NonNull*/ ExecutorProperty _Uniqueschedulingpolicy__uniqueschedulingpolicyEndDate = new EcoreExecutorProperty(ModemoPackage.Literals.UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_END_DATE, Types._Uniqueschedulingpolicy, 0);
		public static final /*@NonNull*/ ExecutorProperty _Uniqueschedulingpolicy__uniqueschedulingpolicyStartDate = new EcoreExecutorProperty(ModemoPackage.Literals.UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_START_DATE, Types._Uniqueschedulingpolicy, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModemoTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ActionOperation =
			{
				Fragments._ActionOperation__OclAny /* 0 */,
				Fragments._ActionOperation__OclElement /* 1 */,
				Fragments._ActionOperation__OclType /* 2 */,
				Fragments._ActionOperation__OclEnumeration /* 3 */,
				Fragments._ActionOperation__ActionOperation /* 4 */
			};
		private static final int /*@NonNull*/ [] __ActionOperation = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ActionType =
			{
				Fragments._ActionType__OclAny /* 0 */,
				Fragments._ActionType__OclElement /* 1 */,
				Fragments._ActionType__OclType /* 2 */,
				Fragments._ActionType__OclEnumeration /* 3 */,
				Fragments._ActionType__ActionType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ActionType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Actiontrigger =
			{
				Fragments._Actiontrigger__OclAny /* 0 */,
				Fragments._Actiontrigger__OclElement /* 1 */,
				Fragments._Actiontrigger__Entity /* 2 */,
				Fragments._Actiontrigger__Resource /* 3 */,
				Fragments._Actiontrigger__Actiontrigger /* 4 */
			};
		private static final int /*@NonNull*/ [] __Actiontrigger = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Allocationpolicy =
			{
				Fragments._Allocationpolicy__OclAny /* 0 */,
				Fragments._Allocationpolicy__OclElement /* 1 */,
				Fragments._Allocationpolicy__MixinBase /* 2 */,
				Fragments._Allocationpolicy__Allocationpolicy /* 3 */
			};
		private static final int /*@NonNull*/ [] __Allocationpolicy = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Amazonprovider =
			{
				Fragments._Amazonprovider__OclAny /* 0 */,
				Fragments._Amazonprovider__OclElement /* 1 */,
				Fragments._Amazonprovider__Entity /* 2 */,
				Fragments._Amazonprovider__Resource /* 3 */,
				Fragments._Amazonprovider__Provider /* 4 */,
				Fragments._Amazonprovider__Amazonprovider /* 5 */
			};
		private static final int /*@NonNull*/ [] __Amazonprovider = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Array =
			{
				Fragments._Array__OclAny /* 0 */,
				Fragments._Array__OclElement /* 1 */,
				Fragments._Array__Array /* 2 */
			};
		private static final int /*@NonNull*/ [] __Array = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ArrofRecStep =
			{
				Fragments._ArrofRecStep__OclAny /* 0 */,
				Fragments._ArrofRecStep__OclElement /* 1 */,
				Fragments._ArrofRecStep__ArrofRecStep /* 2 */
			};
		private static final int /*@NonNull*/ [] __ArrofRecStep = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Availableresources =
			{
				Fragments._Availableresources__OclAny /* 0 */,
				Fragments._Availableresources__OclElement /* 1 */,
				Fragments._Availableresources__MixinBase /* 2 */,
				Fragments._Availableresources__Allocationpolicy /* 3 */,
				Fragments._Availableresources__Availableresources /* 4 */
			};
		private static final int /*@NonNull*/ [] __Availableresources = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Availableresourcesorload =
			{
				Fragments._Availableresourcesorload__OclAny /* 0 */,
				Fragments._Availableresourcesorload__OclElement /* 1 */,
				Fragments._Availableresourcesorload__MixinBase /* 2 */,
				Fragments._Availableresourcesorload__Targetmigrationpolicy /* 3 */,
				Fragments._Availableresourcesorload__Availableresourcesorload /* 4 */
			};
		private static final int /*@NonNull*/ [] __Availableresourcesorload = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Azureprovider =
			{
				Fragments._Azureprovider__OclAny /* 0 */,
				Fragments._Azureprovider__OclElement /* 1 */,
				Fragments._Azureprovider__Entity /* 2 */,
				Fragments._Azureprovider__Resource /* 3 */,
				Fragments._Azureprovider__Provider /* 4 */,
				Fragments._Azureprovider__Azureprovider /* 5 */
			};
		private static final int /*@NonNull*/ [] __Azureprovider = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cost =
			{
				Fragments._Cost__OclAny /* 0 */,
				Fragments._Cost__OclElement /* 1 */,
				Fragments._Cost__MixinBase /* 2 */,
				Fragments._Cost__Allocationpolicy /* 3 */,
				Fragments._Cost__Cost /* 4 */
			};
		private static final int /*@NonNull*/ [] __Cost = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cpuutilisation =
			{
				Fragments._Cpuutilisation__OclAny /* 0 */,
				Fragments._Cpuutilisation__OclElement /* 1 */,
				Fragments._Cpuutilisation__MixinBase /* 2 */,
				Fragments._Cpuutilisation__Metric /* 3 */,
				Fragments._Cpuutilisation__Cpuutilisation /* 4 */
			};
		private static final int /*@NonNull*/ [] __Cpuutilisation = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Creation =
			{
				Fragments._Creation__OclAny /* 0 */,
				Fragments._Creation__OclElement /* 1 */,
				Fragments._Creation__MixinBase /* 2 */,
				Fragments._Creation__Creation /* 3 */
			};
		private static final int /*@NonNull*/ [] __Creation = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Date =
			{
				Fragments._Date__OclAny /* 0 */,
				Fragments._Date__OclComparable /* 1 */,
				Fragments._Date__Date /* 2 */
			};
		private static final int /*@NonNull*/ [] __Date = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Dynamicadjustmentscalingpolicy =
			{
				Fragments._Dynamicadjustmentscalingpolicy__OclAny /* 0 */,
				Fragments._Dynamicadjustmentscalingpolicy__OclElement /* 1 */,
				Fragments._Dynamicadjustmentscalingpolicy__MixinBase /* 2 */,
				Fragments._Dynamicadjustmentscalingpolicy__Scalingpolicy /* 3 */,
				Fragments._Dynamicadjustmentscalingpolicy__Dynamicscalingpolicy /* 4 */,
				Fragments._Dynamicadjustmentscalingpolicy__Dynamicadjustmentscalingpolicy /* 5 */
			};
		private static final int /*@NonNull*/ [] __Dynamicadjustmentscalingpolicy = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Dynamicmigrationpolicy =
			{
				Fragments._Dynamicmigrationpolicy__OclAny /* 0 */,
				Fragments._Dynamicmigrationpolicy__OclElement /* 1 */,
				Fragments._Dynamicmigrationpolicy__MixinBase /* 2 */,
				Fragments._Dynamicmigrationpolicy__Sourcemigrationpolicy /* 3 */,
				Fragments._Dynamicmigrationpolicy__Dynamicmigrationpolicy /* 4 */
			};
		private static final int /*@NonNull*/ [] __Dynamicmigrationpolicy = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Dynamicscalingpolicy =
			{
				Fragments._Dynamicscalingpolicy__OclAny /* 0 */,
				Fragments._Dynamicscalingpolicy__OclElement /* 1 */,
				Fragments._Dynamicscalingpolicy__MixinBase /* 2 */,
				Fragments._Dynamicscalingpolicy__Scalingpolicy /* 3 */,
				Fragments._Dynamicscalingpolicy__Dynamicscalingpolicy /* 4 */
			};
		private static final int /*@NonNull*/ [] __Dynamicscalingpolicy = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Elasticitycontroller =
			{
				Fragments._Elasticitycontroller__OclAny /* 0 */,
				Fragments._Elasticitycontroller__OclElement /* 1 */,
				Fragments._Elasticitycontroller__Entity /* 2 */,
				Fragments._Elasticitycontroller__Resource /* 3 */,
				Fragments._Elasticitycontroller__Elasticitycontroller /* 4 */
			};
		private static final int /*@NonNull*/ [] __Elasticitycontroller = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Elasticlink =
			{
				Fragments._Elasticlink__OclAny /* 0 */,
				Fragments._Elasticlink__OclElement /* 1 */,
				Fragments._Elasticlink__Entity /* 2 */,
				Fragments._Elasticlink__Link /* 3 */,
				Fragments._Elasticlink__Elasticlink /* 4 */
			};
		private static final int /*@NonNull*/ [] __Elasticlink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _First =
			{
				Fragments._First__OclAny /* 0 */,
				Fragments._First__OclElement /* 1 */,
				Fragments._First__MixinBase /* 2 */,
				Fragments._First__Loadbalancerpolicy /* 3 */,
				Fragments._First__First /* 4 */
			};
		private static final int /*@NonNull*/ [] __First = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Float =
			{
				Fragments._Float__OclAny /* 0 */,
				Fragments._Float__Float /* 1 */
			};
		private static final int /*@NonNull*/ [] __Float = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Horizontalgroup =
			{
				Fragments._Horizontalgroup__OclAny /* 0 */,
				Fragments._Horizontalgroup__OclElement /* 1 */,
				Fragments._Horizontalgroup__Entity /* 2 */,
				Fragments._Horizontalgroup__Resource /* 3 */,
				Fragments._Horizontalgroup__Horizontalgroup /* 4 */
			};
		private static final int /*@NonNull*/ [] __Horizontalgroup = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Instancegrouplink =
			{
				Fragments._Instancegrouplink__OclAny /* 0 */,
				Fragments._Instancegrouplink__OclElement /* 1 */,
				Fragments._Instancegrouplink__Entity /* 2 */,
				Fragments._Instancegrouplink__Link /* 3 */,
				Fragments._Instancegrouplink__Instancegrouplink /* 4 */
			};
		private static final int /*@NonNull*/ [] __Instancegrouplink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Leastconn =
			{
				Fragments._Leastconn__OclAny /* 0 */,
				Fragments._Leastconn__OclElement /* 1 */,
				Fragments._Leastconn__MixinBase /* 2 */,
				Fragments._Leastconn__Loadbalancerpolicy /* 3 */,
				Fragments._Leastconn__Leastconn /* 4 */
			};
		private static final int /*@NonNull*/ [] __Leastconn = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Leastlatency =
			{
				Fragments._Leastlatency__OclAny /* 0 */,
				Fragments._Leastlatency__OclElement /* 1 */,
				Fragments._Leastlatency__MixinBase /* 2 */,
				Fragments._Leastlatency__Loadbalancerpolicy /* 3 */,
				Fragments._Leastlatency__Leastlatency /* 4 */
			};
		private static final int /*@NonNull*/ [] __Leastlatency = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Leasttraffic =
			{
				Fragments._Leasttraffic__OclAny /* 0 */,
				Fragments._Leasttraffic__OclElement /* 1 */,
				Fragments._Leasttraffic__MixinBase /* 2 */,
				Fragments._Leasttraffic__Loadbalancerpolicy /* 3 */,
				Fragments._Leasttraffic__Leasttraffic /* 4 */
			};
		private static final int /*@NonNull*/ [] __Leasttraffic = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Livemigration =
			{
				Fragments._Livemigration__OclAny /* 0 */,
				Fragments._Livemigration__OclElement /* 1 */,
				Fragments._Livemigration__MixinBase /* 2 */,
				Fragments._Livemigration__Migrationpolicy /* 3 */,
				Fragments._Livemigration__Livemigration /* 4 */
			};
		private static final int /*@NonNull*/ [] __Livemigration = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Loadbalancer =
			{
				Fragments._Loadbalancer__OclAny /* 0 */,
				Fragments._Loadbalancer__OclElement /* 1 */,
				Fragments._Loadbalancer__Entity /* 2 */,
				Fragments._Loadbalancer__Resource /* 3 */,
				Fragments._Loadbalancer__Loadbalancer /* 4 */
			};
		private static final int /*@NonNull*/ [] __Loadbalancer = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Loadbalancerlink =
			{
				Fragments._Loadbalancerlink__OclAny /* 0 */,
				Fragments._Loadbalancerlink__OclElement /* 1 */,
				Fragments._Loadbalancerlink__Entity /* 2 */,
				Fragments._Loadbalancerlink__Link /* 3 */,
				Fragments._Loadbalancerlink__Loadbalancerlink /* 4 */
			};
		private static final int /*@NonNull*/ [] __Loadbalancerlink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Loadbalancerpolicy =
			{
				Fragments._Loadbalancerpolicy__OclAny /* 0 */,
				Fragments._Loadbalancerpolicy__OclElement /* 1 */,
				Fragments._Loadbalancerpolicy__MixinBase /* 2 */,
				Fragments._Loadbalancerpolicy__Loadbalancerpolicy /* 3 */
			};
		private static final int /*@NonNull*/ [] __Loadbalancerpolicy = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Loadvolume =
			{
				Fragments._Loadvolume__OclAny /* 0 */,
				Fragments._Loadvolume__OclElement /* 1 */,
				Fragments._Loadvolume__MixinBase /* 2 */,
				Fragments._Loadvolume__Sourcemigrationpolicy /* 3 */,
				Fragments._Loadvolume__Dynamicmigrationpolicy /* 4 */,
				Fragments._Loadvolume__Loadvolume /* 5 */
			};
		private static final int /*@NonNull*/ [] __Loadvolume = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Manualmigrationpolicy =
			{
				Fragments._Manualmigrationpolicy__OclAny /* 0 */,
				Fragments._Manualmigrationpolicy__OclElement /* 1 */,
				Fragments._Manualmigrationpolicy__MixinBase /* 2 */,
				Fragments._Manualmigrationpolicy__Sourcemigrationpolicy /* 3 */,
				Fragments._Manualmigrationpolicy__Manualmigrationpolicy /* 4 */
			};
		private static final int /*@NonNull*/ [] __Manualmigrationpolicy = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Manualscalingpolicy =
			{
				Fragments._Manualscalingpolicy__OclAny /* 0 */,
				Fragments._Manualscalingpolicy__OclElement /* 1 */,
				Fragments._Manualscalingpolicy__MixinBase /* 2 */,
				Fragments._Manualscalingpolicy__Scalingpolicy /* 3 */,
				Fragments._Manualscalingpolicy__Manualscalingpolicy /* 4 */
			};
		private static final int /*@NonNull*/ [] __Manualscalingpolicy = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Manualtargetselection =
			{
				Fragments._Manualtargetselection__OclAny /* 0 */,
				Fragments._Manualtargetselection__OclElement /* 1 */,
				Fragments._Manualtargetselection__MixinBase /* 2 */,
				Fragments._Manualtargetselection__Targetmigrationpolicy /* 3 */,
				Fragments._Manualtargetselection__Manualtargetselection /* 4 */
			};
		private static final int /*@NonNull*/ [] __Manualtargetselection = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Memoryutilisation =
			{
				Fragments._Memoryutilisation__OclAny /* 0 */,
				Fragments._Memoryutilisation__OclElement /* 1 */,
				Fragments._Memoryutilisation__MixinBase /* 2 */,
				Fragments._Memoryutilisation__Metric /* 3 */,
				Fragments._Memoryutilisation__Memoryutilisation /* 4 */
			};
		private static final int /*@NonNull*/ [] __Memoryutilisation = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Metric =
			{
				Fragments._Metric__OclAny /* 0 */,
				Fragments._Metric__OclElement /* 1 */,
				Fragments._Metric__MixinBase /* 2 */,
				Fragments._Metric__Metric /* 3 */
			};
		private static final int /*@NonNull*/ [] __Metric = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _MetricTargetTracking =
			{
				Fragments._MetricTargetTracking__OclAny /* 0 */,
				Fragments._MetricTargetTracking__OclElement /* 1 */,
				Fragments._MetricTargetTracking__OclType /* 2 */,
				Fragments._MetricTargetTracking__OclEnumeration /* 3 */,
				Fragments._MetricTargetTracking__MetricTargetTracking /* 4 */
			};
		private static final int /*@NonNull*/ [] __MetricTargetTracking = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Migrationpolicy =
			{
				Fragments._Migrationpolicy__OclAny /* 0 */,
				Fragments._Migrationpolicy__OclElement /* 1 */,
				Fragments._Migrationpolicy__MixinBase /* 2 */,
				Fragments._Migrationpolicy__Migrationpolicy /* 3 */
			};
		private static final int /*@NonNull*/ [] __Migrationpolicy = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Nonlivemigration =
			{
				Fragments._Nonlivemigration__OclAny /* 0 */,
				Fragments._Nonlivemigration__OclElement /* 1 */,
				Fragments._Nonlivemigration__MixinBase /* 2 */,
				Fragments._Nonlivemigration__Migrationpolicy /* 3 */,
				Fragments._Nonlivemigration__Nonlivemigration /* 4 */
			};
		private static final int /*@NonNull*/ [] __Nonlivemigration = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Openstackprovider =
			{
				Fragments._Openstackprovider__OclAny /* 0 */,
				Fragments._Openstackprovider__OclElement /* 1 */,
				Fragments._Openstackprovider__Entity /* 2 */,
				Fragments._Openstackprovider__Resource /* 3 */,
				Fragments._Openstackprovider__Provider /* 4 */,
				Fragments._Openstackprovider__Openstackprovider /* 5 */
			};
		private static final int /*@NonNull*/ [] __Openstackprovider = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _OperatorType =
			{
				Fragments._OperatorType__OclAny /* 0 */,
				Fragments._OperatorType__OclElement /* 1 */,
				Fragments._OperatorType__OclType /* 2 */,
				Fragments._OperatorType__OclEnumeration /* 3 */,
				Fragments._OperatorType__OperatorType /* 4 */
			};
		private static final int /*@NonNull*/ [] __OperatorType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Power =
			{
				Fragments._Power__OclAny /* 0 */,
				Fragments._Power__OclElement /* 1 */,
				Fragments._Power__MixinBase /* 2 */,
				Fragments._Power__Sourcemigrationpolicy /* 3 */,
				Fragments._Power__Dynamicmigrationpolicy /* 4 */,
				Fragments._Power__Power /* 5 */
			};
		private static final int /*@NonNull*/ [] __Power = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Provider =
			{
				Fragments._Provider__OclAny /* 0 */,
				Fragments._Provider__OclElement /* 1 */,
				Fragments._Provider__Entity /* 2 */,
				Fragments._Provider__Resource /* 3 */,
				Fragments._Provider__Provider /* 4 */
			};
		private static final int /*@NonNull*/ [] __Provider = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Providerinstancelink =
			{
				Fragments._Providerinstancelink__OclAny /* 0 */,
				Fragments._Providerinstancelink__OclElement /* 1 */,
				Fragments._Providerinstancelink__Entity /* 2 */,
				Fragments._Providerinstancelink__Link /* 3 */,
				Fragments._Providerinstancelink__Providerinstancelink /* 4 */
			};
		private static final int /*@NonNull*/ [] __Providerinstancelink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Providerlink =
			{
				Fragments._Providerlink__OclAny /* 0 */,
				Fragments._Providerlink__OclElement /* 1 */,
				Fragments._Providerlink__Entity /* 2 */,
				Fragments._Providerlink__Link /* 3 */,
				Fragments._Providerlink__Providerlink /* 4 */
			};
		private static final int /*@NonNull*/ [] __Providerlink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _RecurrenceStep =
			{
				Fragments._RecurrenceStep__OclAny /* 0 */,
				Fragments._RecurrenceStep__OclElement /* 1 */,
				Fragments._RecurrenceStep__RecurrenceStep /* 2 */
			};
		private static final int /*@NonNull*/ [] __RecurrenceStep = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Recurringschedulingpolicy =
			{
				Fragments._Recurringschedulingpolicy__OclAny /* 0 */,
				Fragments._Recurringschedulingpolicy__OclElement /* 1 */,
				Fragments._Recurringschedulingpolicy__MixinBase /* 2 */,
				Fragments._Recurringschedulingpolicy__Schedulingpolicy /* 3 */,
				Fragments._Recurringschedulingpolicy__Recurringschedulingpolicy /* 4 */
			};
		private static final int /*@NonNull*/ [] __Recurringschedulingpolicy = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Responsetime =
			{
				Fragments._Responsetime__OclAny /* 0 */,
				Fragments._Responsetime__OclElement /* 1 */,
				Fragments._Responsetime__MixinBase /* 2 */,
				Fragments._Responsetime__Allocationpolicy /* 3 */,
				Fragments._Responsetime__Responsetime /* 4 */
			};
		private static final int /*@NonNull*/ [] __Responsetime = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Responsetimemetric =
			{
				Fragments._Responsetimemetric__OclAny /* 0 */,
				Fragments._Responsetimemetric__OclElement /* 1 */,
				Fragments._Responsetimemetric__MixinBase /* 2 */,
				Fragments._Responsetimemetric__Metric /* 3 */,
				Fragments._Responsetimemetric__Responsetimemetric /* 4 */
			};
		private static final int /*@NonNull*/ [] __Responsetimemetric = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Roundrobin =
			{
				Fragments._Roundrobin__OclAny /* 0 */,
				Fragments._Roundrobin__OclElement /* 1 */,
				Fragments._Roundrobin__MixinBase /* 2 */,
				Fragments._Roundrobin__Allocationpolicy /* 3 */,
				Fragments._Roundrobin__Roundrobin /* 4 */
			};
		private static final int /*@NonNull*/ [] __Roundrobin = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Roundrobinalgo =
			{
				Fragments._Roundrobinalgo__OclAny /* 0 */,
				Fragments._Roundrobinalgo__OclElement /* 1 */,
				Fragments._Roundrobinalgo__MixinBase /* 2 */,
				Fragments._Roundrobinalgo__Loadbalancerpolicy /* 3 */,
				Fragments._Roundrobinalgo__Roundrobinalgo /* 4 */
			};
		private static final int /*@NonNull*/ [] __Roundrobinalgo = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Rule =
			{
				Fragments._Rule__OclAny /* 0 */,
				Fragments._Rule__OclElement /* 1 */,
				Fragments._Rule__Entity /* 2 */,
				Fragments._Rule__Link /* 3 */,
				Fragments._Rule__Rule /* 4 */
			};
		private static final int /*@NonNull*/ [] __Rule = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Scalingpolicy =
			{
				Fragments._Scalingpolicy__OclAny /* 0 */,
				Fragments._Scalingpolicy__OclElement /* 1 */,
				Fragments._Scalingpolicy__MixinBase /* 2 */,
				Fragments._Scalingpolicy__Scalingpolicy /* 3 */
			};
		private static final int /*@NonNull*/ [] __Scalingpolicy = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Schedulingpolicy =
			{
				Fragments._Schedulingpolicy__OclAny /* 0 */,
				Fragments._Schedulingpolicy__OclElement /* 1 */,
				Fragments._Schedulingpolicy__MixinBase /* 2 */,
				Fragments._Schedulingpolicy__Schedulingpolicy /* 3 */
			};
		private static final int /*@NonNull*/ [] __Schedulingpolicy = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Simpledynamicscalingpolicy =
			{
				Fragments._Simpledynamicscalingpolicy__OclAny /* 0 */,
				Fragments._Simpledynamicscalingpolicy__OclElement /* 1 */,
				Fragments._Simpledynamicscalingpolicy__MixinBase /* 2 */,
				Fragments._Simpledynamicscalingpolicy__Scalingpolicy /* 3 */,
				Fragments._Simpledynamicscalingpolicy__Dynamicscalingpolicy /* 4 */,
				Fragments._Simpledynamicscalingpolicy__Simpledynamicscalingpolicy /* 5 */
			};
		private static final int /*@NonNull*/ [] __Simpledynamicscalingpolicy = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Source =
			{
				Fragments._Source__OclAny /* 0 */,
				Fragments._Source__OclElement /* 1 */,
				Fragments._Source__MixinBase /* 2 */,
				Fragments._Source__Loadbalancerpolicy /* 3 */,
				Fragments._Source__Source /* 4 */
			};
		private static final int /*@NonNull*/ [] __Source = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Sourcemigrationpolicy =
			{
				Fragments._Sourcemigrationpolicy__OclAny /* 0 */,
				Fragments._Sourcemigrationpolicy__OclElement /* 1 */,
				Fragments._Sourcemigrationpolicy__MixinBase /* 2 */,
				Fragments._Sourcemigrationpolicy__Sourcemigrationpolicy /* 3 */
			};
		private static final int /*@NonNull*/ [] __Sourcemigrationpolicy = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Step =
			{
				Fragments._Step__OclAny /* 0 */,
				Fragments._Step__OclElement /* 1 */,
				Fragments._Step__Entity /* 2 */,
				Fragments._Step__Resource /* 3 */,
				Fragments._Step__Step /* 4 */
			};
		private static final int /*@NonNull*/ [] __Step = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Stepdynamicscalingpolicy =
			{
				Fragments._Stepdynamicscalingpolicy__OclAny /* 0 */,
				Fragments._Stepdynamicscalingpolicy__OclElement /* 1 */,
				Fragments._Stepdynamicscalingpolicy__MixinBase /* 2 */,
				Fragments._Stepdynamicscalingpolicy__Scalingpolicy /* 3 */,
				Fragments._Stepdynamicscalingpolicy__Dynamicscalingpolicy /* 4 */,
				Fragments._Stepdynamicscalingpolicy__Stepdynamicscalingpolicy /* 5 */
			};
		private static final int /*@NonNull*/ [] __Stepdynamicscalingpolicy = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Steplink =
			{
				Fragments._Steplink__OclAny /* 0 */,
				Fragments._Steplink__OclElement /* 1 */,
				Fragments._Steplink__Entity /* 2 */,
				Fragments._Steplink__Link /* 3 */,
				Fragments._Steplink__Steplink /* 4 */
			};
		private static final int /*@NonNull*/ [] __Steplink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Swappingpolicy =
			{
				Fragments._Swappingpolicy__OclAny /* 0 */,
				Fragments._Swappingpolicy__OclElement /* 1 */,
				Fragments._Swappingpolicy__MixinBase /* 2 */,
				Fragments._Swappingpolicy__Swappingpolicy /* 3 */
			};
		private static final int /*@NonNull*/ [] __Swappingpolicy = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Targetmigrationpolicy =
			{
				Fragments._Targetmigrationpolicy__OclAny /* 0 */,
				Fragments._Targetmigrationpolicy__OclElement /* 1 */,
				Fragments._Targetmigrationpolicy__MixinBase /* 2 */,
				Fragments._Targetmigrationpolicy__Targetmigrationpolicy /* 3 */
			};
		private static final int /*@NonNull*/ [] __Targetmigrationpolicy = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Targetresponsetime =
			{
				Fragments._Targetresponsetime__OclAny /* 0 */,
				Fragments._Targetresponsetime__OclElement /* 1 */,
				Fragments._Targetresponsetime__MixinBase /* 2 */,
				Fragments._Targetresponsetime__Targetmigrationpolicy /* 3 */,
				Fragments._Targetresponsetime__Targetresponsetime /* 4 */
			};
		private static final int /*@NonNull*/ [] __Targetresponsetime = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Uniqueschedulingpolicy =
			{
				Fragments._Uniqueschedulingpolicy__OclAny /* 0 */,
				Fragments._Uniqueschedulingpolicy__OclElement /* 1 */,
				Fragments._Uniqueschedulingpolicy__MixinBase /* 2 */,
				Fragments._Uniqueschedulingpolicy__Schedulingpolicy /* 3 */,
				Fragments._Uniqueschedulingpolicy__Uniqueschedulingpolicy /* 4 */
			};
		private static final int /*@NonNull*/ [] __Uniqueschedulingpolicy = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Unit =
			{
				Fragments._Unit__OclAny /* 0 */,
				Fragments._Unit__OclElement /* 1 */,
				Fragments._Unit__OclType /* 2 */,
				Fragments._Unit__OclEnumeration /* 3 */,
				Fragments._Unit__Unit /* 4 */
			};
		private static final int /*@NonNull*/ [] __Unit = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Vmwareprovider =
			{
				Fragments._Vmwareprovider__OclAny /* 0 */,
				Fragments._Vmwareprovider__OclElement /* 1 */,
				Fragments._Vmwareprovider__Entity /* 2 */,
				Fragments._Vmwareprovider__Resource /* 3 */,
				Fragments._Vmwareprovider__Provider /* 4 */,
				Fragments._Vmwareprovider__Vmwareprovider /* 5 */
			};
		private static final int /*@NonNull*/ [] __Vmwareprovider = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Wstaticrr =
			{
				Fragments._Wstaticrr__OclAny /* 0 */,
				Fragments._Wstaticrr__OclElement /* 1 */,
				Fragments._Wstaticrr__MixinBase /* 2 */,
				Fragments._Wstaticrr__Loadbalancerpolicy /* 3 */,
				Fragments._Wstaticrr__Wstaticrr /* 4 */
			};
		private static final int /*@NonNull*/ [] __Wstaticrr = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._ActionOperation.initFragments(_ActionOperation, __ActionOperation);
			Types._ActionType.initFragments(_ActionType, __ActionType);
			Types._Actiontrigger.initFragments(_Actiontrigger, __Actiontrigger);
			Types._Allocationpolicy.initFragments(_Allocationpolicy, __Allocationpolicy);
			Types._Amazonprovider.initFragments(_Amazonprovider, __Amazonprovider);
			Types._Array.initFragments(_Array, __Array);
			Types._ArrofRecStep.initFragments(_ArrofRecStep, __ArrofRecStep);
			Types._Availableresources.initFragments(_Availableresources, __Availableresources);
			Types._Availableresourcesorload.initFragments(_Availableresourcesorload, __Availableresourcesorload);
			Types._Azureprovider.initFragments(_Azureprovider, __Azureprovider);
			Types._Cost.initFragments(_Cost, __Cost);
			Types._Cpuutilisation.initFragments(_Cpuutilisation, __Cpuutilisation);
			Types._Creation.initFragments(_Creation, __Creation);
			Types._Date.initFragments(_Date, __Date);
			Types._Dynamicadjustmentscalingpolicy.initFragments(_Dynamicadjustmentscalingpolicy, __Dynamicadjustmentscalingpolicy);
			Types._Dynamicmigrationpolicy.initFragments(_Dynamicmigrationpolicy, __Dynamicmigrationpolicy);
			Types._Dynamicscalingpolicy.initFragments(_Dynamicscalingpolicy, __Dynamicscalingpolicy);
			Types._Elasticitycontroller.initFragments(_Elasticitycontroller, __Elasticitycontroller);
			Types._Elasticlink.initFragments(_Elasticlink, __Elasticlink);
			Types._First.initFragments(_First, __First);
			Types._Float.initFragments(_Float, __Float);
			Types._Horizontalgroup.initFragments(_Horizontalgroup, __Horizontalgroup);
			Types._Instancegrouplink.initFragments(_Instancegrouplink, __Instancegrouplink);
			Types._Leastconn.initFragments(_Leastconn, __Leastconn);
			Types._Leastlatency.initFragments(_Leastlatency, __Leastlatency);
			Types._Leasttraffic.initFragments(_Leasttraffic, __Leasttraffic);
			Types._Livemigration.initFragments(_Livemigration, __Livemigration);
			Types._Loadbalancer.initFragments(_Loadbalancer, __Loadbalancer);
			Types._Loadbalancerlink.initFragments(_Loadbalancerlink, __Loadbalancerlink);
			Types._Loadbalancerpolicy.initFragments(_Loadbalancerpolicy, __Loadbalancerpolicy);
			Types._Loadvolume.initFragments(_Loadvolume, __Loadvolume);
			Types._Manualmigrationpolicy.initFragments(_Manualmigrationpolicy, __Manualmigrationpolicy);
			Types._Manualscalingpolicy.initFragments(_Manualscalingpolicy, __Manualscalingpolicy);
			Types._Manualtargetselection.initFragments(_Manualtargetselection, __Manualtargetselection);
			Types._Memoryutilisation.initFragments(_Memoryutilisation, __Memoryutilisation);
			Types._Metric.initFragments(_Metric, __Metric);
			Types._MetricTargetTracking.initFragments(_MetricTargetTracking, __MetricTargetTracking);
			Types._Migrationpolicy.initFragments(_Migrationpolicy, __Migrationpolicy);
			Types._Nonlivemigration.initFragments(_Nonlivemigration, __Nonlivemigration);
			Types._Openstackprovider.initFragments(_Openstackprovider, __Openstackprovider);
			Types._OperatorType.initFragments(_OperatorType, __OperatorType);
			Types._Power.initFragments(_Power, __Power);
			Types._Provider.initFragments(_Provider, __Provider);
			Types._Providerinstancelink.initFragments(_Providerinstancelink, __Providerinstancelink);
			Types._Providerlink.initFragments(_Providerlink, __Providerlink);
			Types._RecurrenceStep.initFragments(_RecurrenceStep, __RecurrenceStep);
			Types._Recurringschedulingpolicy.initFragments(_Recurringschedulingpolicy, __Recurringschedulingpolicy);
			Types._Responsetime.initFragments(_Responsetime, __Responsetime);
			Types._Responsetimemetric.initFragments(_Responsetimemetric, __Responsetimemetric);
			Types._Roundrobin.initFragments(_Roundrobin, __Roundrobin);
			Types._Roundrobinalgo.initFragments(_Roundrobinalgo, __Roundrobinalgo);
			Types._Rule.initFragments(_Rule, __Rule);
			Types._Scalingpolicy.initFragments(_Scalingpolicy, __Scalingpolicy);
			Types._Schedulingpolicy.initFragments(_Schedulingpolicy, __Schedulingpolicy);
			Types._Simpledynamicscalingpolicy.initFragments(_Simpledynamicscalingpolicy, __Simpledynamicscalingpolicy);
			Types._Source.initFragments(_Source, __Source);
			Types._Sourcemigrationpolicy.initFragments(_Sourcemigrationpolicy, __Sourcemigrationpolicy);
			Types._Step.initFragments(_Step, __Step);
			Types._Stepdynamicscalingpolicy.initFragments(_Stepdynamicscalingpolicy, __Stepdynamicscalingpolicy);
			Types._Steplink.initFragments(_Steplink, __Steplink);
			Types._Swappingpolicy.initFragments(_Swappingpolicy, __Swappingpolicy);
			Types._Targetmigrationpolicy.initFragments(_Targetmigrationpolicy, __Targetmigrationpolicy);
			Types._Targetresponsetime.initFragments(_Targetresponsetime, __Targetresponsetime);
			Types._Uniqueschedulingpolicy.initFragments(_Uniqueschedulingpolicy, __Uniqueschedulingpolicy);
			Types._Unit.initFragments(_Unit, __Unit);
			Types._Vmwareprovider.initFragments(_Vmwareprovider, __Vmwareprovider);
			Types._Wstaticrr.initFragments(_Wstaticrr, __Wstaticrr);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModemoTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ActionOperation__ActionOperation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ActionOperation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ActionOperation__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ActionOperation__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ActionOperation__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ActionType__ActionType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ActionType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ActionType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ActionType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ActionType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actiontrigger__Actiontrigger = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actiontrigger__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actiontrigger__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actiontrigger__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actiontrigger__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Allocationpolicy__Allocationpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Allocationpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Allocationpolicy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Allocationpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Amazonprovider__Amazonprovider = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Amazonprovider__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Amazonprovider__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Amazonprovider__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Amazonprovider__Provider = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Amazonprovider__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Array__Array = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Array__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Array__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrofRecStep__ArrofRecStep = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrofRecStep__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrofRecStep__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availableresources__Availableresources = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availableresources__Allocationpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availableresources__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availableresources__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availableresources__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availableresourcesorload__Availableresourcesorload = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availableresourcesorload__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availableresourcesorload__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availableresourcesorload__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availableresourcesorload__Targetmigrationpolicy = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Azureprovider__Azureprovider = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Azureprovider__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Azureprovider__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Azureprovider__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Azureprovider__Provider = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Azureprovider__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cost__Cost = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cost__Allocationpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cost__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cost__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cost__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuutilisation__Cpuutilisation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuutilisation__Metric = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuutilisation__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuutilisation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuutilisation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Creation__Creation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Creation__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Creation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Creation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Date__Date = {
			ModemoTables.Operations._Date__compareTo /* compareTo(OclSelf[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Date__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Date__OclComparable = {
			OCLstdlibTables.Operations._OclComparable___lt_ /* _'<'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___lt__eq_ /* _'<='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___gt_ /* _'>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___gt__eq_ /* _'>='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable__compareTo /* compareTo(OclSelf[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicadjustmentscalingpolicy__Dynamicadjustmentscalingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicadjustmentscalingpolicy__Dynamicscalingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicadjustmentscalingpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicadjustmentscalingpolicy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicadjustmentscalingpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicadjustmentscalingpolicy__Scalingpolicy = {
			ModemoTables.Operations._Scalingpolicy__start /* start() */,
			ModemoTables.Operations._Scalingpolicy__stop /* stop() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicmigrationpolicy__Dynamicmigrationpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicmigrationpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicmigrationpolicy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicmigrationpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicmigrationpolicy__Sourcemigrationpolicy = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicscalingpolicy__Dynamicscalingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicscalingpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicscalingpolicy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicscalingpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicscalingpolicy__Scalingpolicy = {
			ModemoTables.Operations._Scalingpolicy__start /* start() */,
			ModemoTables.Operations._Scalingpolicy__stop /* stop() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticitycontroller__Elasticitycontroller = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticitycontroller__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticitycontroller__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticitycontroller__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticitycontroller__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticlink__Elasticlink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticlink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticlink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticlink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticlink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _First__First = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _First__Loadbalancerpolicy = {
			ModemoTables.Operations._Loadbalancerpolicy__start /* start() */,
			ModemoTables.Operations._Loadbalancerpolicy__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _First__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _First__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _First__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Float__Float = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Float__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Horizontalgroup__Horizontalgroup = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Horizontalgroup__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Horizontalgroup__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Horizontalgroup__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Horizontalgroup__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancegrouplink__Instancegrouplink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancegrouplink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancegrouplink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancegrouplink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancegrouplink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Leastconn__Leastconn = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Leastconn__Loadbalancerpolicy = {
			ModemoTables.Operations._Loadbalancerpolicy__start /* start() */,
			ModemoTables.Operations._Loadbalancerpolicy__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Leastconn__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Leastconn__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Leastconn__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Leastlatency__Leastlatency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Leastlatency__Loadbalancerpolicy = {
			ModemoTables.Operations._Loadbalancerpolicy__start /* start() */,
			ModemoTables.Operations._Loadbalancerpolicy__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Leastlatency__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Leastlatency__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Leastlatency__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Leasttraffic__Leasttraffic = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Leasttraffic__Loadbalancerpolicy = {
			ModemoTables.Operations._Loadbalancerpolicy__start /* start() */,
			ModemoTables.Operations._Loadbalancerpolicy__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Leasttraffic__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Leasttraffic__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Leasttraffic__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Livemigration__Livemigration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Livemigration__Migrationpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Livemigration__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Livemigration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Livemigration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancer__Loadbalancer = {
			ModemoTables.Operations._Loadbalancer__addbackendserver /* addbackendserver() */,
			ModemoTables.Operations._Loadbalancer__removebackendserver /* removebackendserver() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancer__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancer__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancerlink__Loadbalancerlink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancerlink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancerlink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancerlink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancerlink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancerpolicy__Loadbalancerpolicy = {
			ModemoTables.Operations._Loadbalancerpolicy__start /* start() */,
			ModemoTables.Operations._Loadbalancerpolicy__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancerpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancerpolicy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancerpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadvolume__Loadvolume = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadvolume__Dynamicmigrationpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadvolume__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadvolume__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadvolume__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadvolume__Sourcemigrationpolicy = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualmigrationpolicy__Manualmigrationpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualmigrationpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualmigrationpolicy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualmigrationpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualmigrationpolicy__Sourcemigrationpolicy = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualscalingpolicy__Manualscalingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualscalingpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualscalingpolicy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualscalingpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualscalingpolicy__Scalingpolicy = {
			ModemoTables.Operations._Scalingpolicy__start /* start() */,
			ModemoTables.Operations._Scalingpolicy__stop /* stop() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualtargetselection__Manualtargetselection = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualtargetselection__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualtargetselection__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualtargetselection__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualtargetselection__Targetmigrationpolicy = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Memoryutilisation__Memoryutilisation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Memoryutilisation__Metric = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Memoryutilisation__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Memoryutilisation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Memoryutilisation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Metric__Metric = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Metric__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Metric__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Metric__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MetricTargetTracking__MetricTargetTracking = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MetricTargetTracking__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MetricTargetTracking__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MetricTargetTracking__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MetricTargetTracking__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Migrationpolicy__Migrationpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Migrationpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Migrationpolicy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Migrationpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Nonlivemigration__Nonlivemigration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Nonlivemigration__Migrationpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Nonlivemigration__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Nonlivemigration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Nonlivemigration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Openstackprovider__Openstackprovider = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Openstackprovider__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Openstackprovider__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Openstackprovider__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Openstackprovider__Provider = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Openstackprovider__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OperatorType__OperatorType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OperatorType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OperatorType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OperatorType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OperatorType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Power__Power = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Power__Dynamicmigrationpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Power__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Power__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Power__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Power__Sourcemigrationpolicy = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Provider__Provider = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Provider__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Provider__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Provider__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Provider__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Providerinstancelink__Providerinstancelink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Providerinstancelink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Providerinstancelink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Providerinstancelink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Providerinstancelink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Providerlink__Providerlink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Providerlink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Providerlink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Providerlink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Providerlink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RecurrenceStep__RecurrenceStep = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RecurrenceStep__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RecurrenceStep__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Recurringschedulingpolicy__Recurringschedulingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Recurringschedulingpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Recurringschedulingpolicy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Recurringschedulingpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Recurringschedulingpolicy__Schedulingpolicy = {
			ModemoTables.Operations._Schedulingpolicy__start /* start() */,
			ModemoTables.Operations._Schedulingpolicy__stop /* stop() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Responsetime__Responsetime = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Responsetime__Allocationpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Responsetime__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Responsetime__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Responsetime__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Responsetimemetric__Responsetimemetric = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Responsetimemetric__Metric = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Responsetimemetric__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Responsetimemetric__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Responsetimemetric__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Roundrobin__Roundrobin = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Roundrobin__Allocationpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Roundrobin__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Roundrobin__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Roundrobin__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Roundrobinalgo__Roundrobinalgo = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Roundrobinalgo__Loadbalancerpolicy = {
			ModemoTables.Operations._Loadbalancerpolicy__start /* start() */,
			ModemoTables.Operations._Loadbalancerpolicy__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Roundrobinalgo__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Roundrobinalgo__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Roundrobinalgo__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rule__Rule = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rule__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rule__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rule__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rule__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scalingpolicy__Scalingpolicy = {
			ModemoTables.Operations._Scalingpolicy__start /* start() */,
			ModemoTables.Operations._Scalingpolicy__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scalingpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scalingpolicy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scalingpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Schedulingpolicy__Schedulingpolicy = {
			ModemoTables.Operations._Schedulingpolicy__start /* start() */,
			ModemoTables.Operations._Schedulingpolicy__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Schedulingpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Schedulingpolicy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Schedulingpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Simpledynamicscalingpolicy__Simpledynamicscalingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Simpledynamicscalingpolicy__Dynamicscalingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Simpledynamicscalingpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Simpledynamicscalingpolicy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Simpledynamicscalingpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Simpledynamicscalingpolicy__Scalingpolicy = {
			ModemoTables.Operations._Scalingpolicy__start /* start() */,
			ModemoTables.Operations._Scalingpolicy__stop /* stop() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Source__Source = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Source__Loadbalancerpolicy = {
			ModemoTables.Operations._Loadbalancerpolicy__start /* start() */,
			ModemoTables.Operations._Loadbalancerpolicy__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Source__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Source__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Source__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sourcemigrationpolicy__Sourcemigrationpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sourcemigrationpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sourcemigrationpolicy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sourcemigrationpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Step__Step = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Step__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Step__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Step__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Step__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Stepdynamicscalingpolicy__Stepdynamicscalingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Stepdynamicscalingpolicy__Dynamicscalingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Stepdynamicscalingpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Stepdynamicscalingpolicy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Stepdynamicscalingpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Stepdynamicscalingpolicy__Scalingpolicy = {
			ModemoTables.Operations._Scalingpolicy__start /* start() */,
			ModemoTables.Operations._Scalingpolicy__stop /* stop() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Steplink__Steplink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Steplink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Steplink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Steplink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Steplink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swappingpolicy__Swappingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swappingpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swappingpolicy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swappingpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Targetmigrationpolicy__Targetmigrationpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Targetmigrationpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Targetmigrationpolicy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Targetmigrationpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Targetresponsetime__Targetresponsetime = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Targetresponsetime__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Targetresponsetime__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Targetresponsetime__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Targetresponsetime__Targetmigrationpolicy = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Uniqueschedulingpolicy__Uniqueschedulingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Uniqueschedulingpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Uniqueschedulingpolicy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Uniqueschedulingpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Uniqueschedulingpolicy__Schedulingpolicy = {
			ModemoTables.Operations._Schedulingpolicy__start /* start() */,
			ModemoTables.Operations._Schedulingpolicy__stop /* stop() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Unit__Unit = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Unit__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Unit__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Unit__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Unit__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vmwareprovider__Vmwareprovider = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vmwareprovider__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vmwareprovider__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vmwareprovider__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vmwareprovider__Provider = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vmwareprovider__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Wstaticrr__Wstaticrr = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Wstaticrr__Loadbalancerpolicy = {
			ModemoTables.Operations._Loadbalancerpolicy__start /* start() */,
			ModemoTables.Operations._Loadbalancerpolicy__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Wstaticrr__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Wstaticrr__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Wstaticrr__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._ActionOperation__ActionOperation.initOperations(_ActionOperation__ActionOperation);
			Fragments._ActionOperation__OclAny.initOperations(_ActionOperation__OclAny);
			Fragments._ActionOperation__OclElement.initOperations(_ActionOperation__OclElement);
			Fragments._ActionOperation__OclEnumeration.initOperations(_ActionOperation__OclEnumeration);
			Fragments._ActionOperation__OclType.initOperations(_ActionOperation__OclType);

			Fragments._ActionType__ActionType.initOperations(_ActionType__ActionType);
			Fragments._ActionType__OclAny.initOperations(_ActionType__OclAny);
			Fragments._ActionType__OclElement.initOperations(_ActionType__OclElement);
			Fragments._ActionType__OclEnumeration.initOperations(_ActionType__OclEnumeration);
			Fragments._ActionType__OclType.initOperations(_ActionType__OclType);

			Fragments._Actiontrigger__Actiontrigger.initOperations(_Actiontrigger__Actiontrigger);
			Fragments._Actiontrigger__Entity.initOperations(_Actiontrigger__Entity);
			Fragments._Actiontrigger__OclAny.initOperations(_Actiontrigger__OclAny);
			Fragments._Actiontrigger__OclElement.initOperations(_Actiontrigger__OclElement);
			Fragments._Actiontrigger__Resource.initOperations(_Actiontrigger__Resource);

			Fragments._Allocationpolicy__Allocationpolicy.initOperations(_Allocationpolicy__Allocationpolicy);
			Fragments._Allocationpolicy__MixinBase.initOperations(_Allocationpolicy__MixinBase);
			Fragments._Allocationpolicy__OclAny.initOperations(_Allocationpolicy__OclAny);
			Fragments._Allocationpolicy__OclElement.initOperations(_Allocationpolicy__OclElement);

			Fragments._Amazonprovider__Amazonprovider.initOperations(_Amazonprovider__Amazonprovider);
			Fragments._Amazonprovider__Entity.initOperations(_Amazonprovider__Entity);
			Fragments._Amazonprovider__OclAny.initOperations(_Amazonprovider__OclAny);
			Fragments._Amazonprovider__OclElement.initOperations(_Amazonprovider__OclElement);
			Fragments._Amazonprovider__Provider.initOperations(_Amazonprovider__Provider);
			Fragments._Amazonprovider__Resource.initOperations(_Amazonprovider__Resource);

			Fragments._Array__Array.initOperations(_Array__Array);
			Fragments._Array__OclAny.initOperations(_Array__OclAny);
			Fragments._Array__OclElement.initOperations(_Array__OclElement);

			Fragments._ArrofRecStep__ArrofRecStep.initOperations(_ArrofRecStep__ArrofRecStep);
			Fragments._ArrofRecStep__OclAny.initOperations(_ArrofRecStep__OclAny);
			Fragments._ArrofRecStep__OclElement.initOperations(_ArrofRecStep__OclElement);

			Fragments._Availableresources__Allocationpolicy.initOperations(_Availableresources__Allocationpolicy);
			Fragments._Availableresources__Availableresources.initOperations(_Availableresources__Availableresources);
			Fragments._Availableresources__MixinBase.initOperations(_Availableresources__MixinBase);
			Fragments._Availableresources__OclAny.initOperations(_Availableresources__OclAny);
			Fragments._Availableresources__OclElement.initOperations(_Availableresources__OclElement);

			Fragments._Availableresourcesorload__Availableresourcesorload.initOperations(_Availableresourcesorload__Availableresourcesorload);
			Fragments._Availableresourcesorload__MixinBase.initOperations(_Availableresourcesorload__MixinBase);
			Fragments._Availableresourcesorload__OclAny.initOperations(_Availableresourcesorload__OclAny);
			Fragments._Availableresourcesorload__OclElement.initOperations(_Availableresourcesorload__OclElement);
			Fragments._Availableresourcesorload__Targetmigrationpolicy.initOperations(_Availableresourcesorload__Targetmigrationpolicy);

			Fragments._Azureprovider__Azureprovider.initOperations(_Azureprovider__Azureprovider);
			Fragments._Azureprovider__Entity.initOperations(_Azureprovider__Entity);
			Fragments._Azureprovider__OclAny.initOperations(_Azureprovider__OclAny);
			Fragments._Azureprovider__OclElement.initOperations(_Azureprovider__OclElement);
			Fragments._Azureprovider__Provider.initOperations(_Azureprovider__Provider);
			Fragments._Azureprovider__Resource.initOperations(_Azureprovider__Resource);

			Fragments._Cost__Allocationpolicy.initOperations(_Cost__Allocationpolicy);
			Fragments._Cost__Cost.initOperations(_Cost__Cost);
			Fragments._Cost__MixinBase.initOperations(_Cost__MixinBase);
			Fragments._Cost__OclAny.initOperations(_Cost__OclAny);
			Fragments._Cost__OclElement.initOperations(_Cost__OclElement);

			Fragments._Cpuutilisation__Cpuutilisation.initOperations(_Cpuutilisation__Cpuutilisation);
			Fragments._Cpuutilisation__Metric.initOperations(_Cpuutilisation__Metric);
			Fragments._Cpuutilisation__MixinBase.initOperations(_Cpuutilisation__MixinBase);
			Fragments._Cpuutilisation__OclAny.initOperations(_Cpuutilisation__OclAny);
			Fragments._Cpuutilisation__OclElement.initOperations(_Cpuutilisation__OclElement);

			Fragments._Creation__Creation.initOperations(_Creation__Creation);
			Fragments._Creation__MixinBase.initOperations(_Creation__MixinBase);
			Fragments._Creation__OclAny.initOperations(_Creation__OclAny);
			Fragments._Creation__OclElement.initOperations(_Creation__OclElement);

			Fragments._Date__Date.initOperations(_Date__Date);
			Fragments._Date__OclAny.initOperations(_Date__OclAny);
			Fragments._Date__OclComparable.initOperations(_Date__OclComparable);

			Fragments._Dynamicadjustmentscalingpolicy__Dynamicadjustmentscalingpolicy.initOperations(_Dynamicadjustmentscalingpolicy__Dynamicadjustmentscalingpolicy);
			Fragments._Dynamicadjustmentscalingpolicy__Dynamicscalingpolicy.initOperations(_Dynamicadjustmentscalingpolicy__Dynamicscalingpolicy);
			Fragments._Dynamicadjustmentscalingpolicy__MixinBase.initOperations(_Dynamicadjustmentscalingpolicy__MixinBase);
			Fragments._Dynamicadjustmentscalingpolicy__OclAny.initOperations(_Dynamicadjustmentscalingpolicy__OclAny);
			Fragments._Dynamicadjustmentscalingpolicy__OclElement.initOperations(_Dynamicadjustmentscalingpolicy__OclElement);
			Fragments._Dynamicadjustmentscalingpolicy__Scalingpolicy.initOperations(_Dynamicadjustmentscalingpolicy__Scalingpolicy);

			Fragments._Dynamicmigrationpolicy__Dynamicmigrationpolicy.initOperations(_Dynamicmigrationpolicy__Dynamicmigrationpolicy);
			Fragments._Dynamicmigrationpolicy__MixinBase.initOperations(_Dynamicmigrationpolicy__MixinBase);
			Fragments._Dynamicmigrationpolicy__OclAny.initOperations(_Dynamicmigrationpolicy__OclAny);
			Fragments._Dynamicmigrationpolicy__OclElement.initOperations(_Dynamicmigrationpolicy__OclElement);
			Fragments._Dynamicmigrationpolicy__Sourcemigrationpolicy.initOperations(_Dynamicmigrationpolicy__Sourcemigrationpolicy);

			Fragments._Dynamicscalingpolicy__Dynamicscalingpolicy.initOperations(_Dynamicscalingpolicy__Dynamicscalingpolicy);
			Fragments._Dynamicscalingpolicy__MixinBase.initOperations(_Dynamicscalingpolicy__MixinBase);
			Fragments._Dynamicscalingpolicy__OclAny.initOperations(_Dynamicscalingpolicy__OclAny);
			Fragments._Dynamicscalingpolicy__OclElement.initOperations(_Dynamicscalingpolicy__OclElement);
			Fragments._Dynamicscalingpolicy__Scalingpolicy.initOperations(_Dynamicscalingpolicy__Scalingpolicy);

			Fragments._Elasticitycontroller__Elasticitycontroller.initOperations(_Elasticitycontroller__Elasticitycontroller);
			Fragments._Elasticitycontroller__Entity.initOperations(_Elasticitycontroller__Entity);
			Fragments._Elasticitycontroller__OclAny.initOperations(_Elasticitycontroller__OclAny);
			Fragments._Elasticitycontroller__OclElement.initOperations(_Elasticitycontroller__OclElement);
			Fragments._Elasticitycontroller__Resource.initOperations(_Elasticitycontroller__Resource);

			Fragments._Elasticlink__Elasticlink.initOperations(_Elasticlink__Elasticlink);
			Fragments._Elasticlink__Entity.initOperations(_Elasticlink__Entity);
			Fragments._Elasticlink__Link.initOperations(_Elasticlink__Link);
			Fragments._Elasticlink__OclAny.initOperations(_Elasticlink__OclAny);
			Fragments._Elasticlink__OclElement.initOperations(_Elasticlink__OclElement);

			Fragments._First__First.initOperations(_First__First);
			Fragments._First__Loadbalancerpolicy.initOperations(_First__Loadbalancerpolicy);
			Fragments._First__MixinBase.initOperations(_First__MixinBase);
			Fragments._First__OclAny.initOperations(_First__OclAny);
			Fragments._First__OclElement.initOperations(_First__OclElement);

			Fragments._Float__Float.initOperations(_Float__Float);
			Fragments._Float__OclAny.initOperations(_Float__OclAny);

			Fragments._Horizontalgroup__Entity.initOperations(_Horizontalgroup__Entity);
			Fragments._Horizontalgroup__Horizontalgroup.initOperations(_Horizontalgroup__Horizontalgroup);
			Fragments._Horizontalgroup__OclAny.initOperations(_Horizontalgroup__OclAny);
			Fragments._Horizontalgroup__OclElement.initOperations(_Horizontalgroup__OclElement);
			Fragments._Horizontalgroup__Resource.initOperations(_Horizontalgroup__Resource);

			Fragments._Instancegrouplink__Entity.initOperations(_Instancegrouplink__Entity);
			Fragments._Instancegrouplink__Instancegrouplink.initOperations(_Instancegrouplink__Instancegrouplink);
			Fragments._Instancegrouplink__Link.initOperations(_Instancegrouplink__Link);
			Fragments._Instancegrouplink__OclAny.initOperations(_Instancegrouplink__OclAny);
			Fragments._Instancegrouplink__OclElement.initOperations(_Instancegrouplink__OclElement);

			Fragments._Leastconn__Leastconn.initOperations(_Leastconn__Leastconn);
			Fragments._Leastconn__Loadbalancerpolicy.initOperations(_Leastconn__Loadbalancerpolicy);
			Fragments._Leastconn__MixinBase.initOperations(_Leastconn__MixinBase);
			Fragments._Leastconn__OclAny.initOperations(_Leastconn__OclAny);
			Fragments._Leastconn__OclElement.initOperations(_Leastconn__OclElement);

			Fragments._Leastlatency__Leastlatency.initOperations(_Leastlatency__Leastlatency);
			Fragments._Leastlatency__Loadbalancerpolicy.initOperations(_Leastlatency__Loadbalancerpolicy);
			Fragments._Leastlatency__MixinBase.initOperations(_Leastlatency__MixinBase);
			Fragments._Leastlatency__OclAny.initOperations(_Leastlatency__OclAny);
			Fragments._Leastlatency__OclElement.initOperations(_Leastlatency__OclElement);

			Fragments._Leasttraffic__Leasttraffic.initOperations(_Leasttraffic__Leasttraffic);
			Fragments._Leasttraffic__Loadbalancerpolicy.initOperations(_Leasttraffic__Loadbalancerpolicy);
			Fragments._Leasttraffic__MixinBase.initOperations(_Leasttraffic__MixinBase);
			Fragments._Leasttraffic__OclAny.initOperations(_Leasttraffic__OclAny);
			Fragments._Leasttraffic__OclElement.initOperations(_Leasttraffic__OclElement);

			Fragments._Livemigration__Livemigration.initOperations(_Livemigration__Livemigration);
			Fragments._Livemigration__Migrationpolicy.initOperations(_Livemigration__Migrationpolicy);
			Fragments._Livemigration__MixinBase.initOperations(_Livemigration__MixinBase);
			Fragments._Livemigration__OclAny.initOperations(_Livemigration__OclAny);
			Fragments._Livemigration__OclElement.initOperations(_Livemigration__OclElement);

			Fragments._Loadbalancer__Entity.initOperations(_Loadbalancer__Entity);
			Fragments._Loadbalancer__Loadbalancer.initOperations(_Loadbalancer__Loadbalancer);
			Fragments._Loadbalancer__OclAny.initOperations(_Loadbalancer__OclAny);
			Fragments._Loadbalancer__OclElement.initOperations(_Loadbalancer__OclElement);
			Fragments._Loadbalancer__Resource.initOperations(_Loadbalancer__Resource);

			Fragments._Loadbalancerlink__Entity.initOperations(_Loadbalancerlink__Entity);
			Fragments._Loadbalancerlink__Link.initOperations(_Loadbalancerlink__Link);
			Fragments._Loadbalancerlink__Loadbalancerlink.initOperations(_Loadbalancerlink__Loadbalancerlink);
			Fragments._Loadbalancerlink__OclAny.initOperations(_Loadbalancerlink__OclAny);
			Fragments._Loadbalancerlink__OclElement.initOperations(_Loadbalancerlink__OclElement);

			Fragments._Loadbalancerpolicy__Loadbalancerpolicy.initOperations(_Loadbalancerpolicy__Loadbalancerpolicy);
			Fragments._Loadbalancerpolicy__MixinBase.initOperations(_Loadbalancerpolicy__MixinBase);
			Fragments._Loadbalancerpolicy__OclAny.initOperations(_Loadbalancerpolicy__OclAny);
			Fragments._Loadbalancerpolicy__OclElement.initOperations(_Loadbalancerpolicy__OclElement);

			Fragments._Loadvolume__Dynamicmigrationpolicy.initOperations(_Loadvolume__Dynamicmigrationpolicy);
			Fragments._Loadvolume__Loadvolume.initOperations(_Loadvolume__Loadvolume);
			Fragments._Loadvolume__MixinBase.initOperations(_Loadvolume__MixinBase);
			Fragments._Loadvolume__OclAny.initOperations(_Loadvolume__OclAny);
			Fragments._Loadvolume__OclElement.initOperations(_Loadvolume__OclElement);
			Fragments._Loadvolume__Sourcemigrationpolicy.initOperations(_Loadvolume__Sourcemigrationpolicy);

			Fragments._Manualmigrationpolicy__Manualmigrationpolicy.initOperations(_Manualmigrationpolicy__Manualmigrationpolicy);
			Fragments._Manualmigrationpolicy__MixinBase.initOperations(_Manualmigrationpolicy__MixinBase);
			Fragments._Manualmigrationpolicy__OclAny.initOperations(_Manualmigrationpolicy__OclAny);
			Fragments._Manualmigrationpolicy__OclElement.initOperations(_Manualmigrationpolicy__OclElement);
			Fragments._Manualmigrationpolicy__Sourcemigrationpolicy.initOperations(_Manualmigrationpolicy__Sourcemigrationpolicy);

			Fragments._Manualscalingpolicy__Manualscalingpolicy.initOperations(_Manualscalingpolicy__Manualscalingpolicy);
			Fragments._Manualscalingpolicy__MixinBase.initOperations(_Manualscalingpolicy__MixinBase);
			Fragments._Manualscalingpolicy__OclAny.initOperations(_Manualscalingpolicy__OclAny);
			Fragments._Manualscalingpolicy__OclElement.initOperations(_Manualscalingpolicy__OclElement);
			Fragments._Manualscalingpolicy__Scalingpolicy.initOperations(_Manualscalingpolicy__Scalingpolicy);

			Fragments._Manualtargetselection__Manualtargetselection.initOperations(_Manualtargetselection__Manualtargetselection);
			Fragments._Manualtargetselection__MixinBase.initOperations(_Manualtargetselection__MixinBase);
			Fragments._Manualtargetselection__OclAny.initOperations(_Manualtargetselection__OclAny);
			Fragments._Manualtargetselection__OclElement.initOperations(_Manualtargetselection__OclElement);
			Fragments._Manualtargetselection__Targetmigrationpolicy.initOperations(_Manualtargetselection__Targetmigrationpolicy);

			Fragments._Memoryutilisation__Memoryutilisation.initOperations(_Memoryutilisation__Memoryutilisation);
			Fragments._Memoryutilisation__Metric.initOperations(_Memoryutilisation__Metric);
			Fragments._Memoryutilisation__MixinBase.initOperations(_Memoryutilisation__MixinBase);
			Fragments._Memoryutilisation__OclAny.initOperations(_Memoryutilisation__OclAny);
			Fragments._Memoryutilisation__OclElement.initOperations(_Memoryutilisation__OclElement);

			Fragments._Metric__Metric.initOperations(_Metric__Metric);
			Fragments._Metric__MixinBase.initOperations(_Metric__MixinBase);
			Fragments._Metric__OclAny.initOperations(_Metric__OclAny);
			Fragments._Metric__OclElement.initOperations(_Metric__OclElement);

			Fragments._MetricTargetTracking__MetricTargetTracking.initOperations(_MetricTargetTracking__MetricTargetTracking);
			Fragments._MetricTargetTracking__OclAny.initOperations(_MetricTargetTracking__OclAny);
			Fragments._MetricTargetTracking__OclElement.initOperations(_MetricTargetTracking__OclElement);
			Fragments._MetricTargetTracking__OclEnumeration.initOperations(_MetricTargetTracking__OclEnumeration);
			Fragments._MetricTargetTracking__OclType.initOperations(_MetricTargetTracking__OclType);

			Fragments._Migrationpolicy__Migrationpolicy.initOperations(_Migrationpolicy__Migrationpolicy);
			Fragments._Migrationpolicy__MixinBase.initOperations(_Migrationpolicy__MixinBase);
			Fragments._Migrationpolicy__OclAny.initOperations(_Migrationpolicy__OclAny);
			Fragments._Migrationpolicy__OclElement.initOperations(_Migrationpolicy__OclElement);

			Fragments._Nonlivemigration__Migrationpolicy.initOperations(_Nonlivemigration__Migrationpolicy);
			Fragments._Nonlivemigration__MixinBase.initOperations(_Nonlivemigration__MixinBase);
			Fragments._Nonlivemigration__Nonlivemigration.initOperations(_Nonlivemigration__Nonlivemigration);
			Fragments._Nonlivemigration__OclAny.initOperations(_Nonlivemigration__OclAny);
			Fragments._Nonlivemigration__OclElement.initOperations(_Nonlivemigration__OclElement);

			Fragments._Openstackprovider__Entity.initOperations(_Openstackprovider__Entity);
			Fragments._Openstackprovider__OclAny.initOperations(_Openstackprovider__OclAny);
			Fragments._Openstackprovider__OclElement.initOperations(_Openstackprovider__OclElement);
			Fragments._Openstackprovider__Openstackprovider.initOperations(_Openstackprovider__Openstackprovider);
			Fragments._Openstackprovider__Provider.initOperations(_Openstackprovider__Provider);
			Fragments._Openstackprovider__Resource.initOperations(_Openstackprovider__Resource);

			Fragments._OperatorType__OclAny.initOperations(_OperatorType__OclAny);
			Fragments._OperatorType__OclElement.initOperations(_OperatorType__OclElement);
			Fragments._OperatorType__OclEnumeration.initOperations(_OperatorType__OclEnumeration);
			Fragments._OperatorType__OclType.initOperations(_OperatorType__OclType);
			Fragments._OperatorType__OperatorType.initOperations(_OperatorType__OperatorType);

			Fragments._Power__Dynamicmigrationpolicy.initOperations(_Power__Dynamicmigrationpolicy);
			Fragments._Power__MixinBase.initOperations(_Power__MixinBase);
			Fragments._Power__OclAny.initOperations(_Power__OclAny);
			Fragments._Power__OclElement.initOperations(_Power__OclElement);
			Fragments._Power__Power.initOperations(_Power__Power);
			Fragments._Power__Sourcemigrationpolicy.initOperations(_Power__Sourcemigrationpolicy);

			Fragments._Provider__Entity.initOperations(_Provider__Entity);
			Fragments._Provider__OclAny.initOperations(_Provider__OclAny);
			Fragments._Provider__OclElement.initOperations(_Provider__OclElement);
			Fragments._Provider__Provider.initOperations(_Provider__Provider);
			Fragments._Provider__Resource.initOperations(_Provider__Resource);

			Fragments._Providerinstancelink__Entity.initOperations(_Providerinstancelink__Entity);
			Fragments._Providerinstancelink__Link.initOperations(_Providerinstancelink__Link);
			Fragments._Providerinstancelink__OclAny.initOperations(_Providerinstancelink__OclAny);
			Fragments._Providerinstancelink__OclElement.initOperations(_Providerinstancelink__OclElement);
			Fragments._Providerinstancelink__Providerinstancelink.initOperations(_Providerinstancelink__Providerinstancelink);

			Fragments._Providerlink__Entity.initOperations(_Providerlink__Entity);
			Fragments._Providerlink__Link.initOperations(_Providerlink__Link);
			Fragments._Providerlink__OclAny.initOperations(_Providerlink__OclAny);
			Fragments._Providerlink__OclElement.initOperations(_Providerlink__OclElement);
			Fragments._Providerlink__Providerlink.initOperations(_Providerlink__Providerlink);

			Fragments._RecurrenceStep__OclAny.initOperations(_RecurrenceStep__OclAny);
			Fragments._RecurrenceStep__OclElement.initOperations(_RecurrenceStep__OclElement);
			Fragments._RecurrenceStep__RecurrenceStep.initOperations(_RecurrenceStep__RecurrenceStep);

			Fragments._Recurringschedulingpolicy__MixinBase.initOperations(_Recurringschedulingpolicy__MixinBase);
			Fragments._Recurringschedulingpolicy__OclAny.initOperations(_Recurringschedulingpolicy__OclAny);
			Fragments._Recurringschedulingpolicy__OclElement.initOperations(_Recurringschedulingpolicy__OclElement);
			Fragments._Recurringschedulingpolicy__Recurringschedulingpolicy.initOperations(_Recurringschedulingpolicy__Recurringschedulingpolicy);
			Fragments._Recurringschedulingpolicy__Schedulingpolicy.initOperations(_Recurringschedulingpolicy__Schedulingpolicy);

			Fragments._Responsetime__Allocationpolicy.initOperations(_Responsetime__Allocationpolicy);
			Fragments._Responsetime__MixinBase.initOperations(_Responsetime__MixinBase);
			Fragments._Responsetime__OclAny.initOperations(_Responsetime__OclAny);
			Fragments._Responsetime__OclElement.initOperations(_Responsetime__OclElement);
			Fragments._Responsetime__Responsetime.initOperations(_Responsetime__Responsetime);

			Fragments._Responsetimemetric__Metric.initOperations(_Responsetimemetric__Metric);
			Fragments._Responsetimemetric__MixinBase.initOperations(_Responsetimemetric__MixinBase);
			Fragments._Responsetimemetric__OclAny.initOperations(_Responsetimemetric__OclAny);
			Fragments._Responsetimemetric__OclElement.initOperations(_Responsetimemetric__OclElement);
			Fragments._Responsetimemetric__Responsetimemetric.initOperations(_Responsetimemetric__Responsetimemetric);

			Fragments._Roundrobin__Allocationpolicy.initOperations(_Roundrobin__Allocationpolicy);
			Fragments._Roundrobin__MixinBase.initOperations(_Roundrobin__MixinBase);
			Fragments._Roundrobin__OclAny.initOperations(_Roundrobin__OclAny);
			Fragments._Roundrobin__OclElement.initOperations(_Roundrobin__OclElement);
			Fragments._Roundrobin__Roundrobin.initOperations(_Roundrobin__Roundrobin);

			Fragments._Roundrobinalgo__Loadbalancerpolicy.initOperations(_Roundrobinalgo__Loadbalancerpolicy);
			Fragments._Roundrobinalgo__MixinBase.initOperations(_Roundrobinalgo__MixinBase);
			Fragments._Roundrobinalgo__OclAny.initOperations(_Roundrobinalgo__OclAny);
			Fragments._Roundrobinalgo__OclElement.initOperations(_Roundrobinalgo__OclElement);
			Fragments._Roundrobinalgo__Roundrobinalgo.initOperations(_Roundrobinalgo__Roundrobinalgo);

			Fragments._Rule__Entity.initOperations(_Rule__Entity);
			Fragments._Rule__Link.initOperations(_Rule__Link);
			Fragments._Rule__OclAny.initOperations(_Rule__OclAny);
			Fragments._Rule__OclElement.initOperations(_Rule__OclElement);
			Fragments._Rule__Rule.initOperations(_Rule__Rule);

			Fragments._Scalingpolicy__MixinBase.initOperations(_Scalingpolicy__MixinBase);
			Fragments._Scalingpolicy__OclAny.initOperations(_Scalingpolicy__OclAny);
			Fragments._Scalingpolicy__OclElement.initOperations(_Scalingpolicy__OclElement);
			Fragments._Scalingpolicy__Scalingpolicy.initOperations(_Scalingpolicy__Scalingpolicy);

			Fragments._Schedulingpolicy__MixinBase.initOperations(_Schedulingpolicy__MixinBase);
			Fragments._Schedulingpolicy__OclAny.initOperations(_Schedulingpolicy__OclAny);
			Fragments._Schedulingpolicy__OclElement.initOperations(_Schedulingpolicy__OclElement);
			Fragments._Schedulingpolicy__Schedulingpolicy.initOperations(_Schedulingpolicy__Schedulingpolicy);

			Fragments._Simpledynamicscalingpolicy__Dynamicscalingpolicy.initOperations(_Simpledynamicscalingpolicy__Dynamicscalingpolicy);
			Fragments._Simpledynamicscalingpolicy__MixinBase.initOperations(_Simpledynamicscalingpolicy__MixinBase);
			Fragments._Simpledynamicscalingpolicy__OclAny.initOperations(_Simpledynamicscalingpolicy__OclAny);
			Fragments._Simpledynamicscalingpolicy__OclElement.initOperations(_Simpledynamicscalingpolicy__OclElement);
			Fragments._Simpledynamicscalingpolicy__Scalingpolicy.initOperations(_Simpledynamicscalingpolicy__Scalingpolicy);
			Fragments._Simpledynamicscalingpolicy__Simpledynamicscalingpolicy.initOperations(_Simpledynamicscalingpolicy__Simpledynamicscalingpolicy);

			Fragments._Source__Loadbalancerpolicy.initOperations(_Source__Loadbalancerpolicy);
			Fragments._Source__MixinBase.initOperations(_Source__MixinBase);
			Fragments._Source__OclAny.initOperations(_Source__OclAny);
			Fragments._Source__OclElement.initOperations(_Source__OclElement);
			Fragments._Source__Source.initOperations(_Source__Source);

			Fragments._Sourcemigrationpolicy__MixinBase.initOperations(_Sourcemigrationpolicy__MixinBase);
			Fragments._Sourcemigrationpolicy__OclAny.initOperations(_Sourcemigrationpolicy__OclAny);
			Fragments._Sourcemigrationpolicy__OclElement.initOperations(_Sourcemigrationpolicy__OclElement);
			Fragments._Sourcemigrationpolicy__Sourcemigrationpolicy.initOperations(_Sourcemigrationpolicy__Sourcemigrationpolicy);

			Fragments._Step__Entity.initOperations(_Step__Entity);
			Fragments._Step__OclAny.initOperations(_Step__OclAny);
			Fragments._Step__OclElement.initOperations(_Step__OclElement);
			Fragments._Step__Resource.initOperations(_Step__Resource);
			Fragments._Step__Step.initOperations(_Step__Step);

			Fragments._Stepdynamicscalingpolicy__Dynamicscalingpolicy.initOperations(_Stepdynamicscalingpolicy__Dynamicscalingpolicy);
			Fragments._Stepdynamicscalingpolicy__MixinBase.initOperations(_Stepdynamicscalingpolicy__MixinBase);
			Fragments._Stepdynamicscalingpolicy__OclAny.initOperations(_Stepdynamicscalingpolicy__OclAny);
			Fragments._Stepdynamicscalingpolicy__OclElement.initOperations(_Stepdynamicscalingpolicy__OclElement);
			Fragments._Stepdynamicscalingpolicy__Scalingpolicy.initOperations(_Stepdynamicscalingpolicy__Scalingpolicy);
			Fragments._Stepdynamicscalingpolicy__Stepdynamicscalingpolicy.initOperations(_Stepdynamicscalingpolicy__Stepdynamicscalingpolicy);

			Fragments._Steplink__Entity.initOperations(_Steplink__Entity);
			Fragments._Steplink__Link.initOperations(_Steplink__Link);
			Fragments._Steplink__OclAny.initOperations(_Steplink__OclAny);
			Fragments._Steplink__OclElement.initOperations(_Steplink__OclElement);
			Fragments._Steplink__Steplink.initOperations(_Steplink__Steplink);

			Fragments._Swappingpolicy__MixinBase.initOperations(_Swappingpolicy__MixinBase);
			Fragments._Swappingpolicy__OclAny.initOperations(_Swappingpolicy__OclAny);
			Fragments._Swappingpolicy__OclElement.initOperations(_Swappingpolicy__OclElement);
			Fragments._Swappingpolicy__Swappingpolicy.initOperations(_Swappingpolicy__Swappingpolicy);

			Fragments._Targetmigrationpolicy__MixinBase.initOperations(_Targetmigrationpolicy__MixinBase);
			Fragments._Targetmigrationpolicy__OclAny.initOperations(_Targetmigrationpolicy__OclAny);
			Fragments._Targetmigrationpolicy__OclElement.initOperations(_Targetmigrationpolicy__OclElement);
			Fragments._Targetmigrationpolicy__Targetmigrationpolicy.initOperations(_Targetmigrationpolicy__Targetmigrationpolicy);

			Fragments._Targetresponsetime__MixinBase.initOperations(_Targetresponsetime__MixinBase);
			Fragments._Targetresponsetime__OclAny.initOperations(_Targetresponsetime__OclAny);
			Fragments._Targetresponsetime__OclElement.initOperations(_Targetresponsetime__OclElement);
			Fragments._Targetresponsetime__Targetmigrationpolicy.initOperations(_Targetresponsetime__Targetmigrationpolicy);
			Fragments._Targetresponsetime__Targetresponsetime.initOperations(_Targetresponsetime__Targetresponsetime);

			Fragments._Uniqueschedulingpolicy__MixinBase.initOperations(_Uniqueschedulingpolicy__MixinBase);
			Fragments._Uniqueschedulingpolicy__OclAny.initOperations(_Uniqueschedulingpolicy__OclAny);
			Fragments._Uniqueschedulingpolicy__OclElement.initOperations(_Uniqueschedulingpolicy__OclElement);
			Fragments._Uniqueschedulingpolicy__Schedulingpolicy.initOperations(_Uniqueschedulingpolicy__Schedulingpolicy);
			Fragments._Uniqueschedulingpolicy__Uniqueschedulingpolicy.initOperations(_Uniqueschedulingpolicy__Uniqueschedulingpolicy);

			Fragments._Unit__OclAny.initOperations(_Unit__OclAny);
			Fragments._Unit__OclElement.initOperations(_Unit__OclElement);
			Fragments._Unit__OclEnumeration.initOperations(_Unit__OclEnumeration);
			Fragments._Unit__OclType.initOperations(_Unit__OclType);
			Fragments._Unit__Unit.initOperations(_Unit__Unit);

			Fragments._Vmwareprovider__Entity.initOperations(_Vmwareprovider__Entity);
			Fragments._Vmwareprovider__OclAny.initOperations(_Vmwareprovider__OclAny);
			Fragments._Vmwareprovider__OclElement.initOperations(_Vmwareprovider__OclElement);
			Fragments._Vmwareprovider__Provider.initOperations(_Vmwareprovider__Provider);
			Fragments._Vmwareprovider__Resource.initOperations(_Vmwareprovider__Resource);
			Fragments._Vmwareprovider__Vmwareprovider.initOperations(_Vmwareprovider__Vmwareprovider);

			Fragments._Wstaticrr__Loadbalancerpolicy.initOperations(_Wstaticrr__Loadbalancerpolicy);
			Fragments._Wstaticrr__MixinBase.initOperations(_Wstaticrr__MixinBase);
			Fragments._Wstaticrr__OclAny.initOperations(_Wstaticrr__OclAny);
			Fragments._Wstaticrr__OclElement.initOperations(_Wstaticrr__OclElement);
			Fragments._Wstaticrr__Wstaticrr.initOperations(_Wstaticrr__Wstaticrr);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModemoTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ActionOperation = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ActionType = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Actiontrigger = {
			ModemoTables.Properties._Actiontrigger__actiontriggerAction,
			ModemoTables.Properties._Actiontrigger__actiontriggerActionType,
			ModemoTables.Properties._Actiontrigger__actiontriggerAmount
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Allocationpolicy = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Amazonprovider = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Array = {
			ModemoTables.Properties._Array__values
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ArrofRecStep = {
			ModemoTables.Properties._ArrofRecStep__arrofrecstepValues
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Availableresources = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Availableresourcesorload = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Azureprovider = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cost = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cpuutilisation = {
			ModemoTables.Properties._Metric__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Creation = {
			ModemoTables.Properties._Creation__occiComputeCreationDate
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Date = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Dynamicadjustmentscalingpolicy = {
			ModemoTables.Properties._Dynamicadjustmentscalingpolicy__dynamicadjustmentscalingpolicyDisableScaleIn,
			ModemoTables.Properties._Dynamicadjustmentscalingpolicy__dynamicadjustmentscalingpolicyMetric,
			ModemoTables.Properties._Dynamicadjustmentscalingpolicy__dynamicadjustmentscalingpolicyTarget,
			ModemoTables.Properties._Dynamicscalingpolicy__dynamicscalingpolicyCoolDuration,
			ModemoTables.Properties._Dynamicscalingpolicy__dynamicscalingpolicyIterationWaitTime
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Dynamicmigrationpolicy = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Dynamicscalingpolicy = {
			ModemoTables.Properties._Dynamicscalingpolicy__dynamicscalingpolicyCoolDuration,
			ModemoTables.Properties._Dynamicscalingpolicy__dynamicscalingpolicyIterationWaitTime
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Elasticitycontroller = {
			ModemoTables.Properties._Elasticitycontroller__ElasticitycontrollerMaximumLimit,
			ModemoTables.Properties._Elasticitycontroller__ElasticitycontrollerMinimumLimit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Elasticlink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _First = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Float = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Horizontalgroup = {
			ModemoTables.Properties._Horizontalgroup__horizontalgroupGroupSize,
			ModemoTables.Properties._Horizontalgroup__horizontalgroupLoadBalancer,
			ModemoTables.Properties._Horizontalgroup__horizontalgroupMaximum,
			ModemoTables.Properties._Horizontalgroup__horizontalgroupMinimum,
			ModemoTables.Properties._Horizontalgroup__horizontalgroupName,
			ModemoTables.Properties._Horizontalgroup__horizontalgroupTemplateName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Instancegrouplink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Leastconn = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Leastlatency = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Leasttraffic = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Livemigration = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Loadbalancer = {
			ModemoTables.Properties._Loadbalancer__loadbalancerAddress,
			ModemoTables.Properties._Loadbalancer__loadbalancerInstanceIP,
			ModemoTables.Properties._Loadbalancer__loadbalancerName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Loadbalancerlink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Loadbalancerpolicy = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Loadvolume = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Manualmigrationpolicy = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Manualscalingpolicy = {
			ModemoTables.Properties._Manualscalingpolicy__manualscalingpolicyComputeUnit,
			ModemoTables.Properties._Manualscalingpolicy__manualscalingpolicyDesiredSize
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Manualtargetselection = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Memoryutilisation = {
			ModemoTables.Properties._Metric__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Metric = {
			ModemoTables.Properties._Metric__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MetricTargetTracking = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Migrationpolicy = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Nonlivemigration = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Openstackprovider = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _OperatorType = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Power = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Provider = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Providerinstancelink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Providerlink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _RecurrenceStep = {
			ModemoTables.Properties._RecurrenceStep__unit,
			ModemoTables.Properties._RecurrenceStep__value
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Recurringschedulingpolicy = {
			ModemoTables.Properties._Recurringschedulingpolicy__recurringschedulingpolicyEndDate,
			ModemoTables.Properties._Recurringschedulingpolicy__recurringschedulingpolicyInterval,
			ModemoTables.Properties._Recurringschedulingpolicy__recurringschedulingpolicyRecurrence,
			ModemoTables.Properties._Recurringschedulingpolicy__recurringschedulingpolicyStartDate
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Responsetime = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Responsetimemetric = {
			ModemoTables.Properties._Metric__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Roundrobin = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Roundrobinalgo = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Rule = {
			ModemoTables.Properties._Rule__ruleConsecutive,
			ModemoTables.Properties._Rule__ruleOperator,
			ModemoTables.Properties._Rule__rulePeriod,
			ModemoTables.Properties._Rule__ruleThreshold
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Scalingpolicy = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Schedulingpolicy = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Simpledynamicscalingpolicy = {
			ModemoTables.Properties._Dynamicscalingpolicy__dynamicscalingpolicyCoolDuration,
			ModemoTables.Properties._Dynamicscalingpolicy__dynamicscalingpolicyIterationWaitTime
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Source = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Sourcemigrationpolicy = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Step = {
			ModemoTables.Properties._Step__stepLowerStepBound,
			ModemoTables.Properties._Step__stepSize,
			ModemoTables.Properties._Step__stepUpperStepBound
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Stepdynamicscalingpolicy = {
			ModemoTables.Properties._Dynamicscalingpolicy__dynamicscalingpolicyCoolDuration,
			ModemoTables.Properties._Dynamicscalingpolicy__dynamicscalingpolicyIterationWaitTime
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Steplink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Swappingpolicy = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Targetmigrationpolicy = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Targetresponsetime = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Uniqueschedulingpolicy = {
			ModemoTables.Properties._Uniqueschedulingpolicy__uniqueschedulingpolicyEndDate,
			ModemoTables.Properties._Uniqueschedulingpolicy__uniqueschedulingpolicyStartDate
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Unit = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Vmwareprovider = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Wstaticrr = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._ActionOperation__ActionOperation.initProperties(_ActionOperation);
			Fragments._ActionType__ActionType.initProperties(_ActionType);
			Fragments._Actiontrigger__Actiontrigger.initProperties(_Actiontrigger);
			Fragments._Allocationpolicy__Allocationpolicy.initProperties(_Allocationpolicy);
			Fragments._Amazonprovider__Amazonprovider.initProperties(_Amazonprovider);
			Fragments._Array__Array.initProperties(_Array);
			Fragments._ArrofRecStep__ArrofRecStep.initProperties(_ArrofRecStep);
			Fragments._Availableresources__Availableresources.initProperties(_Availableresources);
			Fragments._Availableresourcesorload__Availableresourcesorload.initProperties(_Availableresourcesorload);
			Fragments._Azureprovider__Azureprovider.initProperties(_Azureprovider);
			Fragments._Cost__Cost.initProperties(_Cost);
			Fragments._Cpuutilisation__Cpuutilisation.initProperties(_Cpuutilisation);
			Fragments._Creation__Creation.initProperties(_Creation);
			Fragments._Date__Date.initProperties(_Date);
			Fragments._Dynamicadjustmentscalingpolicy__Dynamicadjustmentscalingpolicy.initProperties(_Dynamicadjustmentscalingpolicy);
			Fragments._Dynamicmigrationpolicy__Dynamicmigrationpolicy.initProperties(_Dynamicmigrationpolicy);
			Fragments._Dynamicscalingpolicy__Dynamicscalingpolicy.initProperties(_Dynamicscalingpolicy);
			Fragments._Elasticitycontroller__Elasticitycontroller.initProperties(_Elasticitycontroller);
			Fragments._Elasticlink__Elasticlink.initProperties(_Elasticlink);
			Fragments._First__First.initProperties(_First);
			Fragments._Float__Float.initProperties(_Float);
			Fragments._Horizontalgroup__Horizontalgroup.initProperties(_Horizontalgroup);
			Fragments._Instancegrouplink__Instancegrouplink.initProperties(_Instancegrouplink);
			Fragments._Leastconn__Leastconn.initProperties(_Leastconn);
			Fragments._Leastlatency__Leastlatency.initProperties(_Leastlatency);
			Fragments._Leasttraffic__Leasttraffic.initProperties(_Leasttraffic);
			Fragments._Livemigration__Livemigration.initProperties(_Livemigration);
			Fragments._Loadbalancer__Loadbalancer.initProperties(_Loadbalancer);
			Fragments._Loadbalancerlink__Loadbalancerlink.initProperties(_Loadbalancerlink);
			Fragments._Loadbalancerpolicy__Loadbalancerpolicy.initProperties(_Loadbalancerpolicy);
			Fragments._Loadvolume__Loadvolume.initProperties(_Loadvolume);
			Fragments._Manualmigrationpolicy__Manualmigrationpolicy.initProperties(_Manualmigrationpolicy);
			Fragments._Manualscalingpolicy__Manualscalingpolicy.initProperties(_Manualscalingpolicy);
			Fragments._Manualtargetselection__Manualtargetselection.initProperties(_Manualtargetselection);
			Fragments._Memoryutilisation__Memoryutilisation.initProperties(_Memoryutilisation);
			Fragments._Metric__Metric.initProperties(_Metric);
			Fragments._MetricTargetTracking__MetricTargetTracking.initProperties(_MetricTargetTracking);
			Fragments._Migrationpolicy__Migrationpolicy.initProperties(_Migrationpolicy);
			Fragments._Nonlivemigration__Nonlivemigration.initProperties(_Nonlivemigration);
			Fragments._Openstackprovider__Openstackprovider.initProperties(_Openstackprovider);
			Fragments._OperatorType__OperatorType.initProperties(_OperatorType);
			Fragments._Power__Power.initProperties(_Power);
			Fragments._Provider__Provider.initProperties(_Provider);
			Fragments._Providerinstancelink__Providerinstancelink.initProperties(_Providerinstancelink);
			Fragments._Providerlink__Providerlink.initProperties(_Providerlink);
			Fragments._RecurrenceStep__RecurrenceStep.initProperties(_RecurrenceStep);
			Fragments._Recurringschedulingpolicy__Recurringschedulingpolicy.initProperties(_Recurringschedulingpolicy);
			Fragments._Responsetime__Responsetime.initProperties(_Responsetime);
			Fragments._Responsetimemetric__Responsetimemetric.initProperties(_Responsetimemetric);
			Fragments._Roundrobin__Roundrobin.initProperties(_Roundrobin);
			Fragments._Roundrobinalgo__Roundrobinalgo.initProperties(_Roundrobinalgo);
			Fragments._Rule__Rule.initProperties(_Rule);
			Fragments._Scalingpolicy__Scalingpolicy.initProperties(_Scalingpolicy);
			Fragments._Schedulingpolicy__Schedulingpolicy.initProperties(_Schedulingpolicy);
			Fragments._Simpledynamicscalingpolicy__Simpledynamicscalingpolicy.initProperties(_Simpledynamicscalingpolicy);
			Fragments._Source__Source.initProperties(_Source);
			Fragments._Sourcemigrationpolicy__Sourcemigrationpolicy.initProperties(_Sourcemigrationpolicy);
			Fragments._Step__Step.initProperties(_Step);
			Fragments._Stepdynamicscalingpolicy__Stepdynamicscalingpolicy.initProperties(_Stepdynamicscalingpolicy);
			Fragments._Steplink__Steplink.initProperties(_Steplink);
			Fragments._Swappingpolicy__Swappingpolicy.initProperties(_Swappingpolicy);
			Fragments._Targetmigrationpolicy__Targetmigrationpolicy.initProperties(_Targetmigrationpolicy);
			Fragments._Targetresponsetime__Targetresponsetime.initProperties(_Targetresponsetime);
			Fragments._Uniqueschedulingpolicy__Uniqueschedulingpolicy.initProperties(_Uniqueschedulingpolicy);
			Fragments._Unit__Unit.initProperties(_Unit);
			Fragments._Vmwareprovider__Vmwareprovider.initProperties(_Vmwareprovider);
			Fragments._Wstaticrr__Wstaticrr.initProperties(_Wstaticrr);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModemoTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ActionOperation__add = new EcoreExecutorEnumerationLiteral(ModemoPackage.Literals.ACTION_OPERATION.getEEnumLiteral("add"), Types._ActionOperation, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ActionOperation__remove = new EcoreExecutorEnumerationLiteral(ModemoPackage.Literals.ACTION_OPERATION.getEEnumLiteral("remove"), Types._ActionOperation, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ActionOperation__set_to = new EcoreExecutorEnumerationLiteral(ModemoPackage.Literals.ACTION_OPERATION.getEEnumLiteral("set_to"), Types._ActionOperation, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ActionOperation = {
			_ActionOperation__add,
			_ActionOperation__remove,
			_ActionOperation__set_to
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ActionType__instanceCount = new EcoreExecutorEnumerationLiteral(ModemoPackage.Literals.ACTION_TYPE.getEEnumLiteral("instanceCount"), Types._ActionType, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ActionType__percent = new EcoreExecutorEnumerationLiteral(ModemoPackage.Literals.ACTION_TYPE.getEEnumLiteral("percent"), Types._ActionType, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ActionType = {
			_ActionType__instanceCount,
			_ActionType__percent
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _MetricTargetTracking__AverageCpuUtilisation = new EcoreExecutorEnumerationLiteral(ModemoPackage.Literals.METRIC_TARGET_TRACKING.getEEnumLiteral("AverageCpuUtilisation"), Types._MetricTargetTracking, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _MetricTargetTracking__LBRequestCountperTarget = new EcoreExecutorEnumerationLiteral(ModemoPackage.Literals.METRIC_TARGET_TRACKING.getEEnumLiteral("LBRequestCountperTarget"), Types._MetricTargetTracking, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _MetricTargetTracking__AverageNetworkIn = new EcoreExecutorEnumerationLiteral(ModemoPackage.Literals.METRIC_TARGET_TRACKING.getEEnumLiteral("AverageNetworkIn"), Types._MetricTargetTracking, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _MetricTargetTracking__AverageNetworkOut = new EcoreExecutorEnumerationLiteral(ModemoPackage.Literals.METRIC_TARGET_TRACKING.getEEnumLiteral("AverageNetworkOut"), Types._MetricTargetTracking, 3);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _MetricTargetTracking = {
			_MetricTargetTracking__AverageCpuUtilisation,
			_MetricTargetTracking__LBRequestCountperTarget,
			_MetricTargetTracking__AverageNetworkIn,
			_MetricTargetTracking__AverageNetworkOut
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _OperatorType__GreaterThan = new EcoreExecutorEnumerationLiteral(ModemoPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("GreaterThan"), Types._OperatorType, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _OperatorType__GreaterThanOrEqualTo = new EcoreExecutorEnumerationLiteral(ModemoPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("GreaterThanOrEqualTo"), Types._OperatorType, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _OperatorType__LessThan = new EcoreExecutorEnumerationLiteral(ModemoPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("LessThan"), Types._OperatorType, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _OperatorType__LessThanOrEqualTo = new EcoreExecutorEnumerationLiteral(ModemoPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("LessThanOrEqualTo"), Types._OperatorType, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _OperatorType__EqualTo = new EcoreExecutorEnumerationLiteral(ModemoPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("EqualTo"), Types._OperatorType, 4);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _OperatorType__NotEqualTo = new EcoreExecutorEnumerationLiteral(ModemoPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("NotEqualTo"), Types._OperatorType, 5);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _OperatorType = {
			_OperatorType__GreaterThan,
			_OperatorType__GreaterThanOrEqualTo,
			_OperatorType__LessThan,
			_OperatorType__LessThanOrEqualTo,
			_OperatorType__EqualTo,
			_OperatorType__NotEqualTo
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Unit__minute = new EcoreExecutorEnumerationLiteral(ModemoPackage.Literals.UNIT.getEEnumLiteral("minute"), Types._Unit, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Unit__hour = new EcoreExecutorEnumerationLiteral(ModemoPackage.Literals.UNIT.getEEnumLiteral("hour"), Types._Unit, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Unit__dayOfWeek = new EcoreExecutorEnumerationLiteral(ModemoPackage.Literals.UNIT.getEEnumLiteral("dayOfWeek"), Types._Unit, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Unit__dayOfMonth = new EcoreExecutorEnumerationLiteral(ModemoPackage.Literals.UNIT.getEEnumLiteral("dayOfMonth"), Types._Unit, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Unit__month = new EcoreExecutorEnumerationLiteral(ModemoPackage.Literals.UNIT.getEEnumLiteral("month"), Types._Unit, 4);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Unit = {
			_Unit__minute,
			_Unit__hour,
			_Unit__dayOfWeek,
			_Unit__dayOfMonth,
			_Unit__month
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._ActionOperation.initLiterals(_ActionOperation);
			Types._ActionType.initLiterals(_ActionType);
			Types._MetricTargetTracking.initLiterals(_MetricTargetTracking);
			Types._OperatorType.initLiterals(_OperatorType);
			Types._Unit.initLiterals(_Unit);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModemoTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
