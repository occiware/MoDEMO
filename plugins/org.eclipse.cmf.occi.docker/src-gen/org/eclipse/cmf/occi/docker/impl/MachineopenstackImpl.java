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
import org.eclipse.cmf.occi.docker.Machineopenstack;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machineopenstack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getFlavorId <em>Flavor Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getFlavorName <em>Flavor Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getImageId <em>Image Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getImageName <em>Image Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getAuthUrl <em>Auth Url</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getTenantName <em>Tenant Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getTenantId <em>Tenant Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getEndpointType <em>Endpoint Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getNetId <em>Net Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getNetName <em>Net Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getSecGroups <em>Sec Groups</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getFloatingIpPool <em>Floating Ip Pool</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getActiveTimeOut <em>Active Time Out</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getAvailabilityZone <em>Availability Zone</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getDomainId <em>Domain Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#isInsecure <em>Insecure</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getIpVersion <em>Ip Version</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getKeypairName <em>Keypair Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getPrivateKeyFile <em>Private Key File</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getSshPort <em>Ssh Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl#getSshUser <em>Ssh User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachineopenstackImpl extends MachineImpl implements Machineopenstack {
	/**
	 * The default value of the '{@link #getFlavorId() <em>Flavor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavorId()
	 * @generated
	 * @ordered
	 */
	protected static final String FLAVOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlavorId() <em>Flavor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavorId()
	 * @generated
	 * @ordered
	 */
	protected String flavorId = FLAVOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlavorName() <em>Flavor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavorName()
	 * @generated
	 * @ordered
	 */
	protected static final String FLAVOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlavorName() <em>Flavor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavorName()
	 * @generated
	 * @ordered
	 */
	protected String flavorName = FLAVOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageId() <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageId()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageId() <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageId()
	 * @generated
	 * @ordered
	 */
	protected String imageId = IMAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageName() <em>Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageName() <em>Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageName()
	 * @generated
	 * @ordered
	 */
	protected String imageName = IMAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthUrl() <em>Auth Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthUrl() <em>Auth Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthUrl()
	 * @generated
	 * @ordered
	 */
	protected String authUrl = AUTH_URL_EDEFAULT;

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
	 * The default value of the '{@link #getTenantName() <em>Tenant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantName()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTenantName() <em>Tenant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantName()
	 * @generated
	 * @ordered
	 */
	protected String tenantName = TENANT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTenantId() <em>Tenant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantId()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTenantId() <em>Tenant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantId()
	 * @generated
	 * @ordered
	 */
	protected String tenantId = TENANT_ID_EDEFAULT;

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
	 * The default value of the '{@link #getEndpointType() <em>Endpoint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointType()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_TYPE_EDEFAULT = "publicURL";

	/**
	 * The cached value of the '{@link #getEndpointType() <em>Endpoint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointType()
	 * @generated
	 * @ordered
	 */
	protected String endpointType = ENDPOINT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetId() <em>Net Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetId()
	 * @generated
	 * @ordered
	 */
	protected static final String NET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetId() <em>Net Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetId()
	 * @generated
	 * @ordered
	 */
	protected String netId = NET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetName() <em>Net Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetName()
	 * @generated
	 * @ordered
	 */
	protected static final String NET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetName() <em>Net Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetName()
	 * @generated
	 * @ordered
	 */
	protected String netName = NET_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecGroups() <em>Sec Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecGroups()
	 * @generated
	 * @ordered
	 */
	protected static final String SEC_GROUPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecGroups() <em>Sec Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecGroups()
	 * @generated
	 * @ordered
	 */
	protected String secGroups = SEC_GROUPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloatingIpPool() <em>Floating Ip Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatingIpPool()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOATING_IP_POOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFloatingIpPool() <em>Floating Ip Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatingIpPool()
	 * @generated
	 * @ordered
	 */
	protected String floatingIpPool = FLOATING_IP_POOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActiveTimeOut() <em>Active Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveTimeOut()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ACTIVE_TIME_OUT_EDEFAULT = new BigInteger("200");

	/**
	 * The cached value of the '{@link #getActiveTimeOut() <em>Active Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveTimeOut()
	 * @generated
	 * @ordered
	 */
	protected BigInteger activeTimeOut = ACTIVE_TIME_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailabilityZone() <em>Availability Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityZone()
	 * @generated
	 * @ordered
	 */
	protected static final String AVAILABILITY_ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailabilityZone() <em>Availability Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityZone()
	 * @generated
	 * @ordered
	 */
	protected String availabilityZone = AVAILABILITY_ZONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainId() <em>Domain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainId()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainId() <em>Domain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainId()
	 * @generated
	 * @ordered
	 */
	protected String domainId = DOMAIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected String domainName = DOMAIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isInsecure() <em>Insecure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsecure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSECURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInsecure() <em>Insecure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsecure()
	 * @generated
	 * @ordered
	 */
	protected boolean insecure = INSECURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIpVersion() <em>Ip Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpVersion()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger IP_VERSION_EDEFAULT = new BigInteger("4");

	/**
	 * The cached value of the '{@link #getIpVersion() <em>Ip Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpVersion()
	 * @generated
	 * @ordered
	 */
	protected BigInteger ipVersion = IP_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeypairName() <em>Keypair Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeypairName()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYPAIR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeypairName() <em>Keypair Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeypairName()
	 * @generated
	 * @ordered
	 */
	protected String keypairName = KEYPAIR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateKeyFile() <em>Private Key File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateKeyFile()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_KEY_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateKeyFile() <em>Private Key File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateKeyFile()
	 * @generated
	 * @ordered
	 */
	protected String privateKeyFile = PRIVATE_KEY_FILE_EDEFAULT;

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
	 * The default value of the '{@link #getSshUser() <em>Ssh User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshUser()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_USER_EDEFAULT = "root";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineopenstackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINEOPENSTACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlavorId() {
		return flavorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlavorId(String newFlavorId) {
		String oldFlavorId = flavorId;
		flavorId = newFlavorId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__FLAVOR_ID, oldFlavorId, flavorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlavorName() {
		return flavorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlavorName(String newFlavorName) {
		String oldFlavorName = flavorName;
		flavorName = newFlavorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__FLAVOR_NAME, oldFlavorName, flavorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageId() {
		return imageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageId(String newImageId) {
		String oldImageId = imageId;
		imageId = newImageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__IMAGE_ID, oldImageId, imageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageName() {
		return imageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageName(String newImageName) {
		String oldImageName = imageName;
		imageName = newImageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__IMAGE_NAME, oldImageName, imageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthUrl() {
		return authUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthUrl(String newAuthUrl) {
		String oldAuthUrl = authUrl;
		authUrl = newAuthUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__AUTH_URL, oldAuthUrl, authUrl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__USERNAME, oldUsername, username));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTenantName() {
		return tenantName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTenantName(String newTenantName) {
		String oldTenantName = tenantName;
		tenantName = newTenantName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__TENANT_NAME, oldTenantName, tenantName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTenantId() {
		return tenantId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTenantId(String newTenantId) {
		String oldTenantId = tenantId;
		tenantId = newTenantId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__TENANT_ID, oldTenantId, tenantId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndpointType() {
		return endpointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointType(String newEndpointType) {
		String oldEndpointType = endpointType;
		endpointType = newEndpointType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__ENDPOINT_TYPE, oldEndpointType, endpointType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetId() {
		return netId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetId(String newNetId) {
		String oldNetId = netId;
		netId = newNetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__NET_ID, oldNetId, netId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetName() {
		return netName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetName(String newNetName) {
		String oldNetName = netName;
		netName = newNetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__NET_NAME, oldNetName, netName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecGroups() {
		return secGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecGroups(String newSecGroups) {
		String oldSecGroups = secGroups;
		secGroups = newSecGroups;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__SEC_GROUPS, oldSecGroups, secGroups));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFloatingIpPool() {
		return floatingIpPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatingIpPool(String newFloatingIpPool) {
		String oldFloatingIpPool = floatingIpPool;
		floatingIpPool = newFloatingIpPool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__FLOATING_IP_POOL, oldFloatingIpPool, floatingIpPool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getActiveTimeOut() {
		return activeTimeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveTimeOut(BigInteger newActiveTimeOut) {
		BigInteger oldActiveTimeOut = activeTimeOut;
		activeTimeOut = newActiveTimeOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__ACTIVE_TIME_OUT, oldActiveTimeOut, activeTimeOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvailabilityZone() {
		return availabilityZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailabilityZone(String newAvailabilityZone) {
		String oldAvailabilityZone = availabilityZone;
		availabilityZone = newAvailabilityZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__AVAILABILITY_ZONE, oldAvailabilityZone, availabilityZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainId() {
		return domainId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainId(String newDomainId) {
		String oldDomainId = domainId;
		domainId = newDomainId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__DOMAIN_ID, oldDomainId, domainId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainName(String newDomainName) {
		String oldDomainName = domainName;
		domainName = newDomainName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__DOMAIN_NAME, oldDomainName, domainName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInsecure() {
		return insecure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsecure(boolean newInsecure) {
		boolean oldInsecure = insecure;
		insecure = newInsecure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__INSECURE, oldInsecure, insecure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getIpVersion() {
		return ipVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpVersion(BigInteger newIpVersion) {
		BigInteger oldIpVersion = ipVersion;
		ipVersion = newIpVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__IP_VERSION, oldIpVersion, ipVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeypairName() {
		return keypairName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeypairName(String newKeypairName) {
		String oldKeypairName = keypairName;
		keypairName = newKeypairName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__KEYPAIR_NAME, oldKeypairName, keypairName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivateKeyFile() {
		return privateKeyFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateKeyFile(String newPrivateKeyFile) {
		String oldPrivateKeyFile = privateKeyFile;
		privateKeyFile = newPrivateKeyFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__PRIVATE_KEY_FILE, oldPrivateKeyFile, privateKeyFile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__SSH_PORT, oldSshPort, sshPort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEOPENSTACK__SSH_USER, oldSshUser, sshUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINEOPENSTACK__FLAVOR_ID:
				return getFlavorId();
			case DockerPackage.MACHINEOPENSTACK__FLAVOR_NAME:
				return getFlavorName();
			case DockerPackage.MACHINEOPENSTACK__IMAGE_ID:
				return getImageId();
			case DockerPackage.MACHINEOPENSTACK__IMAGE_NAME:
				return getImageName();
			case DockerPackage.MACHINEOPENSTACK__AUTH_URL:
				return getAuthUrl();
			case DockerPackage.MACHINEOPENSTACK__USERNAME:
				return getUsername();
			case DockerPackage.MACHINEOPENSTACK__PASSWORD:
				return getPassword();
			case DockerPackage.MACHINEOPENSTACK__TENANT_NAME:
				return getTenantName();
			case DockerPackage.MACHINEOPENSTACK__TENANT_ID:
				return getTenantId();
			case DockerPackage.MACHINEOPENSTACK__REGION:
				return getRegion();
			case DockerPackage.MACHINEOPENSTACK__ENDPOINT_TYPE:
				return getEndpointType();
			case DockerPackage.MACHINEOPENSTACK__NET_ID:
				return getNetId();
			case DockerPackage.MACHINEOPENSTACK__NET_NAME:
				return getNetName();
			case DockerPackage.MACHINEOPENSTACK__SEC_GROUPS:
				return getSecGroups();
			case DockerPackage.MACHINEOPENSTACK__FLOATING_IP_POOL:
				return getFloatingIpPool();
			case DockerPackage.MACHINEOPENSTACK__ACTIVE_TIME_OUT:
				return getActiveTimeOut();
			case DockerPackage.MACHINEOPENSTACK__AVAILABILITY_ZONE:
				return getAvailabilityZone();
			case DockerPackage.MACHINEOPENSTACK__DOMAIN_ID:
				return getDomainId();
			case DockerPackage.MACHINEOPENSTACK__DOMAIN_NAME:
				return getDomainName();
			case DockerPackage.MACHINEOPENSTACK__INSECURE:
				return isInsecure();
			case DockerPackage.MACHINEOPENSTACK__IP_VERSION:
				return getIpVersion();
			case DockerPackage.MACHINEOPENSTACK__KEYPAIR_NAME:
				return getKeypairName();
			case DockerPackage.MACHINEOPENSTACK__PRIVATE_KEY_FILE:
				return getPrivateKeyFile();
			case DockerPackage.MACHINEOPENSTACK__SSH_PORT:
				return getSshPort();
			case DockerPackage.MACHINEOPENSTACK__SSH_USER:
				return getSshUser();
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
			case DockerPackage.MACHINEOPENSTACK__FLAVOR_ID:
				setFlavorId((String)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__FLAVOR_NAME:
				setFlavorName((String)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__IMAGE_ID:
				setImageId((String)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__IMAGE_NAME:
				setImageName((String)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__AUTH_URL:
				setAuthUrl((String)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__USERNAME:
				setUsername((String)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__PASSWORD:
				setPassword((String)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__TENANT_NAME:
				setTenantName((String)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__TENANT_ID:
				setTenantId((String)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__REGION:
				setRegion((String)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__ENDPOINT_TYPE:
				setEndpointType((String)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__NET_ID:
				setNetId((String)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__NET_NAME:
				setNetName((String)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__SEC_GROUPS:
				setSecGroups((String)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__FLOATING_IP_POOL:
				setFloatingIpPool((String)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__ACTIVE_TIME_OUT:
				setActiveTimeOut((BigInteger)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__AVAILABILITY_ZONE:
				setAvailabilityZone((String)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__DOMAIN_ID:
				setDomainId((String)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__DOMAIN_NAME:
				setDomainName((String)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__INSECURE:
				setInsecure((Boolean)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__IP_VERSION:
				setIpVersion((BigInteger)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__KEYPAIR_NAME:
				setKeypairName((String)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__PRIVATE_KEY_FILE:
				setPrivateKeyFile((String)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__SSH_PORT:
				setSshPort((BigInteger)newValue);
				return;
			case DockerPackage.MACHINEOPENSTACK__SSH_USER:
				setSshUser((String)newValue);
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
			case DockerPackage.MACHINEOPENSTACK__FLAVOR_ID:
				setFlavorId(FLAVOR_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__FLAVOR_NAME:
				setFlavorName(FLAVOR_NAME_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__IMAGE_ID:
				setImageId(IMAGE_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__IMAGE_NAME:
				setImageName(IMAGE_NAME_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__AUTH_URL:
				setAuthUrl(AUTH_URL_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__TENANT_NAME:
				setTenantName(TENANT_NAME_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__TENANT_ID:
				setTenantId(TENANT_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__ENDPOINT_TYPE:
				setEndpointType(ENDPOINT_TYPE_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__NET_ID:
				setNetId(NET_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__NET_NAME:
				setNetName(NET_NAME_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__SEC_GROUPS:
				setSecGroups(SEC_GROUPS_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__FLOATING_IP_POOL:
				setFloatingIpPool(FLOATING_IP_POOL_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__ACTIVE_TIME_OUT:
				setActiveTimeOut(ACTIVE_TIME_OUT_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__AVAILABILITY_ZONE:
				setAvailabilityZone(AVAILABILITY_ZONE_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__DOMAIN_ID:
				setDomainId(DOMAIN_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__DOMAIN_NAME:
				setDomainName(DOMAIN_NAME_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__INSECURE:
				setInsecure(INSECURE_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__IP_VERSION:
				setIpVersion(IP_VERSION_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__KEYPAIR_NAME:
				setKeypairName(KEYPAIR_NAME_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__PRIVATE_KEY_FILE:
				setPrivateKeyFile(PRIVATE_KEY_FILE_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__SSH_PORT:
				setSshPort(SSH_PORT_EDEFAULT);
				return;
			case DockerPackage.MACHINEOPENSTACK__SSH_USER:
				setSshUser(SSH_USER_EDEFAULT);
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
			case DockerPackage.MACHINEOPENSTACK__FLAVOR_ID:
				return FLAVOR_ID_EDEFAULT == null ? flavorId != null : !FLAVOR_ID_EDEFAULT.equals(flavorId);
			case DockerPackage.MACHINEOPENSTACK__FLAVOR_NAME:
				return FLAVOR_NAME_EDEFAULT == null ? flavorName != null : !FLAVOR_NAME_EDEFAULT.equals(flavorName);
			case DockerPackage.MACHINEOPENSTACK__IMAGE_ID:
				return IMAGE_ID_EDEFAULT == null ? imageId != null : !IMAGE_ID_EDEFAULT.equals(imageId);
			case DockerPackage.MACHINEOPENSTACK__IMAGE_NAME:
				return IMAGE_NAME_EDEFAULT == null ? imageName != null : !IMAGE_NAME_EDEFAULT.equals(imageName);
			case DockerPackage.MACHINEOPENSTACK__AUTH_URL:
				return AUTH_URL_EDEFAULT == null ? authUrl != null : !AUTH_URL_EDEFAULT.equals(authUrl);
			case DockerPackage.MACHINEOPENSTACK__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case DockerPackage.MACHINEOPENSTACK__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case DockerPackage.MACHINEOPENSTACK__TENANT_NAME:
				return TENANT_NAME_EDEFAULT == null ? tenantName != null : !TENANT_NAME_EDEFAULT.equals(tenantName);
			case DockerPackage.MACHINEOPENSTACK__TENANT_ID:
				return TENANT_ID_EDEFAULT == null ? tenantId != null : !TENANT_ID_EDEFAULT.equals(tenantId);
			case DockerPackage.MACHINEOPENSTACK__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case DockerPackage.MACHINEOPENSTACK__ENDPOINT_TYPE:
				return ENDPOINT_TYPE_EDEFAULT == null ? endpointType != null : !ENDPOINT_TYPE_EDEFAULT.equals(endpointType);
			case DockerPackage.MACHINEOPENSTACK__NET_ID:
				return NET_ID_EDEFAULT == null ? netId != null : !NET_ID_EDEFAULT.equals(netId);
			case DockerPackage.MACHINEOPENSTACK__NET_NAME:
				return NET_NAME_EDEFAULT == null ? netName != null : !NET_NAME_EDEFAULT.equals(netName);
			case DockerPackage.MACHINEOPENSTACK__SEC_GROUPS:
				return SEC_GROUPS_EDEFAULT == null ? secGroups != null : !SEC_GROUPS_EDEFAULT.equals(secGroups);
			case DockerPackage.MACHINEOPENSTACK__FLOATING_IP_POOL:
				return FLOATING_IP_POOL_EDEFAULT == null ? floatingIpPool != null : !FLOATING_IP_POOL_EDEFAULT.equals(floatingIpPool);
			case DockerPackage.MACHINEOPENSTACK__ACTIVE_TIME_OUT:
				return ACTIVE_TIME_OUT_EDEFAULT == null ? activeTimeOut != null : !ACTIVE_TIME_OUT_EDEFAULT.equals(activeTimeOut);
			case DockerPackage.MACHINEOPENSTACK__AVAILABILITY_ZONE:
				return AVAILABILITY_ZONE_EDEFAULT == null ? availabilityZone != null : !AVAILABILITY_ZONE_EDEFAULT.equals(availabilityZone);
			case DockerPackage.MACHINEOPENSTACK__DOMAIN_ID:
				return DOMAIN_ID_EDEFAULT == null ? domainId != null : !DOMAIN_ID_EDEFAULT.equals(domainId);
			case DockerPackage.MACHINEOPENSTACK__DOMAIN_NAME:
				return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
			case DockerPackage.MACHINEOPENSTACK__INSECURE:
				return insecure != INSECURE_EDEFAULT;
			case DockerPackage.MACHINEOPENSTACK__IP_VERSION:
				return IP_VERSION_EDEFAULT == null ? ipVersion != null : !IP_VERSION_EDEFAULT.equals(ipVersion);
			case DockerPackage.MACHINEOPENSTACK__KEYPAIR_NAME:
				return KEYPAIR_NAME_EDEFAULT == null ? keypairName != null : !KEYPAIR_NAME_EDEFAULT.equals(keypairName);
			case DockerPackage.MACHINEOPENSTACK__PRIVATE_KEY_FILE:
				return PRIVATE_KEY_FILE_EDEFAULT == null ? privateKeyFile != null : !PRIVATE_KEY_FILE_EDEFAULT.equals(privateKeyFile);
			case DockerPackage.MACHINEOPENSTACK__SSH_PORT:
				return SSH_PORT_EDEFAULT == null ? sshPort != null : !SSH_PORT_EDEFAULT.equals(sshPort);
			case DockerPackage.MACHINEOPENSTACK__SSH_USER:
				return SSH_USER_EDEFAULT == null ? sshUser != null : !SSH_USER_EDEFAULT.equals(sshUser);
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
		result.append(" (flavorId: ");
		result.append(flavorId);
		result.append(", flavorName: ");
		result.append(flavorName);
		result.append(", imageId: ");
		result.append(imageId);
		result.append(", imageName: ");
		result.append(imageName);
		result.append(", authUrl: ");
		result.append(authUrl);
		result.append(", username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", tenantName: ");
		result.append(tenantName);
		result.append(", tenantId: ");
		result.append(tenantId);
		result.append(", region: ");
		result.append(region);
		result.append(", endpointType: ");
		result.append(endpointType);
		result.append(", netId: ");
		result.append(netId);
		result.append(", netName: ");
		result.append(netName);
		result.append(", secGroups: ");
		result.append(secGroups);
		result.append(", floatingIpPool: ");
		result.append(floatingIpPool);
		result.append(", activeTimeOut: ");
		result.append(activeTimeOut);
		result.append(", availabilityZone: ");
		result.append(availabilityZone);
		result.append(", domainId: ");
		result.append(domainId);
		result.append(", domainName: ");
		result.append(domainName);
		result.append(", insecure: ");
		result.append(insecure);
		result.append(", ipVersion: ");
		result.append(ipVersion);
		result.append(", keypairName: ");
		result.append(keypairName);
		result.append(", privateKeyFile: ");
		result.append(privateKeyFile);
		result.append(", sshPort: ");
		result.append(sshPort);
		result.append(", sshUser: ");
		result.append(sshUser);
		result.append(')');
		return result.toString();
	}

} //MachineopenstackImpl
