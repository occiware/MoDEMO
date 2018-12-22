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

import org.eclipse.cmf.occi.docker.DockerPackage;
import org.eclipse.cmf.occi.docker.Machinegrid5000;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machinegrid5000</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.Machinegrid5000Impl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.Machinegrid5000Impl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.Machinegrid5000Impl#getSite <em>Site</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.Machinegrid5000Impl#getWalltime <em>Walltime</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.Machinegrid5000Impl#getSshPrivateKey <em>Ssh Private Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.Machinegrid5000Impl#getSshPublicKey <em>Ssh Public Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.Machinegrid5000Impl#getImage <em>Image</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.Machinegrid5000Impl#getResourceProperties <em>Resource Properties</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.Machinegrid5000Impl#getUseJobReservation <em>Use Job Reservation</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.Machinegrid5000Impl#getHostToProvision <em>Host To Provision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machinegrid5000Impl extends MachineImpl implements Machinegrid5000 {
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
	 * The default value of the '{@link #getSite() <em>Site</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSite() <em>Site</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected String site = SITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWalltime() <em>Walltime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWalltime()
	 * @generated
	 * @ordered
	 */
	protected static final String WALLTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWalltime() <em>Walltime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWalltime()
	 * @generated
	 * @ordered
	 */
	protected String walltime = WALLTIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSshPrivateKey() <em>Ssh Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshPrivateKey()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_PRIVATE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSshPrivateKey() <em>Ssh Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshPrivateKey()
	 * @generated
	 * @ordered
	 */
	protected String sshPrivateKey = SSH_PRIVATE_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSshPublicKey() <em>Ssh Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshPublicKey()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_PUBLIC_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSshPublicKey() <em>Ssh Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshPublicKey()
	 * @generated
	 * @ordered
	 */
	protected String sshPublicKey = SSH_PUBLIC_KEY_EDEFAULT;

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
	 * The default value of the '{@link #getResourceProperties() <em>Resource Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceProperties()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceProperties() <em>Resource Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceProperties()
	 * @generated
	 * @ordered
	 */
	protected String resourceProperties = RESOURCE_PROPERTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseJobReservation() <em>Use Job Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseJobReservation()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_JOB_RESERVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseJobReservation() <em>Use Job Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseJobReservation()
	 * @generated
	 * @ordered
	 */
	protected String useJobReservation = USE_JOB_RESERVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostToProvision() <em>Host To Provision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostToProvision()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_TO_PROVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostToProvision() <em>Host To Provision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostToProvision()
	 * @generated
	 * @ordered
	 */
	protected String hostToProvision = HOST_TO_PROVISION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machinegrid5000Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINEGRID5000;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEGRID5000__USERNAME, oldUsername, username));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEGRID5000__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSite() {
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSite(String newSite) {
		String oldSite = site;
		site = newSite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEGRID5000__SITE, oldSite, site));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWalltime() {
		return walltime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWalltime(String newWalltime) {
		String oldWalltime = walltime;
		walltime = newWalltime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEGRID5000__WALLTIME, oldWalltime, walltime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSshPrivateKey() {
		return sshPrivateKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSshPrivateKey(String newSshPrivateKey) {
		String oldSshPrivateKey = sshPrivateKey;
		sshPrivateKey = newSshPrivateKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEGRID5000__SSH_PRIVATE_KEY, oldSshPrivateKey, sshPrivateKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSshPublicKey() {
		return sshPublicKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSshPublicKey(String newSshPublicKey) {
		String oldSshPublicKey = sshPublicKey;
		sshPublicKey = newSshPublicKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEGRID5000__SSH_PUBLIC_KEY, oldSshPublicKey, sshPublicKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEGRID5000__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceProperties() {
		return resourceProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceProperties(String newResourceProperties) {
		String oldResourceProperties = resourceProperties;
		resourceProperties = newResourceProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEGRID5000__RESOURCE_PROPERTIES, oldResourceProperties, resourceProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseJobReservation() {
		return useJobReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseJobReservation(String newUseJobReservation) {
		String oldUseJobReservation = useJobReservation;
		useJobReservation = newUseJobReservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEGRID5000__USE_JOB_RESERVATION, oldUseJobReservation, useJobReservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostToProvision() {
		return hostToProvision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostToProvision(String newHostToProvision) {
		String oldHostToProvision = hostToProvision;
		hostToProvision = newHostToProvision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEGRID5000__HOST_TO_PROVISION, oldHostToProvision, hostToProvision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINEGRID5000__USERNAME:
				return getUsername();
			case DockerPackage.MACHINEGRID5000__PASSWORD:
				return getPassword();
			case DockerPackage.MACHINEGRID5000__SITE:
				return getSite();
			case DockerPackage.MACHINEGRID5000__WALLTIME:
				return getWalltime();
			case DockerPackage.MACHINEGRID5000__SSH_PRIVATE_KEY:
				return getSshPrivateKey();
			case DockerPackage.MACHINEGRID5000__SSH_PUBLIC_KEY:
				return getSshPublicKey();
			case DockerPackage.MACHINEGRID5000__IMAGE:
				return getImage();
			case DockerPackage.MACHINEGRID5000__RESOURCE_PROPERTIES:
				return getResourceProperties();
			case DockerPackage.MACHINEGRID5000__USE_JOB_RESERVATION:
				return getUseJobReservation();
			case DockerPackage.MACHINEGRID5000__HOST_TO_PROVISION:
				return getHostToProvision();
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
			case DockerPackage.MACHINEGRID5000__USERNAME:
				setUsername((String)newValue);
				return;
			case DockerPackage.MACHINEGRID5000__PASSWORD:
				setPassword((String)newValue);
				return;
			case DockerPackage.MACHINEGRID5000__SITE:
				setSite((String)newValue);
				return;
			case DockerPackage.MACHINEGRID5000__WALLTIME:
				setWalltime((String)newValue);
				return;
			case DockerPackage.MACHINEGRID5000__SSH_PRIVATE_KEY:
				setSshPrivateKey((String)newValue);
				return;
			case DockerPackage.MACHINEGRID5000__SSH_PUBLIC_KEY:
				setSshPublicKey((String)newValue);
				return;
			case DockerPackage.MACHINEGRID5000__IMAGE:
				setImage((String)newValue);
				return;
			case DockerPackage.MACHINEGRID5000__RESOURCE_PROPERTIES:
				setResourceProperties((String)newValue);
				return;
			case DockerPackage.MACHINEGRID5000__USE_JOB_RESERVATION:
				setUseJobReservation((String)newValue);
				return;
			case DockerPackage.MACHINEGRID5000__HOST_TO_PROVISION:
				setHostToProvision((String)newValue);
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
			case DockerPackage.MACHINEGRID5000__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case DockerPackage.MACHINEGRID5000__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case DockerPackage.MACHINEGRID5000__SITE:
				setSite(SITE_EDEFAULT);
				return;
			case DockerPackage.MACHINEGRID5000__WALLTIME:
				setWalltime(WALLTIME_EDEFAULT);
				return;
			case DockerPackage.MACHINEGRID5000__SSH_PRIVATE_KEY:
				setSshPrivateKey(SSH_PRIVATE_KEY_EDEFAULT);
				return;
			case DockerPackage.MACHINEGRID5000__SSH_PUBLIC_KEY:
				setSshPublicKey(SSH_PUBLIC_KEY_EDEFAULT);
				return;
			case DockerPackage.MACHINEGRID5000__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case DockerPackage.MACHINEGRID5000__RESOURCE_PROPERTIES:
				setResourceProperties(RESOURCE_PROPERTIES_EDEFAULT);
				return;
			case DockerPackage.MACHINEGRID5000__USE_JOB_RESERVATION:
				setUseJobReservation(USE_JOB_RESERVATION_EDEFAULT);
				return;
			case DockerPackage.MACHINEGRID5000__HOST_TO_PROVISION:
				setHostToProvision(HOST_TO_PROVISION_EDEFAULT);
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
			case DockerPackage.MACHINEGRID5000__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case DockerPackage.MACHINEGRID5000__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case DockerPackage.MACHINEGRID5000__SITE:
				return SITE_EDEFAULT == null ? site != null : !SITE_EDEFAULT.equals(site);
			case DockerPackage.MACHINEGRID5000__WALLTIME:
				return WALLTIME_EDEFAULT == null ? walltime != null : !WALLTIME_EDEFAULT.equals(walltime);
			case DockerPackage.MACHINEGRID5000__SSH_PRIVATE_KEY:
				return SSH_PRIVATE_KEY_EDEFAULT == null ? sshPrivateKey != null : !SSH_PRIVATE_KEY_EDEFAULT.equals(sshPrivateKey);
			case DockerPackage.MACHINEGRID5000__SSH_PUBLIC_KEY:
				return SSH_PUBLIC_KEY_EDEFAULT == null ? sshPublicKey != null : !SSH_PUBLIC_KEY_EDEFAULT.equals(sshPublicKey);
			case DockerPackage.MACHINEGRID5000__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case DockerPackage.MACHINEGRID5000__RESOURCE_PROPERTIES:
				return RESOURCE_PROPERTIES_EDEFAULT == null ? resourceProperties != null : !RESOURCE_PROPERTIES_EDEFAULT.equals(resourceProperties);
			case DockerPackage.MACHINEGRID5000__USE_JOB_RESERVATION:
				return USE_JOB_RESERVATION_EDEFAULT == null ? useJobReservation != null : !USE_JOB_RESERVATION_EDEFAULT.equals(useJobReservation);
			case DockerPackage.MACHINEGRID5000__HOST_TO_PROVISION:
				return HOST_TO_PROVISION_EDEFAULT == null ? hostToProvision != null : !HOST_TO_PROVISION_EDEFAULT.equals(hostToProvision);
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
		result.append(", site: ");
		result.append(site);
		result.append(", walltime: ");
		result.append(walltime);
		result.append(", sshPrivateKey: ");
		result.append(sshPrivateKey);
		result.append(", sshPublicKey: ");
		result.append(sshPublicKey);
		result.append(", image: ");
		result.append(image);
		result.append(", resourceProperties: ");
		result.append(resourceProperties);
		result.append(", useJobReservation: ");
		result.append(useJobReservation);
		result.append(", hostToProvision: ");
		result.append(hostToProvision);
		result.append(')');
		return result.toString();
	}

} //Machinegrid5000Impl
