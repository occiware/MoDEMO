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
import org.eclipse.cmf.occi.docker.Machineibmsoftlayer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machineibmsoftlayer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineibmsoftlayerImpl#getApiEndpoint <em>Api Endpoint</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineibmsoftlayerImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineibmsoftlayerImpl#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineibmsoftlayerImpl#getCpu <em>Cpu</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineibmsoftlayerImpl#getDiskSize <em>Disk Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineibmsoftlayerImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineibmsoftlayerImpl#isHourlyBilling <em>Hourly Billing</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineibmsoftlayerImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineibmsoftlayerImpl#isLocalDisk <em>Local Disk</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineibmsoftlayerImpl#isPrivateNetOnly <em>Private Net Only</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineibmsoftlayerImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineibmsoftlayerImpl#getPublicVlanId <em>Public Vlan Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineibmsoftlayerImpl#getPrivateVlanId <em>Private Vlan Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachineibmsoftlayerImpl extends MachineImpl implements Machineibmsoftlayer {
	/**
	 * The default value of the '{@link #getApiEndpoint() <em>Api Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String API_ENDPOINT_EDEFAULT = "api.softlayer.com/rest/v3";

	/**
	 * The cached value of the '{@link #getApiEndpoint() <em>Api Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiEndpoint()
	 * @generated
	 * @ordered
	 */
	protected String apiEndpoint = API_ENDPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getApiKey() <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKey()
	 * @generated
	 * @ordered
	 */
	protected static final String API_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiKey() <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKey()
	 * @generated
	 * @ordered
	 */
	protected String apiKey = API_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpu() <em>Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CPU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpu() <em>Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu()
	 * @generated
	 * @ordered
	 */
	protected BigInteger cpu = CPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiskSize() <em>Disk Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DISK_SIZE_EDEFAULT = null;

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
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected String domain = DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isHourlyBilling() <em>Hourly Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHourlyBilling()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HOURLY_BILLING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHourlyBilling() <em>Hourly Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHourlyBilling()
	 * @generated
	 * @ordered
	 */
	protected boolean hourlyBilling = HOURLY_BILLING_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = "UBUNTU_LATEST";

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isLocalDisk() <em>Local Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocalDisk()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCAL_DISK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLocalDisk() <em>Local Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocalDisk()
	 * @generated
	 * @ordered
	 */
	protected boolean localDisk = LOCAL_DISK_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrivateNetOnly() <em>Private Net Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivateNetOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIVATE_NET_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrivateNetOnly() <em>Private Net Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivateNetOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean privateNetOnly = PRIVATE_NET_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicVlanId() <em>Public Vlan Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicVlanId()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_VLAN_ID_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getPublicVlanId() <em>Public Vlan Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicVlanId()
	 * @generated
	 * @ordered
	 */
	protected String publicVlanId = PUBLIC_VLAN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateVlanId() <em>Private Vlan Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateVlanId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_VLAN_ID_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getPrivateVlanId() <em>Private Vlan Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateVlanId()
	 * @generated
	 * @ordered
	 */
	protected String privateVlanId = PRIVATE_VLAN_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineibmsoftlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINEIBMSOFTLAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApiEndpoint() {
		return apiEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiEndpoint(String newApiEndpoint) {
		String oldApiEndpoint = apiEndpoint;
		apiEndpoint = newApiEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEIBMSOFTLAYER__API_ENDPOINT, oldApiEndpoint, apiEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEIBMSOFTLAYER__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApiKey() {
		return apiKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiKey(String newApiKey) {
		String oldApiKey = apiKey;
		apiKey = newApiKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEIBMSOFTLAYER__API_KEY, oldApiKey, apiKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCpu() {
		return cpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpu(BigInteger newCpu) {
		BigInteger oldCpu = cpu;
		cpu = newCpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEIBMSOFTLAYER__CPU, oldCpu, cpu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEIBMSOFTLAYER__DISK_SIZE, oldDiskSize, diskSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(String newDomain) {
		String oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEIBMSOFTLAYER__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHourlyBilling() {
		return hourlyBilling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHourlyBilling(boolean newHourlyBilling) {
		boolean oldHourlyBilling = hourlyBilling;
		hourlyBilling = newHourlyBilling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEIBMSOFTLAYER__HOURLY_BILLING, oldHourlyBilling, hourlyBilling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEIBMSOFTLAYER__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocalDisk() {
		return localDisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalDisk(boolean newLocalDisk) {
		boolean oldLocalDisk = localDisk;
		localDisk = newLocalDisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEIBMSOFTLAYER__LOCAL_DISK, oldLocalDisk, localDisk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrivateNetOnly() {
		return privateNetOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateNetOnly(boolean newPrivateNetOnly) {
		boolean oldPrivateNetOnly = privateNetOnly;
		privateNetOnly = newPrivateNetOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEIBMSOFTLAYER__PRIVATE_NET_ONLY, oldPrivateNetOnly, privateNetOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEIBMSOFTLAYER__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicVlanId() {
		return publicVlanId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicVlanId(String newPublicVlanId) {
		String oldPublicVlanId = publicVlanId;
		publicVlanId = newPublicVlanId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEIBMSOFTLAYER__PUBLIC_VLAN_ID, oldPublicVlanId, publicVlanId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivateVlanId() {
		return privateVlanId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateVlanId(String newPrivateVlanId) {
		String oldPrivateVlanId = privateVlanId;
		privateVlanId = newPrivateVlanId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEIBMSOFTLAYER__PRIVATE_VLAN_ID, oldPrivateVlanId, privateVlanId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINEIBMSOFTLAYER__API_ENDPOINT:
				return getApiEndpoint();
			case DockerPackage.MACHINEIBMSOFTLAYER__USER:
				return getUser();
			case DockerPackage.MACHINEIBMSOFTLAYER__API_KEY:
				return getApiKey();
			case DockerPackage.MACHINEIBMSOFTLAYER__CPU:
				return getCpu();
			case DockerPackage.MACHINEIBMSOFTLAYER__DISK_SIZE:
				return getDiskSize();
			case DockerPackage.MACHINEIBMSOFTLAYER__DOMAIN:
				return getDomain();
			case DockerPackage.MACHINEIBMSOFTLAYER__HOURLY_BILLING:
				return isHourlyBilling();
			case DockerPackage.MACHINEIBMSOFTLAYER__IMAGE:
				return getImage();
			case DockerPackage.MACHINEIBMSOFTLAYER__LOCAL_DISK:
				return isLocalDisk();
			case DockerPackage.MACHINEIBMSOFTLAYER__PRIVATE_NET_ONLY:
				return isPrivateNetOnly();
			case DockerPackage.MACHINEIBMSOFTLAYER__REGION:
				return getRegion();
			case DockerPackage.MACHINEIBMSOFTLAYER__PUBLIC_VLAN_ID:
				return getPublicVlanId();
			case DockerPackage.MACHINEIBMSOFTLAYER__PRIVATE_VLAN_ID:
				return getPrivateVlanId();
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
			case DockerPackage.MACHINEIBMSOFTLAYER__API_ENDPOINT:
				setApiEndpoint((String)newValue);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__USER:
				setUser((String)newValue);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__API_KEY:
				setApiKey((String)newValue);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__CPU:
				setCpu((BigInteger)newValue);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__DISK_SIZE:
				setDiskSize((BigInteger)newValue);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__DOMAIN:
				setDomain((String)newValue);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__HOURLY_BILLING:
				setHourlyBilling((Boolean)newValue);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__IMAGE:
				setImage((String)newValue);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__LOCAL_DISK:
				setLocalDisk((Boolean)newValue);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__PRIVATE_NET_ONLY:
				setPrivateNetOnly((Boolean)newValue);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__REGION:
				setRegion((String)newValue);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__PUBLIC_VLAN_ID:
				setPublicVlanId((String)newValue);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__PRIVATE_VLAN_ID:
				setPrivateVlanId((String)newValue);
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
			case DockerPackage.MACHINEIBMSOFTLAYER__API_ENDPOINT:
				setApiEndpoint(API_ENDPOINT_EDEFAULT);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__USER:
				setUser(USER_EDEFAULT);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__API_KEY:
				setApiKey(API_KEY_EDEFAULT);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__CPU:
				setCpu(CPU_EDEFAULT);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__DISK_SIZE:
				setDiskSize(DISK_SIZE_EDEFAULT);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__DOMAIN:
				setDomain(DOMAIN_EDEFAULT);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__HOURLY_BILLING:
				setHourlyBilling(HOURLY_BILLING_EDEFAULT);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__LOCAL_DISK:
				setLocalDisk(LOCAL_DISK_EDEFAULT);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__PRIVATE_NET_ONLY:
				setPrivateNetOnly(PRIVATE_NET_ONLY_EDEFAULT);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__PUBLIC_VLAN_ID:
				setPublicVlanId(PUBLIC_VLAN_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINEIBMSOFTLAYER__PRIVATE_VLAN_ID:
				setPrivateVlanId(PRIVATE_VLAN_ID_EDEFAULT);
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
			case DockerPackage.MACHINEIBMSOFTLAYER__API_ENDPOINT:
				return API_ENDPOINT_EDEFAULT == null ? apiEndpoint != null : !API_ENDPOINT_EDEFAULT.equals(apiEndpoint);
			case DockerPackage.MACHINEIBMSOFTLAYER__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case DockerPackage.MACHINEIBMSOFTLAYER__API_KEY:
				return API_KEY_EDEFAULT == null ? apiKey != null : !API_KEY_EDEFAULT.equals(apiKey);
			case DockerPackage.MACHINEIBMSOFTLAYER__CPU:
				return CPU_EDEFAULT == null ? cpu != null : !CPU_EDEFAULT.equals(cpu);
			case DockerPackage.MACHINEIBMSOFTLAYER__DISK_SIZE:
				return DISK_SIZE_EDEFAULT == null ? diskSize != null : !DISK_SIZE_EDEFAULT.equals(diskSize);
			case DockerPackage.MACHINEIBMSOFTLAYER__DOMAIN:
				return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
			case DockerPackage.MACHINEIBMSOFTLAYER__HOURLY_BILLING:
				return hourlyBilling != HOURLY_BILLING_EDEFAULT;
			case DockerPackage.MACHINEIBMSOFTLAYER__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case DockerPackage.MACHINEIBMSOFTLAYER__LOCAL_DISK:
				return localDisk != LOCAL_DISK_EDEFAULT;
			case DockerPackage.MACHINEIBMSOFTLAYER__PRIVATE_NET_ONLY:
				return privateNetOnly != PRIVATE_NET_ONLY_EDEFAULT;
			case DockerPackage.MACHINEIBMSOFTLAYER__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case DockerPackage.MACHINEIBMSOFTLAYER__PUBLIC_VLAN_ID:
				return PUBLIC_VLAN_ID_EDEFAULT == null ? publicVlanId != null : !PUBLIC_VLAN_ID_EDEFAULT.equals(publicVlanId);
			case DockerPackage.MACHINEIBMSOFTLAYER__PRIVATE_VLAN_ID:
				return PRIVATE_VLAN_ID_EDEFAULT == null ? privateVlanId != null : !PRIVATE_VLAN_ID_EDEFAULT.equals(privateVlanId);
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
		result.append(" (apiEndpoint: ");
		result.append(apiEndpoint);
		result.append(", user: ");
		result.append(user);
		result.append(", apiKey: ");
		result.append(apiKey);
		result.append(", cpu: ");
		result.append(cpu);
		result.append(", diskSize: ");
		result.append(diskSize);
		result.append(", domain: ");
		result.append(domain);
		result.append(", hourlyBilling: ");
		result.append(hourlyBilling);
		result.append(", image: ");
		result.append(image);
		result.append(", localDisk: ");
		result.append(localDisk);
		result.append(", privateNetOnly: ");
		result.append(privateNetOnly);
		result.append(", region: ");
		result.append(region);
		result.append(", publicVlanId: ");
		result.append(publicVlanId);
		result.append(", privateVlanId: ");
		result.append(privateVlanId);
		result.append(')');
		return result.toString();
	}

} //MachineibmsoftlayerImpl
