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
package org.eclipse.cmf.occi.docker.impl;

import java.math.BigInteger;
import org.eclipse.cmf.occi.docker.DockerPackage;
import org.eclipse.cmf.occi.docker.Machinemicrosofthyperv;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machinemicrosofthyperv</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosofthypervImpl#getVirtualSwitch <em>Virtual Switch</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosofthypervImpl#getBoot2dockerURL <em>Boot2docker URL</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosofthypervImpl#getDiskSize <em>Disk Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosofthypervImpl#getStaticMacAddress <em>Static Mac Address</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosofthypervImpl#getVlanId <em>Vlan Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachinemicrosofthypervImpl extends MachineImpl implements Machinemicrosofthyperv {
	/**
	 * The default value of the '{@link #getVirtualSwitch() <em>Virtual Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualSwitch()
	 * @generated
	 * @ordered
	 */
	protected static final String VIRTUAL_SWITCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirtualSwitch() <em>Virtual Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualSwitch()
	 * @generated
	 * @ordered
	 */
	protected String virtualSwitch = VIRTUAL_SWITCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoot2dockerURL() <em>Boot2docker URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoot2dockerURL()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOT2DOCKER_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoot2dockerURL() <em>Boot2docker URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoot2dockerURL()
	 * @generated
	 * @ordered
	 */
	protected String boot2dockerURL = BOOT2DOCKER_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiskSize() <em>Disk Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DISK_SIZE_EDEFAULT = new BigInteger("20000");

	/**
	 * The cached value of the '{@link #getDiskSize() <em>Disk Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskSize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger diskSize = DISK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStaticMacAddress() <em>Static Mac Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticMacAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String STATIC_MAC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStaticMacAddress() <em>Static Mac Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticMacAddress()
	 * @generated
	 * @ordered
	 */
	protected String staticMacAddress = STATIC_MAC_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVlanId() <em>Vlan Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVlanId()
	 * @generated
	 * @ordered
	 */
	protected static final String VLAN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVlanId() <em>Vlan Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVlanId()
	 * @generated
	 * @ordered
	 */
	protected String vlanId = VLAN_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachinemicrosofthypervImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINEMICROSOFTHYPERV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVirtualSwitch() {
		return virtualSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualSwitch(String newVirtualSwitch) {
		String oldVirtualSwitch = virtualSwitch;
		virtualSwitch = newVirtualSwitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTHYPERV__VIRTUAL_SWITCH, oldVirtualSwitch, virtualSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoot2dockerURL() {
		return boot2dockerURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoot2dockerURL(String newBoot2dockerURL) {
		String oldBoot2dockerURL = boot2dockerURL;
		boot2dockerURL = newBoot2dockerURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTHYPERV__BOOT2DOCKER_URL, oldBoot2dockerURL, boot2dockerURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDiskSize() {
		return diskSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiskSize(BigInteger newDiskSize) {
		BigInteger oldDiskSize = diskSize;
		diskSize = newDiskSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTHYPERV__DISK_SIZE, oldDiskSize, diskSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStaticMacAddress() {
		return staticMacAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticMacAddress(String newStaticMacAddress) {
		String oldStaticMacAddress = staticMacAddress;
		staticMacAddress = newStaticMacAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTHYPERV__STATIC_MAC_ADDRESS, oldStaticMacAddress, staticMacAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVlanId() {
		return vlanId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVlanId(String newVlanId) {
		String oldVlanId = vlanId;
		vlanId = newVlanId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTHYPERV__VLAN_ID, oldVlanId, vlanId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINEMICROSOFTHYPERV__VIRTUAL_SWITCH:
				return getVirtualSwitch();
			case DockerPackage.MACHINEMICROSOFTHYPERV__BOOT2DOCKER_URL:
				return getBoot2dockerURL();
			case DockerPackage.MACHINEMICROSOFTHYPERV__DISK_SIZE:
				return getDiskSize();
			case DockerPackage.MACHINEMICROSOFTHYPERV__STATIC_MAC_ADDRESS:
				return getStaticMacAddress();
			case DockerPackage.MACHINEMICROSOFTHYPERV__VLAN_ID:
				return getVlanId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DockerPackage.MACHINEMICROSOFTHYPERV__VIRTUAL_SWITCH:
				setVirtualSwitch((String)newValue);
				return;
			case DockerPackage.MACHINEMICROSOFTHYPERV__BOOT2DOCKER_URL:
				setBoot2dockerURL((String)newValue);
				return;
			case DockerPackage.MACHINEMICROSOFTHYPERV__DISK_SIZE:
				setDiskSize((BigInteger)newValue);
				return;
			case DockerPackage.MACHINEMICROSOFTHYPERV__STATIC_MAC_ADDRESS:
				setStaticMacAddress((String)newValue);
				return;
			case DockerPackage.MACHINEMICROSOFTHYPERV__VLAN_ID:
				setVlanId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DockerPackage.MACHINEMICROSOFTHYPERV__VIRTUAL_SWITCH:
				setVirtualSwitch(VIRTUAL_SWITCH_EDEFAULT);
				return;
			case DockerPackage.MACHINEMICROSOFTHYPERV__BOOT2DOCKER_URL:
				setBoot2dockerURL(BOOT2DOCKER_URL_EDEFAULT);
				return;
			case DockerPackage.MACHINEMICROSOFTHYPERV__DISK_SIZE:
				setDiskSize(DISK_SIZE_EDEFAULT);
				return;
			case DockerPackage.MACHINEMICROSOFTHYPERV__STATIC_MAC_ADDRESS:
				setStaticMacAddress(STATIC_MAC_ADDRESS_EDEFAULT);
				return;
			case DockerPackage.MACHINEMICROSOFTHYPERV__VLAN_ID:
				setVlanId(VLAN_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DockerPackage.MACHINEMICROSOFTHYPERV__VIRTUAL_SWITCH:
				return VIRTUAL_SWITCH_EDEFAULT == null ? virtualSwitch != null : !VIRTUAL_SWITCH_EDEFAULT.equals(virtualSwitch);
			case DockerPackage.MACHINEMICROSOFTHYPERV__BOOT2DOCKER_URL:
				return BOOT2DOCKER_URL_EDEFAULT == null ? boot2dockerURL != null : !BOOT2DOCKER_URL_EDEFAULT.equals(boot2dockerURL);
			case DockerPackage.MACHINEMICROSOFTHYPERV__DISK_SIZE:
				return DISK_SIZE_EDEFAULT == null ? diskSize != null : !DISK_SIZE_EDEFAULT.equals(diskSize);
			case DockerPackage.MACHINEMICROSOFTHYPERV__STATIC_MAC_ADDRESS:
				return STATIC_MAC_ADDRESS_EDEFAULT == null ? staticMacAddress != null : !STATIC_MAC_ADDRESS_EDEFAULT.equals(staticMacAddress);
			case DockerPackage.MACHINEMICROSOFTHYPERV__VLAN_ID:
				return VLAN_ID_EDEFAULT == null ? vlanId != null : !VLAN_ID_EDEFAULT.equals(vlanId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (virtualSwitch: ");
		result.append(virtualSwitch);
		result.append(", boot2dockerURL: ");
		result.append(boot2dockerURL);
		result.append(", diskSize: ");
		result.append(diskSize);
		result.append(", staticMacAddress: ");
		result.append(staticMacAddress);
		result.append(", vlanId: ");
		result.append(vlanId);
		result.append(')');
		return result.toString();
	}

} //MachinemicrosofthypervImpl
