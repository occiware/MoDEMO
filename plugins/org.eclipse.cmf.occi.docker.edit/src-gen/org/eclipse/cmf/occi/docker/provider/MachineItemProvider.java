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

import org.eclipse.cmf.occi.docker.DockerFactory;
import org.eclipse.cmf.occi.docker.DockerPackage;
import org.eclipse.cmf.occi.docker.Machine;

import org.eclipse.cmf.occi.infrastructure.provider.ComputeItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.docker.Machine} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MachineItemProvider extends ComputeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MachineItemProvider(AdapterFactory adapterFactory) {
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
			addEngineInstallURLPropertyDescriptor(object);
			addEngineOptPropertyDescriptor(object);
			addEngineInsecureRegistryPropertyDescriptor(object);
			addEngineRegistryMirrorPropertyDescriptor(object);
			addEngineLabelPropertyDescriptor(object);
			addEngineStorageDriverPropertyDescriptor(object);
			addEngineEnvPropertyDescriptor(object);
			addSwarmPropertyDescriptor(object);
			addSwarmImagePropertyDescriptor(object);
			addSwarmMasterPropertyDescriptor(object);
			addSwarmDiscoveryPropertyDescriptor(object);
			addSwarmStrategyPropertyDescriptor(object);
			addSwarmOptPropertyDescriptor(object);
			addSwarmHostPropertyDescriptor(object);
			addSwarmAddrPropertyDescriptor(object);
			addSwarmExperimentalPropertyDescriptor(object);
			addTlsSanPropertyDescriptor(object);
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
				 getString("_UI_Machine_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_name_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Engine Install URL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEngineInstallURLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_engineInstallURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_engineInstallURL_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__ENGINE_INSTALL_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Engine Opt feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEngineOptPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_engineOpt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_engineOpt_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__ENGINE_OPT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Engine Insecure Registry feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEngineInsecureRegistryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_engineInsecureRegistry_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_engineInsecureRegistry_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__ENGINE_INSECURE_REGISTRY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Engine Registry Mirror feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEngineRegistryMirrorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_engineRegistryMirror_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_engineRegistryMirror_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__ENGINE_REGISTRY_MIRROR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Engine Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEngineLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_engineLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_engineLabel_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__ENGINE_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Engine Storage Driver feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEngineStorageDriverPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_engineStorageDriver_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_engineStorageDriver_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__ENGINE_STORAGE_DRIVER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Engine Env feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEngineEnvPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_engineEnv_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_engineEnv_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__ENGINE_ENV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Swarm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwarmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_swarm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_swarm_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__SWARM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Swarm Image feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwarmImagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_swarmImage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_swarmImage_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__SWARM_IMAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Swarm Master feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwarmMasterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_swarmMaster_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_swarmMaster_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__SWARM_MASTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Swarm Discovery feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwarmDiscoveryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_swarmDiscovery_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_swarmDiscovery_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__SWARM_DISCOVERY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Swarm Strategy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwarmStrategyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_swarmStrategy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_swarmStrategy_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__SWARM_STRATEGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Swarm Opt feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwarmOptPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_swarmOpt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_swarmOpt_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__SWARM_OPT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Swarm Host feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwarmHostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_swarmHost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_swarmHost_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__SWARM_HOST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Swarm Addr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwarmAddrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_swarmAddr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_swarmAddr_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__SWARM_ADDR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Swarm Experimental feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwarmExperimentalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_swarmExperimental_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_swarmExperimental_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__SWARM_EXPERIMENTAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tls San feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTlsSanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_tlsSan_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_tlsSan_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__TLS_SAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Machine.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Machine"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Machine)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Machine_type") :
			getString("_UI_Machine_type") + " " + label;
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

		switch (notification.getFeatureID(Machine.class)) {
			case DockerPackage.MACHINE__NAME:
			case DockerPackage.MACHINE__ENGINE_INSTALL_URL:
			case DockerPackage.MACHINE__ENGINE_OPT:
			case DockerPackage.MACHINE__ENGINE_INSECURE_REGISTRY:
			case DockerPackage.MACHINE__ENGINE_REGISTRY_MIRROR:
			case DockerPackage.MACHINE__ENGINE_LABEL:
			case DockerPackage.MACHINE__ENGINE_STORAGE_DRIVER:
			case DockerPackage.MACHINE__ENGINE_ENV:
			case DockerPackage.MACHINE__SWARM:
			case DockerPackage.MACHINE__SWARM_IMAGE:
			case DockerPackage.MACHINE__SWARM_MASTER:
			case DockerPackage.MACHINE__SWARM_DISCOVERY:
			case DockerPackage.MACHINE__SWARM_STRATEGY:
			case DockerPackage.MACHINE__SWARM_OPT:
			case DockerPackage.MACHINE__SWARM_HOST:
			case DockerPackage.MACHINE__SWARM_ADDR:
			case DockerPackage.MACHINE__SWARM_EXPERIMENTAL:
			case DockerPackage.MACHINE__TLS_SAN:
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
