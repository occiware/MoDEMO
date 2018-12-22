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
import org.eclipse.cmf.occi.docker.Machinemicrosoftazure;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MachinemicrosoftazureItemProvider extends MachineItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MachinemicrosoftazureItemProvider(AdapterFactory adapterFactory) {
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

			addSubscriptionIdPropertyDescriptor(object);
			addSubscriptionCertPropertyDescriptor(object);
			addEnvironmentPropertyDescriptor(object);
			addMachineLocationPropertyDescriptor(object);
			addResourceGroupPropertyDescriptor(object);
			addSizePropertyDescriptor(object);
			addSshUserPropertyDescriptor(object);
			addVnetPropertyDescriptor(object);
			addSubnetPropertyDescriptor(object);
			addSubnetPrefixPropertyDescriptor(object);
			addAvailabilitySetPropertyDescriptor(object);
			addOpenPortPropertyDescriptor(object);
			addPrivateIpAddressPropertyDescriptor(object);
			addNoPublicIpPropertyDescriptor(object);
			addStaticPublicIpPropertyDescriptor(object);
			addDockerPortPropertyDescriptor(object);
			addUsePrivateIpPropertyDescriptor(object);
			addImagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Subscription Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubscriptionIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinemicrosoftazure_subscriptionId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinemicrosoftazure_subscriptionId_feature", "_UI_Machinemicrosoftazure_type"),
				 DockerPackage.Literals.MACHINEMICROSOFTAZURE__SUBSCRIPTION_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subscription Cert feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubscriptionCertPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinemicrosoftazure_subscriptionCert_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinemicrosoftazure_subscriptionCert_feature", "_UI_Machinemicrosoftazure_type"),
				 DockerPackage.Literals.MACHINEMICROSOFTAZURE__SUBSCRIPTION_CERT,
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
				 getString("_UI_Machinemicrosoftazure_environment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinemicrosoftazure_environment_feature", "_UI_Machinemicrosoftazure_type"),
				 DockerPackage.Literals.MACHINEMICROSOFTAZURE__ENVIRONMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Machine Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMachineLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinemicrosoftazure_machineLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinemicrosoftazure_machineLocation_feature", "_UI_Machinemicrosoftazure_type"),
				 DockerPackage.Literals.MACHINEMICROSOFTAZURE__MACHINE_LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinemicrosoftazure_resourceGroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinemicrosoftazure_resourceGroup_feature", "_UI_Machinemicrosoftazure_type"),
				 DockerPackage.Literals.MACHINEMICROSOFTAZURE__RESOURCE_GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinemicrosoftazure_size_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinemicrosoftazure_size_feature", "_UI_Machinemicrosoftazure_type"),
				 DockerPackage.Literals.MACHINEMICROSOFTAZURE__SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ssh User feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSshUserPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinemicrosoftazure_sshUser_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinemicrosoftazure_sshUser_feature", "_UI_Machinemicrosoftazure_type"),
				 DockerPackage.Literals.MACHINEMICROSOFTAZURE__SSH_USER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vnet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVnetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinemicrosoftazure_vnet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinemicrosoftazure_vnet_feature", "_UI_Machinemicrosoftazure_type"),
				 DockerPackage.Literals.MACHINEMICROSOFTAZURE__VNET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subnet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubnetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinemicrosoftazure_subnet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinemicrosoftazure_subnet_feature", "_UI_Machinemicrosoftazure_type"),
				 DockerPackage.Literals.MACHINEMICROSOFTAZURE__SUBNET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subnet Prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubnetPrefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinemicrosoftazure_subnetPrefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinemicrosoftazure_subnetPrefix_feature", "_UI_Machinemicrosoftazure_type"),
				 DockerPackage.Literals.MACHINEMICROSOFTAZURE__SUBNET_PREFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Availability Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailabilitySetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinemicrosoftazure_availabilitySet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinemicrosoftazure_availabilitySet_feature", "_UI_Machinemicrosoftazure_type"),
				 DockerPackage.Literals.MACHINEMICROSOFTAZURE__AVAILABILITY_SET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Open Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpenPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinemicrosoftazure_openPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinemicrosoftazure_openPort_feature", "_UI_Machinemicrosoftazure_type"),
				 DockerPackage.Literals.MACHINEMICROSOFTAZURE__OPEN_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Private Ip Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrivateIpAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinemicrosoftazure_privateIpAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinemicrosoftazure_privateIpAddress_feature", "_UI_Machinemicrosoftazure_type"),
				 DockerPackage.Literals.MACHINEMICROSOFTAZURE__PRIVATE_IP_ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the No Public Ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoPublicIpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinemicrosoftazure_noPublicIp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinemicrosoftazure_noPublicIp_feature", "_UI_Machinemicrosoftazure_type"),
				 DockerPackage.Literals.MACHINEMICROSOFTAZURE__NO_PUBLIC_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Static Public Ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStaticPublicIpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinemicrosoftazure_staticPublicIp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinemicrosoftazure_staticPublicIp_feature", "_UI_Machinemicrosoftazure_type"),
				 DockerPackage.Literals.MACHINEMICROSOFTAZURE__STATIC_PUBLIC_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Docker Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDockerPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinemicrosoftazure_dockerPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinemicrosoftazure_dockerPort_feature", "_UI_Machinemicrosoftazure_type"),
				 DockerPackage.Literals.MACHINEMICROSOFTAZURE__DOCKER_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Private Ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsePrivateIpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinemicrosoftazure_usePrivateIp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinemicrosoftazure_usePrivateIp_feature", "_UI_Machinemicrosoftazure_type"),
				 DockerPackage.Literals.MACHINEMICROSOFTAZURE__USE_PRIVATE_IP,
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
				 getString("_UI_Machinemicrosoftazure_image_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinemicrosoftazure_image_feature", "_UI_Machinemicrosoftazure_type"),
				 DockerPackage.Literals.MACHINEMICROSOFTAZURE__IMAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Machinemicrosoftazure.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Machinemicrosoftazure"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Machinemicrosoftazure)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Machinemicrosoftazure_type") :
			getString("_UI_Machinemicrosoftazure_type") + " " + label;
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

		switch (notification.getFeatureID(Machinemicrosoftazure.class)) {
			case DockerPackage.MACHINEMICROSOFTAZURE__SUBSCRIPTION_ID:
			case DockerPackage.MACHINEMICROSOFTAZURE__SUBSCRIPTION_CERT:
			case DockerPackage.MACHINEMICROSOFTAZURE__ENVIRONMENT:
			case DockerPackage.MACHINEMICROSOFTAZURE__MACHINE_LOCATION:
			case DockerPackage.MACHINEMICROSOFTAZURE__RESOURCE_GROUP:
			case DockerPackage.MACHINEMICROSOFTAZURE__SIZE:
			case DockerPackage.MACHINEMICROSOFTAZURE__SSH_USER:
			case DockerPackage.MACHINEMICROSOFTAZURE__VNET:
			case DockerPackage.MACHINEMICROSOFTAZURE__SUBNET:
			case DockerPackage.MACHINEMICROSOFTAZURE__SUBNET_PREFIX:
			case DockerPackage.MACHINEMICROSOFTAZURE__AVAILABILITY_SET:
			case DockerPackage.MACHINEMICROSOFTAZURE__OPEN_PORT:
			case DockerPackage.MACHINEMICROSOFTAZURE__PRIVATE_IP_ADDRESS:
			case DockerPackage.MACHINEMICROSOFTAZURE__NO_PUBLIC_IP:
			case DockerPackage.MACHINEMICROSOFTAZURE__STATIC_PUBLIC_IP:
			case DockerPackage.MACHINEMICROSOFTAZURE__DOCKER_PORT:
			case DockerPackage.MACHINEMICROSOFTAZURE__USE_PRIVATE_IP:
			case DockerPackage.MACHINEMICROSOFTAZURE__IMAGE:
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
