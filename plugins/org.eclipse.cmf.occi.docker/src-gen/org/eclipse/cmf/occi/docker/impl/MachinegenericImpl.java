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
import org.eclipse.cmf.occi.docker.Machinegeneric;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machinegeneric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinegenericImpl#getEnginePort <em>Engine Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinegenericImpl#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinegenericImpl#getSshKey <em>Ssh Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinegenericImpl#getSshUser <em>Ssh User</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinegenericImpl#getSshPort <em>Ssh Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachinegenericImpl extends MachineImpl implements Machinegeneric {
	/**
	 * The default value of the '{@link #getEnginePort() <em>Engine Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnginePort()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ENGINE_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnginePort() <em>Engine Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnginePort()
	 * @generated
	 * @ordered
	 */
	protected BigInteger enginePort = ENGINE_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIpAddress() <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpAddress() <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpAddress()
	 * @generated
	 * @ordered
	 */
	protected String ipAddress = IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSshKey() <em>Ssh Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshKey()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSshKey() <em>Ssh Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshKey()
	 * @generated
	 * @ordered
	 */
	protected String sshKey = SSH_KEY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachinegenericImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINEGENERIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEnginePort() {
		return enginePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnginePort(BigInteger newEnginePort) {
		BigInteger oldEnginePort = enginePort;
		enginePort = newEnginePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEGENERIC__ENGINE_PORT, oldEnginePort, enginePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpAddress(String newIpAddress) {
		String oldIpAddress = ipAddress;
		ipAddress = newIpAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEGENERIC__IP_ADDRESS, oldIpAddress, ipAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSshKey() {
		return sshKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSshKey(String newSshKey) {
		String oldSshKey = sshKey;
		sshKey = newSshKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEGENERIC__SSH_KEY, oldSshKey, sshKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEGENERIC__SSH_USER, oldSshUser, sshUser));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEGENERIC__SSH_PORT, oldSshPort, sshPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINEGENERIC__ENGINE_PORT:
				return getEnginePort();
			case DockerPackage.MACHINEGENERIC__IP_ADDRESS:
				return getIpAddress();
			case DockerPackage.MACHINEGENERIC__SSH_KEY:
				return getSshKey();
			case DockerPackage.MACHINEGENERIC__SSH_USER:
				return getSshUser();
			case DockerPackage.MACHINEGENERIC__SSH_PORT:
				return getSshPort();
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
			case DockerPackage.MACHINEGENERIC__ENGINE_PORT:
				setEnginePort((BigInteger)newValue);
				return;
			case DockerPackage.MACHINEGENERIC__IP_ADDRESS:
				setIpAddress((String)newValue);
				return;
			case DockerPackage.MACHINEGENERIC__SSH_KEY:
				setSshKey((String)newValue);
				return;
			case DockerPackage.MACHINEGENERIC__SSH_USER:
				setSshUser((String)newValue);
				return;
			case DockerPackage.MACHINEGENERIC__SSH_PORT:
				setSshPort((BigInteger)newValue);
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
			case DockerPackage.MACHINEGENERIC__ENGINE_PORT:
				setEnginePort(ENGINE_PORT_EDEFAULT);
				return;
			case DockerPackage.MACHINEGENERIC__IP_ADDRESS:
				setIpAddress(IP_ADDRESS_EDEFAULT);
				return;
			case DockerPackage.MACHINEGENERIC__SSH_KEY:
				setSshKey(SSH_KEY_EDEFAULT);
				return;
			case DockerPackage.MACHINEGENERIC__SSH_USER:
				setSshUser(SSH_USER_EDEFAULT);
				return;
			case DockerPackage.MACHINEGENERIC__SSH_PORT:
				setSshPort(SSH_PORT_EDEFAULT);
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
			case DockerPackage.MACHINEGENERIC__ENGINE_PORT:
				return ENGINE_PORT_EDEFAULT == null ? enginePort != null : !ENGINE_PORT_EDEFAULT.equals(enginePort);
			case DockerPackage.MACHINEGENERIC__IP_ADDRESS:
				return IP_ADDRESS_EDEFAULT == null ? ipAddress != null : !IP_ADDRESS_EDEFAULT.equals(ipAddress);
			case DockerPackage.MACHINEGENERIC__SSH_KEY:
				return SSH_KEY_EDEFAULT == null ? sshKey != null : !SSH_KEY_EDEFAULT.equals(sshKey);
			case DockerPackage.MACHINEGENERIC__SSH_USER:
				return SSH_USER_EDEFAULT == null ? sshUser != null : !SSH_USER_EDEFAULT.equals(sshUser);
			case DockerPackage.MACHINEGENERIC__SSH_PORT:
				return SSH_PORT_EDEFAULT == null ? sshPort != null : !SSH_PORT_EDEFAULT.equals(sshPort);
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
		result.append(" (enginePort: ");
		result.append(enginePort);
		result.append(", ipAddress: ");
		result.append(ipAddress);
		result.append(", sshKey: ");
		result.append(sshKey);
		result.append(", sshUser: ");
		result.append(sshUser);
		result.append(", sshPort: ");
		result.append(sshPort);
		result.append(')');
		return result.toString();
	}

} //MachinegenericImpl
