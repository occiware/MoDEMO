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
package org.eclipse.cmf.occi.multicloud.modemoazure.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.cmf.occi.infrastructure.provider.ComputeItemProvider;

import org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm;
import org.eclipse.cmf.occi.multicloud.modemoazure.ModemoazurePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AzurevmItemProvider extends ComputeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzurevmItemProvider(AdapterFactory adapterFactory) {
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

			addAzureVmazureIdPropertyDescriptor(object);
			addAzureVmazureImageIDPropertyDescriptor(object);
			addAzureVmazurePublicIPPropertyDescriptor(object);
			addAzureVmazureSizeTypePropertyDescriptor(object);
			addAzureVmazureResourceGroupPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Azure Vmazure Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAzureVmazureIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Azurevm_azureVmazureId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Azurevm_azureVmazureId_feature", "_UI_Azurevm_type"),
				 ModemoazurePackage.Literals.AZUREVM__AZURE_VMAZURE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Azure Vmazure Image ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAzureVmazureImageIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Azurevm_azureVmazureImageID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Azurevm_azureVmazureImageID_feature", "_UI_Azurevm_type"),
				 ModemoazurePackage.Literals.AZUREVM__AZURE_VMAZURE_IMAGE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Azure Vmazure Public IP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAzureVmazurePublicIPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Azurevm_azureVmazurePublicIP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Azurevm_azureVmazurePublicIP_feature", "_UI_Azurevm_type"),
				 ModemoazurePackage.Literals.AZUREVM__AZURE_VMAZURE_PUBLIC_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Azure Vmazure Size Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAzureVmazureSizeTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Azurevm_azureVmazureSizeType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Azurevm_azureVmazureSizeType_feature", "_UI_Azurevm_type"),
				 ModemoazurePackage.Literals.AZUREVM__AZURE_VMAZURE_SIZE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Azure Vmazure Resource Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAzureVmazureResourceGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Azurevm_azureVmazureResourceGroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Azurevm_azureVmazureResourceGroup_feature", "_UI_Azurevm_type"),
				 ModemoazurePackage.Literals.AZUREVM__AZURE_VMAZURE_RESOURCE_GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Azurevm.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Azurevm"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Azurevm)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Azurevm_type") :
			getString("_UI_Azurevm_type") + " " + label;
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

		switch (notification.getFeatureID(Azurevm.class)) {
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_ID:
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_IMAGE_ID:
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_PUBLIC_IP:
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_SIZE_TYPE:
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_RESOURCE_GROUP:
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
		return ModemoazureEditPlugin.INSTANCE;
	}

}
