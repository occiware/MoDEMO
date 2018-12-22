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
import org.eclipse.cmf.occi.docker.Machineexoscale;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machineexoscale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineexoscaleImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineexoscaleImpl#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineexoscaleImpl#getApiSecretKey <em>Api Secret Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineexoscaleImpl#getInstanceProfile <em>Instance Profile</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineexoscaleImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineexoscaleImpl#getSecurityGroup <em>Security Group</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineexoscaleImpl#getAvailabilityZone <em>Availability Zone</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineexoscaleImpl#getSshUser <em>Ssh User</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineexoscaleImpl#getUserData <em>User Data</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineexoscaleImpl#getAffinityGroup <em>Affinity Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachineexoscaleImpl extends MachineImpl implements Machineexoscale {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = "https://api.exoscale.ch/compute";

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

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
	 * The default value of the '{@link #getApiSecretKey() <em>Api Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiSecretKey()
	 * @generated
	 * @ordered
	 */
	protected static final String API_SECRET_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiSecretKey() <em>Api Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiSecretKey()
	 * @generated
	 * @ordered
	 */
	protected String apiSecretKey = API_SECRET_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceProfile() <em>Instance Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceProfile()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_PROFILE_EDEFAULT = "small";

	/**
	 * The cached value of the '{@link #getInstanceProfile() <em>Instance Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceProfile()
	 * @generated
	 * @ordered
	 */
	protected String instanceProfile = INSTANCE_PROFILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = "ubuntu-16.04";

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
	 * The default value of the '{@link #getSecurityGroup() <em>Security Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityGroup() <em>Security Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroup()
	 * @generated
	 * @ordered
	 */
	protected String securityGroup = SECURITY_GROUP_EDEFAULT;

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
	 * The default value of the '{@link #getSshUser() <em>Ssh User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshUser()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_USER_EDEFAULT = "ubuntu";

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
	 * The default value of the '{@link #getUserData() <em>User Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserData()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserData() <em>User Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserData()
	 * @generated
	 * @ordered
	 */
	protected String userData = USER_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getAffinityGroup() <em>Affinity Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffinityGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String AFFINITY_GROUP_EDEFAULT = "docker-machine";

	/**
	 * The cached value of the '{@link #getAffinityGroup() <em>Affinity Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffinityGroup()
	 * @generated
	 * @ordered
	 */
	protected String affinityGroup = AFFINITY_GROUP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineexoscaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINEEXOSCALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEEXOSCALE__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEEXOSCALE__API_KEY, oldApiKey, apiKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApiSecretKey() {
		return apiSecretKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiSecretKey(String newApiSecretKey) {
		String oldApiSecretKey = apiSecretKey;
		apiSecretKey = newApiSecretKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEEXOSCALE__API_SECRET_KEY, oldApiSecretKey, apiSecretKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceProfile() {
		return instanceProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceProfile(String newInstanceProfile) {
		String oldInstanceProfile = instanceProfile;
		instanceProfile = newInstanceProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEEXOSCALE__INSTANCE_PROFILE, oldInstanceProfile, instanceProfile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEEXOSCALE__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityGroup() {
		return securityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityGroup(String newSecurityGroup) {
		String oldSecurityGroup = securityGroup;
		securityGroup = newSecurityGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEEXOSCALE__SECURITY_GROUP, oldSecurityGroup, securityGroup));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEEXOSCALE__AVAILABILITY_ZONE, oldAvailabilityZone, availabilityZone));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEEXOSCALE__SSH_USER, oldSshUser, sshUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserData() {
		return userData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserData(String newUserData) {
		String oldUserData = userData;
		userData = newUserData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEEXOSCALE__USER_DATA, oldUserData, userData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAffinityGroup() {
		return affinityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffinityGroup(String newAffinityGroup) {
		String oldAffinityGroup = affinityGroup;
		affinityGroup = newAffinityGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEEXOSCALE__AFFINITY_GROUP, oldAffinityGroup, affinityGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINEEXOSCALE__URL:
				return getUrl();
			case DockerPackage.MACHINEEXOSCALE__API_KEY:
				return getApiKey();
			case DockerPackage.MACHINEEXOSCALE__API_SECRET_KEY:
				return getApiSecretKey();
			case DockerPackage.MACHINEEXOSCALE__INSTANCE_PROFILE:
				return getInstanceProfile();
			case DockerPackage.MACHINEEXOSCALE__IMAGE:
				return getImage();
			case DockerPackage.MACHINEEXOSCALE__SECURITY_GROUP:
				return getSecurityGroup();
			case DockerPackage.MACHINEEXOSCALE__AVAILABILITY_ZONE:
				return getAvailabilityZone();
			case DockerPackage.MACHINEEXOSCALE__SSH_USER:
				return getSshUser();
			case DockerPackage.MACHINEEXOSCALE__USER_DATA:
				return getUserData();
			case DockerPackage.MACHINEEXOSCALE__AFFINITY_GROUP:
				return getAffinityGroup();
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
			case DockerPackage.MACHINEEXOSCALE__URL:
				setUrl((String)newValue);
				return;
			case DockerPackage.MACHINEEXOSCALE__API_KEY:
				setApiKey((String)newValue);
				return;
			case DockerPackage.MACHINEEXOSCALE__API_SECRET_KEY:
				setApiSecretKey((String)newValue);
				return;
			case DockerPackage.MACHINEEXOSCALE__INSTANCE_PROFILE:
				setInstanceProfile((String)newValue);
				return;
			case DockerPackage.MACHINEEXOSCALE__IMAGE:
				setImage((String)newValue);
				return;
			case DockerPackage.MACHINEEXOSCALE__SECURITY_GROUP:
				setSecurityGroup((String)newValue);
				return;
			case DockerPackage.MACHINEEXOSCALE__AVAILABILITY_ZONE:
				setAvailabilityZone((String)newValue);
				return;
			case DockerPackage.MACHINEEXOSCALE__SSH_USER:
				setSshUser((String)newValue);
				return;
			case DockerPackage.MACHINEEXOSCALE__USER_DATA:
				setUserData((String)newValue);
				return;
			case DockerPackage.MACHINEEXOSCALE__AFFINITY_GROUP:
				setAffinityGroup((String)newValue);
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
			case DockerPackage.MACHINEEXOSCALE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case DockerPackage.MACHINEEXOSCALE__API_KEY:
				setApiKey(API_KEY_EDEFAULT);
				return;
			case DockerPackage.MACHINEEXOSCALE__API_SECRET_KEY:
				setApiSecretKey(API_SECRET_KEY_EDEFAULT);
				return;
			case DockerPackage.MACHINEEXOSCALE__INSTANCE_PROFILE:
				setInstanceProfile(INSTANCE_PROFILE_EDEFAULT);
				return;
			case DockerPackage.MACHINEEXOSCALE__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case DockerPackage.MACHINEEXOSCALE__SECURITY_GROUP:
				setSecurityGroup(SECURITY_GROUP_EDEFAULT);
				return;
			case DockerPackage.MACHINEEXOSCALE__AVAILABILITY_ZONE:
				setAvailabilityZone(AVAILABILITY_ZONE_EDEFAULT);
				return;
			case DockerPackage.MACHINEEXOSCALE__SSH_USER:
				setSshUser(SSH_USER_EDEFAULT);
				return;
			case DockerPackage.MACHINEEXOSCALE__USER_DATA:
				setUserData(USER_DATA_EDEFAULT);
				return;
			case DockerPackage.MACHINEEXOSCALE__AFFINITY_GROUP:
				setAffinityGroup(AFFINITY_GROUP_EDEFAULT);
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
			case DockerPackage.MACHINEEXOSCALE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case DockerPackage.MACHINEEXOSCALE__API_KEY:
				return API_KEY_EDEFAULT == null ? apiKey != null : !API_KEY_EDEFAULT.equals(apiKey);
			case DockerPackage.MACHINEEXOSCALE__API_SECRET_KEY:
				return API_SECRET_KEY_EDEFAULT == null ? apiSecretKey != null : !API_SECRET_KEY_EDEFAULT.equals(apiSecretKey);
			case DockerPackage.MACHINEEXOSCALE__INSTANCE_PROFILE:
				return INSTANCE_PROFILE_EDEFAULT == null ? instanceProfile != null : !INSTANCE_PROFILE_EDEFAULT.equals(instanceProfile);
			case DockerPackage.MACHINEEXOSCALE__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case DockerPackage.MACHINEEXOSCALE__SECURITY_GROUP:
				return SECURITY_GROUP_EDEFAULT == null ? securityGroup != null : !SECURITY_GROUP_EDEFAULT.equals(securityGroup);
			case DockerPackage.MACHINEEXOSCALE__AVAILABILITY_ZONE:
				return AVAILABILITY_ZONE_EDEFAULT == null ? availabilityZone != null : !AVAILABILITY_ZONE_EDEFAULT.equals(availabilityZone);
			case DockerPackage.MACHINEEXOSCALE__SSH_USER:
				return SSH_USER_EDEFAULT == null ? sshUser != null : !SSH_USER_EDEFAULT.equals(sshUser);
			case DockerPackage.MACHINEEXOSCALE__USER_DATA:
				return USER_DATA_EDEFAULT == null ? userData != null : !USER_DATA_EDEFAULT.equals(userData);
			case DockerPackage.MACHINEEXOSCALE__AFFINITY_GROUP:
				return AFFINITY_GROUP_EDEFAULT == null ? affinityGroup != null : !AFFINITY_GROUP_EDEFAULT.equals(affinityGroup);
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
		result.append(" (url: ");
		result.append(url);
		result.append(", apiKey: ");
		result.append(apiKey);
		result.append(", apiSecretKey: ");
		result.append(apiSecretKey);
		result.append(", instanceProfile: ");
		result.append(instanceProfile);
		result.append(", image: ");
		result.append(image);
		result.append(", securityGroup: ");
		result.append(securityGroup);
		result.append(", availabilityZone: ");
		result.append(availabilityZone);
		result.append(", sshUser: ");
		result.append(sshUser);
		result.append(", userData: ");
		result.append(userData);
		result.append(", affinityGroup: ");
		result.append(affinityGroup);
		result.append(')');
		return result.toString();
	}

} //MachineexoscaleImpl
