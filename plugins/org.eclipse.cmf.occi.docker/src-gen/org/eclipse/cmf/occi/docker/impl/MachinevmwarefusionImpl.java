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
import org.eclipse.cmf.occi.docker.Machinevmwarefusion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machinevmwarefusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarefusionImpl#getBoot2dockerURL <em>Boot2docker URL</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarefusionImpl#getDiskSize <em>Disk Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarefusionImpl#getMemorySize <em>Memory Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarefusionImpl#isNoShare <em>No Share</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachinevmwarefusionImpl extends MachineImpl implements Machinevmwarefusion {
	/**
	 * The default value of the '{@link #getBoot2dockerURL() <em>Boot2docker URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoot2dockerURL()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOT2DOCKER_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoot2dockerURL() <em>Boot2docker URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoot2dockerURL()
	 * @generated
	 * @ordered
	 */
	protected String boot2dockerURL = BOOT2DOCKER_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiskSize() <em>Disk Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DISK_SIZE_EDEFAULT = new BigInteger("20000");

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
	 * The default value of the '{@link #getMemorySize() <em>Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MEMORY_SIZE_EDEFAULT = new BigInteger("1024");

	/**
	 * The cached value of the '{@link #getMemorySize() <em>Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger memorySize = MEMORY_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoShare() <em>No Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoShare()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_SHARE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoShare() <em>No Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoShare()
	 * @generated
	 * @ordered
	 */
	protected boolean noShare = NO_SHARE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachinevmwarefusionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINEVMWAREFUSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoot2dockerURL() {
		return boot2dockerURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoot2dockerURL(String newBoot2dockerURL) {
		String oldBoot2dockerURL = boot2dockerURL;
		boot2dockerURL = newBoot2dockerURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREFUSION__BOOT2DOCKER_URL, oldBoot2dockerURL, boot2dockerURL));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREFUSION__DISK_SIZE, oldDiskSize, diskSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMemorySize() {
		return memorySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemorySize(BigInteger newMemorySize) {
		BigInteger oldMemorySize = memorySize;
		memorySize = newMemorySize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREFUSION__MEMORY_SIZE, oldMemorySize, memorySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoShare() {
		return noShare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoShare(boolean newNoShare) {
		boolean oldNoShare = noShare;
		noShare = newNoShare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINEVMWAREFUSION__NO_SHARE, oldNoShare, noShare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINEVMWAREFUSION__BOOT2DOCKER_URL:
				return getBoot2dockerURL();
			case DockerPackage.MACHINEVMWAREFUSION__DISK_SIZE:
				return getDiskSize();
			case DockerPackage.MACHINEVMWAREFUSION__MEMORY_SIZE:
				return getMemorySize();
			case DockerPackage.MACHINEVMWAREFUSION__NO_SHARE:
				return isNoShare();
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
			case DockerPackage.MACHINEVMWAREFUSION__BOOT2DOCKER_URL:
				setBoot2dockerURL((String)newValue);
				return;
			case DockerPackage.MACHINEVMWAREFUSION__DISK_SIZE:
				setDiskSize((BigInteger)newValue);
				return;
			case DockerPackage.MACHINEVMWAREFUSION__MEMORY_SIZE:
				setMemorySize((BigInteger)newValue);
				return;
			case DockerPackage.MACHINEVMWAREFUSION__NO_SHARE:
				setNoShare((Boolean)newValue);
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
			case DockerPackage.MACHINEVMWAREFUSION__BOOT2DOCKER_URL:
				setBoot2dockerURL(BOOT2DOCKER_URL_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREFUSION__DISK_SIZE:
				setDiskSize(DISK_SIZE_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREFUSION__MEMORY_SIZE:
				setMemorySize(MEMORY_SIZE_EDEFAULT);
				return;
			case DockerPackage.MACHINEVMWAREFUSION__NO_SHARE:
				setNoShare(NO_SHARE_EDEFAULT);
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
			case DockerPackage.MACHINEVMWAREFUSION__BOOT2DOCKER_URL:
				return BOOT2DOCKER_URL_EDEFAULT == null ? boot2dockerURL != null : !BOOT2DOCKER_URL_EDEFAULT.equals(boot2dockerURL);
			case DockerPackage.MACHINEVMWAREFUSION__DISK_SIZE:
				return DISK_SIZE_EDEFAULT == null ? diskSize != null : !DISK_SIZE_EDEFAULT.equals(diskSize);
			case DockerPackage.MACHINEVMWAREFUSION__MEMORY_SIZE:
				return MEMORY_SIZE_EDEFAULT == null ? memorySize != null : !MEMORY_SIZE_EDEFAULT.equals(memorySize);
			case DockerPackage.MACHINEVMWAREFUSION__NO_SHARE:
				return noShare != NO_SHARE_EDEFAULT;
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
		result.append(" (boot2dockerURL: ");
		result.append(boot2dockerURL);
		result.append(", diskSize: ");
		result.append(diskSize);
		result.append(", memorySize: ");
		result.append(memorySize);
		result.append(", noShare: ");
		result.append(noShare);
		result.append(')');
		return result.toString();
	}

} //MachinevmwarefusionImpl
