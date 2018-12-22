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
import org.eclipse.cmf.occi.docker.Machineibmsoftlayer;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MachineibmsoftlayerItemProvider extends MachineItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MachineibmsoftlayerItemProvider(AdapterFactory adapterFactory) {
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

			addApiEndpointPropertyDescriptor(object);
			addUserPropertyDescriptor(object);
			addApiKeyPropertyDescriptor(object);
			addCpuPropertyDescriptor(object);
			addDiskSizePropertyDescriptor(object);
			addDomainPropertyDescriptor(object);
			addHourlyBillingPropertyDescriptor(object);
			addImagePropertyDescriptor(object);
			addLocalDiskPropertyDescriptor(object);
			addPrivateNetOnlyPropertyDescriptor(object);
			addRegionPropertyDescriptor(object);
			addPublicVlanIdPropertyDescriptor(object);
			addPrivateVlanIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Api Endpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApiEndpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineibmsoftlayer_apiEndpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineibmsoftlayer_apiEndpoint_feature", "_UI_Machineibmsoftlayer_type"),
				 DockerPackage.Literals.MACHINEIBMSOFTLAYER__API_ENDPOINT,
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
				 getString("_UI_Machineibmsoftlayer_user_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineibmsoftlayer_user_feature", "_UI_Machineibmsoftlayer_type"),
				 DockerPackage.Literals.MACHINEIBMSOFTLAYER__USER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Api Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApiKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineibmsoftlayer_apiKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineibmsoftlayer_apiKey_feature", "_UI_Machineibmsoftlayer_type"),
				 DockerPackage.Literals.MACHINEIBMSOFTLAYER__API_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpu feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpuPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineibmsoftlayer_cpu_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineibmsoftlayer_cpu_feature", "_UI_Machineibmsoftlayer_type"),
				 DockerPackage.Literals.MACHINEIBMSOFTLAYER__CPU,
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
				 getString("_UI_Machineibmsoftlayer_diskSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineibmsoftlayer_diskSize_feature", "_UI_Machineibmsoftlayer_type"),
				 DockerPackage.Literals.MACHINEIBMSOFTLAYER__DISK_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineibmsoftlayer_domain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineibmsoftlayer_domain_feature", "_UI_Machineibmsoftlayer_type"),
				 DockerPackage.Literals.MACHINEIBMSOFTLAYER__DOMAIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hourly Billing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHourlyBillingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineibmsoftlayer_hourlyBilling_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineibmsoftlayer_hourlyBilling_feature", "_UI_Machineibmsoftlayer_type"),
				 DockerPackage.Literals.MACHINEIBMSOFTLAYER__HOURLY_BILLING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_Machineibmsoftlayer_image_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineibmsoftlayer_image_feature", "_UI_Machineibmsoftlayer_type"),
				 DockerPackage.Literals.MACHINEIBMSOFTLAYER__IMAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Disk feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalDiskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineibmsoftlayer_localDisk_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineibmsoftlayer_localDisk_feature", "_UI_Machineibmsoftlayer_type"),
				 DockerPackage.Literals.MACHINEIBMSOFTLAYER__LOCAL_DISK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Private Net Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrivateNetOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineibmsoftlayer_privateNetOnly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineibmsoftlayer_privateNetOnly_feature", "_UI_Machineibmsoftlayer_type"),
				 DockerPackage.Literals.MACHINEIBMSOFTLAYER__PRIVATE_NET_ONLY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Region feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineibmsoftlayer_region_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineibmsoftlayer_region_feature", "_UI_Machineibmsoftlayer_type"),
				 DockerPackage.Literals.MACHINEIBMSOFTLAYER__REGION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Public Vlan Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublicVlanIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineibmsoftlayer_publicVlanId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineibmsoftlayer_publicVlanId_feature", "_UI_Machineibmsoftlayer_type"),
				 DockerPackage.Literals.MACHINEIBMSOFTLAYER__PUBLIC_VLAN_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Private Vlan Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrivateVlanIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineibmsoftlayer_privateVlanId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineibmsoftlayer_privateVlanId_feature", "_UI_Machineibmsoftlayer_type"),
				 DockerPackage.Literals.MACHINEIBMSOFTLAYER__PRIVATE_VLAN_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Machineibmsoftlayer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Machineibmsoftlayer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Machineibmsoftlayer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Machineibmsoftlayer_type") :
			getString("_UI_Machineibmsoftlayer_type") + " " + label;
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

		switch (notification.getFeatureID(Machineibmsoftlayer.class)) {
			case DockerPackage.MACHINEIBMSOFTLAYER__API_ENDPOINT:
			case DockerPackage.MACHINEIBMSOFTLAYER__USER:
			case DockerPackage.MACHINEIBMSOFTLAYER__API_KEY:
			case DockerPackage.MACHINEIBMSOFTLAYER__CPU:
			case DockerPackage.MACHINEIBMSOFTLAYER__DISK_SIZE:
			case DockerPackage.MACHINEIBMSOFTLAYER__DOMAIN:
			case DockerPackage.MACHINEIBMSOFTLAYER__HOURLY_BILLING:
			case DockerPackage.MACHINEIBMSOFTLAYER__IMAGE:
			case DockerPackage.MACHINEIBMSOFTLAYER__LOCAL_DISK:
			case DockerPackage.MACHINEIBMSOFTLAYER__PRIVATE_NET_ONLY:
			case DockerPackage.MACHINEIBMSOFTLAYER__REGION:
			case DockerPackage.MACHINEIBMSOFTLAYER__PUBLIC_VLAN_ID:
			case DockerPackage.MACHINEIBMSOFTLAYER__PRIVATE_VLAN_ID:
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
