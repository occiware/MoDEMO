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
import org.eclipse.cmf.occi.docker.Machineamazonec2;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.docker.Machineamazonec2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Machineamazonec2ItemProvider extends MachineItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machineamazonec2ItemProvider(AdapterFactory adapterFactory) {
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

			addAccessKeyPropertyDescriptor(object);
			addAmiPropertyDescriptor(object);
			addInstanceTypePropertyDescriptor(object);
			addRegionPropertyDescriptor(object);
			addRootSizePropertyDescriptor(object);
			addSecretKeyPropertyDescriptor(object);
			addSecurityGroupPropertyDescriptor(object);
			addSessionTokenPropertyDescriptor(object);
			addSubnetIdPropertyDescriptor(object);
			addVpcIdPropertyDescriptor(object);
			addZonePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Access Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineamazonec2_accessKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineamazonec2_accessKey_feature", "_UI_Machineamazonec2_type"),
				 DockerPackage.Literals.MACHINEAMAZONEC2__ACCESS_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ami feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAmiPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineamazonec2_ami_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineamazonec2_ami_feature", "_UI_Machineamazonec2_type"),
				 DockerPackage.Literals.MACHINEAMAZONEC2__AMI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineamazonec2_instanceType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineamazonec2_instanceType_feature", "_UI_Machineamazonec2_type"),
				 DockerPackage.Literals.MACHINEAMAZONEC2__INSTANCE_TYPE,
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
				 getString("_UI_Machineamazonec2_region_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineamazonec2_region_feature", "_UI_Machineamazonec2_type"),
				 DockerPackage.Literals.MACHINEAMAZONEC2__REGION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Root Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineamazonec2_rootSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineamazonec2_rootSize_feature", "_UI_Machineamazonec2_type"),
				 DockerPackage.Literals.MACHINEAMAZONEC2__ROOT_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Secret Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecretKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineamazonec2_secretKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineamazonec2_secretKey_feature", "_UI_Machineamazonec2_type"),
				 DockerPackage.Literals.MACHINEAMAZONEC2__SECRET_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineamazonec2_securityGroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineamazonec2_securityGroup_feature", "_UI_Machineamazonec2_type"),
				 DockerPackage.Literals.MACHINEAMAZONEC2__SECURITY_GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Session Token feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSessionTokenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineamazonec2_sessionToken_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineamazonec2_sessionToken_feature", "_UI_Machineamazonec2_type"),
				 DockerPackage.Literals.MACHINEAMAZONEC2__SESSION_TOKEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subnet Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubnetIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineamazonec2_subnetId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineamazonec2_subnetId_feature", "_UI_Machineamazonec2_type"),
				 DockerPackage.Literals.MACHINEAMAZONEC2__SUBNET_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vpc Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpcIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineamazonec2_vpcId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineamazonec2_vpcId_feature", "_UI_Machineamazonec2_type"),
				 DockerPackage.Literals.MACHINEAMAZONEC2__VPC_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZonePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machineamazonec2_zone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machineamazonec2_zone_feature", "_UI_Machineamazonec2_type"),
				 DockerPackage.Literals.MACHINEAMAZONEC2__ZONE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Machineamazonec2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Machineamazonec2"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Machineamazonec2)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Machineamazonec2_type") :
			getString("_UI_Machineamazonec2_type") + " " + label;
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

		switch (notification.getFeatureID(Machineamazonec2.class)) {
			case DockerPackage.MACHINEAMAZONEC2__ACCESS_KEY:
			case DockerPackage.MACHINEAMAZONEC2__AMI:
			case DockerPackage.MACHINEAMAZONEC2__INSTANCE_TYPE:
			case DockerPackage.MACHINEAMAZONEC2__REGION:
			case DockerPackage.MACHINEAMAZONEC2__ROOT_SIZE:
			case DockerPackage.MACHINEAMAZONEC2__SECRET_KEY:
			case DockerPackage.MACHINEAMAZONEC2__SECURITY_GROUP:
			case DockerPackage.MACHINEAMAZONEC2__SESSION_TOKEN:
			case DockerPackage.MACHINEAMAZONEC2__SUBNET_ID:
			case DockerPackage.MACHINEAMAZONEC2__VPC_ID:
			case DockerPackage.MACHINEAMAZONEC2__ZONE:
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
