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
import org.eclipse.cmf.occi.docker.Machinegooglecomputeengine;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machinegooglecomputeengine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinegooglecomputeengineImpl#getZone <em>Zone</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinegooglecomputeengineImpl#getMachineType <em>Machine Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinegooglecomputeengineImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinegooglecomputeengineImpl#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinegooglecomputeengineImpl#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachinegooglecomputeengineImpl extends MachineImpl implements Machinegooglecomputeengine {
	/**
	 * The default value of the '{@link #getZone() <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected static final String ZONE_EDEFAULT = "us-central1-a";

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
	 * The default value of the '{@link #getMachineType() <em>Machine Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineType()
	 * @generated
	 * @ordered
	 */
	protected static final String MACHINE_TYPE_EDEFAULT = "f1-micro";

	/**
	 * The cached value of the '{@link #getMachineType() <em>Machine Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineType()
	 * @generated
	 * @ordered
	 */
	protected String machineType = MACHINE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = "docker-user";

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
	 * The default value of the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_NAME_EDEFAULT = "docker-machine";

	/**
	 * The cached value of the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected String instanceName = INSTANCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected String project = PROJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachinegooglecomputeengineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINEGOOGLECOMPUTEENGINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEGOOGLECOMPUTEENGINE__ZONE, oldZone, zone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMachineType() {
		return machineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachineType(String newMachineType) {
		String oldMachineType = machineType;
		machineType = newMachineType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEGOOGLECOMPUTEENGINE__MACHINE_TYPE, oldMachineType, machineType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEGOOGLECOMPUTEENGINE__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceName() {
		return instanceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceName(String newInstanceName) {
		String oldInstanceName = instanceName;
		instanceName = newInstanceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEGOOGLECOMPUTEENGINE__INSTANCE_NAME, oldInstanceName, instanceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(String newProject) {
		String oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEGOOGLECOMPUTEENGINE__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE__ZONE:
				return getZone();
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE__MACHINE_TYPE:
				return getMachineType();
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE__USERNAME:
				return getUsername();
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE__INSTANCE_NAME:
				return getInstanceName();
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE__PROJECT:
				return getProject();
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
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE__ZONE:
				setZone((String)newValue);
				return;
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE__MACHINE_TYPE:
				setMachineType((String)newValue);
				return;
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE__USERNAME:
				setUsername((String)newValue);
				return;
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE__INSTANCE_NAME:
				setInstanceName((String)newValue);
				return;
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE__PROJECT:
				setProject((String)newValue);
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
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE__ZONE:
				setZone(ZONE_EDEFAULT);
				return;
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE__MACHINE_TYPE:
				setMachineType(MACHINE_TYPE_EDEFAULT);
				return;
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE__INSTANCE_NAME:
				setInstanceName(INSTANCE_NAME_EDEFAULT);
				return;
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE__PROJECT:
				setProject(PROJECT_EDEFAULT);
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
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE__ZONE:
				return ZONE_EDEFAULT == null ? zone != null : !ZONE_EDEFAULT.equals(zone);
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE__MACHINE_TYPE:
				return MACHINE_TYPE_EDEFAULT == null ? machineType != null : !MACHINE_TYPE_EDEFAULT.equals(machineType);
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE__INSTANCE_NAME:
				return INSTANCE_NAME_EDEFAULT == null ? instanceName != null : !INSTANCE_NAME_EDEFAULT.equals(instanceName);
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE__PROJECT:
				return PROJECT_EDEFAULT == null ? project != null : !PROJECT_EDEFAULT.equals(project);
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
		result.append(" (zone: ");
		result.append(zone);
		result.append(", machineType: ");
		result.append(machineType);
		result.append(", username: ");
		result.append(username);
		result.append(", instanceName: ");
		result.append(instanceName);
		result.append(", project: ");
		result.append(project);
		result.append(')');
		return result.toString();
	}

} //MachinegooglecomputeengineImpl
