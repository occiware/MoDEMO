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
import org.eclipse.cmf.occi.docker.Machinevirtualbox;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.docker.Machinevirtualbox} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MachinevirtualboxItemProvider extends MachineItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MachinevirtualboxItemProvider(AdapterFactory adapterFactory) {
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

			addBoot2dockerURLPropertyDescriptor(object);
			addDiskSizePropertyDescriptor(object);
			addHostDNSResolverPropertyDescriptor(object);
			addImportBoot2DockerVMPropertyDescriptor(object);
			addHostOnlyCIDRPropertyDescriptor(object);
			addHostOnlyNICTypePropertyDescriptor(object);
			addHostOnlyNICPromiscPropertyDescriptor(object);
			addNoSharePropertyDescriptor(object);
			addNoDNSProxyPropertyDescriptor(object);
			addNoVTXCheckPropertyDescriptor(object);
			addShareFolderPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Machinevirtualbox_boot2dockerURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevirtualbox_boot2dockerURL_feature", "_UI_Machinevirtualbox_type"),
				 DockerPackage.Literals.MACHINEVIRTUALBOX__BOOT2DOCKER_URL,
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
				 getString("_UI_Machinevirtualbox_diskSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevirtualbox_diskSize_feature", "_UI_Machinevirtualbox_type"),
				 DockerPackage.Literals.MACHINEVIRTUALBOX__DISK_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host DNS Resolver feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostDNSResolverPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevirtualbox_hostDNSResolver_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevirtualbox_hostDNSResolver_feature", "_UI_Machinevirtualbox_type"),
				 DockerPackage.Literals.MACHINEVIRTUALBOX__HOST_DNS_RESOLVER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Import Boot2 Docker VM feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportBoot2DockerVMPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevirtualbox_importBoot2DockerVM_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevirtualbox_importBoot2DockerVM_feature", "_UI_Machinevirtualbox_type"),
				 DockerPackage.Literals.MACHINEVIRTUALBOX__IMPORT_BOOT2_DOCKER_VM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Only CIDR feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostOnlyCIDRPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevirtualbox_hostOnlyCIDR_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevirtualbox_hostOnlyCIDR_feature", "_UI_Machinevirtualbox_type"),
				 DockerPackage.Literals.MACHINEVIRTUALBOX__HOST_ONLY_CIDR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Only NIC Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostOnlyNICTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevirtualbox_hostOnlyNICType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevirtualbox_hostOnlyNICType_feature", "_UI_Machinevirtualbox_type"),
				 DockerPackage.Literals.MACHINEVIRTUALBOX__HOST_ONLY_NIC_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Only NIC Promisc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostOnlyNICPromiscPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevirtualbox_hostOnlyNICPromisc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevirtualbox_hostOnlyNICPromisc_feature", "_UI_Machinevirtualbox_type"),
				 DockerPackage.Literals.MACHINEVIRTUALBOX__HOST_ONLY_NIC_PROMISC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the No Share feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoSharePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevirtualbox_noShare_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevirtualbox_noShare_feature", "_UI_Machinevirtualbox_type"),
				 DockerPackage.Literals.MACHINEVIRTUALBOX__NO_SHARE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the No DNS Proxy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoDNSProxyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevirtualbox_noDNSProxy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevirtualbox_noDNSProxy_feature", "_UI_Machinevirtualbox_type"),
				 DockerPackage.Literals.MACHINEVIRTUALBOX__NO_DNS_PROXY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the No VTX Check feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoVTXCheckPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevirtualbox_noVTXCheck_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevirtualbox_noVTXCheck_feature", "_UI_Machinevirtualbox_type"),
				 DockerPackage.Literals.MACHINEVIRTUALBOX__NO_VTX_CHECK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Share Folder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShareFolderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machinevirtualbox_shareFolder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machinevirtualbox_shareFolder_feature", "_UI_Machinevirtualbox_type"),
				 DockerPackage.Literals.MACHINEVIRTUALBOX__SHARE_FOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Machinevirtualbox.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Machinevirtualbox"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Machinevirtualbox)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Machinevirtualbox_type") :
			getString("_UI_Machinevirtualbox_type") + " " + label;
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

		switch (notification.getFeatureID(Machinevirtualbox.class)) {
			case DockerPackage.MACHINEVIRTUALBOX__BOOT2DOCKER_URL:
			case DockerPackage.MACHINEVIRTUALBOX__DISK_SIZE:
			case DockerPackage.MACHINEVIRTUALBOX__HOST_DNS_RESOLVER:
			case DockerPackage.MACHINEVIRTUALBOX__IMPORT_BOOT2_DOCKER_VM:
			case DockerPackage.MACHINEVIRTUALBOX__HOST_ONLY_CIDR:
			case DockerPackage.MACHINEVIRTUALBOX__HOST_ONLY_NIC_TYPE:
			case DockerPackage.MACHINEVIRTUALBOX__HOST_ONLY_NIC_PROMISC:
			case DockerPackage.MACHINEVIRTUALBOX__NO_SHARE:
			case DockerPackage.MACHINEVIRTUALBOX__NO_DNS_PROXY:
			case DockerPackage.MACHINEVIRTUALBOX__NO_VTX_CHECK:
			case DockerPackage.MACHINEVIRTUALBOX__SHARE_FOLDER:
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
