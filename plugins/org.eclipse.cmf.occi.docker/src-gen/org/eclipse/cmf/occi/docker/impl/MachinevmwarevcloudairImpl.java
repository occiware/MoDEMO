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
import org.eclipse.cmf.occi.docker.Machinevmwarevcloudair;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machinevmwarevcloudair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevcloudairImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevcloudairImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevcloudairImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevcloudairImpl#getCatalogItem <em>Catalog Item</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevcloudairImpl#getComputeId <em>Compute Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevcloudairImpl#getCpuCount <em>Cpu Count</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevcloudairImpl#getDockerPort <em>Docker Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevcloudairImpl#getEdgegateway <em>Edgegateway</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevcloudairImpl#getMemorySize <em>Memory Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevcloudairImpl#getVappName <em>Vapp Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevcloudairImpl#getOrgvdcnetwork <em>Orgvdcnetwork</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevcloudairImpl#isProvision <em>Provision</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevcloudairImpl#getPublicIp <em>Public Ip</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevcloudairImpl#getSshPort <em>Ssh Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevcloudairImpl#getVdcId <em>Vdc Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachinevmwarevcloudairImpl extends MachineImpl implements Machinevmwarevcloudair {
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
	 * The default value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected static final String CATALOG_EDEFAULT = "Public Catalog";

	/**
	 * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected String catalog = CATALOG_EDEFAULT;

	/**
	 * The default value of the '{@link #getCatalogItem() <em>Catalog Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogItem()
	 * @generated
	 * @ordered
	 */
	protected static final String CATALOG_ITEM_EDEFAULT = "Ubuntu Server 12.04 LTS (amd64 20140927)";

	/**
	 * The cached value of the '{@link #getCatalogItem() <em>Catalog Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogItem()
	 * @generated
	 * @ordered
	 */
	protected String catalogItem = CATALOG_ITEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getComputeId() <em>Compute Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputeId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPUTE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComputeId() <em>Compute Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputeId()
	 * @generated
	 * @ordered
	 */
	protected String computeId = COMPUTE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuCount() <em>Cpu Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CPU_COUNT_EDEFAULT = new BigInteger("1");

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
	 * The default value of the '{@link #getDockerPort() <em>Docker Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerPort()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DOCKER_PORT_EDEFAULT = new BigInteger("2376");

	/**
	 * The cached value of the '{@link #getDockerPort() <em>Docker Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerPort()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dockerPort = DOCKER_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdgegateway() <em>Edgegateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgegateway()
	 * @generated
	 * @ordered
	 */
	protected static final String EDGEGATEWAY_EDEFAULT = "&lt;vdcid>";

	/**
	 * The cached value of the '{@link #getEdgegateway() <em>Edgegateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgegateway()
	 * @generated
	 * @ordered
	 */
	protected String edgegateway = EDGEGATEWAY_EDEFAULT;

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
	 * The default value of the '{@link #getVappName() <em>Vapp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVappName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAPP_NAME_EDEFAULT = "&lt;autogenerated>";

	/**
	 * The cached value of the '{@link #getVappName() <em>Vapp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVappName()
	 * @generated
	 * @ordered
	 */
	protected String vappName = VAPP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrgvdcnetwork() <em>Orgvdcnetwork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrgvdcnetwork()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGVDCNETWORK_EDEFAULT = "&lt;vdcid>-default-routed";

	/**
	 * The cached value of the '{@link #getOrgvdcnetwork() <em>Orgvdcnetwork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrgvdcnetwork()
	 * @generated
	 * @ordered
	 */
	protected String orgvdcnetwork = ORGVDCNETWORK_EDEFAULT;

	/**
	 * The default value of the '{@link #isProvision() <em>Provision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvision()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROVISION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isProvision() <em>Provision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvision()
	 * @generated
	 * @ordered
	 */
	protected boolean provision = PROVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicIp() <em>Public Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicIp()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicIp() <em>Public Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicIp()
	 * @generated
	 * @ordered
	 */
	protected String publicIp = PUBLIC_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSshPort() <em>Ssh Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshPort()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SSH_PORT_EDEFAULT = new BigInteger("22");

	/**
	 * The cached value of the '{@link #getSshPort() <em>Ssh Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshPort()
	 * @generated
	 * @ordered
	 */
	protected BigInteger sshPort = SSH_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVdcId() <em>Vdc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVdcId()
	 * @generated
	 * @ordered
	 */
	protected static final String VDC_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVdcId() <em>Vdc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVdcId()
	 * @generated
	 * @ordered
	 */
	protected String vdcId = VDC_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachinevmwarevcloudairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINEVMWAREVCLOUDAIR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVCLOUDAIR__USERNAME, oldUsername, username));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVCLOUDAIR__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatalog() {
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalog(String newCatalog) {
		String oldCatalog = catalog;
		catalog = newCatalog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVCLOUDAIR__CATALOG, oldCatalog, catalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatalogItem() {
		return catalogItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalogItem(String newCatalogItem) {
		String oldCatalogItem = catalogItem;
		catalogItem = newCatalogItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVCLOUDAIR__CATALOG_ITEM, oldCatalogItem, catalogItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComputeId() {
		return computeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputeId(String newComputeId) {
		String oldComputeId = computeId;
		computeId = newComputeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVCLOUDAIR__COMPUTE_ID, oldComputeId, computeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVCLOUDAIR__CPU_COUNT, oldCpuCount, cpuCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDockerPort() {
		return dockerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDockerPort(BigInteger newDockerPort) {
		BigInteger oldDockerPort = dockerPort;
		dockerPort = newDockerPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVCLOUDAIR__DOCKER_PORT, oldDockerPort, dockerPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEdgegateway() {
		return edgegateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgegateway(String newEdgegateway) {
		String oldEdgegateway = edgegateway;
		edgegateway = newEdgegateway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVCLOUDAIR__EDGEGATEWAY, oldEdgegateway, edgegateway));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVCLOUDAIR__MEMORY_SIZE, oldMemorySize, memorySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVappName() {
		return vappName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVappName(String newVappName) {
		String oldVappName = vappName;
		vappName = newVappName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVCLOUDAIR__VAPP_NAME, oldVappName, vappName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrgvdcnetwork() {
		return orgvdcnetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrgvdcnetwork(String newOrgvdcnetwork) {
		String oldOrgvdcnetwork = orgvdcnetwork;
		orgvdcnetwork = newOrgvdcnetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVCLOUDAIR__ORGVDCNETWORK, oldOrgvdcnetwork, orgvdcnetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProvision() {
		return provision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvision(boolean newProvision) {
		boolean oldProvision = provision;
		provision = newProvision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVCLOUDAIR__PROVISION, oldProvision, provision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicIp() {
		return publicIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicIp(String newPublicIp) {
		String oldPublicIp = publicIp;
		publicIp = newPublicIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVCLOUDAIR__PUBLIC_IP, oldPublicIp, publicIp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSshPort() {
		return sshPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSshPort(BigInteger newSshPort) {
		BigInteger oldSshPort = sshPort;
		sshPort = newSshPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVCLOUDAIR__SSH_PORT, oldSshPort, sshPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVdcId() {
		return vdcId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVdcId(String newVdcId) {
		String oldVdcId = vdcId;
		vdcId = newVdcId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREVCLOUDAIR__VDC_ID, oldVdcId, vdcId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__USERNAME:
				return getUsername();
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__PASSWORD:
				return getPassword();
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__CATALOG:
				return getCatalog();
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__CATALOG_ITEM:
				return getCatalogItem();
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__COMPUTE_ID:
				return getComputeId();
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__CPU_COUNT:
				return getCpuCount();
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__DOCKER_PORT:
				return getDockerPort();
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__EDGEGATEWAY:
				return getEdgegateway();
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__MEMORY_SIZE:
				return getMemorySize();
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__VAPP_NAME:
				return getVappName();
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__ORGVDCNETWORK:
				return getOrgvdcnetwork();
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__PROVISION:
				return isProvision();
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__PUBLIC_IP:
				return getPublicIp();
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__SSH_PORT:
				return getSshPort();
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__VDC_ID:
				return getVdcId();
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
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__USERNAME:
				setUsername((String)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__PASSWORD:
				setPassword((String)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__CATALOG:
				setCatalog((String)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__CATALOG_ITEM:
				setCatalogItem((String)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__COMPUTE_ID:
				setComputeId((String)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__CPU_COUNT:
				setCpuCount((BigInteger)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__DOCKER_PORT:
				setDockerPort((BigInteger)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__EDGEGATEWAY:
				setEdgegateway((String)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__MEMORY_SIZE:
				setMemorySize((BigInteger)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__VAPP_NAME:
				setVappName((String)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__ORGVDCNETWORK:
				setOrgvdcnetwork((String)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__PROVISION:
				setProvision((Boolean)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__PUBLIC_IP:
				setPublicIp((String)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__SSH_PORT:
				setSshPort((BigInteger)newValue);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__VDC_ID:
				setVdcId((String)newValue);
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
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__CATALOG:
				setCatalog(CATALOG_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__CATALOG_ITEM:
				setCatalogItem(CATALOG_ITEM_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__COMPUTE_ID:
				setComputeId(COMPUTE_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__CPU_COUNT:
				setCpuCount(CPU_COUNT_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__DOCKER_PORT:
				setDockerPort(DOCKER_PORT_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__EDGEGATEWAY:
				setEdgegateway(EDGEGATEWAY_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__MEMORY_SIZE:
				setMemorySize(MEMORY_SIZE_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__VAPP_NAME:
				setVappName(VAPP_NAME_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__ORGVDCNETWORK:
				setOrgvdcnetwork(ORGVDCNETWORK_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__PROVISION:
				setProvision(PROVISION_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__PUBLIC_IP:
				setPublicIp(PUBLIC_IP_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__SSH_PORT:
				setSshPort(SSH_PORT_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__VDC_ID:
				setVdcId(VDC_ID_EDEFAULT);
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
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__CATALOG:
				return CATALOG_EDEFAULT == null ? catalog != null : !CATALOG_EDEFAULT.equals(catalog);
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__CATALOG_ITEM:
				return CATALOG_ITEM_EDEFAULT == null ? catalogItem != null : !CATALOG_ITEM_EDEFAULT.equals(catalogItem);
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__COMPUTE_ID:
				return COMPUTE_ID_EDEFAULT == null ? computeId != null : !COMPUTE_ID_EDEFAULT.equals(computeId);
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__CPU_COUNT:
				return CPU_COUNT_EDEFAULT == null ? cpuCount != null : !CPU_COUNT_EDEFAULT.equals(cpuCount);
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__DOCKER_PORT:
				return DOCKER_PORT_EDEFAULT == null ? dockerPort != null : !DOCKER_PORT_EDEFAULT.equals(dockerPort);
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__EDGEGATEWAY:
				return EDGEGATEWAY_EDEFAULT == null ? edgegateway != null : !EDGEGATEWAY_EDEFAULT.equals(edgegateway);
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__MEMORY_SIZE:
				return MEMORY_SIZE_EDEFAULT == null ? memorySize != null : !MEMORY_SIZE_EDEFAULT.equals(memorySize);
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__VAPP_NAME:
				return VAPP_NAME_EDEFAULT == null ? vappName != null : !VAPP_NAME_EDEFAULT.equals(vappName);
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__ORGVDCNETWORK:
				return ORGVDCNETWORK_EDEFAULT == null ? orgvdcnetwork != null : !ORGVDCNETWORK_EDEFAULT.equals(orgvdcnetwork);
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__PROVISION:
				return provision != PROVISION_EDEFAULT;
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__PUBLIC_IP:
				return PUBLIC_IP_EDEFAULT == null ? publicIp != null : !PUBLIC_IP_EDEFAULT.equals(publicIp);
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__SSH_PORT:
				return SSH_PORT_EDEFAULT == null ? sshPort != null : !SSH_PORT_EDEFAULT.equals(sshPort);
			case DockerPackage.MACHINEVMWAREVCLOUDAIR__VDC_ID:
				return VDC_ID_EDEFAULT == null ? vdcId != null : !VDC_ID_EDEFAULT.equals(vdcId);
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
		result.append(", catalog: ");
		result.append(catalog);
		result.append(", catalogItem: ");
		result.append(catalogItem);
		result.append(", computeId: ");
		result.append(computeId);
		result.append(", cpuCount: ");
		result.append(cpuCount);
		result.append(", dockerPort: ");
		result.append(dockerPort);
		result.append(", edgegateway: ");
		result.append(edgegateway);
		result.append(", memorySize: ");
		result.append(memorySize);
		result.append(", vappName: ");
		result.append(vappName);
		result.append(", orgvdcnetwork: ");
		result.append(orgvdcnetwork);
		result.append(", provision: ");
		result.append(provision);
		result.append(", publicIp: ");
		result.append(publicIp);
		result.append(", sshPort: ");
		result.append(sshPort);
		result.append(", vdcId: ");
		result.append(vdcId);
		result.append(')');
		return result.toString();
	}

} //MachinevmwarevcloudairImpl
