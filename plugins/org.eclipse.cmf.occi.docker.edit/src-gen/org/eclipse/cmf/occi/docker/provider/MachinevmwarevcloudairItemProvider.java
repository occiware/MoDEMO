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
import org.eclipse.cmf.occi.docker.Machinevmwarevcloudair;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MachinevmwarevcloudairItemProvider extends MachineItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MachinevmwarevcloudairItemProvider(AdapterFactory adapterFactory) {
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
			addCatalogPropertyDescriptor(object);
			addCatalogItemPropertyDescriptor(object);
			addComputeIdPropertyDescriptor(object);
			addCpuCountPropertyDescriptor(object);
			addDockerPortPropertyDescriptor(object);
			addEdgegatewayPropertyDescriptor(object);
			addMemorySizePropertyDescriptor(object);
			addVappNamePropertyDescriptor(object);
			addOrgvdcnetworkPropertyDescriptor(object);
			addProvisionPropertyDescriptor(object);
			addPublicIpPropertyDescriptor(object);
			addSshPortPropertyDescriptor(object);
			addVdcIdPropertyDescriptor(object);
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
				 getString("_UI_Machinevmwarevcloudair_username_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevcloudair_username_feature", "_UI_Machinevmwarevcloudair_type"),
				 DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__USERNAME,
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
				 getString("_UI_Machinevmwarevcloudair_password_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevcloudair_password_feature", "_UI_Machinevmwarevcloudair_type"),
				 DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Catalog feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCatalogPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevmwarevcloudair_catalog_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevcloudair_catalog_feature", "_UI_Machinevmwarevcloudair_type"),
				 DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__CATALOG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Catalog Item feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCatalogItemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevmwarevcloudair_catalogItem_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevcloudair_catalogItem_feature", "_UI_Machinevmwarevcloudair_type"),
				 DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__CATALOG_ITEM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compute Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComputeIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevmwarevcloudair_computeId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevcloudair_computeId_feature", "_UI_Machinevmwarevcloudair_type"),
				 DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__COMPUTE_ID,
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
				 getString("_UI_Machinevmwarevcloudair_cpuCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevcloudair_cpuCount_feature", "_UI_Machinevmwarevcloudair_type"),
				 DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__CPU_COUNT,
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
				 getString("_UI_Machinevmwarevcloudair_dockerPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevcloudair_dockerPort_feature", "_UI_Machinevmwarevcloudair_type"),
				 DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__DOCKER_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Edgegateway feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEdgegatewayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevmwarevcloudair_edgegateway_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevcloudair_edgegateway_feature", "_UI_Machinevmwarevcloudair_type"),
				 DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__EDGEGATEWAY,
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
				 getString("_UI_Machinevmwarevcloudair_memorySize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevcloudair_memorySize_feature", "_UI_Machinevmwarevcloudair_type"),
				 DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__MEMORY_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vapp Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVappNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevmwarevcloudair_vappName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevcloudair_vappName_feature", "_UI_Machinevmwarevcloudair_type"),
				 DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__VAPP_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Orgvdcnetwork feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrgvdcnetworkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevmwarevcloudair_orgvdcnetwork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevcloudair_orgvdcnetwork_feature", "_UI_Machinevmwarevcloudair_type"),
				 DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__ORGVDCNETWORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Provision feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvisionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevmwarevcloudair_provision_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevcloudair_provision_feature", "_UI_Machinevmwarevcloudair_type"),
				 DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__PROVISION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Public Ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublicIpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevmwarevcloudair_publicIp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevcloudair_publicIp_feature", "_UI_Machinevmwarevcloudair_type"),
				 DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__PUBLIC_IP,
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
				 getString("_UI_Machinevmwarevcloudair_sshPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevcloudair_sshPort_feature", "_UI_Machinevmwarevcloudair_type"),
				 DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__SSH_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vdc Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVdcIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevmwarevcloudair_vdcId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevmwarevcloudair_vdcId_feature", "_UI_Machinevmwarevcloudair_type"),
				 DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR__VDC_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Machinevmwarevcloudair.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Machinevmwarevcloudair"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Machinevmwarevcloudair)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Machinevmwarevcloudair_type") :
			getString("_UI_Machinevmwarevcloudair_type") + " " + label;
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

		switch (notification.getFeatureID(Machinevmwarevcloudair.class)) {
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__USERNAME:
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__PASSWORD:
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__CATALOG:
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__CATALOG_ITEM:
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__COMPUTE_ID:
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__CPU_COUNT:
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__DOCKER_PORT:
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__EDGEGATEWAY:
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__MEMORY_SIZE:
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__VAPP_NAME:
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__ORGVDCNETWORK:
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__PROVISION:
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__PUBLIC_IP:
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__SSH_PORT:
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__VDC_ID:
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
