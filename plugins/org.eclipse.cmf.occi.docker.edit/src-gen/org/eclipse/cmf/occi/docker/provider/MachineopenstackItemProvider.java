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
import org.eclipse.cmf.occi.docker.Machineopenstack;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.docker.Machineopenstack} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MachineopenstackItemProvider extends MachineItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MachineopenstackItemProvider(AdapterFactory adapterFactory) {
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

			addFlavorIdPropertyDescriptor(object);
			addFlavorNamePropertyDescriptor(object);
			addImageIdPropertyDescriptor(object);
			addImageNamePropertyDescriptor(object);
			addAuthUrlPropertyDescriptor(object);
			addUsernamePropertyDescriptor(object);
			addPasswordPropertyDescriptor(object);
			addTenantNamePropertyDescriptor(object);
			addTenantIdPropertyDescriptor(object);
			addRegionPropertyDescriptor(object);
			addEndpointTypePropertyDescriptor(object);
			addNetIdPropertyDescriptor(object);
			addNetNamePropertyDescriptor(object);
			addSecGroupsPropertyDescriptor(object);
			addFloatingIpPoolPropertyDescriptor(object);
			addActiveTimeOutPropertyDescriptor(object);
			addAvailabilityZonePropertyDescriptor(object);
			addDomainIdPropertyDescriptor(object);
			addDomainNamePropertyDescriptor(object);
			addInsecurePropertyDescriptor(object);
			addIpVersionPropertyDescriptor(object);
			addKeypairNamePropertyDescriptor(object);
			addPrivateKeyFilePropertyDescriptor(object);
			addSshPortPropertyDescriptor(object);
			addSshUserPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Flavor Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlavorIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineopenstack_flavorId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_flavorId_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__FLAVOR_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flavor Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlavorNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineopenstack_flavorName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_flavorName_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__FLAVOR_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Image Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineopenstack_imageId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_imageId_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__IMAGE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Image Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineopenstack_imageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_imageName_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__IMAGE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auth Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineopenstack_authUrl_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_authUrl_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__AUTH_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_Machineopenstack_username_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_username_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__USERNAME,
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
				 getString("_UI_Machineopenstack_password_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_password_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tenant Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTenantNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineopenstack_tenantName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_tenantName_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__TENANT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tenant Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTenantIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineopenstack_tenantId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_tenantId_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__TENANT_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_Machineopenstack_region_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_region_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__REGION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Endpoint Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndpointTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineopenstack_endpointType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_endpointType_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__ENDPOINT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Net Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineopenstack_netId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_netId_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__NET_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Net Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineopenstack_netName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_netName_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__NET_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sec Groups feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecGroupsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineopenstack_secGroups_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_secGroups_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__SEC_GROUPS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Floating Ip Pool feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFloatingIpPoolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineopenstack_floatingIpPool_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_floatingIpPool_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__FLOATING_IP_POOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Active Time Out feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActiveTimeOutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineopenstack_activeTimeOut_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_activeTimeOut_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__ACTIVE_TIME_OUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Availability Zone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailabilityZonePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineopenstack_availabilityZone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_availabilityZone_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__AVAILABILITY_ZONE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineopenstack_domainId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_domainId_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__DOMAIN_ID,
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
				 getString("_UI_Machineopenstack_domainName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_domainName_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__DOMAIN_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Insecure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInsecurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineopenstack_insecure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_insecure_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__INSECURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ip Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIpVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineopenstack_ipVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_ipVersion_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__IP_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Keypair Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeypairNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineopenstack_keypairName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_keypairName_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__KEYPAIR_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Private Key File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrivateKeyFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineopenstack_privateKeyFile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_privateKeyFile_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__PRIVATE_KEY_FILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ssh Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSshPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineopenstack_sshPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_sshPort_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__SSH_PORT,
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
				 getString("_UI_Machineopenstack_sshUser_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineopenstack_sshUser_feature", "_UI_Machineopenstack_type"),
				 DockerPackage.Literals.MACHINEOPENSTACK__SSH_USER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Machineopenstack.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Machineopenstack"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Machineopenstack)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Machineopenstack_type") :
			getString("_UI_Machineopenstack_type") + " " + label;
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

		switch (notification.getFeatureID(Machineopenstack.class)) {
			case DockerPackage.MACHINEOPENSTACK__FLAVOR_ID:
			case DockerPackage.MACHINEOPENSTACK__FLAVOR_NAME:
			case DockerPackage.MACHINEOPENSTACK__IMAGE_ID:
			case DockerPackage.MACHINEOPENSTACK__IMAGE_NAME:
			case DockerPackage.MACHINEOPENSTACK__AUTH_URL:
			case DockerPackage.MACHINEOPENSTACK__USERNAME:
			case DockerPackage.MACHINEOPENSTACK__PASSWORD:
			case DockerPackage.MACHINEOPENSTACK__TENANT_NAME:
			case DockerPackage.MACHINEOPENSTACK__TENANT_ID:
			case DockerPackage.MACHINEOPENSTACK__REGION:
			case DockerPackage.MACHINEOPENSTACK__ENDPOINT_TYPE:
			case DockerPackage.MACHINEOPENSTACK__NET_ID:
			case DockerPackage.MACHINEOPENSTACK__NET_NAME:
			case DockerPackage.MACHINEOPENSTACK__SEC_GROUPS:
			case DockerPackage.MACHINEOPENSTACK__FLOATING_IP_POOL:
			case DockerPackage.MACHINEOPENSTACK__ACTIVE_TIME_OUT:
			case DockerPackage.MACHINEOPENSTACK__AVAILABILITY_ZONE:
			case DockerPackage.MACHINEOPENSTACK__DOMAIN_ID:
			case DockerPackage.MACHINEOPENSTACK__DOMAIN_NAME:
			case DockerPackage.MACHINEOPENSTACK__INSECURE:
			case DockerPackage.MACHINEOPENSTACK__IP_VERSION:
			case DockerPackage.MACHINEOPENSTACK__KEYPAIR_NAME:
			case DockerPackage.MACHINEOPENSTACK__PRIVATE_KEY_FILE:
			case DockerPackage.MACHINEOPENSTACK__SSH_PORT:
			case DockerPackage.MACHINEOPENSTACK__SSH_USER:
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
