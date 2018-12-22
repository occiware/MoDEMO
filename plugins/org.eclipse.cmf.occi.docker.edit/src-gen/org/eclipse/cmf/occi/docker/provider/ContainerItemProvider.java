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
package org.eclipse.cmf.occi.docker.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.docker.Container;
import org.eclipse.cmf.occi.docker.DockerFactory;
import org.eclipse.cmf.occi.docker.DockerPackage;

import org.eclipse.cmf.occi.infrastructure.provider.ComputeItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.docker.Container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerItemProvider extends ComputeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addContaineridPropertyDescriptor(object);
			addImagePropertyDescriptor(object);
			addBuildPropertyDescriptor(object);
			addCommandPropertyDescriptor(object);
			addPortsPropertyDescriptor(object);
			addExposePropertyDescriptor(object);
			addVolumesPropertyDescriptor(object);
			addEnvironmentPropertyDescriptor(object);
			addEnvFilePropertyDescriptor(object);
			addNetPropertyDescriptor(object);
			addDnsPropertyDescriptor(object);
			addDnsSearchPropertyDescriptor(object);
			addCapAddPropertyDescriptor(object);
			addCapDropPropertyDescriptor(object);
			addWorkingDirPropertyDescriptor(object);
			addEntrypointPropertyDescriptor(object);
			addUserPropertyDescriptor(object);
			addDomainNamePropertyDescriptor(object);
			addMemLimitPropertyDescriptor(object);
			addMemorySwapPropertyDescriptor(object);
			addPrivilegedPropertyDescriptor(object);
			addRestartPropertyDescriptor(object);
			addStdinOpenPropertyDescriptor(object);
			addInteractivePropertyDescriptor(object);
			addCpuSharesPropertyDescriptor(object);
			addPidPropertyDescriptor(object);
			addIpcPropertyDescriptor(object);
			addAddHostPropertyDescriptor(object);
			addMacAddressPropertyDescriptor(object);
			addRmPropertyDescriptor(object);
			addSecurityOptPropertyDescriptor(object);
			addDevicePropertyDescriptor(object);
			addLxcConfPropertyDescriptor(object);
			addPublishAllPropertyDescriptor(object);
			addReadOnlyPropertyDescriptor(object);
			addMonitoredPropertyDescriptor(object);
			addCpuUsedPropertyDescriptor(object);
			addMemoryUsedPropertyDescriptor(object);
			addCpuPercentPropertyDescriptor(object);
			addMemoryPercentPropertyDescriptor(object);
			addDiskUsedPropertyDescriptor(object);
			addDiskPercentPropertyDescriptor(object);
			addBandwidthUsedPropertyDescriptor(object);
			addBandwidthPercentPropertyDescriptor(object);
			addMonitoringIntervalPropertyDescriptor(object);
			addCpuMaxValuePropertyDescriptor(object);
			addMemoryMaxValuePropertyDescriptor(object);
			addCoreMaxPropertyDescriptor(object);
			addCpuSetCpusPropertyDescriptor(object);
			addCpuSetMemsPropertyDescriptor(object);
			addTtyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_name_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Containerid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContaineridPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_containerid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_containerid_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__CONTAINERID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Image feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_image_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_image_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__IMAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Build feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBuildPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_build_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_build_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__BUILD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_command_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_command_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__COMMAND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_ports_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_ports_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__PORTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expose feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExposePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_expose_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_expose_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__EXPOSE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Volumes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVolumesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_volumes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_volumes_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__VOLUMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Environment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnvironmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_environment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_environment_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__ENVIRONMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Env File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnvFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_envFile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_envFile_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__ENV_FILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Net feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_net_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_net_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__NET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDnsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_dns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_dns_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__DNS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dns Search feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDnsSearchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_dnsSearch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_dnsSearch_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__DNS_SEARCH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cap Add feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapAddPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_capAdd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_capAdd_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__CAP_ADD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cap Drop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapDropPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_capDrop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_capDrop_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__CAP_DROP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Working Dir feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkingDirPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_workingDir_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_workingDir_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__WORKING_DIR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Entrypoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntrypointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_entrypoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_entrypoint_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__ENTRYPOINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_user_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_user_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__USER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_domainName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_domainName_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__DOMAIN_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mem Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_memLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_memLimit_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__MEM_LIMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Memory Swap feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemorySwapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_memorySwap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_memorySwap_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__MEMORY_SWAP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Privileged feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrivilegedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_privileged_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_privileged_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__PRIVILEGED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Restart feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRestartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_restart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_restart_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__RESTART,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stdin Open feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStdinOpenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_stdinOpen_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_stdinOpen_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__STDIN_OPEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interactive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInteractivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_interactive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_interactive_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__INTERACTIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpu Shares feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpuSharesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_cpuShares_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_cpuShares_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__CPU_SHARES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_pid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_pid_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__PID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ipc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIpcPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_ipc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_ipc_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__IPC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Add Host feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddHostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_addHost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_addHost_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__ADD_HOST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mac Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMacAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_macAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_macAddress_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__MAC_ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_rm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_rm_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__RM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security Opt feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityOptPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_securityOpt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_securityOpt_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__SECURITY_OPT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Device feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDevicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_device_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_device_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__DEVICE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lxc Conf feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLxcConfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_lxcConf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_lxcConf_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__LXC_CONF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Publish All feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublishAllPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_publishAll_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_publishAll_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__PUBLISH_ALL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Read Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_readOnly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_readOnly_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__READ_ONLY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Monitored feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMonitoredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_monitored_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_monitored_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__MONITORED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpu Used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpuUsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_cpuUsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_cpuUsed_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__CPU_USED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Memory Used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemoryUsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_memoryUsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_memoryUsed_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__MEMORY_USED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpu Percent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpuPercentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_cpuPercent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_cpuPercent_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__CPU_PERCENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Memory Percent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemoryPercentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_memoryPercent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_memoryPercent_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__MEMORY_PERCENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disk Used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiskUsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_diskUsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_diskUsed_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__DISK_USED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disk Percent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiskPercentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_diskPercent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_diskPercent_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__DISK_PERCENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bandwidth Used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBandwidthUsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_bandwidthUsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_bandwidthUsed_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__BANDWIDTH_USED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bandwidth Percent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBandwidthPercentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_bandwidthPercent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_bandwidthPercent_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__BANDWIDTH_PERCENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Monitoring Interval feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMonitoringIntervalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_monitoringInterval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_monitoringInterval_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__MONITORING_INTERVAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpu Max Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpuMaxValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_cpuMaxValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_cpuMaxValue_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__CPU_MAX_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Memory Max Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemoryMaxValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_memoryMaxValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_memoryMaxValue_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__MEMORY_MAX_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Core Max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoreMaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_coreMax_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_coreMax_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__CORE_MAX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpu Set Cpus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpuSetCpusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_cpuSetCpus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_cpuSetCpus_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__CPU_SET_CPUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpu Set Mems feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpuSetMemsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_cpuSetMems_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_cpuSetMems_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__CPU_SET_MEMS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tty feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTtyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_tty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_tty_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__TTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Container)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Container_type") :
			getString("_UI_Container_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Container.class)) {
			case DockerPackage.CONTAINER__NAME:
			case DockerPackage.CONTAINER__CONTAINERID:
			case DockerPackage.CONTAINER__IMAGE:
			case DockerPackage.CONTAINER__BUILD:
			case DockerPackage.CONTAINER__COMMAND:
			case DockerPackage.CONTAINER__PORTS:
			case DockerPackage.CONTAINER__EXPOSE:
			case DockerPackage.CONTAINER__VOLUMES:
			case DockerPackage.CONTAINER__ENVIRONMENT:
			case DockerPackage.CONTAINER__ENV_FILE:
			case DockerPackage.CONTAINER__NET:
			case DockerPackage.CONTAINER__DNS:
			case DockerPackage.CONTAINER__DNS_SEARCH:
			case DockerPackage.CONTAINER__CAP_ADD:
			case DockerPackage.CONTAINER__CAP_DROP:
			case DockerPackage.CONTAINER__WORKING_DIR:
			case DockerPackage.CONTAINER__ENTRYPOINT:
			case DockerPackage.CONTAINER__USER:
			case DockerPackage.CONTAINER__DOMAIN_NAME:
			case DockerPackage.CONTAINER__MEM_LIMIT:
			case DockerPackage.CONTAINER__MEMORY_SWAP:
			case DockerPackage.CONTAINER__PRIVILEGED:
			case DockerPackage.CONTAINER__RESTART:
			case DockerPackage.CONTAINER__STDIN_OPEN:
			case DockerPackage.CONTAINER__INTERACTIVE:
			case DockerPackage.CONTAINER__CPU_SHARES:
			case DockerPackage.CONTAINER__PID:
			case DockerPackage.CONTAINER__IPC:
			case DockerPackage.CONTAINER__ADD_HOST:
			case DockerPackage.CONTAINER__MAC_ADDRESS:
			case DockerPackage.CONTAINER__RM:
			case DockerPackage.CONTAINER__SECURITY_OPT:
			case DockerPackage.CONTAINER__DEVICE:
			case DockerPackage.CONTAINER__LXC_CONF:
			case DockerPackage.CONTAINER__PUBLISH_ALL:
			case DockerPackage.CONTAINER__READ_ONLY:
			case DockerPackage.CONTAINER__MONITORED:
			case DockerPackage.CONTAINER__CPU_USED:
			case DockerPackage.CONTAINER__MEMORY_USED:
			case DockerPackage.CONTAINER__CPU_PERCENT:
			case DockerPackage.CONTAINER__MEMORY_PERCENT:
			case DockerPackage.CONTAINER__DISK_USED:
			case DockerPackage.CONTAINER__DISK_PERCENT:
			case DockerPackage.CONTAINER__BANDWIDTH_USED:
			case DockerPackage.CONTAINER__BANDWIDTH_PERCENT:
			case DockerPackage.CONTAINER__MONITORING_INTERVAL:
			case DockerPackage.CONTAINER__CPU_MAX_VALUE:
			case DockerPackage.CONTAINER__MEMORY_MAX_VALUE:
			case DockerPackage.CONTAINER__CORE_MAX:
			case DockerPackage.CONTAINER__CPU_SET_CPUS:
			case DockerPackage.CONTAINER__CPU_SET_MEMS:
			case DockerPackage.CONTAINER__TTY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 DockerFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 DockerFactory.eINSTANCE.createNetworklink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 DockerFactory.eINSTANCE.createVolumesfrom()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 DockerFactory.eINSTANCE.createContains()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DockerEditPlugin.INSTANCE;
	}

}
