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

import java.util.Date;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.docker.DockerPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.cmf.occi.multicloud.accounts.AccountsPackage;

import org.eclipse.cmf.occi.multicloud.modemo.ActionOperation;
import org.eclipse.cmf.occi.multicloud.modemo.ActionType;
import org.eclipse.cmf.occi.multicloud.modemo.Actiontrigger;
import org.eclipse.cmf.occi.multicloud.modemo.Allocationpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Amazonprovider;
import org.eclipse.cmf.occi.multicloud.modemo.Array;
import org.eclipse.cmf.occi.multicloud.modemo.ArrofRecStep;
import org.eclipse.cmf.occi.multicloud.modemo.Availableresources;
import org.eclipse.cmf.occi.multicloud.modemo.Availableresourcesorload;
import org.eclipse.cmf.occi.multicloud.modemo.Azureprovider;
import org.eclipse.cmf.occi.multicloud.modemo.Cost;
import org.eclipse.cmf.occi.multicloud.modemo.Cpuutilisation;
import org.eclipse.cmf.occi.multicloud.modemo.Creation;
import org.eclipse.cmf.occi.multicloud.modemo.Dynamicadjustmentscalingpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Dynamicmigrationpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Dynamicscalingpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Elasticitycontroller;
import org.eclipse.cmf.occi.multicloud.modemo.Elasticlink;
import org.eclipse.cmf.occi.multicloud.modemo.First;
import org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup;
import org.eclipse.cmf.occi.multicloud.modemo.Instancegrouplink;
import org.eclipse.cmf.occi.multicloud.modemo.Leastconn;
import org.eclipse.cmf.occi.multicloud.modemo.Leastlatency;
import org.eclipse.cmf.occi.multicloud.modemo.Leasttraffic;
import org.eclipse.cmf.occi.multicloud.modemo.Livemigration;
import org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer;
import org.eclipse.cmf.occi.multicloud.modemo.Loadbalancerlink;
import org.eclipse.cmf.occi.multicloud.modemo.Loadbalancerpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Loadvolume;
import org.eclipse.cmf.occi.multicloud.modemo.Manualmigrationpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Manualscalingpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Manualtargetselection;
import org.eclipse.cmf.occi.multicloud.modemo.Memoryutilisation;
import org.eclipse.cmf.occi.multicloud.modemo.Metric;
import org.eclipse.cmf.occi.multicloud.modemo.MetricTargetTracking;
import org.eclipse.cmf.occi.multicloud.modemo.Migrationpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.ModemoFactory;
import org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage;
import org.eclipse.cmf.occi.multicloud.modemo.Nonlivemigration;
import org.eclipse.cmf.occi.multicloud.modemo.Openstackprovider;
import org.eclipse.cmf.occi.multicloud.modemo.OperatorType;
import org.eclipse.cmf.occi.multicloud.modemo.Power;
import org.eclipse.cmf.occi.multicloud.modemo.Provider;
import org.eclipse.cmf.occi.multicloud.modemo.Providerinstancelink;
import org.eclipse.cmf.occi.multicloud.modemo.Providerlink;
import org.eclipse.cmf.occi.multicloud.modemo.RecurrenceStep;
import org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Responsetime;
import org.eclipse.cmf.occi.multicloud.modemo.Responsetimemetric;
import org.eclipse.cmf.occi.multicloud.modemo.Roundrobin;
import org.eclipse.cmf.occi.multicloud.modemo.Roundrobinalgo;
import org.eclipse.cmf.occi.multicloud.modemo.Rule;
import org.eclipse.cmf.occi.multicloud.modemo.Scalingpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Schedulingpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Simpledynamicscalingpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Source;
import org.eclipse.cmf.occi.multicloud.modemo.Sourcemigrationpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Step;
import org.eclipse.cmf.occi.multicloud.modemo.Stepdynamicscalingpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Steplink;
import org.eclipse.cmf.occi.multicloud.modemo.Swappingpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Targetmigrationpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Targetresponsetime;
import org.eclipse.cmf.occi.multicloud.modemo.Uniqueschedulingpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Unit;
import org.eclipse.cmf.occi.multicloud.modemo.Vmwareprovider;
import org.eclipse.cmf.occi.multicloud.modemo.Wstaticrr;

import org.eclipse.cmf.occi.multicloud.modemo.util.ModemoValidator;

