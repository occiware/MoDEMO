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
package org.eclipse.cmf.occi.multicloud.vmware.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.cmf.occi.multicloud.vmware.util.VmwareAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VmwareItemProviderAdapterFactory extends VmwareAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmwareItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstancevmwareItemProvider instancevmwareItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInstancevmwareAdapter() {
		if (instancevmwareItemProvider == null) {
			instancevmwareItemProvider = new InstancevmwareItemProvider(this);
		}

		return instancevmwareItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.multicloud.vmware.Storagevmware} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoragevmwareItemProvider storagevmwareItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.multicloud.vmware.Storagevmware}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStoragevmwareAdapter() {
		if (storagevmwareItemProvider == null) {
			storagevmwareItemProvider = new StoragevmwareItemProvider(this);
		}

		return storagevmwareItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.multicloud.vmware.Storagelinkvmware} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoragelinkvmwareItemProvider storagelinkvmwareItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.multicloud.vmware.Storagelinkvmware}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStoragelinkvmwareAdapter() {
		if (storagelinkvmwareItemProvider == null) {
			storagelinkvmwareItemProvider = new StoragelinkvmwareItemProvider(this);
		}

		return storagelinkvmwareItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.multicloud.vmware.Vswitch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VswitchItemProvider vswitchItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.multicloud.vmware.Vswitch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVswitchAdapter() {
		if (vswitchItemProvider == null) {
			vswitchItemProvider = new VswitchItemProvider(this);
		}

		return vswitchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.multicloud.vmware.Networkadapter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkadapterItemProvider networkadapterItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.multicloud.vmware.Networkadapter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNetworkadapterAdapter() {
		if (networkadapterItemProvider == null) {
			networkadapterItemProvider = new NetworkadapterItemProvider(this);
		}

		return networkadapterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.multicloud.vmware.Vcenteraccount} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VcenteraccountItemProvider vcenteraccountItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.multicloud.vmware.Vcenteraccount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVcenteraccountAdapter() {
		if (vcenteraccountItemProvider == null) {
			vcenteraccountItemProvider = new VcenteraccountItemProvider(this);
		}

		return vcenteraccountItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.multicloud.vmware.Windows} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WindowsItemProvider windowsItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.multicloud.vmware.Windows}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWindowsAdapter() {
		if (windowsItemProvider == null) {
			windowsItemProvider = new WindowsItemProvider(this);
		}

		return windowsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.multicloud.vmware.Linux} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinuxItemProvider linuxItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.multicloud.vmware.Linux}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinuxAdapter() {
		if (linuxItemProvider == null) {
			linuxItemProvider = new LinuxItemProvider(this);
		}

		return linuxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.multicloud.vmware.Macosx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MacosxItemProvider macosxItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.multicloud.vmware.Macosx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMacosxAdapter() {
		if (macosxItemProvider == null) {
			macosxItemProvider = new MacosxItemProvider(this);
		}

		return macosxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VmwarefoldersItemProvider vmwarefoldersItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVmwarefoldersAdapter() {
		if (vmwarefoldersItemProvider == null) {
			vmwarefoldersItemProvider = new VmwarefoldersItemProvider(this);
		}

		return vmwarefoldersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.multicloud.vmware.Os_tpl_vmware} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Os_tpl_vmwareItemProvider os_tpl_vmwareItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.multicloud.vmware.Os_tpl_vmware}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOs_tpl_vmwareAdapter() {
		if (os_tpl_vmwareItemProvider == null) {
			os_tpl_vmwareItemProvider = new Os_tpl_vmwareItemProvider(this);
		}

		return os_tpl_vmwareItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.multicloud.vmware.Ssh_user_data} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ssh_user_dataItemProvider ssh_user_dataItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.multicloud.vmware.Ssh_user_data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSsh_user_dataAdapter() {
		if (ssh_user_dataItemProvider == null) {
			ssh_user_dataItemProvider = new Ssh_user_dataItemProvider(this);
		}

		return ssh_user_dataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.multicloud.vmware.Vcentercredential} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VcentercredentialItemProvider vcentercredentialItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.multicloud.vmware.Vcentercredential}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVcentercredentialAdapter() {
		if (vcentercredentialItemProvider == null) {
			vcentercredentialItemProvider = new VcentercredentialItemProvider(this);
		}

		return vcentercredentialItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (instancevmwareItemProvider != null) instancevmwareItemProvider.dispose();
		if (storagevmwareItemProvider != null) storagevmwareItemProvider.dispose();
		if (storagelinkvmwareItemProvider != null) storagelinkvmwareItemProvider.dispose();
		if (vswitchItemProvider != null) vswitchItemProvider.dispose();
		if (networkadapterItemProvider != null) networkadapterItemProvider.dispose();
		if (vcenteraccountItemProvider != null) vcenteraccountItemProvider.dispose();
		if (windowsItemProvider != null) windowsItemProvider.dispose();
		if (linuxItemProvider != null) linuxItemProvider.dispose();
		if (macosxItemProvider != null) macosxItemProvider.dispose();
		if (vmwarefoldersItemProvider != null) vmwarefoldersItemProvider.dispose();
		if (os_tpl_vmwareItemProvider != null) os_tpl_vmwareItemProvider.dispose();
		if (ssh_user_dataItemProvider != null) ssh_user_dataItemProvider.dispose();
		if (vcentercredentialItemProvider != null) vcentercredentialItemProvider.dispose();
	}

}
