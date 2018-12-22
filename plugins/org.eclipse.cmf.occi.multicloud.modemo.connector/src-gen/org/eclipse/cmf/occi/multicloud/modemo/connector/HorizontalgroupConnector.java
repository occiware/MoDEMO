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

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.cmf.occi.infrastructure.ComputeStatus;
import org.eclipse.cmf.occi.multicloud.modemo.Amazonprovider;
import org.eclipse.cmf.occi.multicloud.modemo.Azureprovider;
import org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup;
import org.eclipse.cmf.occi.multicloud.modemo.Instancegrouplink;
import org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer;
import org.eclipse.cmf.occi.multicloud.modemo.ModemoFactory;
import org.eclipse.cmf.occi.multicloud.modemo.Providerlink;
import org.eclipse.cmf.occi.multicloud.modemo.Rule;
import org.eclipse.cmf.occi.multicloud.modemo.Vmwareprovider;
import org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm;
import org.eclipse.cmf.occi.multicloud.modemoazure.ModemoazureFactory;
import org.eclipse.cmf.occi.multicloud.modemoec2.Ec2;
import org.eclipse.cmf.occi.multicloud.modemoec2.Modemoec2Factory;
import org.eclipse.cmf.occi.multicloud.vmware.Instancevmware;
import org.eclipse.cmf.occi.multicloud.vmware.VmwareFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.eclipse.cmf.occi.core.Entity;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemo#
 * - term: horizontalgroup
 * - title: 
 */
