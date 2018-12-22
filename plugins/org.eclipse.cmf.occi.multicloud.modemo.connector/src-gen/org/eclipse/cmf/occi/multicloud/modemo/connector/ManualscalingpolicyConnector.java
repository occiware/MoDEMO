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

import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup;
import org.eclipse.cmf.occi.multicloud.modemo.impl.ElasticitycontrollerImpl;
import org.eclipse.cmf.occi.multicloud.vmware.Instancevmware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
 * - term: manualscalingpolicy
 * - title: 
 */
public class ManualscalingpolicyConnector extends org.eclipse.cmf.occi.multicloud.modemo.impl.ManualscalingpolicyImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ManualscalingpolicyConnector.class);

	// Start of user code Manualscalingpolicyconnector_constructor
	/**
	 * Constructs a manualscalingpolicy connector.
	 */
	ManualscalingpolicyConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code


	// Start of user code Manualscalingpolicy_Mixin_start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo/scalingpolicy/action#
     * - term: start
     * - title: 
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);
		System.out.println("your are in the correct start");
		Horizontalgroup hg = null;
		Compute vm = null;
		Resource res = (Resource) this.eContainer();
		ElasticitycontrollerImpl elasticity = (ElasticitycontrollerImpl) res;
		ElasticitycontrollerConnector ec = (ElasticitycontrollerConnector)elasticity;
		
		for (Link link : ec.getLinks()) {
			if (link != null && link.getTarget() instanceof Horizontalgroup) {
				hg = (Horizontalgroup) link.getTarget();
				break;
			}
			else if (link != null && link.getTarget() instanceof Instancevmware) {
				 vm = (Compute)link.getTarget();
				break;
			}
		}
		
		if (hg !=null) {
			if ((getManualscalingpolicyDesiredSize() != 0) && (getManualscalingpolicyDesiredSize() != null)) {
				// doEditing(hg, getManualGroupSize());
				// ((HorizontalgroupConnector) hg).doEditing22(getManualGroupSize());
				float manualDesiredSize = getManualscalingpolicyDesiredSize();
				//hg.setHorizontalgroupGroupSize((int)manualDesiredSize);   // commented due to the Bigintger
				hg.setHorizontalgroupGroupSize((int)manualDesiredSize);
			}		   
			//if ((ec.getElasticitycontrollerMaximumLimit() != 0) && (ec.getElasticitycontrollerMaximumLimit() != null)) {
			if ((ec.getElasticitycontrollerMaximumLimit() != 0)) {
					hg.setHorizontalgroupMaximum((int)ec.getElasticitycontrollerMaximumLimit());
					System.out.println(" Max size from elasticity controller" +(int)ec.getElasticitycontrollerMaximumLimit());
			}
		   
			//if ((ec.getElasticitycontrollerMinimumLimit() != 0) && (ec.getElasticitycontrollerMinimumLimit() != null)) {
			if ((ec.getElasticitycontrollerMinimumLimit() != 0)) {
					//hg.setHorizontalgroupMinimum((int)ec.getElasticitycontrollerMinimumLimit());
				    hg.setHorizontalgroupMinimum((int)ec.getElasticitycontrollerMinimumLimit());
			}
			//Horizontalgroup hgg =hg;
			//final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);
			//domain.getCommandStack().execute(new RecordingCommand(domain) {
			//	@Override
			//	protected void doExecute() {
			//		hgg.occiUpdate();
			//	}});
			hg.occiUpdate();
			
		} else if (vm!=null) {
			String computeUnit = this.getManualscalingpolicyComputeUnit();
			System.out.println("Comput unite " + computeUnit);
			manual(computeUnit, vm, ec); 
		} else {
			System.out.println("there is no link to any resource");
		}
		
	}
	// End of user code
	// Start of user code Manualscalingpolicy_Mixin_stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo/scalingpolicy/action#
     * - term: stop
     * - title: 
	 */
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);

		// TODO: Implement how to stop this manualscalingpolicy.
	}
	
	private void manual( String computeUnit, Compute vm, ElasticitycontrollerConnector ec) {
		int cpus = vm.getOcciComputeCores();
		switch (computeUnit) {
        	case "cpu":	
        		System.out.println("current vCPUs are: " + cpus);
        		if (getManualscalingpolicyDesiredSize().intValue() <= ec.getElasticitycontrollerMaximumLimit() && getManualscalingpolicyDesiredSize().intValue() >= ec.getElasticitycontrollerMinimumLimit()) {
        			float cpuNum =  getManualscalingpolicyDesiredSize();
        			vm.setOcciComputeCores((int)cpuNum);
        			vm.occiUpdate();
        			vm.occiRetrieve();
        			System.out.println("the number of vcores becomes: " + vm.getOcciComputeCores());
        		} else {
        			System.out.println("can't go beyond the limits");
        		}
            break;
        		
        	case "memory":
        		float memSize = vm.getOcciComputeMemory();
        		System.out.println("current Memory is : " + memSize);
        		if (getManualscalingpolicyDesiredSize().intValue() <= ec.getElasticitycontrollerMaximumLimit() && getManualscalingpolicyDesiredSize().intValue() >= ec.getElasticitycontrollerMinimumLimit()) {	
        			vm.setOcciComputeMemory(getManualscalingpolicyDesiredSize());
        			vm.occiUpdate();
        			vm.occiRetrieve();
        			System.out.println("the Memory size becomes " + vm.getOcciComputeMemory() + "GB");
        		} else {
        			System.out.println("can't go beyond the limits");
        		}
            break;
        default: 
        		System.out.println("Enter correct cmpoute unit");
        break;
		}
		
	}	

	// End of user code
}	
