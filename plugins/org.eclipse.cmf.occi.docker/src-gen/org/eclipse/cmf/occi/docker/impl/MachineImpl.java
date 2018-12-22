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

import java.lang.reflect.InvocationTargetException;
import org.eclipse.cmf.occi.docker.DockerPackage;
import org.eclipse.cmf.occi.docker.Machine;

import org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineImpl#getEngineInstallURL <em>Engine Install URL</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineImpl#getEngineOpt <em>Engine Opt</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineImpl#getEngineInsecureRegistry <em>Engine Insecure Registry</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineImpl#getEngineRegistryMirror <em>Engine Registry Mirror</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineImpl#getEngineLabel <em>Engine Label</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineImpl#getEngineStorageDriver <em>Engine Storage Driver</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineImpl#getEngineEnv <em>Engine Env</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineImpl#isSwarm <em>Swarm</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineImpl#getSwarmImage <em>Swarm Image</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineImpl#isSwarmMaster <em>Swarm Master</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineImpl#getSwarmDiscovery <em>Swarm Discovery</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineImpl#getSwarmStrategy <em>Swarm Strategy</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineImpl#getSwarmOpt <em>Swarm Opt</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineImpl#getSwarmHost <em>Swarm Host</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineImpl#getSwarmAddr <em>Swarm Addr</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineImpl#getSwarmExperimental <em>Swarm Experimental</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.MachineImpl#getTlsSan <em>Tls San</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachineImpl extends ComputeImpl implements Machine {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngineInstallURL() <em>Engine Install URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineInstallURL()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_INSTALL_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngineInstallURL() <em>Engine Install URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineInstallURL()
	 * @generated
	 * @ordered
	 */
	protected String engineInstallURL = ENGINE_INSTALL_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngineOpt() <em>Engine Opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineOpt()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_OPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngineOpt() <em>Engine Opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineOpt()
	 * @generated
	 * @ordered
	 */
	protected String engineOpt = ENGINE_OPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngineInsecureRegistry() <em>Engine Insecure Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineInsecureRegistry()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_INSECURE_REGISTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngineInsecureRegistry() <em>Engine Insecure Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineInsecureRegistry()
	 * @generated
	 * @ordered
	 */
	protected String engineInsecureRegistry = ENGINE_INSECURE_REGISTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngineRegistryMirror() <em>Engine Registry Mirror</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineRegistryMirror()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_REGISTRY_MIRROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngineRegistryMirror() <em>Engine Registry Mirror</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineRegistryMirror()
	 * @generated
	 * @ordered
	 */
	protected String engineRegistryMirror = ENGINE_REGISTRY_MIRROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngineLabel() <em>Engine Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngineLabel() <em>Engine Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineLabel()
	 * @generated
	 * @ordered
	 */
	protected String engineLabel = ENGINE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngineStorageDriver() <em>Engine Storage Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineStorageDriver()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_STORAGE_DRIVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngineStorageDriver() <em>Engine Storage Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineStorageDriver()
	 * @generated
	 * @ordered
	 */
	protected String engineStorageDriver = ENGINE_STORAGE_DRIVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngineEnv() <em>Engine Env</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineEnv()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_ENV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngineEnv() <em>Engine Env</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineEnv()
	 * @generated
	 * @ordered
	 */
	protected String engineEnv = ENGINE_ENV_EDEFAULT;

	/**
	 * The default value of the '{@link #isSwarm() <em>Swarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSwarm()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SWARM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSwarm() <em>Swarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSwarm()
	 * @generated
	 * @ordered
	 */
	protected boolean swarm = SWARM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwarmImage() <em>Swarm Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarmImage()
	 * @generated
	 * @ordered
	 */
	protected static final String SWARM_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwarmImage() <em>Swarm Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarmImage()
	 * @generated
	 * @ordered
	 */
	protected String swarmImage = SWARM_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSwarmMaster() <em>Swarm Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSwarmMaster()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SWARM_MASTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSwarmMaster() <em>Swarm Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSwarmMaster()
	 * @generated
	 * @ordered
	 */
	protected boolean swarmMaster = SWARM_MASTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwarmDiscovery() <em>Swarm Discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarmDiscovery()
	 * @generated
	 * @ordered
	 */
	protected static final String SWARM_DISCOVERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwarmDiscovery() <em>Swarm Discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarmDiscovery()
	 * @generated
	 * @ordered
	 */
	protected String swarmDiscovery = SWARM_DISCOVERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwarmStrategy() <em>Swarm Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarmStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final String SWARM_STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwarmStrategy() <em>Swarm Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarmStrategy()
	 * @generated
	 * @ordered
	 */
	protected String swarmStrategy = SWARM_STRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwarmOpt() <em>Swarm Opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarmOpt()
	 * @generated
	 * @ordered
	 */
	protected static final String SWARM_OPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwarmOpt() <em>Swarm Opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarmOpt()
	 * @generated
	 * @ordered
	 */
	protected String swarmOpt = SWARM_OPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwarmHost() <em>Swarm Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarmHost()
	 * @generated
	 * @ordered
	 */
	protected static final String SWARM_HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwarmHost() <em>Swarm Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarmHost()
	 * @generated
	 * @ordered
	 */
	protected String swarmHost = SWARM_HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwarmAddr() <em>Swarm Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarmAddr()
	 * @generated
	 * @ordered
	 */
	protected static final String SWARM_ADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwarmAddr() <em>Swarm Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarmAddr()
	 * @generated
	 * @ordered
	 */
	protected String swarmAddr = SWARM_ADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwarmExperimental() <em>Swarm Experimental</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarmExperimental()
	 * @generated
	 * @ordered
	 */
	protected static final String SWARM_EXPERIMENTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwarmExperimental() <em>Swarm Experimental</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarmExperimental()
	 * @generated
	 * @ordered
	 */
	protected String swarmExperimental = SWARM_EXPERIMENTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTlsSan() <em>Tls San</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTlsSan()
	 * @generated
	 * @ordered
	 */
	protected static final String TLS_SAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTlsSan() <em>Tls San</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTlsSan()
	 * @generated
	 * @ordered
	 */
	protected String tlsSan = TLS_SAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngineInstallURL() {
		return engineInstallURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngineInstallURL(String newEngineInstallURL) {
		String oldEngineInstallURL = engineInstallURL;
		engineInstallURL = newEngineInstallURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__ENGINE_INSTALL_URL, oldEngineInstallURL, engineInstallURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngineOpt() {
		return engineOpt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngineOpt(String newEngineOpt) {
		String oldEngineOpt = engineOpt;
		engineOpt = newEngineOpt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__ENGINE_OPT, oldEngineOpt, engineOpt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngineInsecureRegistry() {
		return engineInsecureRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngineInsecureRegistry(String newEngineInsecureRegistry) {
		String oldEngineInsecureRegistry = engineInsecureRegistry;
		engineInsecureRegistry = newEngineInsecureRegistry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__ENGINE_INSECURE_REGISTRY, oldEngineInsecureRegistry, engineInsecureRegistry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngineRegistryMirror() {
		return engineRegistryMirror;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngineRegistryMirror(String newEngineRegistryMirror) {
		String oldEngineRegistryMirror = engineRegistryMirror;
		engineRegistryMirror = newEngineRegistryMirror;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__ENGINE_REGISTRY_MIRROR, oldEngineRegistryMirror, engineRegistryMirror));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngineLabel() {
		return engineLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngineLabel(String newEngineLabel) {
		String oldEngineLabel = engineLabel;
		engineLabel = newEngineLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__ENGINE_LABEL, oldEngineLabel, engineLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngineStorageDriver() {
		return engineStorageDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngineStorageDriver(String newEngineStorageDriver) {
		String oldEngineStorageDriver = engineStorageDriver;
		engineStorageDriver = newEngineStorageDriver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__ENGINE_STORAGE_DRIVER, oldEngineStorageDriver, engineStorageDriver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngineEnv() {
		return engineEnv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngineEnv(String newEngineEnv) {
		String oldEngineEnv = engineEnv;
		engineEnv = newEngineEnv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__ENGINE_ENV, oldEngineEnv, engineEnv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSwarm() {
		return swarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwarm(boolean newSwarm) {
		boolean oldSwarm = swarm;
		swarm = newSwarm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__SWARM, oldSwarm, swarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwarmImage() {
		return swarmImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwarmImage(String newSwarmImage) {
		String oldSwarmImage = swarmImage;
		swarmImage = newSwarmImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__SWARM_IMAGE, oldSwarmImage, swarmImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSwarmMaster() {
		return swarmMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwarmMaster(boolean newSwarmMaster) {
		boolean oldSwarmMaster = swarmMaster;
		swarmMaster = newSwarmMaster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__SWARM_MASTER, oldSwarmMaster, swarmMaster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwarmDiscovery() {
		return swarmDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwarmDiscovery(String newSwarmDiscovery) {
		String oldSwarmDiscovery = swarmDiscovery;
		swarmDiscovery = newSwarmDiscovery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__SWARM_DISCOVERY, oldSwarmDiscovery, swarmDiscovery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwarmStrategy() {
		return swarmStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwarmStrategy(String newSwarmStrategy) {
		String oldSwarmStrategy = swarmStrategy;
		swarmStrategy = newSwarmStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__SWARM_STRATEGY, oldSwarmStrategy, swarmStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwarmOpt() {
		return swarmOpt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwarmOpt(String newSwarmOpt) {
		String oldSwarmOpt = swarmOpt;
		swarmOpt = newSwarmOpt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__SWARM_OPT, oldSwarmOpt, swarmOpt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwarmHost() {
		return swarmHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwarmHost(String newSwarmHost) {
		String oldSwarmHost = swarmHost;
		swarmHost = newSwarmHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__SWARM_HOST, oldSwarmHost, swarmHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwarmAddr() {
		return swarmAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwarmAddr(String newSwarmAddr) {
		String oldSwarmAddr = swarmAddr;
		swarmAddr = newSwarmAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__SWARM_ADDR, oldSwarmAddr, swarmAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwarmExperimental() {
		return swarmExperimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwarmExperimental(String newSwarmExperimental) {
		String oldSwarmExperimental = swarmExperimental;
		swarmExperimental = newSwarmExperimental;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__SWARM_EXPERIMENTAL, oldSwarmExperimental, swarmExperimental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTlsSan() {
		return tlsSan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTlsSan(String newTlsSan) {
		String oldTlsSan = tlsSan;
		tlsSan = newTlsSan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__TLS_SAN, oldTlsSan, tlsSan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void startall() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machine!startall()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINE__NAME:
				return getName();
			case DockerPackage.MACHINE__ENGINE_INSTALL_URL:
				return getEngineInstallURL();
			case DockerPackage.MACHINE__ENGINE_OPT:
				return getEngineOpt();
			case DockerPackage.MACHINE__ENGINE_INSECURE_REGISTRY:
				return getEngineInsecureRegistry();
			case DockerPackage.MACHINE__ENGINE_REGISTRY_MIRROR:
				return getEngineRegistryMirror();
			case DockerPackage.MACHINE__ENGINE_LABEL:
				return getEngineLabel();
			case DockerPackage.MACHINE__ENGINE_STORAGE_DRIVER:
				return getEngineStorageDriver();
			case DockerPackage.MACHINE__ENGINE_ENV:
				return getEngineEnv();
			case DockerPackage.MACHINE__SWARM:
				return isSwarm();
			case DockerPackage.MACHINE__SWARM_IMAGE:
				return getSwarmImage();
			case DockerPackage.MACHINE__SWARM_MASTER:
				return isSwarmMaster();
			case DockerPackage.MACHINE__SWARM_DISCOVERY:
				return getSwarmDiscovery();
			case DockerPackage.MACHINE__SWARM_STRATEGY:
				return getSwarmStrategy();
			case DockerPackage.MACHINE__SWARM_OPT:
				return getSwarmOpt();
			case DockerPackage.MACHINE__SWARM_HOST:
				return getSwarmHost();
			case DockerPackage.MACHINE__SWARM_ADDR:
				return getSwarmAddr();
			case DockerPackage.MACHINE__SWARM_EXPERIMENTAL:
				return getSwarmExperimental();
			case DockerPackage.MACHINE__TLS_SAN:
				return getTlsSan();
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
			case DockerPackage.MACHINE__NAME:
				setName((String)newValue);
				return;
			case DockerPackage.MACHINE__ENGINE_INSTALL_URL:
				setEngineInstallURL((String)newValue);
				return;
			case DockerPackage.MACHINE__ENGINE_OPT:
				setEngineOpt((String)newValue);
				return;
			case DockerPackage.MACHINE__ENGINE_INSECURE_REGISTRY:
				setEngineInsecureRegistry((String)newValue);
				return;
			case DockerPackage.MACHINE__ENGINE_REGISTRY_MIRROR:
				setEngineRegistryMirror((String)newValue);
				return;
			case DockerPackage.MACHINE__ENGINE_LABEL:
				setEngineLabel((String)newValue);
				return;
			case DockerPackage.MACHINE__ENGINE_STORAGE_DRIVER:
				setEngineStorageDriver((String)newValue);
				return;
			case DockerPackage.MACHINE__ENGINE_ENV:
				setEngineEnv((String)newValue);
				return;
			case DockerPackage.MACHINE__SWARM:
				setSwarm((Boolean)newValue);
				return;
			case DockerPackage.MACHINE__SWARM_IMAGE:
				setSwarmImage((String)newValue);
				return;
			case DockerPackage.MACHINE__SWARM_MASTER:
				setSwarmMaster((Boolean)newValue);
				return;
			case DockerPackage.MACHINE__SWARM_DISCOVERY:
				setSwarmDiscovery((String)newValue);
				return;
			case DockerPackage.MACHINE__SWARM_STRATEGY:
				setSwarmStrategy((String)newValue);
				return;
			case DockerPackage.MACHINE__SWARM_OPT:
				setSwarmOpt((String)newValue);
				return;
			case DockerPackage.MACHINE__SWARM_HOST:
				setSwarmHost((String)newValue);
				return;
			case DockerPackage.MACHINE__SWARM_ADDR:
				setSwarmAddr((String)newValue);
				return;
			case DockerPackage.MACHINE__SWARM_EXPERIMENTAL:
				setSwarmExperimental((String)newValue);
				return;
			case DockerPackage.MACHINE__TLS_SAN:
				setTlsSan((String)newValue);
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
			case DockerPackage.MACHINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DockerPackage.MACHINE__ENGINE_INSTALL_URL:
				setEngineInstallURL(ENGINE_INSTALL_URL_EDEFAULT);
				return;
			case DockerPackage.MACHINE__ENGINE_OPT:
				setEngineOpt(ENGINE_OPT_EDEFAULT);
				return;
			case DockerPackage.MACHINE__ENGINE_INSECURE_REGISTRY:
				setEngineInsecureRegistry(ENGINE_INSECURE_REGISTRY_EDEFAULT);
				return;
			case DockerPackage.MACHINE__ENGINE_REGISTRY_MIRROR:
				setEngineRegistryMirror(ENGINE_REGISTRY_MIRROR_EDEFAULT);
				return;
			case DockerPackage.MACHINE__ENGINE_LABEL:
				setEngineLabel(ENGINE_LABEL_EDEFAULT);
				return;
			case DockerPackage.MACHINE__ENGINE_STORAGE_DRIVER:
				setEngineStorageDriver(ENGINE_STORAGE_DRIVER_EDEFAULT);
				return;
			case DockerPackage.MACHINE__ENGINE_ENV:
				setEngineEnv(ENGINE_ENV_EDEFAULT);
				return;
			case DockerPackage.MACHINE__SWARM:
				setSwarm(SWARM_EDEFAULT);
				return;
			case DockerPackage.MACHINE__SWARM_IMAGE:
				setSwarmImage(SWARM_IMAGE_EDEFAULT);
				return;
			case DockerPackage.MACHINE__SWARM_MASTER:
				setSwarmMaster(SWARM_MASTER_EDEFAULT);
				return;
			case DockerPackage.MACHINE__SWARM_DISCOVERY:
				setSwarmDiscovery(SWARM_DISCOVERY_EDEFAULT);
				return;
			case DockerPackage.MACHINE__SWARM_STRATEGY:
				setSwarmStrategy(SWARM_STRATEGY_EDEFAULT);
				return;
			case DockerPackage.MACHINE__SWARM_OPT:
				setSwarmOpt(SWARM_OPT_EDEFAULT);
				return;
			case DockerPackage.MACHINE__SWARM_HOST:
				setSwarmHost(SWARM_HOST_EDEFAULT);
				return;
			case DockerPackage.MACHINE__SWARM_ADDR:
				setSwarmAddr(SWARM_ADDR_EDEFAULT);
				return;
			case DockerPackage.MACHINE__SWARM_EXPERIMENTAL:
				setSwarmExperimental(SWARM_EXPERIMENTAL_EDEFAULT);
				return;
			case DockerPackage.MACHINE__TLS_SAN:
				setTlsSan(TLS_SAN_EDEFAULT);
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
			case DockerPackage.MACHINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DockerPackage.MACHINE__ENGINE_INSTALL_URL:
				return ENGINE_INSTALL_URL_EDEFAULT == null ? engineInstallURL != null : !ENGINE_INSTALL_URL_EDEFAULT.equals(engineInstallURL);
			case DockerPackage.MACHINE__ENGINE_OPT:
				return ENGINE_OPT_EDEFAULT == null ? engineOpt != null : !ENGINE_OPT_EDEFAULT.equals(engineOpt);
			case DockerPackage.MACHINE__ENGINE_INSECURE_REGISTRY:
				return ENGINE_INSECURE_REGISTRY_EDEFAULT == null ? engineInsecureRegistry != null : !ENGINE_INSECURE_REGISTRY_EDEFAULT.equals(engineInsecureRegistry);
			case DockerPackage.MACHINE__ENGINE_REGISTRY_MIRROR:
				return ENGINE_REGISTRY_MIRROR_EDEFAULT == null ? engineRegistryMirror != null : !ENGINE_REGISTRY_MIRROR_EDEFAULT.equals(engineRegistryMirror);
			case DockerPackage.MACHINE__ENGINE_LABEL:
				return ENGINE_LABEL_EDEFAULT == null ? engineLabel != null : !ENGINE_LABEL_EDEFAULT.equals(engineLabel);
			case DockerPackage.MACHINE__ENGINE_STORAGE_DRIVER:
				return ENGINE_STORAGE_DRIVER_EDEFAULT == null ? engineStorageDriver != null : !ENGINE_STORAGE_DRIVER_EDEFAULT.equals(engineStorageDriver);
			case DockerPackage.MACHINE__ENGINE_ENV:
				return ENGINE_ENV_EDEFAULT == null ? engineEnv != null : !ENGINE_ENV_EDEFAULT.equals(engineEnv);
			case DockerPackage.MACHINE__SWARM:
				return swarm != SWARM_EDEFAULT;
			case DockerPackage.MACHINE__SWARM_IMAGE:
				return SWARM_IMAGE_EDEFAULT == null ? swarmImage != null : !SWARM_IMAGE_EDEFAULT.equals(swarmImage);
			case DockerPackage.MACHINE__SWARM_MASTER:
				return swarmMaster != SWARM_MASTER_EDEFAULT;
			case DockerPackage.MACHINE__SWARM_DISCOVERY:
				return SWARM_DISCOVERY_EDEFAULT == null ? swarmDiscovery != null : !SWARM_DISCOVERY_EDEFAULT.equals(swarmDiscovery);
			case DockerPackage.MACHINE__SWARM_STRATEGY:
				return SWARM_STRATEGY_EDEFAULT == null ? swarmStrategy != null : !SWARM_STRATEGY_EDEFAULT.equals(swarmStrategy);
			case DockerPackage.MACHINE__SWARM_OPT:
				return SWARM_OPT_EDEFAULT == null ? swarmOpt != null : !SWARM_OPT_EDEFAULT.equals(swarmOpt);
			case DockerPackage.MACHINE__SWARM_HOST:
				return SWARM_HOST_EDEFAULT == null ? swarmHost != null : !SWARM_HOST_EDEFAULT.equals(swarmHost);
			case DockerPackage.MACHINE__SWARM_ADDR:
				return SWARM_ADDR_EDEFAULT == null ? swarmAddr != null : !SWARM_ADDR_EDEFAULT.equals(swarmAddr);
			case DockerPackage.MACHINE__SWARM_EXPERIMENTAL:
				return SWARM_EXPERIMENTAL_EDEFAULT == null ? swarmExperimental != null : !SWARM_EXPERIMENTAL_EDEFAULT.equals(swarmExperimental);
			case DockerPackage.MACHINE__TLS_SAN:
				return TLS_SAN_EDEFAULT == null ? tlsSan != null : !TLS_SAN_EDEFAULT.equals(tlsSan);
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
			case DockerPackage.MACHINE___STARTALL:
				startall();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", engineInstallURL: ");
		result.append(engineInstallURL);
		result.append(", engineOpt: ");
		result.append(engineOpt);
		result.append(", engineInsecureRegistry: ");
		result.append(engineInsecureRegistry);
		result.append(", engineRegistryMirror: ");
		result.append(engineRegistryMirror);
		result.append(", engineLabel: ");
		result.append(engineLabel);
		result.append(", engineStorageDriver: ");
		result.append(engineStorageDriver);
		result.append(", engineEnv: ");
		result.append(engineEnv);
		result.append(", swarm: ");
		result.append(swarm);
		result.append(", swarmImage: ");
		result.append(swarmImage);
		result.append(", swarmMaster: ");
		result.append(swarmMaster);
		result.append(", swarmDiscovery: ");
		result.append(swarmDiscovery);
		result.append(", swarmStrategy: ");
		result.append(swarmStrategy);
		result.append(", swarmOpt: ");
		result.append(swarmOpt);
		result.append(", swarmHost: ");
		result.append(swarmHost);
		result.append(", swarmAddr: ");
		result.append(swarmAddr);
		result.append(", swarmExperimental: ");
		result.append(swarmExperimental);
		result.append(", tlsSan: ");
		result.append(tlsSan);
		result.append(')');
		return result.toString();
	}

} //MachineImpl
