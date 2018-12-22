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
import org.eclipse.cmf.occi.docker.Machinerackspace;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machinerackspace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinerackspaceImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinerackspaceImpl#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinerackspaceImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinerackspaceImpl#getEndPointType <em>End Point Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinerackspaceImpl#getImageId <em>Image Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinerackspaceImpl#getFlavorId <em>Flavor Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinerackspaceImpl#getSshUser <em>Ssh User</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinerackspaceImpl#getSshPort <em>Ssh Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinerackspaceImpl#isDockerInstall <em>Docker Install</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachinerackspaceImpl extends MachineImpl implements Machinerackspace {
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
	 * The default value of the '{@link #getEndPointType() <em>End Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointType()
	 * @generated
	 * @ordered
	 */
	protected static final String END_POINT_TYPE_EDEFAULT = "publicURL";

	/**
	 * The cached value of the '{@link #getEndPointType() <em>End Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointType()
	 * @generated
	 * @ordered
	 */
	protected String endPointType = END_POINT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageId() <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageId()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_ID_EDEFAULT = "59a3fadd-93e7-4674-886a-64883e17115f";

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
	 * The default value of the '{@link #getFlavorId() <em>Flavor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavorId()
	 * @generated
	 * @ordered
	 */
	protected static final String FLAVOR_ID_EDEFAULT = "general1-1";

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
	 * The default value of the '{@link #isDockerInstall() <em>Docker Install</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDockerInstall()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DOCKER_INSTALL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDockerInstall() <em>Docker Install</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDockerInstall()
	 * @generated
	 * @ordered
	 */
	protected boolean dockerInstall = DOCKER_INSTALL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachinerackspaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINERACKSPACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINERACKSPACE__USERNAME, oldUsername, username));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINERACKSPACE__API_KEY, oldApiKey, apiKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINERACKSPACE__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndPointType() {
		return endPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPointType(String newEndPointType) {
		String oldEndPointType = endPointType;
		endPointType = newEndPointType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINERACKSPACE__END_POINT_TYPE, oldEndPointType, endPointType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINERACKSPACE__IMAGE_ID, oldImageId, imageId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINERACKSPACE__FLAVOR_ID, oldFlavorId, flavorId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINERACKSPACE__SSH_USER, oldSshUser, sshUser));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINERACKSPACE__SSH_PORT, oldSshPort, sshPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDockerInstall() {
		return dockerInstall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDockerInstall(boolean newDockerInstall) {
		boolean oldDockerInstall = dockerInstall;
		dockerInstall = newDockerInstall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINERACKSPACE__DOCKER_INSTALL, oldDockerInstall, dockerInstall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINERACKSPACE__USERNAME:
				return getUsername();
			case DockerPackage.MACHINERACKSPACE__API_KEY:
				return getApiKey();
			case DockerPackage.MACHINERACKSPACE__REGION:
				return getRegion();
			case DockerPackage.MACHINERACKSPACE__END_POINT_TYPE:
				return getEndPointType();
			case DockerPackage.MACHINERACKSPACE__IMAGE_ID:
				return getImageId();
			case DockerPackage.MACHINERACKSPACE__FLAVOR_ID:
				return getFlavorId();
			case DockerPackage.MACHINERACKSPACE__SSH_USER:
				return getSshUser();
			case DockerPackage.MACHINERACKSPACE__SSH_PORT:
				return getSshPort();
			case DockerPackage.MACHINERACKSPACE__DOCKER_INSTALL:
				return isDockerInstall();
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
			case DockerPackage.MACHINERACKSPACE__USERNAME:
				setUsername((String)newValue);
				return;
			case DockerPackage.MACHINERACKSPACE__API_KEY:
				setApiKey((String)newValue);
				return;
			case DockerPackage.MACHINERACKSPACE__REGION:
				setRegion((String)newValue);
				return;
			case DockerPackage.MACHINERACKSPACE__END_POINT_TYPE:
				setEndPointType((String)newValue);
				return;
			case DockerPackage.MACHINERACKSPACE__IMAGE_ID:
				setImageId((String)newValue);
				return;
			case DockerPackage.MACHINERACKSPACE__FLAVOR_ID:
				setFlavorId((String)newValue);
				return;
			case DockerPackage.MACHINERACKSPACE__SSH_USER:
				setSshUser((String)newValue);
				return;
			case DockerPackage.MACHINERACKSPACE__SSH_PORT:
				setSshPort((BigInteger)newValue);
				return;
			case DockerPackage.MACHINERACKSPACE__DOCKER_INSTALL:
				setDockerInstall((Boolean)newValue);
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
			case DockerPackage.MACHINERACKSPACE__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case DockerPackage.MACHINERACKSPACE__API_KEY:
				setApiKey(API_KEY_EDEFAULT);
				return;
			case DockerPackage.MACHINERACKSPACE__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case DockerPackage.MACHINERACKSPACE__END_POINT_TYPE:
				setEndPointType(END_POINT_TYPE_EDEFAULT);
				return;
			case DockerPackage.MACHINERACKSPACE__IMAGE_ID:
				setImageId(IMAGE_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINERACKSPACE__FLAVOR_ID:
				setFlavorId(FLAVOR_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINERACKSPACE__SSH_USER:
				setSshUser(SSH_USER_EDEFAULT);
				return;
			case DockerPackage.MACHINERACKSPACE__SSH_PORT:
				setSshPort(SSH_PORT_EDEFAULT);
				return;
			case DockerPackage.MACHINERACKSPACE__DOCKER_INSTALL:
				setDockerInstall(DOCKER_INSTALL_EDEFAULT);
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
			case DockerPackage.MACHINERACKSPACE__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case DockerPackage.MACHINERACKSPACE__API_KEY:
				return API_KEY_EDEFAULT == null ? apiKey != null : !API_KEY_EDEFAULT.equals(apiKey);
			case DockerPackage.MACHINERACKSPACE__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case DockerPackage.MACHINERACKSPACE__END_POINT_TYPE:
				return END_POINT_TYPE_EDEFAULT == null ? endPointType != null : !END_POINT_TYPE_EDEFAULT.equals(endPointType);
			case DockerPackage.MACHINERACKSPACE__IMAGE_ID:
				return IMAGE_ID_EDEFAULT == null ? imageId != null : !IMAGE_ID_EDEFAULT.equals(imageId);
			case DockerPackage.MACHINERACKSPACE__FLAVOR_ID:
				return FLAVOR_ID_EDEFAULT == null ? flavorId != null : !FLAVOR_ID_EDEFAULT.equals(flavorId);
			case DockerPackage.MACHINERACKSPACE__SSH_USER:
				return SSH_USER_EDEFAULT == null ? sshUser != null : !SSH_USER_EDEFAULT.equals(sshUser);
			case DockerPackage.MACHINERACKSPACE__SSH_PORT:
				return SSH_PORT_EDEFAULT == null ? sshPort != null : !SSH_PORT_EDEFAULT.equals(sshPort);
			case DockerPackage.MACHINERACKSPACE__DOCKER_INSTALL:
				return dockerInstall != DOCKER_INSTALL_EDEFAULT;
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
		result.append(", apiKey: ");
		result.append(apiKey);
		result.append(", region: ");
		result.append(region);
		result.append(", endPointType: ");
		result.append(endPointType);
		result.append(", imageId: ");
		result.append(imageId);
		result.append(", flavorId: ");
		result.append(flavorId);
		result.append(", sshUser: ");
		result.append(sshUser);
		result.append(", sshPort: ");
		result.append(sshPort);
		result.append(", dockerInstall: ");
		result.append(dockerInstall);
		result.append(')');
		return result.toString();
	}

} //MachinerackspaceImpl
