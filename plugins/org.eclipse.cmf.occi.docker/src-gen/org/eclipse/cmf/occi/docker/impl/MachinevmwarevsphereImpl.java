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
import org.eclipse.cmf.occi.docker.Machinevmwarevsphere;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machinevmwarevsphere</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevsphereImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevsphereImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevsphereImpl#getBoot2dockerURL <em>Boot2docker URL</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevsphereImpl#getComputeIp <em>Compute Ip</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevsphereImpl#getCpuCount <em>Cpu Count</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevsphereImpl#getDatacenter <em>Datacenter</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevsphereImpl#getDatastore <em>Datastore</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevsphereImpl#getDiskSize <em>Disk Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevsphereImpl#getMemorySize <em>Memory Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevsphereImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevsphereImpl#getPool <em>Pool</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevsphereImpl#getVcenter <em>Vcenter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachinevmwarevsphereImpl extends MachineImpl implements Machinevmwarevsphere {
	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

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
	 * The default value of the '{@link #getComputeIp() <em>Compute Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputeIp()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPUTE_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComputeIp() <em>Compute Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputeIp()
	 * @generated
	 * @ordered
	 */
	protected String computeIp = COMPUTE_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuCount() <em>Cpu Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CPU_COUNT_EDEFAULT = new BigInteger("2");

	/**
	 * The cached value of the '{@link #getCpuCount() <em>Cpu Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger cpuCount = CPU_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatacenter() <em>Datacenter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenter()
	 * @generated
	 * @ordered
	 */
	protected static final String DATACENTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatacenter() <em>Datacenter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenter()
	 * @generated
	 * @ordered
	 */
	protected String datacenter = DATACENTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatastore() <em>Datastore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatastore()
	 * @generated
	 * @ordered
	 */
	protected static final String DATASTORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatastore() <em>Datastore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatastore()
	 * @generated
	 * @ordered
	 */
	protected String datastore = DATASTORE_EDEFAULT;

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
	 * The default value of the '{@link #getMemorySize() <em>Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MEMORY_SIZE_EDEFAULT = new BigInteger("2048");

	/**
	 * The cached value of the '{@link #getMemorySize() <em>Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger memorySize = MEMORY_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetwork() <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected String network = NETWORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPool() <em>Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPool()
	 * @generated
	 * @ordered
	 */
	protected static final String POOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPool() <em>Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPool()
	 * @generated
	 * @ordered
	 */
	protected String pool = POOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVcenter() <em>Vcenter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcenter()
	 * @generated
	 * @ordered
	 */
	protected static final String VCENTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVcenter() <em>Vcenter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcenter()
	 * @generated
	 * @ordered
	 */
	protected String vcenter = VCENTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachinevmwarevsphereImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINEVMWAREVSPHERE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVSPHERE__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVSPHERE__PASSWORD, oldPassword, password));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVSPHERE__BOOT2DOCKER_URL, oldBoot2dockerURL, boot2dockerURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComputeIp() {
		return computeIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputeIp(String newComputeIp) {
		String oldComputeIp = computeIp;
		computeIp = newComputeIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVSPHERE__COMPUTE_IP, oldComputeIp, computeIp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCpuCount() {
		return cpuCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuCount(BigInteger newCpuCount) {
		BigInteger oldCpuCount = cpuCount;
		cpuCount = newCpuCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVSPHERE__CPU_COUNT, oldCpuCount, cpuCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatacenter() {
		return datacenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatacenter(String newDatacenter) {
		String oldDatacenter = datacenter;
		datacenter = newDatacenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVSPHERE__DATACENTER, oldDatacenter, datacenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatastore() {
		return datastore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatastore(String newDatastore) {
		String oldDatastore = datastore;
		datastore = newDatastore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVSPHERE__DATASTORE, oldDatastore, datastore));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVSPHERE__DISK_SIZE, oldDiskSize, diskSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMemorySize() {
		return memorySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemorySize(BigInteger newMemorySize) {
		BigInteger oldMemorySize = memorySize;
		memorySize = newMemorySize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVSPHERE__MEMORY_SIZE, oldMemorySize, memorySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(String newNetwork) {
		String oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVSPHERE__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPool() {
		return pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPool(String newPool) {
		String oldPool = pool;
		pool = newPool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVSPHERE__POOL, oldPool, pool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVcenter() {
		return vcenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcenter(String newVcenter) {
		String oldVcenter = vcenter;
		vcenter = newVcenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVSPHERE__VCENTER, oldVcenter, vcenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINEVMWAREVSPHERE__USERNAME:
				return getUsername();
			case DockerPackage.MACHINEVMWAREVSPHERE__PASSWORD:
				return getPassword();
			case DockerPackage.MACHINEVMWAREVSPHERE__BOOT2DOCKER_URL:
				return getBoot2dockerURL();
			case DockerPackage.MACHINEVMWAREVSPHERE__COMPUTE_IP:
				return getComputeIp();
			case DockerPackage.MACHINEVMWAREVSPHERE__CPU_COUNT:
				return getCpuCount();
			case DockerPackage.MACHINEVMWAREVSPHERE__DATACENTER:
				return getDatacenter();
			case DockerPackage.MACHINEVMWAREVSPHERE__DATASTORE:
				return getDatastore();
			case DockerPackage.MACHINEVMWAREVSPHERE__DISK_SIZE:
				return getDiskSize();
			case DockerPackage.MACHINEVMWAREVSPHERE__MEMORY_SIZE:
				return getMemorySize();
			case DockerPackage.MACHINEVMWAREVSPHERE__NETWORK:
				return getNetwork();
			case DockerPackage.MACHINEVMWAREVSPHERE__POOL:
				return getPool();
			case DockerPackage.MACHINEVMWAREVSPHERE__VCENTER:
				return getVcenter();
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
			case DockerPackage.MACHINEVMWAREVSPHERE__USERNAME:
				setUsername((String)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__PASSWORD:
				setPassword((String)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__BOOT2DOCKER_URL:
				setBoot2dockerURL((String)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__COMPUTE_IP:
				setComputeIp((String)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__CPU_COUNT:
				setCpuCount((BigInteger)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__DATACENTER:
				setDatacenter((String)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__DATASTORE:
				setDatastore((String)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__DISK_SIZE:
				setDiskSize((BigInteger)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__MEMORY_SIZE:
				setMemorySize((BigInteger)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__NETWORK:
				setNetwork((String)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__POOL:
				setPool((String)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__VCENTER:
				setVcenter((String)newValue);
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
			case DockerPackage.MACHINEVMWAREVSPHERE__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__BOOT2DOCKER_URL:
				setBoot2dockerURL(BOOT2DOCKER_URL_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__COMPUTE_IP:
				setComputeIp(COMPUTE_IP_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__CPU_COUNT:
				setCpuCount(CPU_COUNT_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__DATACENTER:
				setDatacenter(DATACENTER_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__DATASTORE:
				setDatastore(DATASTORE_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__DISK_SIZE:
				setDiskSize(DISK_SIZE_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__MEMORY_SIZE:
				setMemorySize(MEMORY_SIZE_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__NETWORK:
				setNetwork(NETWORK_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__POOL:
				setPool(POOL_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVSPHERE__VCENTER:
				setVcenter(VCENTER_EDEFAULT);
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
			case DockerPackage.MACHINEVMWAREVSPHERE__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case DockerPackage.MACHINEVMWAREVSPHERE__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case DockerPackage.MACHINEVMWAREVSPHERE__BOOT2DOCKER_URL:
				return BOOT2DOCKER_URL_EDEFAULT == null ? boot2dockerURL != null : !BOOT2DOCKER_URL_EDEFAULT.equals(boot2dockerURL);
			case DockerPackage.MACHINEVMWAREVSPHERE__COMPUTE_IP:
				return COMPUTE_IP_EDEFAULT == null ? computeIp != null : !COMPUTE_IP_EDEFAULT.equals(computeIp);
			case DockerPackage.MACHINEVMWAREVSPHERE__CPU_COUNT:
				return CPU_COUNT_EDEFAULT == null ? cpuCount != null : !CPU_COUNT_EDEFAULT.equals(cpuCount);
			case DockerPackage.MACHINEVMWAREVSPHERE__DATACENTER:
				return DATACENTER_EDEFAULT == null ? datacenter != null : !DATACENTER_EDEFAULT.equals(datacenter);
			case DockerPackage.MACHINEVMWAREVSPHERE__DATASTORE:
				return DATASTORE_EDEFAULT == null ? datastore != null : !DATASTORE_EDEFAULT.equals(datastore);
			case DockerPackage.MACHINEVMWAREVSPHERE__DISK_SIZE:
				return DISK_SIZE_EDEFAULT == null ? diskSize != null : !DISK_SIZE_EDEFAULT.equals(diskSize);
			case DockerPackage.MACHINEVMWAREVSPHERE__MEMORY_SIZE:
				return MEMORY_SIZE_EDEFAULT == null ? memorySize != null : !MEMORY_SIZE_EDEFAULT.equals(memorySize);
			case DockerPackage.MACHINEVMWAREVSPHERE__NETWORK:
				return NETWORK_EDEFAULT == null ? network != null : !NETWORK_EDEFAULT.equals(network);
			case DockerPackage.MACHINEVMWAREVSPHERE__POOL:
				return POOL_EDEFAULT == null ? pool != null : !POOL_EDEFAULT.equals(pool);
			case DockerPackage.MACHINEVMWAREVSPHERE__VCENTER:
				return VCENTER_EDEFAULT == null ? vcenter != null : !VCENTER_EDEFAULT.equals(vcenter);
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
		result.append(" (username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", boot2dockerURL: ");
		result.append(boot2dockerURL);
		result.append(", computeIp: ");
		result.append(computeIp);
		result.append(", cpuCount: ");
		result.append(cpuCount);
		result.append(", datacenter: ");
		result.append(datacenter);
		result.append(", datastore: ");
		result.append(datastore);
		result.append(", diskSize: ");
		result.append(diskSize);
		result.append(", memorySize: ");
		result.append(memorySize);
		result.append(", network: ");
		result.append(network);
		result.append(", pool: ");
		result.append(pool);
		result.append(", vcenter: ");
		result.append(vcenter);
		result.append(')');
		return result.toString();
	}

} //MachinevmwarevsphereImpl