public class HorizontalgroupConnector extends org.eclipse.cmf.occi.multicloud.modemo.impl.HorizontalgroupImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(HorizontalgroupConnector.class);

	// Start of user code Horizontalgroupconnector_constructor
	/**
	 * Constructs a horizontalgroup connector.
	 */
	HorizontalgroupConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code HorizontalgroupocciCreate
	/**
	 * Called when this Horizontalgroup instance is completely created.
	 */
	
	public void doEditing(int value) {
		System.out.println("titi " + this);
		Horizontalgroup hg = this;
		HorizontalgroupConnector hgc = this;
	    // Make sure your element is attached to a source, otherwise this will return null
		Resource res = this.eResource();
		ResourceSet rs = this.eResource().getResourceSet();
		//System.out.println("1-titi " + this.eResource());
		//System.out.println("2-titi " + this.eResource().getResourceSet());
		//TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(hg);
		//TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain((ResourceSet) hgc);
		TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(rs);
		//if(domain == null){
		//domain =
		//TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(rs);
		//}
	    //System.out.println("tata " + domain);
	    domain.getCommandStack().execute(new RecordingCommand(domain) {
	        @Override
	        protected void doExecute() {
	            // Implement your write operations here,
	            // for example: set a new name
	        		//((Horizontalgroup)element).setHorizontalGroupGroupSize(value);
	   ///     		System.out.println("element " +hgc);
	    ///    		System.out.println("getfeature " +hgc.eClass().getEStructuralFeature("horizontalGroupGroupSize"));
	        		hg.eSet(hg.eClass().getEStructuralFeature("horizontalGroupGroupSize"), value);
	            //((Compute)element).setOcciComputeCores(size);
	            //((Compute)element).occiRetrieve();
	        }
	    });
	}
	
	public void doEditing22(int value) {
		final Horizontalgroup hg = this;
		//final Machine machine = this;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                TransactionalEditingDomain ted = 
                	TransactionUtil.getEditingDomain(hg);
                ted.getCommandStack().execute(new RecordingCommand(ted) 
                	{
                 @Override
                 protected void doExecute() {
                	 hg.setHorizontalgroupGroupSize(value);
                	 //hg.eSet(hg.eClass().getEStructuralFeature("horizontalGroupGroupSize"), value);
                }
                });
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
	
	
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
		if (getHorizontalgroupGroupSize() > getHorizontalgroupMaximum()) {
			setHorizontalgroupGroupSize(getHorizontalgroupMaximum());
		}
		
		if (getHorizontalgroupGroupSize() < getHorizontalgroupMinimum()) {
			setHorizontalgroupGroupSize(getHorizontalgroupMinimum());
		}
		
		int vmIndex1=1;
		final ExecutorService service = Executors.newCachedThreadPool();
		///final ExecutorService service = Executors.newSingleThreadExecutor();
		////Set<Runnable> runnables = new HashSet<Runnable>();
		for (int i=1; i <= getHorizontalgroupGroupSize(); ++i) {
			int vmIndex = vmIndex1;
			MyRunnable myRunnable = new MyRunnable() {
				public void run() {
					try {
						createGroup(vmIndex);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			///service.execute(myRunnable);
			service.submit(myRunnable);
			//service.invokeAll(myRunnable);
			try {
				Thread.sleep(5000); // wait 5 seconds to allows threads to be created
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			vmIndex1++;	
		}
	}
	
	
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		//createLinksAndConfig();
		
		
		//allocationPolicy();
		//providerList();
		//lastcreatedInstance();
		//amazonConfiguration(2);
		getnextProvider();
		System.out.println(" yes  " + getnextProvider());
	}
	// Start of user code Horizontalgroup_occiUpdate_method
	/**
	 * Called when this Horizontalgroup instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
        initializGroupSize(); // this is just to check the groupSize if it's bigger or smaller than the maximum and minimum size of the group
		
		int  oldGroupSize = 0;
		ArrayList<String> LlinksIds = new ArrayList<String>();
		for (Link link : this.getLinks()) {
			if(link instanceof Instancegrouplink) {
				oldGroupSize = oldGroupSize+1;
				LlinksIds.add(link.getId());
			}
		}
		System.out.println("the old group size is  " + oldGroupSize );	
		if (getHorizontalgroupGroupSize() > oldGroupSize) {
			System.out.println("The group will be increased by " + (getHorizontalgroupGroupSize() - oldGroupSize));
			for (String p : LlinksIds)
			    System.out.println("existed instances : " + p );
			final int Gsize = oldGroupSize;
			String provider = getnextProvider();
			if(provider.equals("InstancevmwareConnector")) {
				creatVM(Gsize, LlinksIds);
			}
			if(provider.equals("Ec2Connector")) {
				createEC2(Gsize, LlinksIds);
			}
			if(provider.equals("AzurevmConnector")) {
				createAzure(Gsize, LlinksIds);
			}
		}
			
        else if (getHorizontalgroupGroupSize() < oldGroupSize) {
        		int instancestodelete = (oldGroupSize - getHorizontalgroupGroupSize());
        		System.out.println("The group will be decreased by " + instancestodelete);
        		updateDecrease(instancestodelete);

        } else {
        		System.out.println("there is no change in the group size" );
        		for (Link link : this.getLinks()) {
        			if(link.getTarget() instanceof Instancevmware) {
        				Instancevmware inst = (Instancevmware)link.getTarget();
        				System.out.println(inst);
        			}
                }
        	}
	}
	
	// Start of user code HorizontalgroupocciDelete_method
	/**
	 * Called when this Horizontalgroup instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
		int i=0;
		for (Link link1 : this.getLinks()) {
			++i;
			System.out.println("out of the loop" + i);
			if(link1.getTarget() instanceof Instancevmware) {
				try {
					System.out.println("vmware link found" + i);
					Instancevmware instance = (Instancevmware)link1.getTarget();
					// Remove from model.
					Configuration config = OcciHelper.getConfiguration(instance);					
					org.eclipse.cmf.occi.core.Resource src = link1.getSource();
					org.eclipse.cmf.occi.core.Resource target = link1.getTarget();
										
					System.out.println("the link is removed");
					config.getResources().remove(instance);
					System.out.println("the instance configuration is removed");
					if (src != null) {
					//	src.getLinks().remove(link1);
					src.getLinks().clear();
					} else {
						System.out.println("Warning, the link : " + link1.getKind().getName() + " has no source !");
					}
					if (target != null) {
						//target.getLinks().remove(link1);
						target.getLinks().clear();
						//Iterator it = src.getLinks().iterator();
						//while (it.hasNext()) {
						//	it.remove();
						//}
					} else {
						System.out.println("Warning, the link : " + link1.getKind().getName() + " has no target !");
					}
				} catch ( Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				System.out.println("sleep between loop iterations");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void createLinksAndConfig() {
		for (int i=1; i <= getHorizontalgroupGroupSize(); i++) {
			Configuration config = (Configuration)this.eContainer();
			Instancegrouplink igl = ModemoFactory.eINSTANCE.createInstancegrouplink();
			Instancevmware vm = VmwareFactory.eINSTANCE.createInstancevmware();
			config.getResources().add(vm);
			igl.setSource(this);
			igl.setTarget(vm);
			System.out.println(igl);
			System.out.println(vm);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	private void updateDecrease(int instanceNum) {
		ArrayList<Link>  arrayLinks = new ArrayList<Link>();
		for (Link link : this.getLinks()) {
			if(link instanceof Instancegrouplink) { //if((link.getTarget() instanceof Instancevmware) && i <=instanceNum) 
				arrayLinks.add(link);
				System.out.println("link added to array list" + link);
			}
		}
		
		for (int i = 1; i<= instanceNum; ++i) {
			Link link1 = arrayLinks.get(arrayLinks.size() - 1);
			if(link1.getTarget() instanceof Instancevmware) {
				deleteVMInstance(link1);
			}
			if(link1.getTarget() instanceof Ec2) {
				deleteEC2Instance(link1);
			}
			if(link1.getTarget() instanceof Azurevm) {
				deleteAzureInstance(link1);
			}
			arrayLinks.remove(arrayLinks.size() - 1);
		}
	}
	
	private void initializGroupSize() {
		if (getHorizontalgroupGroupSize() > getHorizontalgroupMaximum()) {
			System.out.println("The group size is bigger than the maximum limit of the group, the group size is set to the maximum group size" );
			setHorizontalgroupGroupSize(getHorizontalgroupMaximum());
        } else if (getHorizontalgroupGroupSize() < getHorizontalgroupMinimum()) {
        		System.out.println("The group size is smaller than the minimum limit of the group, the group size is set to the minimum group size" );

        } else {
        	System.out.println("it is ok, the groupSize is in the correct range" );
        }
        
	}
	
	protected void createInstanceandLinkConfig(int oldGroupSize) {
		for (int i=oldGroupSize+1; i <= getHorizontalgroupGroupSize(); i++) {
			Configuration config = (Configuration)this.eContainer();
			Instancegrouplink igl = ModemoFactory.eINSTANCE.createInstancegrouplink();
			Instancevmware vm = VmwareFactory.eINSTANCE.createInstancevmware();
			config.getResources().add(vm);
			igl.setSource(this);
			igl.setTarget(vm);
			igl.getTarget();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(" i= " + 1);	
		}
	}
	
	private Link createConfig() {
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);	
		Link link = null;
		Link link1 = null;
		Configuration config = (Configuration)this.eContainer();
		Instancegrouplink igl = ModemoFactory.eINSTANCE.createInstancegrouplink();
		Instancevmware vm = VmwareFactory.eINSTANCE.createInstancevmware();
		Horizontalgroup hg = this;
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				config.getResources().add(vm);
				igl.setSource(hg);
				igl.setTarget(vm);
			}});

		link1 = igl;
		if (link1 !=null) {
			System.out.println(link1);
			System.out.println(vm);
			link = link1;
		}
		return link;
	}
	
	private String getIP(Link link) throws InterruptedException  { 
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);	
		String ipp = "";
		String ip = "";
		Instancevmware inst = (Instancevmware)link.getTarget();
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				Instancevmware inst = (Instancevmware)link.getTarget();
				inst.occiRetrieve();
			}});
		//inst.occiRetrieve();
		Thread.sleep(20000);
		while (inst.getAttributes().get(8).getValue().isEmpty()) { 
			String stateMessage = inst.getOcciComputeStateMessage();
			String gueststate = inst.getAttributes().get(4).getValue();
			if (!gueststate.equals("running")) {
				System.out.println("The machine is creating:  " + stateMessage + "  the machine state is: " + gueststate);
			} else {
				System.out.println("Waiting for the machine to reboot and to get its DHCP ip");
			}
			domain.getCommandStack().execute(new RecordingCommand(domain) {
				@Override
				protected void doExecute() {
					Instancevmware inst = (Instancevmware)link.getTarget();
					try {
						inst.occiRetrieve();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}});
			Thread.sleep(20000);
		}
		ipp = inst.getAttributes().get(8).getValue();
		if (!ipp.isEmpty()) {
			ip =ipp;
			System.out.println("node  " +inst.getAttributes().get(1).getValue() + " ip  " +  inst.getAttributes().get(8).getValue());
		} else {
			System.out.print("ip not found");
		}
		
		return ip;
	}
	
	private void registerinLBandMonitoring(String ip, String vmname) {
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);	
		Loadbalancer lb = null;
		for(Link link: this.getLinks()) {
			if((link.getTarget() instanceof Loadbalancer) &&  link.getTarget() !=null) {
				lb = (Loadbalancer) link.getTarget();
			}
		}
		final Loadbalancer LB  = lb;
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				LB.setLoadbalancerInstanceIP(ip);
			}});
		//lb.setLoadbalancerInstanceIP(ip);
		LB.addbackendserver();
		
		//register the vms in the monitoring system
		ZabbixMonitoring2 zabbix_obj = new ZabbixMonitoring2();
		String zabi = zabbix_obj.connect();
		String hostgroup = "Scalair scaling group";
		zabbix_obj.host_create(zabi, vmname, ip, 10050, hostgroup, "Scalair Template OS Linux");
	}
	
	private void createGroup(int vmIndex) throws InterruptedException {
		
		//create config
		Link link = createConfig();
		Thread.sleep(10000);
			
		//create vm
		//String vmName = "node"+vmIndex;
		String vmName = "flask"+vmIndex;
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);	
		Instancevmware inst = (Instancevmware)link.getTarget();
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				inst.setTitle(vmName);
				inst.setOcciComputeState(ComputeStatus.ACTIVE);
				//inst.setImagename("elasticoccidemo");
				inst.setImagename("flasktemplate");
			}});
		//String vmName = "node"+vmIndex;
		//Instancevmware inst = (Instancevmware)link.getTarget();
		//inst.setTitle(vmName);
		//inst.setOcciComputeState(ComputeStatus.ACTIVE);
		//inst.setImagename("elasticoccidemo");
		inst.occiCreate();
		//vmIndex++;
			
		// get ip
		String ip = "";
		try {
			ip = getIP(link);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
		// register
		registerinLBandMonitoring(ip, vmName); 
		
	}
	
	
	
	
	
	/////////////////////////// configurations //////////////////////////
	protected Link amazonConfiguration(int oldGroupSize) {
		Link link1 =null;
		for (int i=oldGroupSize+1; i <= getHorizontalgroupGroupSize(); i++) {
			Configuration config = (Configuration)this.eContainer();
			Instancegrouplink igl = ModemoFactory.eINSTANCE.createInstancegrouplink();
			Ec2 ec2 = Modemoec2Factory.eINSTANCE.createEc2();
			config.getResources().add(ec2);
			Horizontalgroup hg = this;
			igl.setSource(hg);
			igl.setTarget(ec2);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(" i= " + 1);	
		link1 = igl;
		}
		return link1;
	}
	
	////////////////// azure configuration ////////////////////
	protected Link azureConfiguration(int oldGroupSize) {
		Link link1 =null;
		for (int i=oldGroupSize+1; i <= getHorizontalgroupGroupSize(); i++) {
			Configuration config = (Configuration)this.eContainer();
			Instancegrouplink igl = ModemoFactory.eINSTANCE.createInstancegrouplink();
			Azurevm azure = ModemoazureFactory.eINSTANCE.createAzurevm();
			config.getResources().add(azure);
			Horizontalgroup hg = this;
			igl.setSource(hg);
			igl.setTarget(azure);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(" i= " + 1);	
		link1 = igl;
		}
		return link1;
	}
	
	////////////////////////// vmware provider //////////////////////////////
	protected void creatVM(final int Gsize, ArrayList<String> LlinksIds ) {
		
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);	
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				createInstanceandLinkConfig(Gsize);
			}});
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		MyRunnable myRunnable = new MyRunnable() {
			public void run() {
				try {
					createConfigtemp(Gsize, LlinksIds);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread thread = new Thread(myRunnable);
		thread.start();
	}
	
	private  void createConfigtemp(int oldGroupSize, ArrayList<String> LlinksIds) throws InterruptedException  {
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);
		ArrayList<String> linksIds2 = new ArrayList<String>();
		for (Link link : this.getLinks()) {
			if(link.getTarget() instanceof Instancevmware) {
				//oldGroupSize = oldGroupSize+1;
				linksIds2.add(link.getId());
				
			}
		}
		for (String p : linksIds2)
		    System.out.println("hi : " + p );
		
		int index = oldGroupSize+1;
		String vmname ;
		for (Link link : this.getLinks()) { 
			if(link.getTarget() instanceof Instancevmware) {
				if(!LlinksIds.contains(link.getId())) { // try to deploy in the new created configuratio
					//vmname = "node"+ index;
					vmname = "flask"+ index;
					System.out.println("will be deployed in the confiugration " + link.getId());
					Instancevmware inst = (Instancevmware)link.getTarget();
					System.out.println(" instance name " +  vmname);
					final String vmname1 = vmname;
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						@Override
						protected void doExecute() {
							inst.setTitle(vmname1);
							inst.setOcciComputeState(ComputeStatus.ACTIVE);
							//inst.setImagename("elasticoccidemo"); //templatelast
							inst.setImagename("flasktemplate");
						}});
					System.out.print("instance  " + inst);
					inst.occiCreate();
					index++;
					//service.submit(myRunnable);
					try {
						Thread.sleep(5000); // wait 5 seconds to allows threads to be created
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
			
		}
		//service.shutdown();
		System.out.println("hi, the system will wait until the tasks are finsined");
		System.out.println("finsh, finsih finnnnnnnnnnnnsh");	
		for (Link link : this.getLinks()) { 
			if(link.getTarget() instanceof Instancevmware) {
				if(!LlinksIds.contains(link.getId())) {
					System.out.println("link fonnddddddd " + link.getId());
					Instancevmware inst = (Instancevmware)link.getTarget();
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						@Override
						protected void doExecute() {
							inst.occiRetrieve();
						}});
					Thread.sleep(20000);
									
					while (inst.getAttributes().get(8).getValue().isEmpty()) { 
						String stateMessage = inst.getOcciComputeStateMessage();
						String gueststate = inst.getAttributes().get(4).getValue();
						if (!gueststate.equals("running")) {
							System.out.println("The machine is creating:  " + stateMessage + "   the machine state is:  " + gueststate);
						} else {
							System.out.println("Waiting for the machine to reboot and to get its DHCP ip");
						}
						domain.getCommandStack().execute(new RecordingCommand(domain) {
							@Override
							protected void doExecute() {
								inst.occiRetrieve();
							}});
						Thread.sleep(20000);
					}
					Loadbalancer lb = (Loadbalancer) this.getLinks().get(0).getTarget();  //register the ips in loadBlancer
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						@Override
						protected void doExecute() {
							lb.setLoadbalancerInstanceIP(inst.getAttributes().get(8).getValue());
						}});
					//lb.setLoadbalancerInstanceIP(inst.getAttributes().get(8).getValue());
					lb.addbackendserver();
					//register the vms in the monitoring system
					ZabbixMonitoring2 zabbix_obj = new ZabbixMonitoring2();
					String zabi = zabbix_obj.connect();
			        String hostgroup = "Scalair scaling group";
					zabbix_obj.host_create(zabi, inst.getAttributes().get(1).getValue(), inst.getAttributes().get(8).getValue(), 10050, hostgroup, "Scalair Template OS Linux");
				}
				
			}
			
		}
	}
	
	
	
	///////////////// Azure provider ///////////////////////////////////////////
	
	protected void createAzure(final int Gsize, ArrayList<String> LlinksIds ) {
		
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				azureConfiguration(Gsize);
			}});
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		MyRunnable myRunnable = new MyRunnable() {
			public void run() {
				try {
					createAzureVM(Gsize, LlinksIds);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread thread = new Thread(myRunnable);
		thread.start();
	}
	
	private  void createAzureVM(int oldGroupSize, ArrayList<String> LlinksIds) throws InterruptedException  {
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);
		ArrayList<String> linksIds2 = new ArrayList<String>();
		for (Link link : this.getLinks()) {
			if(link.getTarget() instanceof Azurevm) {
				linksIds2.add(link.getId());
			}
		}
		
		int index = oldGroupSize+1;
		String vmname ;
		for (Link link : this.getLinks()) { 
			if(link.getTarget() instanceof Azurevm) {
				if(!LlinksIds.contains(link.getId())) {
					vmname = "flask"+ index;
					System.out.println("will be deployed in the confiugration " + link.getId());
					Azurevm inst = (Azurevm)link.getTarget();
					System.out.println(" instance name " +  vmname);
					final String vmname1 = vmname;
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						@Override
						protected void doExecute() {
							inst.setTitle(vmname1);
							System.out.print("instance  " + inst);
						}});
					inst.occiCreate();
					System.out.println("Sleep after instance creation");
					index++;
					try {
						Thread.sleep(5000); // wait 5 seconds to allows threads to be created
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}	
		}
		Thread.sleep(10000);			
		for (Link link : this.getLinks()) { 
			if(link.getTarget() instanceof Azurevm) {
				if(!LlinksIds.contains(link.getId())) {
					System.out.println("link fonnddddddd " + link.getId());
					Azurevm inst = (Azurevm)link.getTarget();
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						@Override
						protected void doExecute() {
							inst.occiRetrieve();
						}});
					Thread.sleep(20000);
					while (!inst.getOcciComputeStateMessage().equals("running")) {
						domain.getCommandStack().execute(new RecordingCommand(domain) {
							@Override
							protected void doExecute() {
								inst.occiRetrieve();
							}});
						Thread.sleep(20000);
					}
					Loadbalancer lb = (Loadbalancer) this.getLinks().get(0).getTarget();  //register the ips in loadBlancer
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						@Override
						protected void doExecute() {
							lb.setLoadbalancerInstanceIP(inst.getAzureVmazurePublicIP());
						}});
					lb.addbackendserver();
					
					//register the vms in the monitoring system
					ZabbixMonitoring2 zabbix_obj = new ZabbixMonitoring2();
					String zabi = zabbix_obj.connect();
					
			        String hostgroup = "Scalair scaling group";
			        zabbix_obj.host_create(zabi, inst.getTitle(), inst.getAzureVmazurePublicIP(), 10050, hostgroup, "Scalair Template OS Linux");
				}	
			}	
		}	
	}
	
	
	
	//////////////////// EC2 provider //////////////////////////////////////
	protected void createEC2(final int Gsize, ArrayList<String> LlinksIds ) {
		
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);

		domain.getCommandStack().execute(new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				amazonConfiguration(Gsize);
			}});
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		MyRunnable myRunnable = new MyRunnable() {
			public void run() {
				try {
					createec2Instance(Gsize, LlinksIds);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread thread = new Thread(myRunnable);
		thread.start();
	}
	
	private  void createec2Instance(int oldGroupSize, ArrayList<String> LlinksIds) throws InterruptedException  {
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);
		ArrayList<String> linksIds2 = new ArrayList<String>();
		for (Link link : this.getLinks()) {
			if(link.getTarget() instanceof Instancegrouplink) {
				linksIds2.add(link.getId());
			}
		}
		
		int index = oldGroupSize+1;
		String vmname ;
		for (Link link : this.getLinks()) { 
			if(link.getTarget() instanceof Ec2) {
				if(!LlinksIds.contains(link.getId())) {
					vmname = "flask"+ index;
					System.out.println("will be deployed in the confiugration " + link.getId());
					Ec2 inst = (Ec2)link.getTarget();
					System.out.println(" instance name " +  vmname);
					final String vmname1 = vmname;
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						@Override
						protected void doExecute() {
							inst.setTitle(vmname1);
							inst.setAwsEc2instanceInstanceType("t2.micro");
							inst.setAwsEc2instanceAMI("ami-03cde23d9b4c0bda9");  //ami-0b59bfac6be064b78   
							inst.setAwsEc2instanceKey("modemokeypair");
							inst.setAwsEc2instanceSG("modemosg");							
							System.out.print("instance  " + inst);
							//inst.occiCreate();
						}});
					inst.occiCreate();
					System.out.println("Sleep after instance creation");
					index++;
					try {
						Thread.sleep(5000); // wait 5 seconds to allows threads to be created
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}	
		}
		Thread.sleep(10000);			
		for (Link link : this.getLinks()) { 
			if(link.getTarget() instanceof Ec2) {
				if(!LlinksIds.contains(link.getId())) {
					System.out.println("link founnddddddd " + link.getId());
					Ec2 inst = (Ec2)link.getTarget();
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						@Override
						protected void doExecute() {
							inst.occiRetrieve();
						}});
					Thread.sleep(20000);
					while (!inst.getOcciComputeStateMessage().equals("running")) {
						domain.getCommandStack().execute(new RecordingCommand(domain) {
							@Override
							protected void doExecute() {
								inst.occiRetrieve();
							}});
						Thread.sleep(20000);
					}
					Loadbalancer lb = (Loadbalancer) this.getLinks().get(0).getTarget();  //register the ips in loadBlancer
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						@Override
						protected void doExecute() {
							lb.setLoadbalancerInstanceIP(inst.getAwsEc2instancePublicIP());
						}});
					lb.addbackendserver();
					//register the vms in the monitoring system
					ZabbixMonitoring2 zabbix_obj = new ZabbixMonitoring2();
					String zabi = zabbix_obj.connect();
					
			        String hostgroup = "Scalair scaling group";
			        zabbix_obj.host_create(zabi, inst.getTitle(), inst.getAwsEc2instancePublicIP(), 10050, hostgroup, "Scalair Template OS Linux");
				}	
			}	
		}	
	}
	
	/////////////////// allocation policy round roubin ///////////////////////
	
	protected String getnextProvider() {
		String lastcreatedInstance = lastcreatedInstance();
		ArrayList<String> alist= providerList();
		System.out.println("array size (number of providers)  is " + alist.size());
		String provider = "";
		
		String allocationpolicy = allocationPolicy();
		if(allocationpolicy.equals("roundrobinconnector")) {
			if (lastcreatedInstance.equals(null) || lastcreatedInstance.equals("")) {
				provider =  alist.get(0);
				System.out.println("provider to delpoy on " + provider);
				return provider;
			}
			
			int index = alist.indexOf(lastcreatedInstance);
			System.out.println("index of the provider of last created instance  " + index + " instance  " + alist.get(index));
			
			int nextIndex = index + 1;
			if (nextIndex < alist.size()) {
				provider = alist.get(nextIndex);
			} else {
				provider = alist.get(0);
			}
		}
				
		System.out.println("provider to delpoy on " + provider);

		return provider;
	}
	
	protected String allocationPolicy() {
		EList<MixinBase> mixinsBase = this.getParts();
		String mixinName = "";
		for (MixinBase mixin:mixinsBase) {
			mixinName = mixin.getClass().getName().substring(49).toLowerCase();
			System.out.println("mixin metric   " + mixinName);	
		}
		
		return mixinName;
	}
	
	protected ArrayList<String> providerList() {
		ArrayList<String> alist=new ArrayList<String>();
		for (Link link : this.getLinks()) {
			if (link instanceof Providerlink) {
		         if (link.getTarget() instanceof  Vmwareprovider) {
		        	 System.out.println("provider name " + link.getTarget().getClass().getName().substring(49));
		             //alist.add(link.getTarget().getClass().getName().substring(49));
		        	 alist.add("InstancevmwareConnector");
		         }
		         if (link.getTarget() instanceof Amazonprovider) {
		        	 System.out.println("provider name " + link.getTarget().getClass().getName().substring(49));
		             //alist.add(link.getTarget().getClass().getName().substring(49));
		        	 alist.add("Ec2Connector");
		         }
		         if (link.getTarget() instanceof Azureprovider) {
		        	 System.out.println("provider name " + link.getTarget().getClass().getName().substring(49));
		             //alist.add(link.getTarget().getClass().getName().substring(49));
		        	 alist.add("AzurevmConnector");
		         }
			}
			
		}
		System.out.println(alist);
		return alist;
	}

	protected String lastcreatedInstance()  {
		ArrayList<String> alist=new ArrayList<String>();
		String lastInstance = "";
		
		for (Link link : this.getLinks()) {
			if (link instanceof Instancegrouplink) {
				int index  = link.getTarget().getClass().getName().lastIndexOf(".");
				System.out.println("last created instance " + link.getTarget().getClass().getName().substring(index+1));
				alist.add(link.getTarget().getClass().getName().substring(index+1));
			}
		}
		//System.out.println(alist);
		//System.out.println(alist.get(alist.size() - 1));
		if(!alist.isEmpty()) {
			lastInstance = alist.get(alist.size() - 1);
		}
		
		System.out.println(lastInstance);
		return lastInstance;
	}
	
	//////////////////////////// delete provider instance //////////////////////
	protected void deleteVMInstance(Link link1) {
		Instancevmware instance = (Instancevmware)link1.getTarget();
		// get the ip of the instance
		String ip = instance.getAttributes().get(8).getValue(); 
		// get LB
		Loadbalancer lb = null;
		for (Link link : this.getLinks()) {	
			if(link.getTarget() instanceof Loadbalancer) {
				lb = (Loadbalancer)link.getTarget();
				break;
			}
		}
		//delete the ips from loadBlancer
		lb.setLoadbalancerInstanceIP(ip);
		lb.removebackendserver();
		System.out.println("Instance with " + ip + " is deregistered from the LoadBalancer" );
		
		//delete the vms from the monitoring system
		ZabbixMonitoring2 zabbix_obj = new ZabbixMonitoring2();
		String zabi = zabbix_obj.connect();
		zabbix_obj.host_delete(zabi, ip);
		System.out.println("Instance with " + ip + " is deregistered from the MonitoringSystem" );
		instance.occiDelete();
		System.out.println("instance " + instance.getAttributes().get(1).getValue() + " is deleted from Vcenter");
	
		// Remove from model.
		Configuration config = OcciHelper.getConfiguration(instance);
		
		org.eclipse.cmf.occi.core.Resource src = link1.getSource();
		org.eclipse.cmf.occi.core.Resource target = link1.getTarget();
		
		if (src != null) {
			src.getLinks().remove(link1);
		} else {
			System.out.println("Warning, the link : " + link1.getKind().getName() + " has no source !");
		}
		if (target != null) {
			target.getLinks().remove(link1);
		} else {
			System.out.println("Warning, the link : " + link1.getKind().getName() + " has no target !");
		}
		System.out.println("the link is removed");
		config.getResources().remove(instance);
		System.out.println("the instance configuration is removed");
	}
	
	protected void deleteEC2Instance(Link link1) {
		Ec2 instance = (Ec2)link1.getTarget();
		// get the ip of the instance
		String ip = instance.getAwsEc2instancePublicIP();
		// get LB
		Loadbalancer lb = null;
		for (Link link : this.getLinks()) {	
			if(link.getTarget() instanceof Loadbalancer) {
				lb = (Loadbalancer)link.getTarget();
				break;
			}
		}
		//delete the ips from loadBlancer
		lb.setLoadbalancerInstanceIP(ip);
		lb.removebackendserver();
		System.out.println("Instance with " + ip + " is deregistered from the LoadBalancer" );
		
		//delete the vms from the monitoring system
		ZabbixMonitoring2 zabbix_obj = new ZabbixMonitoring2();
		String zabi = zabbix_obj.connect();
		zabbix_obj.host_delete(zabi, ip);
		System.out.println("Instance with " + ip + " is deregistered from the MonitoringSystem" );
		instance.occiDelete();
		System.out.println("instance " + instance.getTitle() + " is deleted from AWS");
	
		// Remove from model.
		Configuration config = OcciHelper.getConfiguration(instance);
		
		org.eclipse.cmf.occi.core.Resource src = link1.getSource();
		org.eclipse.cmf.occi.core.Resource target = link1.getTarget();
		
		if (src != null) {
			src.getLinks().remove(link1);
		} else {
			System.out.println("Warning, the link : " + link1.getKind().getName() + " has no source !");
		}
		if (target != null) {
			target.getLinks().remove(link1);
		} else {
			System.out.println("Warning, the link : " + link1.getKind().getName() + " has no target !");
		}
		System.out.println("the link is removed");
		config.getResources().remove(instance);
		System.out.println("the instance configuration is removed");
	}
	
	protected void deleteAzureInstance(Link link1) {
		Azurevm instance = (Azurevm)link1.getTarget();
		// get the ip of the instance
		String ip = instance.getAzureVmazurePublicIP();
		// get LB
		Loadbalancer lb = null;
		for (Link link : this.getLinks()) {	
			if(link.getTarget() instanceof Loadbalancer) {
				lb = (Loadbalancer)link.getTarget();
				break;
			}
		}
		//delete the ips from loadBlancer
		lb.setLoadbalancerInstanceIP(ip);
		lb.removebackendserver();
		System.out.println("Instance with " + ip + " is deregistered from the LoadBalancer" );
		
		//delete the vms from the monitoring system
		ZabbixMonitoring2 zabbix_obj = new ZabbixMonitoring2();
		String zabi = zabbix_obj.connect();
		zabbix_obj.host_delete(zabi, ip);
		System.out.println("Instance with " + ip + " is deregistered from the MonitoringSystem" );
		instance.occiDelete();
		System.out.println("instance " + instance.getTitle() + " is deleted from MS Azure");
	
		// Remove from model.
		Configuration config = OcciHelper.getConfiguration(instance);
		
		org.eclipse.cmf.occi.core.Resource src = link1.getSource();
		org.eclipse.cmf.occi.core.Resource target = link1.getTarget();
		
		if (src != null) {
			src.getLinks().remove(link1);
		} else {
			System.out.println("Warning, the link : " + link1.getKind().getName() + " has no source !");
		}
		if (target != null) {
			target.getLinks().remove(link1);
		} else {
			System.out.println("Warning, the link : " + link1.getKind().getName() + " has no target !");
		}
		System.out.println("the link is removed");
		config.getResources().remove(instance);
		System.out.println("the instance configuration is removed");
	}

}	
