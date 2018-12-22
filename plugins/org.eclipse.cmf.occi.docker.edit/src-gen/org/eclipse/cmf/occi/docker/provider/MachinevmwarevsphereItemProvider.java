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

import org.eclipse.cmf.occi.docker.DockerPackage;
import org.eclipse.cmf.occi.docker.Machinevmwarevsphere;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.docker.Machinevmwarevsphere} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MachinevmwarevsphereItemProvider extends MachineItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MachinevmwarevsphereItemProvider(AdapterFactory adapterFactory) {
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

			addUsernamePropertyDescriptor(object);
			addPasswordPropertyDescriptor(object);
			addBoot2dockerURLPropertyDescriptor(object);
			addComputeIpPropertyDescriptor(object);
			addCpuCountPropertyDescriptor(object);
			addDatacenterPropertyDescriptor(object);
			addDatastorePropertyDescriptor(object);
			addDiskSizePropertyDescriptor(object);
			addMemorySizePropertyDescriptor(object);
			addNetworkPropertyDescriptor(object);
			addPoolPropertyDescriptor(object);
			addVcenterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Username feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsernamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevmwarevsphere_username_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevsphere_username_feature", "_UI_Machinevmwarevsphere_type"),
				 DockerPackage.Literals.MACHINEVMWAREVSPHERE__USERNAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Password feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevmwarevsphere_password_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevsphere_password_feature", "_UI_Machinevmwarevsphere_type"),
				 DockerPackage.Literals.MACHINEVMWAREVSPHERE__PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Boot2docker URL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoot2dockerURLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevmwarevsphere_boot2dockerURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevsphere_boot2dockerURL_feature", "_UI_Machinevmwarevsphere_type"),
				 DockerPackage.Literals.MACHINEVMWAREVSPHERE__BOOT2DOCKER_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compute Ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComputeIpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevmwarevsphere_computeIp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevsphere_computeIp_feature", "_UI_Machinevmwarevsphere_type"),
				 DockerPackage.Literals.MACHINEVMWAREVSPHERE__COMPUTE_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpu Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpuCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevmwarevsphere_cpuCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevsphere_cpuCount_feature", "_UI_Machinevmwarevsphere_type"),
				 DockerPackage.Literals.MACHINEVMWAREVSPHERE__CPU_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Datacenter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatacenterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevmwarevsphere_datacenter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevsphere_datacenter_feature", "_UI_Machinevmwarevsphere_type"),
				 DockerPackage.Literals.MACHINEVMWAREVSPHERE__DATACENTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Datastore feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatastorePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevmwarevsphere_datastore_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevsphere_datastore_feature", "_UI_Machinevmwarevsphere_type"),
				 DockerPackage.Literals.MACHINEVMWAREVSPHERE__DATASTORE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disk Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiskSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevmwarevsphere_diskSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevsphere_diskSize_feature", "_UI_Machinevmwarevsphere_type"),
				 DockerPackage.Literals.MACHINEVMWAREVSPHERE__DISK_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Memory Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemorySizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevmwarevsphere_memorySize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevsphere_memorySize_feature", "_UI_Machinevmwarevsphere_type"),
				 DockerPackage.Literals.MACHINEVMWAREVSPHERE__MEMORY_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Network feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetworkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevmwarevsphere_network_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevsphere_network_feature", "_UI_Machinevmwarevsphere_type"),
				 DockerPackage.Literals.MACHINEVMWAREVSPHERE__NETWORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pool feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPoolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevmwarevsphere_pool_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevsphere_pool_feature", "_UI_Machinevmwarevsphere_type"),
				 DockerPackage.Literals.MACHINEVMWAREVSPHERE__POOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vcenter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVcenterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevmwarevsphere_vcenter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevsphere_vcenter_feature", "_UI_Machinevmwarevsphere_type"),
				 DockerPackage.Literals.MACHINEVMWAREVSPHERE__VCENTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Machinevmwarevsphere.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Machinevmwarevsphere"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Machinevmwarevsphere)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Machinevmwarevsphere_type") :
			getString("_UI_Machinevmwarevsphere_type") + " " + label;
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

		switch (notification.getFeatureID(Machinevmwarevsphere.class)) {
			case DockerPackage.MACHINEVMWAREVSPHERE__USERNAME:
			case DockerPackage.MACHINEVMWAREVSPHERE__PASSWORD:
			case DockerPackage.MACHINEVMWAREVSPHERE__BOOT2DOCKER_URL:
			case DockerPackage.MACHINEVMWAREVSPHERE__COMPUTE_IP:
			case DockerPackage.MACHINEVMWAREVSPHERE__CPU_COUNT:
			case DockerPackage.MACHINEVMWAREVSPHERE__DATACENTER:
			case DockerPackage.MACHINEVMWAREVSPHERE__DATASTORE:
			case DockerPackage.MACHINEVMWAREVSPHERE__DISK_SIZE:
			case DockerPackage.MACHINEVMWAREVSPHERE__MEMORY_SIZE:
			case DockerPackage.MACHINEVMWAREVSPHERE__NETWORK:
			case DockerPackage.MACHINEVMWAREVSPHERE__POOL:
			case DockerPackage.MACHINEVMWAREVSPHERE__VCENTER:
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
	}

}
