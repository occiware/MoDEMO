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
import org.eclipse.cmf.occi.docker.Machinemicrosoftazure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machinemicrosoftazure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl#getSubscriptionCert <em>Subscription Cert</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl#getMachineLocation <em>Machine Location</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl#getResourceGroup <em>Resource Group</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl#getSshUser <em>Ssh User</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl#getVnet <em>Vnet</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl#getSubnet <em>Subnet</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl#getSubnetPrefix <em>Subnet Prefix</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl#getAvailabilitySet <em>Availability Set</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl#getOpenPort <em>Open Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl#getPrivateIpAddress <em>Private Ip Address</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl#getNoPublicIp <em>No Public Ip</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl#getStaticPublicIp <em>Static Public Ip</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl#getDockerPort <em>Docker Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl#getUsePrivateIp <em>Use Private Ip</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachinemicrosoftazureImpl extends MachineImpl implements Machinemicrosoftazure {
	/**
	 * The default value of the '{@link #getSubscriptionId() <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIPTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionId() <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionId()
	 * @generated
	 * @ordered
	 */
	protected String subscriptionId = SUBSCRIPTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriptionCert() <em>Subscription Cert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionCert()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIPTION_CERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionCert() <em>Subscription Cert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionCert()
	 * @generated
	 * @ordered
	 */
	protected String subscriptionCert = SUBSCRIPTION_CERT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final String ENVIRONMENT_EDEFAULT = "AzurePublicCloud";

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected String environment = ENVIRONMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMachineLocation() <em>Machine Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String MACHINE_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMachineLocation() <em>Machine Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineLocation()
	 * @generated
	 * @ordered
	 */
	protected String machineLocation = MACHINE_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceGroup() <em>Resource Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_GROUP_EDEFAULT = "docker-machine";

	/**
	 * The cached value of the '{@link #getResourceGroup() <em>Resource Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceGroup()
	 * @generated
	 * @ordered
	 */
	protected String resourceGroup = RESOURCE_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSshUser() <em>Ssh User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshUser()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSshUser() <em>Ssh User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshUser()
	 * @generated
	 * @ordered
	 */
	protected String sshUser = SSH_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVnet() <em>Vnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVnet()
	 * @generated
	 * @ordered
	 */
	protected static final String VNET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVnet() <em>Vnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVnet()
	 * @generated
	 * @ordered
	 */
	protected String vnet = VNET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnet() <em>Subnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnet() <em>Subnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet()
	 * @generated
	 * @ordered
	 */
	protected String subnet = SUBNET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetPrefix() <em>Subnet Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_PREFIX_EDEFAULT = "192.168.0.0/16";

	/**
	 * The cached value of the '{@link #getSubnetPrefix() <em>Subnet Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetPrefix()
	 * @generated
	 * @ordered
	 */
	protected String subnetPrefix = SUBNET_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailabilitySet() <em>Availability Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilitySet()
	 * @generated
	 * @ordered
	 */
	protected static final String AVAILABILITY_SET_EDEFAULT = "docker-machine";

	/**
	 * The cached value of the '{@link #getAvailabilitySet() <em>Availability Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilitySet()
	 * @generated
	 * @ordered
	 */
	protected String availabilitySet = AVAILABILITY_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpenPort() <em>Open Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenPort()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger OPEN_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpenPort() <em>Open Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenPort()
	 * @generated
	 * @ordered
	 */
	protected BigInteger openPort = OPEN_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateIpAddress() <em>Private Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateIpAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateIpAddress() <em>Private Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateIpAddress()
	 * @generated
	 * @ordered
	 */
	protected String privateIpAddress = PRIVATE_IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoPublicIp() <em>No Public Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoPublicIp()
	 * @generated
	 * @ordered
	 */
	protected static final String NO_PUBLIC_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNoPublicIp() <em>No Public Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoPublicIp()
	 * @generated
	 * @ordered
	 */
	protected String noPublicIp = NO_PUBLIC_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getStaticPublicIp() <em>Static Public Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticPublicIp()
	 * @generated
	 * @ordered
	 */
	protected static final String STATIC_PUBLIC_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStaticPublicIp() <em>Static Public Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticPublicIp()
	 * @generated
	 * @ordered
	 */
	protected String staticPublicIp = STATIC_PUBLIC_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDockerPort() <em>Docker Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerPort()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCKER_PORT_EDEFAULT = "2376";

	/**
	 * The cached value of the '{@link #getDockerPort() <em>Docker Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerPort()
	 * @generated
	 * @ordered
	 */
	protected String dockerPort = DOCKER_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsePrivateIp() <em>Use Private Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsePrivateIp()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_PRIVATE_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsePrivateIp() <em>Use Private Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsePrivateIp()
	 * @generated
	 * @ordered
	 */
	protected String usePrivateIp = USE_PRIVATE_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachinemicrosoftazureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINEMICROSOFTAZURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscriptionId() {
		return subscriptionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptionId(String newSubscriptionId) {
		String oldSubscriptionId = subscriptionId;
		subscriptionId = newSubscriptionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTAZURE__SUBSCRIPTION_ID, oldSubscriptionId, subscriptionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscriptionCert() {
		return subscriptionCert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptionCert(String newSubscriptionCert) {
		String oldSubscriptionCert = subscriptionCert;
		subscriptionCert = newSubscriptionCert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTAZURE__SUBSCRIPTION_CERT, oldSubscriptionCert, subscriptionCert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(String newEnvironment) {
		String oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTAZURE__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMachineLocation() {
		return machineLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachineLocation(String newMachineLocation) {
		String oldMachineLocation = machineLocation;
		machineLocation = newMachineLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTAZURE__MACHINE_LOCATION, oldMachineLocation, machineLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceGroup() {
		return resourceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceGroup(String newResourceGroup) {
		String oldResourceGroup = resourceGroup;
		resourceGroup = newResourceGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTAZURE__RESOURCE_GROUP, oldResourceGroup, resourceGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTAZURE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSshUser() {
		return sshUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSshUser(String newSshUser) {
		String oldSshUser = sshUser;
		sshUser = newSshUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTAZURE__SSH_USER, oldSshUser, sshUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVnet() {
		return vnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVnet(String newVnet) {
		String oldVnet = vnet;
		vnet = newVnet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTAZURE__VNET, oldVnet, vnet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubnet() {
		return subnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubnet(String newSubnet) {
		String oldSubnet = subnet;
		subnet = newSubnet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTAZURE__SUBNET, oldSubnet, subnet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubnetPrefix() {
		return subnetPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubnetPrefix(String newSubnetPrefix) {
		String oldSubnetPrefix = subnetPrefix;
		subnetPrefix = newSubnetPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTAZURE__SUBNET_PREFIX, oldSubnetPrefix, subnetPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvailabilitySet() {
		return availabilitySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailabilitySet(String newAvailabilitySet) {
		String oldAvailabilitySet = availabilitySet;
		availabilitySet = newAvailabilitySet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTAZURE__AVAILABILITY_SET, oldAvailabilitySet, availabilitySet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOpenPort() {
		return openPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenPort(BigInteger newOpenPort) {
		BigInteger oldOpenPort = openPort;
		openPort = newOpenPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTAZURE__OPEN_PORT, oldOpenPort, openPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivateIpAddress() {
		return privateIpAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateIpAddress(String newPrivateIpAddress) {
		String oldPrivateIpAddress = privateIpAddress;
		privateIpAddress = newPrivateIpAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTAZURE__PRIVATE_IP_ADDRESS, oldPrivateIpAddress, privateIpAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNoPublicIp() {
		return noPublicIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoPublicIp(String newNoPublicIp) {
		String oldNoPublicIp = noPublicIp;
		noPublicIp = newNoPublicIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTAZURE__NO_PUBLIC_IP, oldNoPublicIp, noPublicIp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStaticPublicIp() {
		return staticPublicIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticPublicIp(String newStaticPublicIp) {
		String oldStaticPublicIp = staticPublicIp;
		staticPublicIp = newStaticPublicIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTAZURE__STATIC_PUBLIC_IP, oldStaticPublicIp, staticPublicIp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDockerPort() {
		return dockerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDockerPort(String newDockerPort) {
		String oldDockerPort = dockerPort;
		dockerPort = newDockerPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTAZURE__DOCKER_PORT, oldDockerPort, dockerPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsePrivateIp() {
		return usePrivateIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsePrivateIp(String newUsePrivateIp) {
		String oldUsePrivateIp = usePrivateIp;
		usePrivateIp = newUsePrivateIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTAZURE__USE_PRIVATE_IP, oldUsePrivateIp, usePrivateIp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEMICROSOFTAZURE__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINEMICROSOFTAZURE__SUBSCRIPTION_ID:
				return getSubscriptionId();
			case DockerPackage.MACHINEMICROSOFTAZURE__SUBSCRIPTION_CERT:
				return getSubscriptionCert();
			case DockerPackage.MACHINEMICROSOFTAZURE__ENVIRONMENT:
				return getEnvironment();
			case DockerPackage.MACHINEMICROSOFTAZURE__MACHINE_LOCATION:
				return getMachineLocation();
			case DockerPackage.MACHINEMICROSOFTAZURE__RESOURCE_GROUP:
				return getResourceGroup();
			case DockerPackage.MACHINEMICROSOFTAZURE__SIZE:
				return getSize();
			case DockerPackage.MACHINEMICROSOFTAZURE__SSH_USER:
				return getSshUser();
			case DockerPackage.MACHINEMICROSOFTAZURE__VNET:
				return getVnet();
			case DockerPackage.MACHINEMICROSOFTAZURE__SUBNET:
				return getSubnet();
			case DockerPackage.MACHINEMICROSOFTAZURE__SUBNET_PREFIX:
				return getSubnetPrefix();
			case DockerPackage.MACHINEMICROSOFTAZURE__AVAILABILITY_SET:
				return getAvailabilitySet();
			case DockerPackage.MACHINEMICROSOFTAZURE__OPEN_PORT:
				return getOpenPort();
			case DockerPackage.MACHINEMICROSOFTAZURE__PRIVATE_IP_ADDRESS:
				return getPrivateIpAddress();
			case DockerPackage.MACHINEMICROSOFTAZURE__NO_PUBLIC_IP:
				return getNoPublicIp();
			case DockerPackage.MACHINEMICROSOFTAZURE__STATIC_PUBLIC_IP:
				return getStaticPublicIp();
			case DockerPackage.MACHINEMICROSOFTAZURE__DOCKER_PORT:
				return getDockerPort();
			case DockerPackage.MACHINEMICROSOFTAZURE__USE_PRIVATE_IP:
				return getUsePrivateIp();
			case DockerPackage.MACHINEMICROSOFTAZURE__IMAGE:
				return getImage();
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
			case DockerPackage.MACHINEMICROSOFTAZURE__SUBSCRIPTION_ID:
				setSubscriptionId((String)newValue);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__SUBSCRIPTION_CERT:
				setSubscriptionCert((String)newValue);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__ENVIRONMENT:
				setEnvironment((String)newValue);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__MACHINE_LOCATION:
				setMachineLocation((String)newValue);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__RESOURCE_GROUP:
				setResourceGroup((String)newValue);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__SIZE:
				setSize((String)newValue);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__SSH_USER:
				setSshUser((String)newValue);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__VNET:
				setVnet((String)newValue);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__SUBNET:
				setSubnet((String)newValue);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__SUBNET_PREFIX:
				setSubnetPrefix((String)newValue);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__AVAILABILITY_SET:
				setAvailabilitySet((String)newValue);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__OPEN_PORT:
				setOpenPort((BigInteger)newValue);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__PRIVATE_IP_ADDRESS:
				setPrivateIpAddress((String)newValue);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__NO_PUBLIC_IP:
				setNoPublicIp((String)newValue);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__STATIC_PUBLIC_IP:
				setStaticPublicIp((String)newValue);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__DOCKER_PORT:
				setDockerPort((String)newValue);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__USE_PRIVATE_IP:
				setUsePrivateIp((String)newValue);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__IMAGE:
				setImage((String)newValue);
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
			case DockerPackage.MACHINEMICROSOFTAZURE__SUBSCRIPTION_ID:
				setSubscriptionId(SUBSCRIPTION_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__SUBSCRIPTION_CERT:
				setSubscriptionCert(SUBSCRIPTION_CERT_EDEFAULT);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__ENVIRONMENT:
				setEnvironment(ENVIRONMENT_EDEFAULT);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__MACHINE_LOCATION:
				setMachineLocation(MACHINE_LOCATION_EDEFAULT);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__RESOURCE_GROUP:
				setResourceGroup(RESOURCE_GROUP_EDEFAULT);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__SSH_USER:
				setSshUser(SSH_USER_EDEFAULT);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__VNET:
				setVnet(VNET_EDEFAULT);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__SUBNET:
				setSubnet(SUBNET_EDEFAULT);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__SUBNET_PREFIX:
				setSubnetPrefix(SUBNET_PREFIX_EDEFAULT);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__AVAILABILITY_SET:
				setAvailabilitySet(AVAILABILITY_SET_EDEFAULT);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__OPEN_PORT:
				setOpenPort(OPEN_PORT_EDEFAULT);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__PRIVATE_IP_ADDRESS:
				setPrivateIpAddress(PRIVATE_IP_ADDRESS_EDEFAULT);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__NO_PUBLIC_IP:
				setNoPublicIp(NO_PUBLIC_IP_EDEFAULT);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__STATIC_PUBLIC_IP:
				setStaticPublicIp(STATIC_PUBLIC_IP_EDEFAULT);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__DOCKER_PORT:
				setDockerPort(DOCKER_PORT_EDEFAULT);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__USE_PRIVATE_IP:
				setUsePrivateIp(USE_PRIVATE_IP_EDEFAULT);
				return;
			case DockerPackage.MACHINEMICROSOFTAZURE__IMAGE:
				setImage(IMAGE_EDEFAULT);
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
			case DockerPackage.MACHINEMICROSOFTAZURE__SUBSCRIPTION_ID:
				return SUBSCRIPTION_ID_EDEFAULT == null ? subscriptionId != null : !SUBSCRIPTION_ID_EDEFAULT.equals(subscriptionId);
			case DockerPackage.MACHINEMICROSOFTAZURE__SUBSCRIPTION_CERT:
				return SUBSCRIPTION_CERT_EDEFAULT == null ? subscriptionCert != null : !SUBSCRIPTION_CERT_EDEFAULT.equals(subscriptionCert);
			case DockerPackage.MACHINEMICROSOFTAZURE__ENVIRONMENT:
				return ENVIRONMENT_EDEFAULT == null ? environment != null : !ENVIRONMENT_EDEFAULT.equals(environment);
			case DockerPackage.MACHINEMICROSOFTAZURE__MACHINE_LOCATION:
				return MACHINE_LOCATION_EDEFAULT == null ? machineLocation != null : !MACHINE_LOCATION_EDEFAULT.equals(machineLocation);
			case DockerPackage.MACHINEMICROSOFTAZURE__RESOURCE_GROUP:
				return RESOURCE_GROUP_EDEFAULT == null ? resourceGroup != null : !RESOURCE_GROUP_EDEFAULT.equals(resourceGroup);
			case DockerPackage.MACHINEMICROSOFTAZURE__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case DockerPackage.MACHINEMICROSOFTAZURE__SSH_USER:
				return SSH_USER_EDEFAULT == null ? sshUser != null : !SSH_USER_EDEFAULT.equals(sshUser);
			case DockerPackage.MACHINEMICROSOFTAZURE__VNET:
				return VNET_EDEFAULT == null ? vnet != null : !VNET_EDEFAULT.equals(vnet);
			case DockerPackage.MACHINEMICROSOFTAZURE__SUBNET:
				return SUBNET_EDEFAULT == null ? subnet != null : !SUBNET_EDEFAULT.equals(subnet);
			case DockerPackage.MACHINEMICROSOFTAZURE__SUBNET_PREFIX:
				return SUBNET_PREFIX_EDEFAULT == null ? subnetPrefix != null : !SUBNET_PREFIX_EDEFAULT.equals(subnetPrefix);
			case DockerPackage.MACHINEMICROSOFTAZURE__AVAILABILITY_SET:
				return AVAILABILITY_SET_EDEFAULT == null ? availabilitySet != null : !AVAILABILITY_SET_EDEFAULT.equals(availabilitySet);
			case DockerPackage.MACHINEMICROSOFTAZURE__OPEN_PORT:
				return OPEN_PORT_EDEFAULT == null ? openPort != null : !OPEN_PORT_EDEFAULT.equals(openPort);
			case DockerPackage.MACHINEMICROSOFTAZURE__PRIVATE_IP_ADDRESS:
				return PRIVATE_IP_ADDRESS_EDEFAULT == null ? privateIpAddress != null : !PRIVATE_IP_ADDRESS_EDEFAULT.equals(privateIpAddress);
			case DockerPackage.MACHINEMICROSOFTAZURE__NO_PUBLIC_IP:
				return NO_PUBLIC_IP_EDEFAULT == null ? noPublicIp != null : !NO_PUBLIC_IP_EDEFAULT.equals(noPublicIp);
			case DockerPackage.MACHINEMICROSOFTAZURE__STATIC_PUBLIC_IP:
				return STATIC_PUBLIC_IP_EDEFAULT == null ? staticPublicIp != null : !STATIC_PUBLIC_IP_EDEFAULT.equals(staticPublicIp);
			case DockerPackage.MACHINEMICROSOFTAZURE__DOCKER_PORT:
				return DOCKER_PORT_EDEFAULT == null ? dockerPort != null : !DOCKER_PORT_EDEFAULT.equals(dockerPort);
			case DockerPackage.MACHINEMICROSOFTAZURE__USE_PRIVATE_IP:
				return USE_PRIVATE_IP_EDEFAULT == null ? usePrivateIp != null : !USE_PRIVATE_IP_EDEFAULT.equals(usePrivateIp);
			case DockerPackage.MACHINEMICROSOFTAZURE__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
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
		result.append(" (subscriptionId: ");
		result.append(subscriptionId);
		result.append(", subscriptionCert: ");
		result.append(subscriptionCert);
		result.append(", environment: ");
		result.append(environment);
		result.append(", machineLocation: ");
		result.append(machineLocation);
		result.append(", resourceGroup: ");
		result.append(resourceGroup);
		result.append(", size: ");
		result.append(size);
		result.append(", sshUser: ");
		result.append(sshUser);
		result.append(", vnet: ");
		result.append(vnet);
		result.append(", subnet: ");
		result.append(subnet);
		result.append(", subnetPrefix: ");
		result.append(subnetPrefix);
		result.append(", availabilitySet: ");
		result.append(availabilitySet);
		result.append(", openPort: ");
		result.append(openPort);
		result.append(", privateIpAddress: ");
		result.append(privateIpAddress);
		result.append(", noPublicIp: ");
		result.append(noPublicIp);
		result.append(", staticPublicIp: ");
		result.append(staticPublicIp);
		result.append(", dockerPort: ");
		result.append(dockerPort);
		result.append(", usePrivateIp: ");
		result.append(usePrivateIp);
		result.append(", image: ");
		result.append(image);
		result.append(')');
		return result.toString();
	}

} //MachinemicrosoftazureImpl
