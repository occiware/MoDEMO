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
 * Generated at Sat Nov 17 16:13:27 CET 2018 from platform:/resource/org.eclipse.cmf.occi.multicloud.modemoec2/model/modemoec2.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclispe.cmf.multicloud.modemoec2.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.ec2.model.CreateTagsRequest;
import com.amazonaws.services.ec2.model.DescribeInstancesRequest;
import com.amazonaws.services.ec2.model.DescribeInstancesResult;
import com.amazonaws.services.ec2.model.Instance;
import com.amazonaws.services.ec2.model.InstanceState;
import com.amazonaws.services.ec2.model.Reservation;
import com.amazonaws.services.ec2.model.RunInstancesRequest;
import com.amazonaws.services.ec2.model.RunInstancesResult;
import com.amazonaws.services.ec2.model.Tag;
import com.amazonaws.services.ec2.model.TerminateInstancesRequest;
import com.amazonaws.services.ec2.model.TerminateInstancesResult;


import org.eclipse.cmf.occi.infrastructure.SuspendMethod;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.cmf.occi.infrastructure.RestartMethod; 
import org.eclipse.cmf.occi.infrastructure.SaveMethod; 
import org.eclipse.cmf.occi.infrastructure.StopMethod; 

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemoec2#
 * - term: ec2
 * - title: 
 */
