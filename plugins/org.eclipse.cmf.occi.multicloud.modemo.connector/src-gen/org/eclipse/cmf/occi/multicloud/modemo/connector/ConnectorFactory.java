/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *
 * Generated at Sat Nov 17 21:54:40 CET 2018 from platform:/resource/org.eclipse.cmf.occi.multicloud.modemo/model/modemo.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.modemo.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: modemo
 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
 */
public class ConnectorFactory extends org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: horizontalgroup
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup createHorizontalgroup() {
		return new HorizontalgroupConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: loadbalancer
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer createLoadbalancer() {
		return new LoadbalancerConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: elasticitycontroller
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Elasticitycontroller createElasticitycontroller() {
		return new ElasticitycontrollerConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: instancegrouplink
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Instancegrouplink createInstancegrouplink() {
		return new InstancegrouplinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: loadbalancerlink
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Loadbalancerlink createLoadbalancerlink() {
		return new LoadbalancerlinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: elasticlink
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Elasticlink createElasticlink() {
		return new ElasticlinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: rule
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Rule createRule() {
		return new RuleConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: actiontrigger
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Actiontrigger createActiontrigger() {
		return new ActiontriggerConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: step
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Step createStep() {
		return new StepConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: steplink
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Steplink createSteplink() {
		return new SteplinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: provider
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Provider createProvider() {
		return new ProviderConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: providerlink
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Providerlink createProviderlink() {
		return new ProviderlinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: vmwareprovider
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Vmwareprovider createVmwareprovider() {
		return new VmwareproviderConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: openstackprovider
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Openstackprovider createOpenstackprovider() {
		return new OpenstackproviderConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: amazonprovider
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Amazonprovider createAmazonprovider() {
		return new AmazonproviderConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: azureprovider
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Azureprovider createAzureprovider() {
		return new AzureproviderConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: providerinstancelink
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Providerinstancelink createProviderinstancelink() {
		return new ProviderinstancelinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: creation
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Creation createCreation() {
		return new CreationConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: schedulingpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Schedulingpolicy createSchedulingpolicy() {
		return new SchedulingpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: uniqueschedulingpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Uniqueschedulingpolicy createUniqueschedulingpolicy() {
		return new UniqueschedulingpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: recurringschedulingpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy createRecurringschedulingpolicy() {
		return new RecurringschedulingpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: scalingpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Scalingpolicy createScalingpolicy() {
		return new ScalingpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: dynamicscalingpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Dynamicscalingpolicy createDynamicscalingpolicy() {
		return new DynamicscalingpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: dynamicadjustmentscalingpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Dynamicadjustmentscalingpolicy createDynamicadjustmentscalingpolicy() {
		return new DynamicadjustmentscalingpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: simpledynamicscalingpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Simpledynamicscalingpolicy createSimpledynamicscalingpolicy() {
		return new SimpledynamicscalingpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: stepdynamicscalingpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Stepdynamicscalingpolicy createStepdynamicscalingpolicy() {
		return new StepdynamicscalingpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: manualscalingpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Manualscalingpolicy createManualscalingpolicy() {
		return new ManualscalingpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: metric
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Metric createMetric() {
		return new MetricConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: cpuutilisation
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Cpuutilisation createCpuutilisation() {
		return new CpuutilisationConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: memoryutilisation
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Memoryutilisation createMemoryutilisation() {
		return new MemoryutilisationConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: allocationpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Allocationpolicy createAllocationpolicy() {
		return new AllocationpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: roundrobin
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Roundrobin createRoundrobin() {
		return new RoundrobinConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: responsetime
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Responsetime createResponsetime() {
		return new ResponsetimeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: cost
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Cost createCost() {
		return new CostConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: swappingpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Swappingpolicy createSwappingpolicy() {
		return new SwappingpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: sourcemigrationpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Sourcemigrationpolicy createSourcemigrationpolicy() {
		return new SourcemigrationpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: livemigration
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Livemigration createLivemigration() {
		return new LivemigrationConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: nonlivemigration
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Nonlivemigration createNonlivemigration() {
		return new NonlivemigrationConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: migrationpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Migrationpolicy createMigrationpolicy() {
		return new MigrationpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: dynamicmigrationpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Dynamicmigrationpolicy createDynamicmigrationpolicy() {
		return new DynamicmigrationpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: manualmigrationpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Manualmigrationpolicy createManualmigrationpolicy() {
		return new ManualmigrationpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: loadvolume
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Loadvolume createLoadvolume() {
		return new LoadvolumeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: power
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Power createPower() {
		return new PowerConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: targetmigrationpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Targetmigrationpolicy createTargetmigrationpolicy() {
		return new TargetmigrationpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: availableresources
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Availableresources createAvailableresources() {
		return new AvailableresourcesConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: manualtargetselection
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Manualtargetselection createManualtargetselection() {
		return new ManualtargetselectionConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: availableresourcesorload
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Availableresourcesorload createAvailableresourcesorload() {
		return new AvailableresourcesorloadConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: targetresponsetime
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Targetresponsetime createTargetresponsetime() {
		return new TargetresponsetimeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: responsetimemetric
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Responsetimemetric createResponsetimemetric() {
		return new ResponsetimemetricConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: loadbalancerpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Loadbalancerpolicy createLoadbalancerpolicy() {
		return new LoadbalancerpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: roundrobinalgo
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Roundrobinalgo createRoundrobinalgo() {
		return new RoundrobinalgoConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: leastconn
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Leastconn createLeastconn() {
		return new LeastconnConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: leasttraffic
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Leasttraffic createLeasttraffic() {
		return new LeasttrafficConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: wstaticrr
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Wstaticrr createWstaticrr() {
		return new WstaticrrConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: source
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Source createSource() {
		return new SourceConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: first
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.First createFirst() {
		return new FirstConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
	 * - term: leastlatency
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemo.Leastlatency createLeastlatency() {
		return new LeastlatencyConnector();
	}

}
