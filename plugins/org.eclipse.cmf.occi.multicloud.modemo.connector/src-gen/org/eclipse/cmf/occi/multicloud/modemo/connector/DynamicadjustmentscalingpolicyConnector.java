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
 * - term: dynamicadjustmentscalingpolicy
 * - title: 
 */
public class DynamicadjustmentscalingpolicyConnector extends org.eclipse.cmf.occi.multicloud.modemo.impl.DynamicadjustmentscalingpolicyImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(DynamicadjustmentscalingpolicyConnector.class);
	private static volatile boolean bool=true;
	private static volatile boolean verticalcontroller=true; 

	// Start of user code Dynamicadjustmentscalingpolicyconnector_constructor
	/**
	 * Constructs a dynamicadjustmentscalingpolicy connector.
	 */
	DynamicadjustmentscalingpolicyConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code


	// Start of user code Dynamicadjustmentscalingpolicy_Mixin_start_action
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

		// TODO: Implement how to start this dynamicadjustmentscalingpolicy.
		Resource res = (Resource) this.eContainer();
		ElasticitycontrollerImpl elasticity = (ElasticitycontrollerImpl) res;
		ElasticitycontrollerConnector ec = (ElasticitycontrollerConnector)elasticity;
		
		bool = true;
		verticalcontroller = true;
		for (Link link : ec.getLinks()) {
			///final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);
			if (link != null && link.getTarget() instanceof Horizontalgroup) {
				MyRunnable myRunnable = new MyRunnable() {
					public void run() {
						while(bool) {
							///domain.getCommandStack().execute(new RecordingCommand(domain) {
								///@Override
								///protected void doExecute() {
									startdynamicadjustment(ec);
								///}});
							
							System.out.println("Wait betwwen loop cycles to avoid consuming CPU cycles");	
							try {
								Thread.sleep(getDynamicscalingpolicyIterationWaitTime());
							} catch (InterruptedException e) {
								e.printStackTrace();
							}	
						}
					}
				};
				Thread thread = new Thread(myRunnable);
				thread.start();
			}
			if (link != null && link.getTarget() instanceof Instancevmware) {
				MyRunnable myRunnable1 = new MyRunnable() {
					public void run() {
						while(verticalcontroller) {
							Compute vm = (Compute) link.getTarget();
							try {
								dynamicVertical(vm, ec);
								System.out.println("Wait  between loop  iterations to save CPU cycles");
								Thread.sleep(getDynamicscalingpolicyIterationWaitTime());
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
						}
					}
				};
				Thread thread1 = new Thread(myRunnable1);
				thread1.start();
			}
		}

	}
	// End of user code
	// Start of user code Dynamicadjustmentscalingpolicy_Mixin_stop_action
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

		// TODO: Implement how to stop this dynamicadjustmentscalingpolicy.
		System.out.println("stop is called");
		bool = false;
		verticalcontroller = false;
	}
	
//////////horizontal ///////////////////
	protected void startdynamicadjustment(ElasticitycontrollerConnector ec) {
		int coolduration = this.getDynamicscalingpolicyCoolDuration();
		//int coolduration = cooldurationbig.intValue();    // this added because of the problem big integer
		
		String  metric = this.getDynamicadjustmentscalingpolicyMetric().getName();
		double metrcUsage  =  ec.CPUGroupUsage();
		Horizontalgroup hg = ec.getHorzontalgroup();
		int groupSize = hg.getHorizontalgroupGroupSize();
		//float decreaseIndicator = ((((groupSize-1)*this.dynamicAdjustmentTarget)/groupSize) - 5);
		float decreaseIndicator = ((((groupSize-1)*this.dynamicadjustmentscalingpolicyTarget)/groupSize) - 5);  // B = (((count-1)*Tcpu)/count) - alpha // you have not to violate the threshold (Tcpu)
		
		if (metrcUsage >= this.dynamicadjustmentscalingpolicyTarget) {
			ec.action( "add", "instanceCount", 1, coolduration);
		}
		
		if(metrcUsage < decreaseIndicator) {
			ec.action( "remove", "instanceCount", 1, coolduration);
		}	
    }
	
	
	protected void dynamicVertical(Compute vm, ElasticitycontrollerConnector ec) throws InterruptedException {
		int coolduration = this.getDynamicscalingpolicyCoolDuration();
		
		//String  metric = this.getDynamicAdjustmentMetric().getName();
		String  metric = this.getDynamicadjustmentscalingpolicyMetric().getName();
		double metrcUsage  =  ec.getMetricVertical( vm, "cpuutilisationconnector");
		int vcpus = vm.getOcciComputeCores();   ///float decreaseIndicator = ((((vcpus-1)*this.dynamicAdjustmentTarget)/vcpus) - 1);
		float decreaseIndicator = ((((vcpus-1)*this.dynamicadjustmentscalingpolicyTarget)/vcpus) - 1);  // B = (((count-1)*Tcpu)/count) - alpha // you have not to violate the threshold (Tcpu)
		float increment = 1;

		if (metrcUsage >= this.dynamicadjustmentscalingpolicyTarget) {
			ec.actionVertical(vm,  increment, "cpuutilisationconnector", "add", coolduration);
		}
		
		if(metrcUsage < decreaseIndicator) {
			ec.actionVertical(vm,  increment, "cpuutilisationconnector", "remove", coolduration);
		}	
	}
	
	// End of user code
}	