public class Ec2Connector extends org.eclipse.cmf.occi.multicloud.modemoec2.impl.Ec2Impl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(Ec2Connector.class);
	BasicAWSCredentials credentials = new BasicAWSCredentials(
			  "AKIAI6PKUKZZSMRITPOQ",
			  "2TKt1l/WslDUx5ky8Nbv+SrFfCD1r++6OUGTqnQZ"
			);
	//Ec2Connector ec2conn;
	public String instanceid;

	// Start of user code Ec2connector_constructor
	/**
	 * Constructs a ec2 connector.
	 */
	Ec2Connector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code Ec2occiCreate
	/**
	 * Called when this Ec2 instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		AmazonEC2 ec2Client = AmazonEC2ClientBuilder
				  .standard()
				  .withCredentials(new AWSStaticCredentialsProvider(credentials))
				  .withRegion(Regions.US_EAST_2)
				  .build();
		// Creating the EC2 Instance
		System.out.print("SG"  + getAwsEc2instanceSG()); 
		RunInstancesRequest runInstancesRequest = new RunInstancesRequest()
				  .withImageId(getAwsEc2instanceAMI())
				  .withInstanceType(getAwsEc2instanceInstanceType()) 
				  .withKeyName(getAwsEc2instanceKey()) 
				  .withMinCount(1)
				  .withMaxCount(1)
				  .withSecurityGroups(getAwsEc2instanceSG());
		
		// run the instance
		RunInstancesResult result = ec2Client.runInstances(runInstancesRequest);
		
		//String instance_id = result.getReservation().getReservationId();
		Instance instance = result.getReservation().getInstances().get(0);
		System.out.println("EC2 Instance Id: " + instance.getInstanceId());
		
		// set a tag
		//List<Tag> tags = new ArrayList<Tag>();  // more than one tag
		//Tag t = new Tag();
		//t.setKey("name");
		//t.setValue("cloudtest");
		//tags.add(t);
		//CreateTagsRequest ctr = new CreateTagsRequest();
		//ctr.setTags((Collection<Tag>) t);
		//ctr.withResources(instance_id);
		//ec2Client.createTags(ctr);
		
		// Setting up the tags for the instance (another method)
	        CreateTagsRequest createTagsRequest = new CreateTagsRequest()
	                .withResources(instance.getInstanceId())
	                .withTags(new Tag("Name", getTitle()));
	        ec2Client.createTags(createTagsRequest);
	        
			final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);
			domain.getCommandStack().execute(new RecordingCommand(domain) {
				@Override
				protected void doExecute() {
					setAwsEc2instanceInstanceID(instance.getInstanceId());
					//inst.occiCreate();
				}});
	        
	        
		
	        //AssociateAddressRequest associate_request =
	        //	    new AssociateAddressRequest()
	        //	        .withInstanceId("i-06d9f1369fe4d9b07")
	        //	        .withPublicIp("63.32.125.42");
	        //	        //.withAllocationId(allocation_id);
		// Starting the Instance
      //StartInstancesRequest startInstancesRequest = new StartInstancesRequest().withInstanceIds(instance_id);
      //ec2Client.startInstances(startInstancesRequest);
		

	}
	// End of user code

	// Start of user code Ec2_occiRetrieve_method
	/**
	 * Called when this Ec2 instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		LOGGER.debug("instance id  ", instanceid);
		System.out.println("instance id  " +  instanceid);
	    //AmazonEC2 ec2 = new AmazonEC2Client(credentials);  // not sure if it's working
	    AmazonEC2 ec2Client = AmazonEC2ClientBuilder
				  .standard()
				  .withCredentials(new AWSStaticCredentialsProvider(credentials))
				  .build();
	    
	    DescribeInstancesRequest describeInstanceRequest = new DescribeInstancesRequest().withInstanceIds(getAwsEc2instanceInstanceID());
	    DescribeInstancesResult describeInstanceResult = ec2Client.describeInstances(describeInstanceRequest);
	    InstanceState state = describeInstanceResult.getReservations().get(0).getInstances().get(0).getState();
		Instance instance = describeInstanceResult.getReservations().get(0).getInstances().get(0);

	    System.out.println("instance stat " + instance.getState().getName());
	    System.out.println("instance public IP  " + instance.getPublicIpAddress());
	    System.out.println("AMI   " + instance.getImageId());
	   
	    setAwsEc2instancePublicIP(instance.getPublicIpAddress());
	    setOcciComputeStateMessage(instance.getState().getName());
	    setAwsEc2instanceAMI(instance.getImageId());
	    this.setAwsEc2instacneDnsName(instance.getPublicDnsName());
	    this.setAwsEc2instancePrivateIP(instance.getPrivateIpAddress());
	}
	// End of user code

	// Start of user code Ec2_occiUpdate_method
	/**
	 * Called when this Ec2 instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		
	    
	}
	// End of user code

	// Start of user code Ec2occiDelete_method
	/**
	 * Called when this Ec2 instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		AmazonEC2 ec2Client = AmazonEC2ClientBuilder
				  .standard()
				  .withCredentials(new AWSStaticCredentialsProvider(credentials))
				  .build();
	    
	    ////// here
	    
	    
	    
	/////////////////////// terminate ///////////////
	    //TerminateInstancesRequest request1 = new TerminateInstancesRequest().withInstanceIds(instanceid);
	    //List<String> instanceIds = null;
	    System.out.println("instance id " + getAwsEc2instanceInstanceID());
	    //instanceIds.add(instanceid);
	   // TerminateInstancesRequest request1 = new TerminateInstancesRequest().withInstanceIds(instanceid);
	   // TerminateInstancesResult result;
	   // try {
	   //     //result = ec2Client.terminateInstances(request1);
	   // 	ec2Client.terminateInstances(request1);
	   // } catch (AmazonServiceException ase) {
	   //     //System.out.println("Terminate Instances command returned the error code {} " +  ase.getErrorCode());
	   //     //throw ase;
	   // }
	   // TerminateInstancesRequest terminateInstancesRequest = new TerminateInstancesRequest();
	   //         //terminateInstancesRequest.setInstanceIds(instanceIds);
	    //        terminateInstancesRequest.withInstanceIds(instanceid);
	     //       TerminateInstancesResult terminateInstancesResult = ec2Client.terminateInstances(terminateInstancesRequest);
	            
	    TerminateInstancesRequest terminateInstanceRequest = new TerminateInstancesRequest();
		//terminateInstanceRequest.setInstanceIds(instanceIds);
	    terminateInstanceRequest.withInstanceIds(getAwsEc2instanceInstanceID());
		ec2Client.terminateInstances(terminateInstanceRequest);
	}
	// End of user code

	//
	// Ec2 actions.
	//

	// Start of user code Ec2_Kind_restart_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.modemoec2/ec2/action#
     * - term: restart
     * - title: 
	 */
	@Override
	public void restart()
	{
		LOGGER.debug("Action restart() called on " + this);

		// TODO: Implement how to restart this ec2.
	}
	// End of user code
	// Start of user code Ec2_Kind_Suspend_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: suspend
     * - title: Suspend the system (hibernate or in RAM)
	 */
	@Override
	public void suspend(final SuspendMethod method)
	{
		LOGGER.debug("Action suspend(" + "method=" + method + ") called on " + this);

		// TODO: Implement how to suspend this ec2.
	}
	// End of user code
	// Start of user code Ec2_Kind_Restart_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: restart
     * - title: Restart the system (graceful, warm or cold)
	 */
	@Override
	public void restart(final RestartMethod method)
	{
		LOGGER.debug("Action restart(" + "method=" + method + ") called on " + this);

		// TODO: Implement how to restart this ec2.
	}
	// End of user code
	// Start of user code Ec2_Kind_Start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: start
     * - title: Start the system
	 */
	@Override
	public void start()
	{
		//LOGGER.debug("Action start() called on " + this);
		
		
	}
	// End of user code
	// Start of user code Ec2_Kind_Save_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: save
     * - title: Save the system (hot, deferred)
	 */
	@Override
	public void save(final SaveMethod method, final String name)
	{
		LOGGER.debug("Action save(" + "method=" + method + "name=" + name + ") called on " + this);

		// TODO: Implement how to save this ec2.
	}
	// End of user code
	// Start of user code Ec2_Kind_Stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: stop
     * - title: Stop the system (graceful, acpioff or poweroff)
	 */
	@Override
	public void stop(final StopMethod method)
	{
		LOGGER.debug("Action stop(" + "method=" + method + ") called on " + this);

		// TODO: Implement how to stop this ec2.
	}
	// End of user code
}	
