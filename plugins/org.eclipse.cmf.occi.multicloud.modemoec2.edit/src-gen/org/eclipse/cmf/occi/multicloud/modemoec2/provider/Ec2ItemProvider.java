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
package org.eclipse.cmf.occi.multicloud.modemoec2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.cmf.occi.infrastructure.provider.ComputeItemProvider;

import org.eclipse.cmf.occi.multicloud.modemoec2.Ec2;
import org.eclipse.cmf.occi.multicloud.modemoec2.Modemoec2Package;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Ec2ItemProvider extends ComputeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ec2ItemProvider(AdapterFactory adapterFactory) {
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

			addAwsEc2instanceKeyPropertyDescriptor(object);
			addAwsEc2instancePublicIPPropertyDescriptor(object);
			addAwsEc2instanceAMIPropertyDescriptor(object);
			addAwsEc2instanceSGPropertyDescriptor(object);
			addAwsEc2instanceInstanceTypePropertyDescriptor(object);
			addAwsEc2instanceInstanceIDPropertyDescriptor(object);
			addAwsEc2instacneDnsNamePropertyDescriptor(object);
			addAwsEc2instancePrivateIPPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Aws Ec2instance Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAwsEc2instanceKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ec2_awsEc2instanceKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ec2_awsEc2instanceKey_feature", "_UI_Ec2_type"),
				 Modemoec2Package.Literals.EC2__AWS_EC2INSTANCE_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aws Ec2instance Public IP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAwsEc2instancePublicIPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ec2_awsEc2instancePublicIP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ec2_awsEc2instancePublicIP_feature", "_UI_Ec2_type"),
				 Modemoec2Package.Literals.EC2__AWS_EC2INSTANCE_PUBLIC_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aws Ec2instance AMI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAwsEc2instanceAMIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ec2_awsEc2instanceAMI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ec2_awsEc2instanceAMI_feature", "_UI_Ec2_type"),
				 Modemoec2Package.Literals.EC2__AWS_EC2INSTANCE_AMI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aws Ec2instance SG feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAwsEc2instanceSGPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ec2_awsEc2instanceSG_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ec2_awsEc2instanceSG_feature", "_UI_Ec2_type"),
				 Modemoec2Package.Literals.EC2__AWS_EC2INSTANCE_SG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aws Ec2instance Instance Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAwsEc2instanceInstanceTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ec2_awsEc2instanceInstanceType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ec2_awsEc2instanceInstanceType_feature", "_UI_Ec2_type"),
				 Modemoec2Package.Literals.EC2__AWS_EC2INSTANCE_INSTANCE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aws Ec2instance Instance ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAwsEc2instanceInstanceIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ec2_awsEc2instanceInstanceID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ec2_awsEc2instanceInstanceID_feature", "_UI_Ec2_type"),
				 Modemoec2Package.Literals.EC2__AWS_EC2INSTANCE_INSTANCE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aws Ec2instacne Dns Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAwsEc2instacneDnsNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ec2_awsEc2instacneDnsName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ec2_awsEc2instacneDnsName_feature", "_UI_Ec2_type"),
				 Modemoec2Package.Literals.EC2__AWS_EC2INSTACNE_DNS_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aws Ec2instance Private IP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAwsEc2instancePrivateIPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ec2_awsEc2instancePrivateIP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ec2_awsEc2instancePrivateIP_feature", "_UI_Ec2_type"),
				 Modemoec2Package.Literals.EC2__AWS_EC2INSTANCE_PRIVATE_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Ec2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Ec2"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Ec2)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Ec2_type") :
			getString("_UI_Ec2_type") + " " + label;
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

		switch (notification.getFeatureID(Ec2.class)) {
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_KEY:
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_PUBLIC_IP:
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_AMI:
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_SG:
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_INSTANCE_TYPE:
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_INSTANCE_ID:
			case Modemoec2Package.EC2__AWS_EC2INSTACNE_DNS_NAME:
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_PRIVATE_IP:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Modemoec2EditPlugin.INSTANCE;
	}

}
