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
 * Generated at Sat Nov 17 14:44:00 CET 2018 from platform:/resource/org.eclipse.cmf.occi.multicloud.modemoazure/model/modemoazure.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.modemoazure.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.microsoft.azure.management.Azure;
import com.microsoft.azure.management.compute.KnownLinuxVirtualMachineImage;
import com.microsoft.azure.management.compute.VirtualMachine;
import com.microsoft.azure.management.compute.VirtualMachineSizeTypes;
import com.microsoft.azure.management.network.PublicIPAddress;
import com.microsoft.azure.management.resources.fluentcore.arm.Region;
import com.microsoft.rest.LogLevel;

import org.eclipse.cmf.occi.infrastructure.StopMethod; 
import org.eclipse.cmf.occi.infrastructure.SuspendMethod;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.cmf.occi.infrastructure.SaveMethod;

import java.io.File;

import org.eclipse.cmf.occi.infrastructure.RestartMethod; 

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemoazure#
 * - term: azurevm
 * - title: 
 */
public class AzurevmConnector extends org.eclipse.cmf.occi.multicloud.modemoazure.impl.AzurevmImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(AzurevmConnector.class);

	// Start of user code Azurevmconnector_constructor
	/**
	 * Constructs a azurevm connector.
	 */
	AzurevmConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code AzurevmocciCreate
	/**
	 * Called when this Azurevm instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		//https://azure.microsoft.com/en-us/blog/azure-management-libraries-for-java-v1-2/
				//https://azure.microsoft.com/en-us/blog/azure-management-libraries-for-java-generally-available-now/
				//https://docs.microsoft.com/en-us/java/azure/java-sdk-manage-virtual-machines?view=azure-java-stable
				//https://github.com/Azure/azure-docs-sdk-java/blob/master/docs-ref-conceptual/java-sdk-azure-authenticate.md
				//https://github.com/Azure/azure-docs-sdk-java/blob/master/docs-ref-conceptual/java-sdk-azure-get-started.md
				//https://docs.microsoft.com/en-us/java/api/overview/azure/virtualmachines?view=azure-java-stable
				
				//https://github.com/Azure/azure-docs-sdk-java/blob/master/docs-ref-conceptual/java-sdk-azure-authenticate.md
					
				
				//https://docs.microsoft.com/en-us/java/azure/java-sdk-azure-get-started?view=azure-java-stable
				LOGGER.debug("Action start() called on " + this);
				
				String sshKey = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDI6dju5zqaLtbHmOX+uGEUiTlC+Kms1CEjVd/7f0eZ33R1Pz1RpO5wKzIpMtGeHfrkN+6D0qvk4zgE7kORpQ/OHMdlNqZqnO+upS2zfwRD7ZJCt6q2lHCyeXvkQEGqhhdwpBqsdxC9TZ8VT6CrCZp6HCObqRVfj5n1W0fBghpiHOkiuyZejYPMQkhXOvL1eKheZNEXMB5h2Ci2UCi20aUqqJS6QOpZvQt0CLGrkc8wJ8HEsT0/76zgjV36+/NiiKTWEakiwtg5VelFkInBklmqNaxAEffHQ++pABcsMrf/aiCAhNvT9/xyMeAmLCLv3di9ydCRhN7hLn+FeJzg2R8/ spirals@MacBook.local";
				Azure azure = azureClient();
			
				try {
					VirtualMachine linuxVM = azure.virtualMachines().define(getTitle())
		                    .withRegion(Region.US_EAST)
		                    .withNewResourceGroup("modemoRG")
		                    .withNewPrimaryNetwork("10.0.0.0/24")
		                    .withPrimaryPrivateIPAddressDynamic()
		                    .withNewPrimaryPublicIPAddress("publicipaddress")
		                    //.withStoredLinuxImage("modemo-image")
		                    .withLinuxCustomImage("/subscriptions/0105f394-8003-4ed7-9566-2aa5853a40c7/resourceGroups/modemoImage/providers/Microsoft.Compute/images/modemo-image")
		                    //.withPopularLinuxImage(KnownLinuxVirtualMachineImage.UBUNTU_SERVER_16_04_LTS)
		                    .withRootUsername("yehia")
		                    .withSsh(sshKey)
		                    //.withUnmanagedDisks()
		                    .withSize(VirtualMachineSizeTypes.STANDARD_A0) 
		                    .create(); 
					System.out.println("the VM name is " + linuxVM.name());
					System.out.println("the VM id is " + linuxVM.id());
					
					final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						@Override
						protected void doExecute() {
							setAzureVmazureId(linuxVM.id());
							//inst.occiCreate();
						}});
					
					
				} catch (Exception e) {
		            System.out.println(e.getMessage());
		            e.printStackTrace();
		        }
	}
	// End of user code

	// Start of user code Azurevm_occiRetrieve_method
	/**
	 * Called when this Azurevm instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		String id = getAzureVmazureId();
		Azure azure = azureClient();
		VirtualMachine azureVM = azure.virtualMachines().getById(id);
		
		String ip = azureVM.getPrimaryPublicIPAddress().ipAddress().toString();
		String status1 = azureVM.provisioningState();
		int index = azureVM.powerState().toString().lastIndexOf("/");
		String status = azureVM.powerState().toString().substring(index+1);
		System.out.println("ip  " + ip);
		setAzureVmazurePublicIP(ip);
		setOcciComputeStateMessage(status);	
		setAzureVmazureSizeType(azureVM.size().toString());
		setAzureVmazureResourceGroup(azureVM.resourceGroupName());
		//azure.virtualMachineImages().
		System.out.println("size "+  azureVM.size());
		
		
		
		
		
	}
	// End of user code

	// Start of user code Azurevm_occiUpdate_method
	/**
	 * Called when this Azurevm instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code AzurevmocciDelete_method
	/**
	 * Called when this Azurevm instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		String id = this.getAzureVmazureId();
		Azure azure = azureClient();
		//VirtualMachine azureVM = azure.virtualMachines().getById(id);
		System.out.println("Delete Azure VM by its id");
		azure.virtualMachines().deleteById(id);
		
	}
	// End of user code

	//
	// Azurevm actions.
	//

	// Start of user code Azurevm_Kind_Stop_action
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

		// TODO: Implement how to stop this azurevm.
	}
	// End of user code
	// Start of user code Azurevm_Kind_Suspend_action
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

		// TODO: Implement how to suspend this azurevm.
	}
	// End of user code
	// Start of user code Azurevm_Kind_Save_action
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

		// TODO: Implement how to save this azurevm.
	}
	// End of user code
	// Start of user code Azurevm_Kind_Restart_action
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

		// TODO: Implement how to restart this azurevm.
	}
	// End of user code
	// Start of user code Azurevm_Kind_restart_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.modemoazure/azurevm/action#
     * - term: restart
     * - title: 
	 */
	@Override
	public void restart()
	{
		LOGGER.debug("Action restart() called on " + this);

		// TODO: Implement how to restart this azurevm.
	}
	// End of user code
	// Start of user code Azurevm_Kind_powerOff_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.modemoazure/azurevm/action#
     * - term: poweroff
     * - title: 
	 */
	@Override
	public void poweroff()
	{
		LOGGER.debug("Action poweroff() called on " + this);

		// TODO: Implement how to poweroff this azurevm.
	}
	// End of user code
	// Start of user code Azurevm_Kind_Start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: start
     * - title: Start the system
	 */
	@Override
	public void start()
	{
		
					
	}
	
private Azure azureClient() {
		
		Azure azure = null;
		try {
			//final File credFile = new File(System.getenv("AZURE_AUTH_LOCATION");
			final File credFile = new File("/Users/spirals/modemotestes/azure/credentials.azureauth"); 
			azure = Azure.configure()            //.withLogLevel(LogLevel.BASIC)
	                .authenticate(credFile)
	                .withDefaultSubscription();
			
			System.out.println("Selected subscription: " + azure.subscriptionId());
			System.out.println("connection succeed " + azure);
		} catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("connection failed");
            e.printStackTrace();
        }
		
		return azure;
		
	}
	// End of user code
}	