import org.eclipse.cmf.occi.multicloud.modemoazure.ModemoazurePackage;
import org.eclipse.cmf.occi.multicloud.modemoec2.Modemoec2Package;
import org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModemoPackageImpl extends EPackageImpl implements ModemoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recurrenceStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrofRecStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass horizontalgroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadbalancerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elasticitycontrollerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instancegrouplinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadbalancerlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elasticlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actiontriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass steplinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmwareproviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openstackproviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amazonproviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass azureproviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerinstancelinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulingpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniqueschedulingpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recurringschedulingpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalingpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicscalingpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicadjustmentscalingpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpledynamicscalingpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepdynamicscalingpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualscalingpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuutilisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryutilisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roundrobinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsetimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass costEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swappingpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourcemigrationpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livemigrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonlivemigrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass migrationpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicmigrationpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualmigrationpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadvolumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetmigrationpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availableresourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualtargetselectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availableresourcesorloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetresponsetimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsetimemetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadbalancerpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roundrobinalgoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leastconnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leasttrafficEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wstaticrrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leastlatencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metricTargetTrackingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModemoPackageImpl() {
		super(eNS_URI, ModemoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ModemoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModemoPackage init() {
		if (isInited) return (ModemoPackage)EPackage.Registry.INSTANCE.getEPackage(ModemoPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModemoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModemoPackageImpl theModemoPackage = registeredModemoPackage instanceof ModemoPackageImpl ? (ModemoPackageImpl)registeredModemoPackage : new ModemoPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();
		VmwarePackage.eINSTANCE.eClass();
		AccountsPackage.eINSTANCE.eClass();
		DockerPackage.eINSTANCE.eClass();
		Modemoec2Package.eINSTANCE.eClass();
		ModemoazurePackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModemoPackage.createPackageContents();

		// Initialize created meta-data
		theModemoPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theModemoPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ModemoValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theModemoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModemoPackage.eNS_URI, theModemoPackage);
		return theModemoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecurrenceStep() {
		return recurrenceStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecurrenceStep_Unit() {
		return (EAttribute)recurrenceStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecurrenceStep_Value() {
		return (EReference)recurrenceStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArray() {
		return arrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_Values() {
		return (EAttribute)arrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrofRecStep() {
		return arrofRecStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrofRecStep_ArrofrecstepValues() {
		return (EReference)arrofRecStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHorizontalgroup() {
		return horizontalgroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalgroup_HorizontalgroupName() {
		return (EAttribute)horizontalgroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalgroup_HorizontalgroupGroupSize() {
		return (EAttribute)horizontalgroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalgroup_HorizontalgroupMaximum() {
		return (EAttribute)horizontalgroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalgroup_HorizontalgroupMinimum() {
		return (EAttribute)horizontalgroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalgroup_HorizontalgroupTemplateName() {
		return (EAttribute)horizontalgroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalgroup_HorizontalgroupLoadBalancer() {
		return (EAttribute)horizontalgroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadbalancer() {
		return loadbalancerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadbalancer_LoadbalancerName() {
		return (EAttribute)loadbalancerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadbalancer_LoadbalancerInstanceIP() {
		return (EAttribute)loadbalancerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadbalancer_LoadbalancerAddress() {
		return (EAttribute)loadbalancerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadbalancer__Addbackendserver() {
		return loadbalancerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadbalancer__Removebackendserver() {
		return loadbalancerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElasticitycontroller() {
		return elasticitycontrollerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElasticitycontroller_ElasticitycontrollerMinimumLimit() {
		return (EAttribute)elasticitycontrollerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElasticitycontroller_ElasticitycontrollerMaximumLimit() {
		return (EAttribute)elasticitycontrollerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstancegrouplink() {
		return instancegrouplinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstancegrouplink__SourceConstraint__DiagnosticChain_Map() {
		return instancegrouplinkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstancegrouplink__TargetConstraint__DiagnosticChain_Map() {
		return instancegrouplinkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadbalancerlink() {
		return loadbalancerlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadbalancerlink__SourceConstraint__DiagnosticChain_Map() {
		return loadbalancerlinkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadbalancerlink__TargetConstraint__DiagnosticChain_Map() {
		return loadbalancerlinkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElasticlink() {
		return elasticlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElasticlink__SourceConstraint__DiagnosticChain_Map() {
		return elasticlinkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElasticlink__TargetConstraint__DiagnosticChain_Map() {
		return elasticlinkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_RuleOperator() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_RuleThreshold() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_RulePeriod() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_RuleConsecutive() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRule__SourceConstraint__DiagnosticChain_Map() {
		return ruleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRule__TargetConstraint__DiagnosticChain_Map() {
		return ruleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActiontrigger() {
		return actiontriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiontrigger_ActiontriggerAction() {
		return (EAttribute)actiontriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiontrigger_ActiontriggerActionType() {
		return (EAttribute)actiontriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiontrigger_ActiontriggerAmount() {
		return (EAttribute)actiontriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_StepLowerStepBound() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_StepUpperStepBound() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_StepSize() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSteplink() {
		return steplinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSteplink__SourceConstraint__DiagnosticChain_Map() {
		return steplinkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSteplink__TargetConstraint__DiagnosticChain_Map() {
		return steplinkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProviderlink() {
		return providerlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProviderlink__SourceConstraint__DiagnosticChain_Map() {
		return providerlinkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProviderlink__TargetConstraint__DiagnosticChain_Map() {
		return providerlinkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVmwareprovider() {
		return vmwareproviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenstackprovider() {
		return openstackproviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmazonprovider() {
		return amazonproviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAzureprovider() {
		return azureproviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProviderinstancelink() {
		return providerinstancelinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProviderinstancelink__SourceConstraint__DiagnosticChain_Map() {
		return providerinstancelinkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProviderinstancelink__TargetConstraint__DiagnosticChain_Map() {
		return providerinstancelinkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreation() {
		return creationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreation_OcciComputeCreationDate() {
		return (EAttribute)creationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreation__AppliesConstraint__DiagnosticChain_Map() {
		return creationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedulingpolicy() {
		return schedulingpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSchedulingpolicy__Start() {
		return schedulingpolicyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSchedulingpolicy__Stop() {
		return schedulingpolicyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSchedulingpolicy__AppliesConstraint__DiagnosticChain_Map() {
		return schedulingpolicyEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniqueschedulingpolicy() {
		return uniqueschedulingpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniqueschedulingpolicy_UniqueschedulingpolicyStartDate() {
		return (EAttribute)uniqueschedulingpolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniqueschedulingpolicy_UniqueschedulingpolicyEndDate() {
		return (EAttribute)uniqueschedulingpolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecurringschedulingpolicy() {
		return recurringschedulingpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecurringschedulingpolicy_RecurringschedulingpolicyRecurrence() {
		return (EReference)recurringschedulingpolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecurringschedulingpolicy_RecurringschedulingpolicyStartDate() {
		return (EAttribute)recurringschedulingpolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecurringschedulingpolicy_RecurringschedulingpolicyEndDate() {
		return (EAttribute)recurringschedulingpolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecurringschedulingpolicy_RecurringschedulingpolicyInterval() {
		return (EAttribute)recurringschedulingpolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalingpolicy() {
		return scalingpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScalingpolicy__Start() {
		return scalingpolicyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScalingpolicy__Stop() {
		return scalingpolicyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScalingpolicy__AppliesConstraint__DiagnosticChain_Map() {
		return scalingpolicyEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicscalingpolicy() {
		return dynamicscalingpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicscalingpolicy_DynamicscalingpolicyCoolDuration() {
		return (EAttribute)dynamicscalingpolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicscalingpolicy_DynamicscalingpolicyIterationWaitTime() {
		return (EAttribute)dynamicscalingpolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicadjustmentscalingpolicy() {
		return dynamicadjustmentscalingpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyMetric() {
		return (EAttribute)dynamicadjustmentscalingpolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyDisableScaleIn() {
		return (EAttribute)dynamicadjustmentscalingpolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyTarget() {
		return (EAttribute)dynamicadjustmentscalingpolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpledynamicscalingpolicy() {
		return simpledynamicscalingpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepdynamicscalingpolicy() {
		return stepdynamicscalingpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManualscalingpolicy() {
		return manualscalingpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManualscalingpolicy_ManualscalingpolicyDesiredSize() {
		return (EAttribute)manualscalingpolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManualscalingpolicy_ManualscalingpolicyComputeUnit() {
		return (EAttribute)manualscalingpolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Name() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMetric__AppliesConstraint__DiagnosticChain_Map() {
		return metricEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCpuutilisation() {
		return cpuutilisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryutilisation() {
		return memoryutilisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationpolicy() {
		return allocationpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAllocationpolicy__AppliesConstraint__DiagnosticChain_Map() {
		return allocationpolicyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoundrobin() {
		return roundrobinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponsetime() {
		return responsetimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCost() {
		return costEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwappingpolicy() {
		return swappingpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwappingpolicy__AppliesConstraint__DiagnosticChain_Map() {
		return swappingpolicyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourcemigrationpolicy() {
		return sourcemigrationpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSourcemigrationpolicy__AppliesConstraint__DiagnosticChain_Map() {
		return sourcemigrationpolicyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivemigration() {
		return livemigrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonlivemigration() {
		return nonlivemigrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMigrationpolicy() {
		return migrationpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMigrationpolicy__AppliesConstraint__DiagnosticChain_Map() {
		return migrationpolicyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicmigrationpolicy() {
		return dynamicmigrationpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManualmigrationpolicy() {
		return manualmigrationpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadvolume() {
		return loadvolumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPower() {
		return powerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetmigrationpolicy() {
		return targetmigrationpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTargetmigrationpolicy__AppliesConstraint__DiagnosticChain_Map() {
		return targetmigrationpolicyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvailableresources() {
		return availableresourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManualtargetselection() {
		return manualtargetselectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvailableresourcesorload() {
		return availableresourcesorloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetresponsetime() {
		return targetresponsetimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponsetimemetric() {
		return responsetimemetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadbalancerpolicy() {
		return loadbalancerpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadbalancerpolicy__Start() {
		return loadbalancerpolicyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadbalancerpolicy__Stop() {
		return loadbalancerpolicyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadbalancerpolicy__AppliesConstraint__DiagnosticChain_Map() {
		return loadbalancerpolicyEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoundrobinalgo() {
		return roundrobinalgoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeastconn() {
		return leastconnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeasttraffic() {
		return leasttrafficEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWstaticrr() {
		return wstaticrrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirst() {
		return firstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeastlatency() {
		return leastlatencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperatorType() {
		return operatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionOperation() {
		return actionOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionType() {
		return actionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMetricTargetTracking() {
		return metricTargetTrackingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnit() {
		return unitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat() {
		return floatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModemoFactory getModemoFactory() {
		return (ModemoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		recurrenceStepEClass = createEClass(RECURRENCE_STEP);
		createEAttribute(recurrenceStepEClass, RECURRENCE_STEP__UNIT);
		createEReference(recurrenceStepEClass, RECURRENCE_STEP__VALUE);

		arrayEClass = createEClass(ARRAY);
		createEAttribute(arrayEClass, ARRAY__VALUES);

		arrofRecStepEClass = createEClass(ARROF_REC_STEP);
		createEReference(arrofRecStepEClass, ARROF_REC_STEP__ARROFRECSTEP_VALUES);

		horizontalgroupEClass = createEClass(HORIZONTALGROUP);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTALGROUP_NAME);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTALGROUP_GROUP_SIZE);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTALGROUP_MAXIMUM);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTALGROUP_MINIMUM);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTALGROUP_TEMPLATE_NAME);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTALGROUP_LOAD_BALANCER);

		loadbalancerEClass = createEClass(LOADBALANCER);
		createEAttribute(loadbalancerEClass, LOADBALANCER__LOADBALANCER_NAME);
		createEAttribute(loadbalancerEClass, LOADBALANCER__LOADBALANCER_INSTANCE_IP);
		createEAttribute(loadbalancerEClass, LOADBALANCER__LOADBALANCER_ADDRESS);
		createEOperation(loadbalancerEClass, LOADBALANCER___ADDBACKENDSERVER);
		createEOperation(loadbalancerEClass, LOADBALANCER___REMOVEBACKENDSERVER);

		elasticitycontrollerEClass = createEClass(ELASTICITYCONTROLLER);
		createEAttribute(elasticitycontrollerEClass, ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MINIMUM_LIMIT);
		createEAttribute(elasticitycontrollerEClass, ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MAXIMUM_LIMIT);

		instancegrouplinkEClass = createEClass(INSTANCEGROUPLINK);
		createEOperation(instancegrouplinkEClass, INSTANCEGROUPLINK___SOURCE_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(instancegrouplinkEClass, INSTANCEGROUPLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		loadbalancerlinkEClass = createEClass(LOADBALANCERLINK);
		createEOperation(loadbalancerlinkEClass, LOADBALANCERLINK___SOURCE_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(loadbalancerlinkEClass, LOADBALANCERLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		elasticlinkEClass = createEClass(ELASTICLINK);
		createEOperation(elasticlinkEClass, ELASTICLINK___SOURCE_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(elasticlinkEClass, ELASTICLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__RULE_OPERATOR);
		createEAttribute(ruleEClass, RULE__RULE_THRESHOLD);
		createEAttribute(ruleEClass, RULE__RULE_PERIOD);
		createEAttribute(ruleEClass, RULE__RULE_CONSECUTIVE);
		createEOperation(ruleEClass, RULE___SOURCE_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(ruleEClass, RULE___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		actiontriggerEClass = createEClass(ACTIONTRIGGER);
		createEAttribute(actiontriggerEClass, ACTIONTRIGGER__ACTIONTRIGGER_ACTION);
		createEAttribute(actiontriggerEClass, ACTIONTRIGGER__ACTIONTRIGGER_ACTION_TYPE);
		createEAttribute(actiontriggerEClass, ACTIONTRIGGER__ACTIONTRIGGER_AMOUNT);

		stepEClass = createEClass(STEP);
		createEAttribute(stepEClass, STEP__STEP_LOWER_STEP_BOUND);
		createEAttribute(stepEClass, STEP__STEP_UPPER_STEP_BOUND);
		createEAttribute(stepEClass, STEP__STEP_SIZE);

		steplinkEClass = createEClass(STEPLINK);
		createEOperation(steplinkEClass, STEPLINK___SOURCE_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(steplinkEClass, STEPLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		providerEClass = createEClass(PROVIDER);

		providerlinkEClass = createEClass(PROVIDERLINK);
		createEOperation(providerlinkEClass, PROVIDERLINK___SOURCE_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(providerlinkEClass, PROVIDERLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		vmwareproviderEClass = createEClass(VMWAREPROVIDER);

		openstackproviderEClass = createEClass(OPENSTACKPROVIDER);

		amazonproviderEClass = createEClass(AMAZONPROVIDER);

		azureproviderEClass = createEClass(AZUREPROVIDER);

		providerinstancelinkEClass = createEClass(PROVIDERINSTANCELINK);
		createEOperation(providerinstancelinkEClass, PROVIDERINSTANCELINK___SOURCE_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(providerinstancelinkEClass, PROVIDERINSTANCELINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		creationEClass = createEClass(CREATION);
		createEAttribute(creationEClass, CREATION__OCCI_COMPUTE_CREATION_DATE);
		createEOperation(creationEClass, CREATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		schedulingpolicyEClass = createEClass(SCHEDULINGPOLICY);
		createEOperation(schedulingpolicyEClass, SCHEDULINGPOLICY___START);
		createEOperation(schedulingpolicyEClass, SCHEDULINGPOLICY___STOP);
		createEOperation(schedulingpolicyEClass, SCHEDULINGPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		uniqueschedulingpolicyEClass = createEClass(UNIQUESCHEDULINGPOLICY);
		createEAttribute(uniqueschedulingpolicyEClass, UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_START_DATE);
		createEAttribute(uniqueschedulingpolicyEClass, UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_END_DATE);

		recurringschedulingpolicyEClass = createEClass(RECURRINGSCHEDULINGPOLICY);
		createEReference(recurringschedulingpolicyEClass, RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_RECURRENCE);
		createEAttribute(recurringschedulingpolicyEClass, RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_START_DATE);
		createEAttribute(recurringschedulingpolicyEClass, RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_END_DATE);
		createEAttribute(recurringschedulingpolicyEClass, RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_INTERVAL);

		scalingpolicyEClass = createEClass(SCALINGPOLICY);
		createEOperation(scalingpolicyEClass, SCALINGPOLICY___START);
		createEOperation(scalingpolicyEClass, SCALINGPOLICY___STOP);
		createEOperation(scalingpolicyEClass, SCALINGPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		dynamicscalingpolicyEClass = createEClass(DYNAMICSCALINGPOLICY);
		createEAttribute(dynamicscalingpolicyEClass, DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_COOL_DURATION);
		createEAttribute(dynamicscalingpolicyEClass, DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME);

		dynamicadjustmentscalingpolicyEClass = createEClass(DYNAMICADJUSTMENTSCALINGPOLICY);
		createEAttribute(dynamicadjustmentscalingpolicyEClass, DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_METRIC);
		createEAttribute(dynamicadjustmentscalingpolicyEClass, DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_DISABLE_SCALE_IN);
		createEAttribute(dynamicadjustmentscalingpolicyEClass, DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_TARGET);

		simpledynamicscalingpolicyEClass = createEClass(SIMPLEDYNAMICSCALINGPOLICY);

		stepdynamicscalingpolicyEClass = createEClass(STEPDYNAMICSCALINGPOLICY);

		manualscalingpolicyEClass = createEClass(MANUALSCALINGPOLICY);
		createEAttribute(manualscalingpolicyEClass, MANUALSCALINGPOLICY__MANUALSCALINGPOLICY_DESIRED_SIZE);
		createEAttribute(manualscalingpolicyEClass, MANUALSCALINGPOLICY__MANUALSCALINGPOLICY_COMPUTE_UNIT);

		metricEClass = createEClass(METRIC);
		createEAttribute(metricEClass, METRIC__NAME);
		createEOperation(metricEClass, METRIC___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		cpuutilisationEClass = createEClass(CPUUTILISATION);

		memoryutilisationEClass = createEClass(MEMORYUTILISATION);

		allocationpolicyEClass = createEClass(ALLOCATIONPOLICY);
		createEOperation(allocationpolicyEClass, ALLOCATIONPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		roundrobinEClass = createEClass(ROUNDROBIN);

		responsetimeEClass = createEClass(RESPONSETIME);

		costEClass = createEClass(COST);

		swappingpolicyEClass = createEClass(SWAPPINGPOLICY);
		createEOperation(swappingpolicyEClass, SWAPPINGPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		sourcemigrationpolicyEClass = createEClass(SOURCEMIGRATIONPOLICY);
		createEOperation(sourcemigrationpolicyEClass, SOURCEMIGRATIONPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		livemigrationEClass = createEClass(LIVEMIGRATION);

		nonlivemigrationEClass = createEClass(NONLIVEMIGRATION);

		migrationpolicyEClass = createEClass(MIGRATIONPOLICY);
		createEOperation(migrationpolicyEClass, MIGRATIONPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		dynamicmigrationpolicyEClass = createEClass(DYNAMICMIGRATIONPOLICY);

		manualmigrationpolicyEClass = createEClass(MANUALMIGRATIONPOLICY);

		loadvolumeEClass = createEClass(LOADVOLUME);

		powerEClass = createEClass(POWER);

		targetmigrationpolicyEClass = createEClass(TARGETMIGRATIONPOLICY);
		createEOperation(targetmigrationpolicyEClass, TARGETMIGRATIONPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		availableresourcesEClass = createEClass(AVAILABLERESOURCES);

		manualtargetselectionEClass = createEClass(MANUALTARGETSELECTION);

		availableresourcesorloadEClass = createEClass(AVAILABLERESOURCESORLOAD);

		targetresponsetimeEClass = createEClass(TARGETRESPONSETIME);

		responsetimemetricEClass = createEClass(RESPONSETIMEMETRIC);

		loadbalancerpolicyEClass = createEClass(LOADBALANCERPOLICY);
		createEOperation(loadbalancerpolicyEClass, LOADBALANCERPOLICY___START);
		createEOperation(loadbalancerpolicyEClass, LOADBALANCERPOLICY___STOP);
		createEOperation(loadbalancerpolicyEClass, LOADBALANCERPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		roundrobinalgoEClass = createEClass(ROUNDROBINALGO);

		leastconnEClass = createEClass(LEASTCONN);

		leasttrafficEClass = createEClass(LEASTTRAFFIC);

		wstaticrrEClass = createEClass(WSTATICRR);

		sourceEClass = createEClass(SOURCE);

		firstEClass = createEClass(FIRST);

		leastlatencyEClass = createEClass(LEASTLATENCY);

		// Create enums
		operatorTypeEEnum = createEEnum(OPERATOR_TYPE);
		actionOperationEEnum = createEEnum(ACTION_OPERATION);
		actionTypeEEnum = createEEnum(ACTION_TYPE);
		metricTargetTrackingEEnum = createEEnum(METRIC_TARGET_TRACKING);
		unitEEnum = createEEnum(UNIT);

		// Create data types
		floatEDataType = createEDataType(FLOAT);
		dateEDataType = createEDataType(DATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		horizontalgroupEClass.getESuperTypes().add(theOCCIPackage.getResource());
		loadbalancerEClass.getESuperTypes().add(theOCCIPackage.getResource());
		elasticitycontrollerEClass.getESuperTypes().add(theOCCIPackage.getResource());
		instancegrouplinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		loadbalancerlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		elasticlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		ruleEClass.getESuperTypes().add(theOCCIPackage.getLink());
		actiontriggerEClass.getESuperTypes().add(theOCCIPackage.getResource());
		stepEClass.getESuperTypes().add(theOCCIPackage.getResource());
		steplinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		providerEClass.getESuperTypes().add(theOCCIPackage.getResource());
		providerlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		vmwareproviderEClass.getESuperTypes().add(this.getProvider());
		openstackproviderEClass.getESuperTypes().add(this.getProvider());
		amazonproviderEClass.getESuperTypes().add(this.getProvider());
		azureproviderEClass.getESuperTypes().add(this.getProvider());
		providerinstancelinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		creationEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		schedulingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		uniqueschedulingpolicyEClass.getESuperTypes().add(this.getSchedulingpolicy());
		uniqueschedulingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		recurringschedulingpolicyEClass.getESuperTypes().add(this.getSchedulingpolicy());
		recurringschedulingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		scalingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		dynamicscalingpolicyEClass.getESuperTypes().add(this.getScalingpolicy());
		dynamicscalingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		dynamicadjustmentscalingpolicyEClass.getESuperTypes().add(this.getDynamicscalingpolicy());
		dynamicadjustmentscalingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		simpledynamicscalingpolicyEClass.getESuperTypes().add(this.getDynamicscalingpolicy());
		simpledynamicscalingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		stepdynamicscalingpolicyEClass.getESuperTypes().add(this.getDynamicscalingpolicy());
		stepdynamicscalingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		manualscalingpolicyEClass.getESuperTypes().add(this.getScalingpolicy());
		manualscalingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		metricEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		cpuutilisationEClass.getESuperTypes().add(this.getMetric());
		cpuutilisationEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		memoryutilisationEClass.getESuperTypes().add(this.getMetric());
		memoryutilisationEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		allocationpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		roundrobinEClass.getESuperTypes().add(this.getAllocationpolicy());
		roundrobinEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		responsetimeEClass.getESuperTypes().add(this.getAllocationpolicy());
		responsetimeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		costEClass.getESuperTypes().add(this.getAllocationpolicy());
		costEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		swappingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		sourcemigrationpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		livemigrationEClass.getESuperTypes().add(this.getMigrationpolicy());
		livemigrationEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		nonlivemigrationEClass.getESuperTypes().add(this.getMigrationpolicy());
		nonlivemigrationEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		migrationpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		dynamicmigrationpolicyEClass.getESuperTypes().add(this.getSourcemigrationpolicy());
		dynamicmigrationpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		manualmigrationpolicyEClass.getESuperTypes().add(this.getSourcemigrationpolicy());
		manualmigrationpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		loadvolumeEClass.getESuperTypes().add(this.getDynamicmigrationpolicy());
		loadvolumeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		powerEClass.getESuperTypes().add(this.getDynamicmigrationpolicy());
		powerEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		targetmigrationpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		availableresourcesEClass.getESuperTypes().add(this.getAllocationpolicy());
		availableresourcesEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		manualtargetselectionEClass.getESuperTypes().add(this.getTargetmigrationpolicy());
		manualtargetselectionEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		availableresourcesorloadEClass.getESuperTypes().add(this.getTargetmigrationpolicy());
		availableresourcesorloadEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		targetresponsetimeEClass.getESuperTypes().add(this.getTargetmigrationpolicy());
		targetresponsetimeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		responsetimemetricEClass.getESuperTypes().add(this.getMetric());
		responsetimemetricEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		loadbalancerpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		roundrobinalgoEClass.getESuperTypes().add(this.getLoadbalancerpolicy());
		roundrobinalgoEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		leastconnEClass.getESuperTypes().add(this.getLoadbalancerpolicy());
		leastconnEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		leasttrafficEClass.getESuperTypes().add(this.getLoadbalancerpolicy());
		leasttrafficEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		wstaticrrEClass.getESuperTypes().add(this.getLoadbalancerpolicy());
		wstaticrrEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		sourceEClass.getESuperTypes().add(this.getLoadbalancerpolicy());
		sourceEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		firstEClass.getESuperTypes().add(this.getLoadbalancerpolicy());
		firstEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		leastlatencyEClass.getESuperTypes().add(this.getLoadbalancerpolicy());
		leastlatencyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(recurrenceStepEClass, RecurrenceStep.class, "RecurrenceStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecurrenceStep_Unit(), this.getUnit(), "unit", null, 1, 1, RecurrenceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecurrenceStep_Value(), this.getArray(), null, "value", null, 0, 1, RecurrenceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayEClass, Array.class, "Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArray_Values(), ecorePackage.getEInt(), "values", null, 0, -1, Array.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrofRecStepEClass, ArrofRecStep.class, "ArrofRecStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrofRecStep_ArrofrecstepValues(), this.getRecurrenceStep(), null, "arrofrecstepValues", null, 0, -1, ArrofRecStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(horizontalgroupEClass, Horizontalgroup.class, "Horizontalgroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHorizontalgroup_HorizontalgroupName(), ecorePackage.getEString(), "horizontalgroupName", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalgroup_HorizontalgroupGroupSize(), ecorePackage.getEInt(), "horizontalgroupGroupSize", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalgroup_HorizontalgroupMaximum(), ecorePackage.getEInt(), "horizontalgroupMaximum", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalgroup_HorizontalgroupMinimum(), ecorePackage.getEInt(), "horizontalgroupMinimum", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalgroup_HorizontalgroupTemplateName(), ecorePackage.getEString(), "horizontalgroupTemplateName", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalgroup_HorizontalgroupLoadBalancer(), ecorePackage.getEString(), "horizontalgroupLoadBalancer", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadbalancerEClass, Loadbalancer.class, "Loadbalancer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoadbalancer_LoadbalancerName(), ecorePackage.getEString(), "loadbalancerName", null, 0, 1, Loadbalancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadbalancer_LoadbalancerInstanceIP(), ecorePackage.getEString(), "loadbalancerInstanceIP", null, 0, 1, Loadbalancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadbalancer_LoadbalancerAddress(), ecorePackage.getEString(), "loadbalancerAddress", null, 0, 1, Loadbalancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLoadbalancer__Addbackendserver(), null, "addbackendserver", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLoadbalancer__Removebackendserver(), null, "removebackendserver", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elasticitycontrollerEClass, Elasticitycontroller.class, "Elasticitycontroller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElasticitycontroller_ElasticitycontrollerMinimumLimit(), ecorePackage.getEInt(), "ElasticitycontrollerMinimumLimit", null, 0, 1, Elasticitycontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElasticitycontroller_ElasticitycontrollerMaximumLimit(), ecorePackage.getEInt(), "ElasticitycontrollerMaximumLimit", null, 0, 1, Elasticitycontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instancegrouplinkEClass, Instancegrouplink.class, "Instancegrouplink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getInstancegrouplink__SourceConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sourceConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInstancegrouplink__TargetConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "targetConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(loadbalancerlinkEClass, Loadbalancerlink.class, "Loadbalancerlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getLoadbalancerlink__SourceConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sourceConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLoadbalancerlink__TargetConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "targetConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elasticlinkEClass, Elasticlink.class, "Elasticlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getElasticlink__SourceConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sourceConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElasticlink__TargetConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "targetConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_RuleOperator(), this.getOperatorType(), "ruleOperator", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_RuleThreshold(), this.getFloat(), "ruleThreshold", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_RulePeriod(), ecorePackage.getEInt(), "rulePeriod", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_RuleConsecutive(), ecorePackage.getEInt(), "ruleConsecutive", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRule__SourceConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sourceConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRule__TargetConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "targetConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actiontriggerEClass, Actiontrigger.class, "Actiontrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActiontrigger_ActiontriggerAction(), this.getActionOperation(), "actiontriggerAction", null, 0, 1, Actiontrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActiontrigger_ActiontriggerActionType(), this.getActionType(), "actiontriggerActionType", null, 0, 1, Actiontrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActiontrigger_ActiontriggerAmount(), this.getFloat(), "actiontriggerAmount", null, 0, 1, Actiontrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStep_StepLowerStepBound(), this.getFloat(), "stepLowerStepBound", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_StepUpperStepBound(), this.getFloat(), "stepUpperStepBound", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_StepSize(), this.getFloat(), "stepSize", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(steplinkEClass, Steplink.class, "Steplink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSteplink__SourceConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sourceConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSteplink__TargetConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "targetConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providerlinkEClass, Providerlink.class, "Providerlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getProviderlink__SourceConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sourceConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProviderlink__TargetConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "targetConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vmwareproviderEClass, Vmwareprovider.class, "Vmwareprovider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openstackproviderEClass, Openstackprovider.class, "Openstackprovider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(amazonproviderEClass, Amazonprovider.class, "Amazonprovider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(azureproviderEClass, Azureprovider.class, "Azureprovider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providerinstancelinkEClass, Providerinstancelink.class, "Providerinstancelink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getProviderinstancelink__SourceConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sourceConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProviderinstancelink__TargetConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "targetConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(creationEClass, Creation.class, "Creation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreation_OcciComputeCreationDate(), this.getDate(), "occiComputeCreationDate", null, 0, 1, Creation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCreation__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(schedulingpolicyEClass, Schedulingpolicy.class, "Schedulingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSchedulingpolicy__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSchedulingpolicy__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSchedulingpolicy__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(uniqueschedulingpolicyEClass, Uniqueschedulingpolicy.class, "Uniqueschedulingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniqueschedulingpolicy_UniqueschedulingpolicyStartDate(), this.getDate(), "uniqueschedulingpolicyStartDate", null, 0, 1, Uniqueschedulingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUniqueschedulingpolicy_UniqueschedulingpolicyEndDate(), this.getDate(), "uniqueschedulingpolicyEndDate", null, 0, 1, Uniqueschedulingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recurringschedulingpolicyEClass, Recurringschedulingpolicy.class, "Recurringschedulingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecurringschedulingpolicy_RecurringschedulingpolicyRecurrence(), this.getArrofRecStep(), null, "recurringschedulingpolicyRecurrence", null, 0, 1, Recurringschedulingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecurringschedulingpolicy_RecurringschedulingpolicyStartDate(), this.getDate(), "recurringschedulingpolicyStartDate", null, 0, 1, Recurringschedulingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecurringschedulingpolicy_RecurringschedulingpolicyEndDate(), this.getDate(), "recurringschedulingpolicyEndDate", null, 0, 1, Recurringschedulingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecurringschedulingpolicy_RecurringschedulingpolicyInterval(), ecorePackage.getEInt(), "recurringschedulingpolicyInterval", null, 0, 1, Recurringschedulingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scalingpolicyEClass, Scalingpolicy.class, "Scalingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getScalingpolicy__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getScalingpolicy__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getScalingpolicy__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dynamicscalingpolicyEClass, Dynamicscalingpolicy.class, "Dynamicscalingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDynamicscalingpolicy_DynamicscalingpolicyCoolDuration(), ecorePackage.getEInt(), "dynamicscalingpolicyCoolDuration", null, 0, 1, Dynamicscalingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicscalingpolicy_DynamicscalingpolicyIterationWaitTime(), ecorePackage.getEInt(), "dynamicscalingpolicyIterationWaitTime", null, 0, 1, Dynamicscalingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicadjustmentscalingpolicyEClass, Dynamicadjustmentscalingpolicy.class, "Dynamicadjustmentscalingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyMetric(), this.getMetricTargetTracking(), "dynamicadjustmentscalingpolicyMetric", null, 0, 1, Dynamicadjustmentscalingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyDisableScaleIn(), ecorePackage.getEBoolean(), "dynamicadjustmentscalingpolicyDisableScaleIn", null, 0, 1, Dynamicadjustmentscalingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyTarget(), this.getFloat(), "dynamicadjustmentscalingpolicyTarget", null, 0, 1, Dynamicadjustmentscalingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpledynamicscalingpolicyEClass, Simpledynamicscalingpolicy.class, "Simpledynamicscalingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stepdynamicscalingpolicyEClass, Stepdynamicscalingpolicy.class, "Stepdynamicscalingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manualscalingpolicyEClass, Manualscalingpolicy.class, "Manualscalingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManualscalingpolicy_ManualscalingpolicyDesiredSize(), this.getFloat(), "manualscalingpolicyDesiredSize", null, 0, 1, Manualscalingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManualscalingpolicy_ManualscalingpolicyComputeUnit(), ecorePackage.getEString(), "manualscalingpolicyComputeUnit", null, 0, 1, Manualscalingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricEClass, Metric.class, "Metric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetric_Name(), ecorePackage.getEString(), "name", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMetric__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cpuutilisationEClass, Cpuutilisation.class, "Cpuutilisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memoryutilisationEClass, Memoryutilisation.class, "Memoryutilisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allocationpolicyEClass, Allocationpolicy.class, "Allocationpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAllocationpolicy__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(roundrobinEClass, Roundrobin.class, "Roundrobin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(responsetimeEClass, Responsetime.class, "Responsetime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(costEClass, Cost.class, "Cost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(swappingpolicyEClass, Swappingpolicy.class, "Swappingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSwappingpolicy__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sourcemigrationpolicyEClass, Sourcemigrationpolicy.class, "Sourcemigrationpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSourcemigrationpolicy__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(livemigrationEClass, Livemigration.class, "Livemigration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nonlivemigrationEClass, Nonlivemigration.class, "Nonlivemigration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(migrationpolicyEClass, Migrationpolicy.class, "Migrationpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getMigrationpolicy__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dynamicmigrationpolicyEClass, Dynamicmigrationpolicy.class, "Dynamicmigrationpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manualmigrationpolicyEClass, Manualmigrationpolicy.class, "Manualmigrationpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loadvolumeEClass, Loadvolume.class, "Loadvolume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(powerEClass, Power.class, "Power", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetmigrationpolicyEClass, Targetmigrationpolicy.class, "Targetmigrationpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getTargetmigrationpolicy__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(availableresourcesEClass, Availableresources.class, "Availableresources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manualtargetselectionEClass, Manualtargetselection.class, "Manualtargetselection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(availableresourcesorloadEClass, Availableresourcesorload.class, "Availableresourcesorload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetresponsetimeEClass, Targetresponsetime.class, "Targetresponsetime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(responsetimemetricEClass, Responsetimemetric.class, "Responsetimemetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loadbalancerpolicyEClass, Loadbalancerpolicy.class, "Loadbalancerpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getLoadbalancerpolicy__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLoadbalancerpolicy__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLoadbalancerpolicy__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(roundrobinalgoEClass, Roundrobinalgo.class, "Roundrobinalgo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leastconnEClass, Leastconn.class, "Leastconn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leasttrafficEClass, Leasttraffic.class, "Leasttraffic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wstaticrrEClass, Wstaticrr.class, "Wstaticrr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(firstEClass, First.class, "First", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leastlatencyEClass, Leastlatency.class, "Leastlatency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(operatorTypeEEnum, OperatorType.class, "OperatorType");
		addEEnumLiteral(operatorTypeEEnum, OperatorType.GREATER_THAN);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.GREATER_THAN_OR_EQUAL_TO);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.LESS_THAN);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.LESS_THAN_OR_EQUAL_TO);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.EQUAL_TO);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.NOT_EQUAL_TO);

		initEEnum(actionOperationEEnum, ActionOperation.class, "ActionOperation");
		addEEnumLiteral(actionOperationEEnum, ActionOperation.ADD);
		addEEnumLiteral(actionOperationEEnum, ActionOperation.REMOVE);
		addEEnumLiteral(actionOperationEEnum, ActionOperation.SET_TO);

		initEEnum(actionTypeEEnum, ActionType.class, "ActionType");
		addEEnumLiteral(actionTypeEEnum, ActionType.INSTANCE_COUNT);
		addEEnumLiteral(actionTypeEEnum, ActionType.PERCENT);

		initEEnum(metricTargetTrackingEEnum, MetricTargetTracking.class, "MetricTargetTracking");
		addEEnumLiteral(metricTargetTrackingEEnum, MetricTargetTracking.AVERAGE_CPU_UTILISATION);
		addEEnumLiteral(metricTargetTrackingEEnum, MetricTargetTracking.LB_REQUEST_COUNTPER_TARGET);
		addEEnumLiteral(metricTargetTrackingEEnum, MetricTargetTracking.AVERAGE_NETWORK_IN);
		addEEnumLiteral(metricTargetTrackingEEnum, MetricTargetTracking.AVERAGE_NETWORK_OUT);

		initEEnum(unitEEnum, Unit.class, "Unit");
		addEEnumLiteral(unitEEnum, Unit.MINUTE);
		addEEnumLiteral(unitEEnum, Unit.HOUR);
		addEEnumLiteral(unitEEnum, Unit.DAY_OF_WEEK);
		addEEnumLiteral(unitEEnum, Unit.DAY_OF_MONTH);
		addEEnumLiteral(unitEEnum, Unit.MONTH);

		// Initialize data types
		initEDataType(floatEDataType, Float.class, "Float", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (instancegrouplinkEClass,
		   source,
		   new String[] {
			   "constraints", "targetConstraint"
		   });
		addAnnotation
		  (loadbalancerlinkEClass,
		   source,
		   new String[] {
			   "constraints", "targetConstraint"
		   });
		addAnnotation
		  (elasticlinkEClass,
		   source,
		   new String[] {
			   "constraints", "targetConstraint"
		   });
		addAnnotation
		  (ruleEClass,
		   source,
		   new String[] {
			   "constraints", "targetConstraint"
		   });
		addAnnotation
		  (steplinkEClass,
		   source,
		   new String[] {
			   "constraints", "targetConstraint"
		   });
		addAnnotation
		  (providerlinkEClass,
		   source,
		   new String[] {
			   "constraints", "targetConstraint"
		   });
		addAnnotation
		  (providerinstancelinkEClass,
		   source,
		   new String[] {
			   "constraints", "targetConstraint"
		   });
		addAnnotation
		  (creationEClass,
		   source,
		   new String[] {
			   "constraints", "appliesConstraint"
		   });
		addAnnotation
		  (schedulingpolicyEClass,
		   source,
		   new String[] {
			   "constraints", "appliesConstraint"
		   });
		addAnnotation
		  (scalingpolicyEClass,
		   source,
		   new String[] {
			   "constraints", "appliesConstraint"
		   });
		addAnnotation
		  (metricEClass,
		   source,
		   new String[] {
			   "constraints", "appliesConstraint"
		   });
		addAnnotation
		  (allocationpolicyEClass,
		   source,
		   new String[] {
			   "constraints", "appliesConstraint"
		   });
		addAnnotation
		  (swappingpolicyEClass,
		   source,
		   new String[] {
			   "constraints", "appliesConstraint"
		   });
		addAnnotation
		  (sourcemigrationpolicyEClass,
		   source,
		   new String[] {
			   "constraints", "appliesConstraint"
		   });
		addAnnotation
		  (migrationpolicyEClass,
		   source,
		   new String[] {
			   "constraints", "appliesConstraint"
		   });
		addAnnotation
		  (targetmigrationpolicyEClass,
		   source,
		   new String[] {
			   "constraints", "appliesConstraint"
		   });
		addAnnotation
		  (loadbalancerpolicyEClass,
		   source,
		   new String[] {
			   "constraints", "appliesConstraint"
		   });
	}

} //ModemoPackageImpl
