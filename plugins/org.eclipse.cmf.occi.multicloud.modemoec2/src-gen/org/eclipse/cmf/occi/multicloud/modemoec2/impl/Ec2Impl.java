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
package org.eclipse.cmf.occi.multicloud.modemoec2.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl;

import org.eclipse.cmf.occi.multicloud.modemoec2.Ec2;
import org.eclipse.cmf.occi.multicloud.modemoec2.Modemoec2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoec2.impl.Ec2Impl#getAwsEc2instanceKey <em>Aws Ec2instance Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoec2.impl.Ec2Impl#getAwsEc2instancePublicIP <em>Aws Ec2instance Public IP</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoec2.impl.Ec2Impl#getAwsEc2instanceAMI <em>Aws Ec2instance AMI</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoec2.impl.Ec2Impl#getAwsEc2instanceSG <em>Aws Ec2instance SG</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoec2.impl.Ec2Impl#getAwsEc2instanceInstanceType <em>Aws Ec2instance Instance Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoec2.impl.Ec2Impl#getAwsEc2instanceInstanceID <em>Aws Ec2instance Instance ID</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoec2.impl.Ec2Impl#getAwsEc2instacneDnsName <em>Aws Ec2instacne Dns Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoec2.impl.Ec2Impl#getAwsEc2instancePrivateIP <em>Aws Ec2instance Private IP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Ec2Impl extends ComputeImpl implements Ec2 {
	/**
	 * The default value of the '{@link #getAwsEc2instanceKey() <em>Aws Ec2instance Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsEc2instanceKey()
	 * @generated
	 * @ordered
	 */
	protected static final String AWS_EC2INSTANCE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAwsEc2instanceKey() <em>Aws Ec2instance Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsEc2instanceKey()
	 * @generated
	 * @ordered
	 */
	protected String awsEc2instanceKey = AWS_EC2INSTANCE_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAwsEc2instancePublicIP() <em>Aws Ec2instance Public IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsEc2instancePublicIP()
	 * @generated
	 * @ordered
	 */
	protected static final String AWS_EC2INSTANCE_PUBLIC_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAwsEc2instancePublicIP() <em>Aws Ec2instance Public IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsEc2instancePublicIP()
	 * @generated
	 * @ordered
	 */
	protected String awsEc2instancePublicIP = AWS_EC2INSTANCE_PUBLIC_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAwsEc2instanceAMI() <em>Aws Ec2instance AMI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsEc2instanceAMI()
	 * @generated
	 * @ordered
	 */
	protected static final String AWS_EC2INSTANCE_AMI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAwsEc2instanceAMI() <em>Aws Ec2instance AMI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsEc2instanceAMI()
	 * @generated
	 * @ordered
	 */
	protected String awsEc2instanceAMI = AWS_EC2INSTANCE_AMI_EDEFAULT;

	/**
	 * The default value of the '{@link #getAwsEc2instanceSG() <em>Aws Ec2instance SG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsEc2instanceSG()
	 * @generated
	 * @ordered
	 */
	protected static final String AWS_EC2INSTANCE_SG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAwsEc2instanceSG() <em>Aws Ec2instance SG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsEc2instanceSG()
	 * @generated
	 * @ordered
	 */
	protected String awsEc2instanceSG = AWS_EC2INSTANCE_SG_EDEFAULT;

	/**
	 * The default value of the '{@link #getAwsEc2instanceInstanceType() <em>Aws Ec2instance Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsEc2instanceInstanceType()
	 * @generated
	 * @ordered
	 */
	protected static final String AWS_EC2INSTANCE_INSTANCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAwsEc2instanceInstanceType() <em>Aws Ec2instance Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsEc2instanceInstanceType()
	 * @generated
	 * @ordered
	 */
	protected String awsEc2instanceInstanceType = AWS_EC2INSTANCE_INSTANCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAwsEc2instanceInstanceID() <em>Aws Ec2instance Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsEc2instanceInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final String AWS_EC2INSTANCE_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAwsEc2instanceInstanceID() <em>Aws Ec2instance Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsEc2instanceInstanceID()
	 * @generated
	 * @ordered
	 */
	protected String awsEc2instanceInstanceID = AWS_EC2INSTANCE_INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAwsEc2instacneDnsName() <em>Aws Ec2instacne Dns Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsEc2instacneDnsName()
	 * @generated
	 * @ordered
	 */
	protected static final String AWS_EC2INSTACNE_DNS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAwsEc2instacneDnsName() <em>Aws Ec2instacne Dns Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsEc2instacneDnsName()
	 * @generated
	 * @ordered
	 */
	protected String awsEc2instacneDnsName = AWS_EC2INSTACNE_DNS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAwsEc2instancePrivateIP() <em>Aws Ec2instance Private IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsEc2instancePrivateIP()
	 * @generated
	 * @ordered
	 */
	protected static final String AWS_EC2INSTANCE_PRIVATE_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAwsEc2instancePrivateIP() <em>Aws Ec2instance Private IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsEc2instancePrivateIP()
	 * @generated
	 * @ordered
	 */
	protected String awsEc2instancePrivateIP = AWS_EC2INSTANCE_PRIVATE_IP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Modemoec2Package.Literals.EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAwsEc2instanceKey() {
		return awsEc2instanceKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwsEc2instanceKey(String newAwsEc2instanceKey) {
		String oldAwsEc2instanceKey = awsEc2instanceKey;
		awsEc2instanceKey = newAwsEc2instanceKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Modemoec2Package.EC2__AWS_EC2INSTANCE_KEY, oldAwsEc2instanceKey, awsEc2instanceKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAwsEc2instancePublicIP() {
		return awsEc2instancePublicIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwsEc2instancePublicIP(String newAwsEc2instancePublicIP) {
		String oldAwsEc2instancePublicIP = awsEc2instancePublicIP;
		awsEc2instancePublicIP = newAwsEc2instancePublicIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Modemoec2Package.EC2__AWS_EC2INSTANCE_PUBLIC_IP, oldAwsEc2instancePublicIP, awsEc2instancePublicIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAwsEc2instanceAMI() {
		return awsEc2instanceAMI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwsEc2instanceAMI(String newAwsEc2instanceAMI) {
		String oldAwsEc2instanceAMI = awsEc2instanceAMI;
		awsEc2instanceAMI = newAwsEc2instanceAMI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Modemoec2Package.EC2__AWS_EC2INSTANCE_AMI, oldAwsEc2instanceAMI, awsEc2instanceAMI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAwsEc2instanceSG() {
		return awsEc2instanceSG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwsEc2instanceSG(String newAwsEc2instanceSG) {
		String oldAwsEc2instanceSG = awsEc2instanceSG;
		awsEc2instanceSG = newAwsEc2instanceSG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Modemoec2Package.EC2__AWS_EC2INSTANCE_SG, oldAwsEc2instanceSG, awsEc2instanceSG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAwsEc2instanceInstanceType() {
		return awsEc2instanceInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwsEc2instanceInstanceType(String newAwsEc2instanceInstanceType) {
		String oldAwsEc2instanceInstanceType = awsEc2instanceInstanceType;
		awsEc2instanceInstanceType = newAwsEc2instanceInstanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Modemoec2Package.EC2__AWS_EC2INSTANCE_INSTANCE_TYPE, oldAwsEc2instanceInstanceType, awsEc2instanceInstanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAwsEc2instanceInstanceID() {
		return awsEc2instanceInstanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwsEc2instanceInstanceID(String newAwsEc2instanceInstanceID) {
		String oldAwsEc2instanceInstanceID = awsEc2instanceInstanceID;
		awsEc2instanceInstanceID = newAwsEc2instanceInstanceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Modemoec2Package.EC2__AWS_EC2INSTANCE_INSTANCE_ID, oldAwsEc2instanceInstanceID, awsEc2instanceInstanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAwsEc2instacneDnsName() {
		return awsEc2instacneDnsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwsEc2instacneDnsName(String newAwsEc2instacneDnsName) {
		String oldAwsEc2instacneDnsName = awsEc2instacneDnsName;
		awsEc2instacneDnsName = newAwsEc2instacneDnsName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Modemoec2Package.EC2__AWS_EC2INSTACNE_DNS_NAME, oldAwsEc2instacneDnsName, awsEc2instacneDnsName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAwsEc2instancePrivateIP() {
		return awsEc2instancePrivateIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwsEc2instancePrivateIP(String newAwsEc2instancePrivateIP) {
		String oldAwsEc2instancePrivateIP = awsEc2instancePrivateIP;
		awsEc2instancePrivateIP = newAwsEc2instancePrivateIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Modemoec2Package.EC2__AWS_EC2INSTANCE_PRIVATE_IP, oldAwsEc2instancePrivateIP, awsEc2instancePrivateIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void restart() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemoec2/ecore!Ec2!restart()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_KEY:
				return getAwsEc2instanceKey();
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_PUBLIC_IP:
				return getAwsEc2instancePublicIP();
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_AMI:
				return getAwsEc2instanceAMI();
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_SG:
				return getAwsEc2instanceSG();
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_INSTANCE_TYPE:
				return getAwsEc2instanceInstanceType();
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_INSTANCE_ID:
				return getAwsEc2instanceInstanceID();
			case Modemoec2Package.EC2__AWS_EC2INSTACNE_DNS_NAME:
				return getAwsEc2instacneDnsName();
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_PRIVATE_IP:
				return getAwsEc2instancePrivateIP();
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
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_KEY:
				setAwsEc2instanceKey((String)newValue);
				return;
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_PUBLIC_IP:
				setAwsEc2instancePublicIP((String)newValue);
				return;
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_AMI:
				setAwsEc2instanceAMI((String)newValue);
				return;
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_SG:
				setAwsEc2instanceSG((String)newValue);
				return;
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_INSTANCE_TYPE:
				setAwsEc2instanceInstanceType((String)newValue);
				return;
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_INSTANCE_ID:
				setAwsEc2instanceInstanceID((String)newValue);
				return;
			case Modemoec2Package.EC2__AWS_EC2INSTACNE_DNS_NAME:
				setAwsEc2instacneDnsName((String)newValue);
				return;
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_PRIVATE_IP:
				setAwsEc2instancePrivateIP((String)newValue);
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
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_KEY:
				setAwsEc2instanceKey(AWS_EC2INSTANCE_KEY_EDEFAULT);
				return;
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_PUBLIC_IP:
				setAwsEc2instancePublicIP(AWS_EC2INSTANCE_PUBLIC_IP_EDEFAULT);
				return;
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_AMI:
				setAwsEc2instanceAMI(AWS_EC2INSTANCE_AMI_EDEFAULT);
				return;
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_SG:
				setAwsEc2instanceSG(AWS_EC2INSTANCE_SG_EDEFAULT);
				return;
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_INSTANCE_TYPE:
				setAwsEc2instanceInstanceType(AWS_EC2INSTANCE_INSTANCE_TYPE_EDEFAULT);
				return;
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_INSTANCE_ID:
				setAwsEc2instanceInstanceID(AWS_EC2INSTANCE_INSTANCE_ID_EDEFAULT);
				return;
			case Modemoec2Package.EC2__AWS_EC2INSTACNE_DNS_NAME:
				setAwsEc2instacneDnsName(AWS_EC2INSTACNE_DNS_NAME_EDEFAULT);
				return;
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_PRIVATE_IP:
				setAwsEc2instancePrivateIP(AWS_EC2INSTANCE_PRIVATE_IP_EDEFAULT);
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
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_KEY:
				return AWS_EC2INSTANCE_KEY_EDEFAULT == null ? awsEc2instanceKey != null : !AWS_EC2INSTANCE_KEY_EDEFAULT.equals(awsEc2instanceKey);
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_PUBLIC_IP:
				return AWS_EC2INSTANCE_PUBLIC_IP_EDEFAULT == null ? awsEc2instancePublicIP != null : !AWS_EC2INSTANCE_PUBLIC_IP_EDEFAULT.equals(awsEc2instancePublicIP);
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_AMI:
				return AWS_EC2INSTANCE_AMI_EDEFAULT == null ? awsEc2instanceAMI != null : !AWS_EC2INSTANCE_AMI_EDEFAULT.equals(awsEc2instanceAMI);
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_SG:
				return AWS_EC2INSTANCE_SG_EDEFAULT == null ? awsEc2instanceSG != null : !AWS_EC2INSTANCE_SG_EDEFAULT.equals(awsEc2instanceSG);
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_INSTANCE_TYPE:
				return AWS_EC2INSTANCE_INSTANCE_TYPE_EDEFAULT == null ? awsEc2instanceInstanceType != null : !AWS_EC2INSTANCE_INSTANCE_TYPE_EDEFAULT.equals(awsEc2instanceInstanceType);
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_INSTANCE_ID:
				return AWS_EC2INSTANCE_INSTANCE_ID_EDEFAULT == null ? awsEc2instanceInstanceID != null : !AWS_EC2INSTANCE_INSTANCE_ID_EDEFAULT.equals(awsEc2instanceInstanceID);
			case Modemoec2Package.EC2__AWS_EC2INSTACNE_DNS_NAME:
				return AWS_EC2INSTACNE_DNS_NAME_EDEFAULT == null ? awsEc2instacneDnsName != null : !AWS_EC2INSTACNE_DNS_NAME_EDEFAULT.equals(awsEc2instacneDnsName);
			case Modemoec2Package.EC2__AWS_EC2INSTANCE_PRIVATE_IP:
				return AWS_EC2INSTANCE_PRIVATE_IP_EDEFAULT == null ? awsEc2instancePrivateIP != null : !AWS_EC2INSTANCE_PRIVATE_IP_EDEFAULT.equals(awsEc2instancePrivateIP);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Modemoec2Package.EC2___RESTART:
				restart();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (awsEc2instanceKey: ");
		result.append(awsEc2instanceKey);
		result.append(", awsEc2instancePublicIP: ");
		result.append(awsEc2instancePublicIP);
		result.append(", awsEc2instanceAMI: ");
		result.append(awsEc2instanceAMI);
		result.append(", awsEc2instanceSG: ");
		result.append(awsEc2instanceSG);
		result.append(", awsEc2instanceInstanceType: ");
		result.append(awsEc2instanceInstanceType);
		result.append(", awsEc2instanceInstanceID: ");
		result.append(awsEc2instanceInstanceID);
		result.append(", awsEc2instacneDnsName: ");
		result.append(awsEc2instacneDnsName);
		result.append(", awsEc2instancePrivateIP: ");
		result.append(awsEc2instancePrivateIP);
		result.append(')');
		return result.toString();
	}

} //Ec2Impl
