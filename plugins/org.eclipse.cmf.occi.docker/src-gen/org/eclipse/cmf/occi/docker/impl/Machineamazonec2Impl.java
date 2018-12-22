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
import org.eclipse.cmf.occi.docker.Machineamazonec2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machineamazonec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.Machineamazonec2Impl#getAccessKey <em>Access Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.Machineamazonec2Impl#getAmi <em>Ami</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.Machineamazonec2Impl#getInstanceType <em>Instance Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.Machineamazonec2Impl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.Machineamazonec2Impl#getRootSize <em>Root Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.Machineamazonec2Impl#getSecretKey <em>Secret Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.Machineamazonec2Impl#getSecurityGroup <em>Security Group</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.Machineamazonec2Impl#getSessionToken <em>Session Token</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.Machineamazonec2Impl#getSubnetId <em>Subnet Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.Machineamazonec2Impl#getVpcId <em>Vpc Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.Machineamazonec2Impl#getZone <em>Zone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machineamazonec2Impl extends MachineImpl implements Machineamazonec2 {
	/**
	 * The default value of the '{@link #getAccessKey() <em>Access Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessKey()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessKey() <em>Access Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessKey()
	 * @generated
	 * @ordered
	 */
	protected String accessKey = ACCESS_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmi() <em>Ami</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmi()
	 * @generated
	 * @ordered
	 */
	protected static final String AMI_EDEFAULT = "ami-4ae27e22";

	/**
	 * The cached value of the '{@link #getAmi() <em>Ami</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmi()
	 * @generated
	 * @ordered
	 */
	protected String ami = AMI_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceType() <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceType()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_TYPE_EDEFAULT = "t2.micro";

	/**
	 * The cached value of the '{@link #getInstanceType() <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceType()
	 * @generated
	 * @ordered
	 */
	protected String instanceType = INSTANCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = "us-east-1";

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
	 * The default value of the '{@link #getRootSize() <em>Root Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ROOT_SIZE_EDEFAULT = new BigInteger("16");

	/**
	 * The cached value of the '{@link #getRootSize() <em>Root Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootSize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger rootSize = ROOT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecretKey() <em>Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretKey()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRET_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecretKey() <em>Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretKey()
	 * @generated
	 * @ordered
	 */
	protected String secretKey = SECRET_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityGroup() <em>Security Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_GROUP_EDEFAULT = "docker-machine";

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
	 * The default value of the '{@link #getSessionToken() <em>Session Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionToken()
	 * @generated
	 * @ordered
	 */
	protected static final String SESSION_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionToken() <em>Session Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionToken()
	 * @generated
	 * @ordered
	 */
	protected String sessionToken = SESSION_TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetId() <em>Subnet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetId() <em>Subnet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetId()
	 * @generated
	 * @ordered
	 */
	protected String subnetId = SUBNET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcId() <em>Vpc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcId()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcId() <em>Vpc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcId()
	 * @generated
	 * @ordered
	 */
	protected String vpcId = VPC_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getZone() <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected static final String ZONE_EDEFAULT = "a";

	/**
	 * The cached value of the '{@link #getZone() <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected String zone = ZONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machineamazonec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINEAMAZONEC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessKey() {
		return accessKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessKey(String newAccessKey) {
		String oldAccessKey = accessKey;
		accessKey = newAccessKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEAMAZONEC2__ACCESS_KEY, oldAccessKey, accessKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAmi() {
		return ami;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmi(String newAmi) {
		String oldAmi = ami;
		ami = newAmi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEAMAZONEC2__AMI, oldAmi, ami));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceType() {
		return instanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceType(String newInstanceType) {
		String oldInstanceType = instanceType;
		instanceType = newInstanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEAMAZONEC2__INSTANCE_TYPE, oldInstanceType, instanceType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEAMAZONEC2__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRootSize() {
		return rootSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootSize(BigInteger newRootSize) {
		BigInteger oldRootSize = rootSize;
		rootSize = newRootSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEAMAZONEC2__ROOT_SIZE, oldRootSize, rootSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecretKey() {
		return secretKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecretKey(String newSecretKey) {
		String oldSecretKey = secretKey;
		secretKey = newSecretKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEAMAZONEC2__SECRET_KEY, oldSecretKey, secretKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEAMAZONEC2__SECURITY_GROUP, oldSecurityGroup, securityGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSessionToken() {
		return sessionToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionToken(String newSessionToken) {
		String oldSessionToken = sessionToken;
		sessionToken = newSessionToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEAMAZONEC2__SESSION_TOKEN, oldSessionToken, sessionToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubnetId() {
		return subnetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubnetId(String newSubnetId) {
		String oldSubnetId = subnetId;
		subnetId = newSubnetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEAMAZONEC2__SUBNET_ID, oldSubnetId, subnetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVpcId() {
		return vpcId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVpcId(String newVpcId) {
		String oldVpcId = vpcId;
		vpcId = newVpcId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEAMAZONEC2__VPC_ID, oldVpcId, vpcId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZone() {
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZone(String newZone) {
		String oldZone = zone;
		zone = newZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEAMAZONEC2__ZONE, oldZone, zone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINEAMAZONEC2__ACCESS_KEY:
				return getAccessKey();
			case DockerPackage.MACHINEAMAZONEC2__AMI:
				return getAmi();
			case DockerPackage.MACHINEAMAZONEC2__INSTANCE_TYPE:
				return getInstanceType();
			case DockerPackage.MACHINEAMAZONEC2__REGION:
				return getRegion();
			case DockerPackage.MACHINEAMAZONEC2__ROOT_SIZE:
				return getRootSize();
			case DockerPackage.MACHINEAMAZONEC2__SECRET_KEY:
				return getSecretKey();
			case DockerPackage.MACHINEAMAZONEC2__SECURITY_GROUP:
				return getSecurityGroup();
			case DockerPackage.MACHINEAMAZONEC2__SESSION_TOKEN:
				return getSessionToken();
			case DockerPackage.MACHINEAMAZONEC2__SUBNET_ID:
				return getSubnetId();
			case DockerPackage.MACHINEAMAZONEC2__VPC_ID:
				return getVpcId();
			case DockerPackage.MACHINEAMAZONEC2__ZONE:
				return getZone();
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
			case DockerPackage.MACHINEAMAZONEC2__ACCESS_KEY:
				setAccessKey((String)newValue);
				return;
			case DockerPackage.MACHINEAMAZONEC2__AMI:
				setAmi((String)newValue);
				return;
			case DockerPackage.MACHINEAMAZONEC2__INSTANCE_TYPE:
				setInstanceType((String)newValue);
				return;
			case DockerPackage.MACHINEAMAZONEC2__REGION:
				setRegion((String)newValue);
				return;
			case DockerPackage.MACHINEAMAZONEC2__ROOT_SIZE:
				setRootSize((BigInteger)newValue);
				return;
			case DockerPackage.MACHINEAMAZONEC2__SECRET_KEY:
				setSecretKey((String)newValue);
				return;
			case DockerPackage.MACHINEAMAZONEC2__SECURITY_GROUP:
				setSecurityGroup((String)newValue);
				return;
			case DockerPackage.MACHINEAMAZONEC2__SESSION_TOKEN:
				setSessionToken((String)newValue);
				return;
			case DockerPackage.MACHINEAMAZONEC2__SUBNET_ID:
				setSubnetId((String)newValue);
				return;
			case DockerPackage.MACHINEAMAZONEC2__VPC_ID:
				setVpcId((String)newValue);
				return;
			case DockerPackage.MACHINEAMAZONEC2__ZONE:
				setZone((String)newValue);
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
			case DockerPackage.MACHINEAMAZONEC2__ACCESS_KEY:
				setAccessKey(ACCESS_KEY_EDEFAULT);
				return;
			case DockerPackage.MACHINEAMAZONEC2__AMI:
				setAmi(AMI_EDEFAULT);
				return;
			case DockerPackage.MACHINEAMAZONEC2__INSTANCE_TYPE:
				setInstanceType(INSTANCE_TYPE_EDEFAULT);
				return;
			case DockerPackage.MACHINEAMAZONEC2__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case DockerPackage.MACHINEAMAZONEC2__ROOT_SIZE:
				setRootSize(ROOT_SIZE_EDEFAULT);
				return;
			case DockerPackage.MACHINEAMAZONEC2__SECRET_KEY:
				setSecretKey(SECRET_KEY_EDEFAULT);
				return;
			case DockerPackage.MACHINEAMAZONEC2__SECURITY_GROUP:
				setSecurityGroup(SECURITY_GROUP_EDEFAULT);
				return;
			case DockerPackage.MACHINEAMAZONEC2__SESSION_TOKEN:
				setSessionToken(SESSION_TOKEN_EDEFAULT);
				return;
			case DockerPackage.MACHINEAMAZONEC2__SUBNET_ID:
				setSubnetId(SUBNET_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINEAMAZONEC2__VPC_ID:
				setVpcId(VPC_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINEAMAZONEC2__ZONE:
				setZone(ZONE_EDEFAULT);
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
			case DockerPackage.MACHINEAMAZONEC2__ACCESS_KEY:
				return ACCESS_KEY_EDEFAULT == null ? accessKey != null : !ACCESS_KEY_EDEFAULT.equals(accessKey);
			case DockerPackage.MACHINEAMAZONEC2__AMI:
				return AMI_EDEFAULT == null ? ami != null : !AMI_EDEFAULT.equals(ami);
			case DockerPackage.MACHINEAMAZONEC2__INSTANCE_TYPE:
				return INSTANCE_TYPE_EDEFAULT == null ? instanceType != null : !INSTANCE_TYPE_EDEFAULT.equals(instanceType);
			case DockerPackage.MACHINEAMAZONEC2__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case DockerPackage.MACHINEAMAZONEC2__ROOT_SIZE:
				return ROOT_SIZE_EDEFAULT == null ? rootSize != null : !ROOT_SIZE_EDEFAULT.equals(rootSize);
			case DockerPackage.MACHINEAMAZONEC2__SECRET_KEY:
				return SECRET_KEY_EDEFAULT == null ? secretKey != null : !SECRET_KEY_EDEFAULT.equals(secretKey);
			case DockerPackage.MACHINEAMAZONEC2__SECURITY_GROUP:
				return SECURITY_GROUP_EDEFAULT == null ? securityGroup != null : !SECURITY_GROUP_EDEFAULT.equals(securityGroup);
			case DockerPackage.MACHINEAMAZONEC2__SESSION_TOKEN:
				return SESSION_TOKEN_EDEFAULT == null ? sessionToken != null : !SESSION_TOKEN_EDEFAULT.equals(sessionToken);
			case DockerPackage.MACHINEAMAZONEC2__SUBNET_ID:
				return SUBNET_ID_EDEFAULT == null ? subnetId != null : !SUBNET_ID_EDEFAULT.equals(subnetId);
			case DockerPackage.MACHINEAMAZONEC2__VPC_ID:
				return VPC_ID_EDEFAULT == null ? vpcId != null : !VPC_ID_EDEFAULT.equals(vpcId);
			case DockerPackage.MACHINEAMAZONEC2__ZONE:
				return ZONE_EDEFAULT == null ? zone != null : !ZONE_EDEFAULT.equals(zone);
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
		result.append(" (accessKey: ");
		result.append(accessKey);
		result.append(", ami: ");
		result.append(ami);
		result.append(", instanceType: ");
		result.append(instanceType);
		result.append(", region: ");
		result.append(region);
		result.append(", rootSize: ");
		result.append(rootSize);
		result.append(", secretKey: ");
		result.append(secretKey);
		result.append(", securityGroup: ");
		result.append(securityGroup);
		result.append(", sessionToken: ");
		result.append(sessionToken);
		result.append(", subnetId: ");
		result.append(subnetId);
		result.append(", vpcId: ");
		result.append(vpcId);
		result.append(", zone: ");
		result.append(zone);
		result.append(')');
		return result.toString();
	}

} //Machineamazonec2Impl
