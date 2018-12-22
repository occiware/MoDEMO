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

import java.math.BigInteger;
import org.eclipse.cmf.occi.docker.ArrayOfString;
import org.eclipse.cmf.occi.docker.DockerPackage;

import org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getContainerid <em>Containerid</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getBuild <em>Build</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getExpose <em>Expose</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getEnvFile <em>Env File</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getNet <em>Net</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getDns <em>Dns</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getDnsSearch <em>Dns Search</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getCapAdd <em>Cap Add</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getCapDrop <em>Cap Drop</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getWorkingDir <em>Working Dir</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getMemLimit <em>Mem Limit</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getMemorySwap <em>Memory Swap</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#isPrivileged <em>Privileged</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getRestart <em>Restart</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#isStdinOpen <em>Stdin Open</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#isInteractive <em>Interactive</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getCpuShares <em>Cpu Shares</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getPid <em>Pid</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getIpc <em>Ipc</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getAddHost <em>Add Host</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getMacAddress <em>Mac Address</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#isRm <em>Rm</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getSecurityOpt <em>Security Opt</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getLxcConf <em>Lxc Conf</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#isPublishAll <em>Publish All</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#isMonitored <em>Monitored</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getCpuUsed <em>Cpu Used</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getMemoryUsed <em>Memory Used</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getCpuPercent <em>Cpu Percent</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getMemoryPercent <em>Memory Percent</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getDiskUsed <em>Disk Used</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getDiskPercent <em>Disk Percent</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getBandwidthUsed <em>Bandwidth Used</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getBandwidthPercent <em>Bandwidth Percent</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getMonitoringInterval <em>Monitoring Interval</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getCpuMaxValue <em>Cpu Max Value</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getMemoryMaxValue <em>Memory Max Value</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getCoreMax <em>Core Max</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getCpuSetCpus <em>Cpu Set Cpus</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#getCpuSetMems <em>Cpu Set Mems</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl#isTty <em>Tty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends ComputeImpl implements org.eclipse.cmf.occi.docker.Container {
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
	 * The default value of the '{@link #getContainerid() <em>Containerid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerid()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINERID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerid() <em>Containerid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerid()
	 * @generated
	 * @ordered
	 */
	protected String containerid = CONTAINERID_EDEFAULT;

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
	 * The default value of the '{@link #getBuild() <em>Build</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuild()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuild() <em>Build</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuild()
	 * @generated
	 * @ordered
	 */
	protected String build = BUILD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected String command = COMMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getPorts() <em>Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected static final String PORTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected String ports = PORTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpose() <em>Expose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpose()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpose() <em>Expose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpose()
	 * @generated
	 * @ordered
	 */
	protected String expose = EXPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolumes() <em>Volumes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLUMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected String volumes = VOLUMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final String ENVIRONMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected String environment = ENVIRONMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvFile() <em>Env File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvFile()
	 * @generated
	 * @ordered
	 */
	protected static final String ENV_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvFile() <em>Env File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvFile()
	 * @generated
	 * @ordered
	 */
	protected String envFile = ENV_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNet() <em>Net</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected static final String NET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected String net = NET_EDEFAULT;

	/**
	 * The default value of the '{@link #getDns() <em>Dns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDns()
	 * @generated
	 * @ordered
	 */
	protected static final String DNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDns() <em>Dns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDns()
	 * @generated
	 * @ordered
	 */
	protected String dns = DNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDnsSearch() <em>Dns Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnsSearch()
	 * @generated
	 * @ordered
	 */
	protected static final String DNS_SEARCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDnsSearch() <em>Dns Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnsSearch()
	 * @generated
	 * @ordered
	 */
	protected String dnsSearch = DNS_SEARCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapAdd() <em>Cap Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapAdd()
	 * @generated
	 * @ordered
	 */
	protected static final String CAP_ADD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapAdd() <em>Cap Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapAdd()
	 * @generated
	 * @ordered
	 */
	protected String capAdd = CAP_ADD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapDrop() <em>Cap Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapDrop()
	 * @generated
	 * @ordered
	 */
	protected static final String CAP_DROP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapDrop() <em>Cap Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapDrop()
	 * @generated
	 * @ordered
	 */
	protected String capDrop = CAP_DROP_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkingDir() <em>Working Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingDir()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKING_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkingDir() <em>Working Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingDir()
	 * @generated
	 * @ordered
	 */
	protected String workingDir = WORKING_DIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntrypoint() <em>Entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrypoint()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRYPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntrypoint() <em>Entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrypoint()
	 * @generated
	 * @ordered
	 */
	protected String entrypoint = ENTRYPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

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
	 * The default value of the '{@link #getMemLimit() <em>Mem Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemLimit()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MEM_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemLimit() <em>Mem Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemLimit()
	 * @generated
	 * @ordered
	 */
	protected BigInteger memLimit = MEM_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemorySwap() <em>Memory Swap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySwap()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MEMORY_SWAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemorySwap() <em>Memory Swap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySwap()
	 * @generated
	 * @ordered
	 */
	protected BigInteger memorySwap = MEMORY_SWAP_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrivileged() <em>Privileged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivileged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIVILEGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrivileged() <em>Privileged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivileged()
	 * @generated
	 * @ordered
	 */
	protected boolean privileged = PRIVILEGED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestart() <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestart()
	 * @generated
	 * @ordered
	 */
	protected static final String RESTART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestart() <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestart()
	 * @generated
	 * @ordered
	 */
	protected String restart = RESTART_EDEFAULT;

	/**
	 * The default value of the '{@link #isStdinOpen() <em>Stdin Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStdinOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STDIN_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStdinOpen() <em>Stdin Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStdinOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean stdinOpen = STDIN_OPEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isInteractive() <em>Interactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInteractive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInteractive() <em>Interactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInteractive()
	 * @generated
	 * @ordered
	 */
	protected boolean interactive = INTERACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuShares() <em>Cpu Shares</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuShares()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CPU_SHARES_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getCpuShares() <em>Cpu Shares</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuShares()
	 * @generated
	 * @ordered
	 */
	protected BigInteger cpuShares = CPU_SHARES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPid() <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPid()
	 * @generated
	 * @ordered
	 */
	protected static final String PID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPid() <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPid()
	 * @generated
	 * @ordered
	 */
	protected String pid = PID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIpc() <em>Ipc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpc()
	 * @generated
	 * @ordered
	 */
	protected static final String IPC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpc() <em>Ipc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpc()
	 * @generated
	 * @ordered
	 */
	protected String ipc = IPC_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddHost() <em>Add Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddHost()
	 * @generated
	 * @ordered
	 */
	protected static final String ADD_HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddHost() <em>Add Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddHost()
	 * @generated
	 * @ordered
	 */
	protected String addHost = ADD_HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMacAddress() <em>Mac Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String MAC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMacAddress() <em>Mac Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacAddress()
	 * @generated
	 * @ordered
	 */
	protected String macAddress = MAC_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isRm() <em>Rm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRm()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRm() <em>Rm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRm()
	 * @generated
	 * @ordered
	 */
	protected boolean rm = RM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityOpt() <em>Security Opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityOpt()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_OPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityOpt() <em>Security Opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityOpt()
	 * @generated
	 * @ordered
	 */
	protected String securityOpt = SECURITY_OPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected String device = DEVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLxcConf() <em>Lxc Conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLxcConf()
	 * @generated
	 * @ordered
	 */
	protected static final String LXC_CONF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLxcConf() <em>Lxc Conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLxcConf()
	 * @generated
	 * @ordered
	 */
	protected String lxcConf = LXC_CONF_EDEFAULT;

	/**
	 * The default value of the '{@link #isPublishAll() <em>Publish All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublishAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUBLISH_ALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPublishAll() <em>Publish All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublishAll()
	 * @generated
	 * @ordered
	 */
	protected boolean publishAll = PUBLISH_ALL_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isMonitored() <em>Monitored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitored()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MONITORED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMonitored() <em>Monitored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitored()
	 * @generated
	 * @ordered
	 */
	protected boolean monitored = MONITORED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuUsed() <em>Cpu Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuUsed()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CPU_USED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpuUsed() <em>Cpu Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuUsed()
	 * @generated
	 * @ordered
	 */
	protected BigInteger cpuUsed = CPU_USED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryUsed() <em>Memory Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryUsed()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MEMORY_USED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemoryUsed() <em>Memory Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryUsed()
	 * @generated
	 * @ordered
	 */
	protected BigInteger memoryUsed = MEMORY_USED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuPercent() <em>Cpu Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuPercent()
	 * @generated
	 * @ordered
	 */
	protected static final String CPU_PERCENT_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getCpuPercent() <em>Cpu Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuPercent()
	 * @generated
	 * @ordered
	 */
	protected String cpuPercent = CPU_PERCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryPercent() <em>Memory Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryPercent()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMORY_PERCENT_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getMemoryPercent() <em>Memory Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryPercent()
	 * @generated
	 * @ordered
	 */
	protected String memoryPercent = MEMORY_PERCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiskUsed() <em>Disk Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskUsed()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DISK_USED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiskUsed() <em>Disk Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskUsed()
	 * @generated
	 * @ordered
	 */
	protected BigInteger diskUsed = DISK_USED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiskPercent() <em>Disk Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskPercent()
	 * @generated
	 * @ordered
	 */
	protected static final String DISK_PERCENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiskPercent() <em>Disk Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskPercent()
	 * @generated
	 * @ordered
	 */
	protected String diskPercent = DISK_PERCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBandwidthUsed() <em>Bandwidth Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidthUsed()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BANDWIDTH_USED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBandwidthUsed() <em>Bandwidth Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidthUsed()
	 * @generated
	 * @ordered
	 */
	protected BigInteger bandwidthUsed = BANDWIDTH_USED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBandwidthPercent() <em>Bandwidth Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidthPercent()
	 * @generated
	 * @ordered
	 */
	protected static final String BANDWIDTH_PERCENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBandwidthPercent() <em>Bandwidth Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidthPercent()
	 * @generated
	 * @ordered
	 */
	protected String bandwidthPercent = BANDWIDTH_PERCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonitoringInterval() <em>Monitoring Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringInterval()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MONITORING_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonitoringInterval() <em>Monitoring Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringInterval()
	 * @generated
	 * @ordered
	 */
	protected BigInteger monitoringInterval = MONITORING_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuMaxValue() <em>Cpu Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CPU_MAX_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpuMaxValue() <em>Cpu Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuMaxValue()
	 * @generated
	 * @ordered
	 */
	protected BigInteger cpuMaxValue = CPU_MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryMaxValue() <em>Memory Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MEMORY_MAX_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemoryMaxValue() <em>Memory Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMaxValue()
	 * @generated
	 * @ordered
	 */
	protected BigInteger memoryMaxValue = MEMORY_MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoreMax() <em>Core Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreMax()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CORE_MAX_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getCoreMax() <em>Core Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreMax()
	 * @generated
	 * @ordered
	 */
	protected BigInteger coreMax = CORE_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuSetCpus() <em>Cpu Set Cpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuSetCpus()
	 * @generated
	 * @ordered
	 */
	protected static final String CPU_SET_CPUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpuSetCpus() <em>Cpu Set Cpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuSetCpus()
	 * @generated
	 * @ordered
	 */
	protected String cpuSetCpus = CPU_SET_CPUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuSetMems() <em>Cpu Set Mems</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuSetMems()
	 * @generated
	 * @ordered
	 */
	protected static final String CPU_SET_MEMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpuSetMems() <em>Cpu Set Mems</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuSetMems()
	 * @generated
	 * @ordered
	 */
	protected String cpuSetMems = CPU_SET_MEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #isTty() <em>Tty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTty() <em>Tty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTty()
	 * @generated
	 * @ordered
	 */
	protected boolean tty = TTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.CONTAINER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainerid() {
		return containerid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerid(String newContainerid) {
		String oldContainerid = containerid;
		containerid = newContainerid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__CONTAINERID, oldContainerid, containerid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBuild() {
		return build;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuild(String newBuild) {
		String oldBuild = build;
		build = newBuild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__BUILD, oldBuild, build));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(String newCommand) {
		String oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__COMMAND, oldCommand, command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPorts() {
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorts(String newPorts) {
		String oldPorts = ports;
		ports = newPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__PORTS, oldPorts, ports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpose() {
		return expose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpose(String newExpose) {
		String oldExpose = expose;
		expose = newExpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__EXPOSE, oldExpose, expose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVolumes() {
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumes(String newVolumes) {
		String oldVolumes = volumes;
		volumes = newVolumes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__VOLUMES, oldVolumes, volumes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(String newEnvironment) {
		String oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnvFile() {
		return envFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvFile(String newEnvFile) {
		String oldEnvFile = envFile;
		envFile = newEnvFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__ENV_FILE, oldEnvFile, envFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(String newNet) {
		String oldNet = net;
		net = newNet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__NET, oldNet, net));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDns() {
		return dns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDns(String newDns) {
		String oldDns = dns;
		dns = newDns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__DNS, oldDns, dns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDnsSearch() {
		return dnsSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDnsSearch(String newDnsSearch) {
		String oldDnsSearch = dnsSearch;
		dnsSearch = newDnsSearch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__DNS_SEARCH, oldDnsSearch, dnsSearch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapAdd() {
		return capAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapAdd(String newCapAdd) {
		String oldCapAdd = capAdd;
		capAdd = newCapAdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__CAP_ADD, oldCapAdd, capAdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapDrop() {
		return capDrop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapDrop(String newCapDrop) {
		String oldCapDrop = capDrop;
		capDrop = newCapDrop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__CAP_DROP, oldCapDrop, capDrop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkingDir() {
		return workingDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkingDir(String newWorkingDir) {
		String oldWorkingDir = workingDir;
		workingDir = newWorkingDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__WORKING_DIR, oldWorkingDir, workingDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntrypoint() {
		return entrypoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntrypoint(String newEntrypoint) {
		String oldEntrypoint = entrypoint;
		entrypoint = newEntrypoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__ENTRYPOINT, oldEntrypoint, entrypoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__USER, oldUser, user));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__DOMAIN_NAME, oldDomainName, domainName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMemLimit() {
		return memLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemLimit(BigInteger newMemLimit) {
		BigInteger oldMemLimit = memLimit;
		memLimit = newMemLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__MEM_LIMIT, oldMemLimit, memLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMemorySwap() {
		return memorySwap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemorySwap(BigInteger newMemorySwap) {
		BigInteger oldMemorySwap = memorySwap;
		memorySwap = newMemorySwap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__MEMORY_SWAP, oldMemorySwap, memorySwap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrivileged() {
		return privileged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivileged(boolean newPrivileged) {
		boolean oldPrivileged = privileged;
		privileged = newPrivileged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__PRIVILEGED, oldPrivileged, privileged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRestart() {
		return restart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestart(String newRestart) {
		String oldRestart = restart;
		restart = newRestart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__RESTART, oldRestart, restart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStdinOpen() {
		return stdinOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStdinOpen(boolean newStdinOpen) {
		boolean oldStdinOpen = stdinOpen;
		stdinOpen = newStdinOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__STDIN_OPEN, oldStdinOpen, stdinOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInteractive() {
		return interactive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractive(boolean newInteractive) {
		boolean oldInteractive = interactive;
		interactive = newInteractive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__INTERACTIVE, oldInteractive, interactive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCpuShares() {
		return cpuShares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuShares(BigInteger newCpuShares) {
		BigInteger oldCpuShares = cpuShares;
		cpuShares = newCpuShares;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__CPU_SHARES, oldCpuShares, cpuShares));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPid() {
		return pid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPid(String newPid) {
		String oldPid = pid;
		pid = newPid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__PID, oldPid, pid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIpc() {
		return ipc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpc(String newIpc) {
		String oldIpc = ipc;
		ipc = newIpc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__IPC, oldIpc, ipc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddHost() {
		return addHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddHost(String newAddHost) {
		String oldAddHost = addHost;
		addHost = newAddHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__ADD_HOST, oldAddHost, addHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMacAddress() {
		return macAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMacAddress(String newMacAddress) {
		String oldMacAddress = macAddress;
		macAddress = newMacAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__MAC_ADDRESS, oldMacAddress, macAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRm() {
		return rm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRm(boolean newRm) {
		boolean oldRm = rm;
		rm = newRm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__RM, oldRm, rm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityOpt() {
		return securityOpt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityOpt(String newSecurityOpt) {
		String oldSecurityOpt = securityOpt;
		securityOpt = newSecurityOpt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__SECURITY_OPT, oldSecurityOpt, securityOpt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(String newDevice) {
		String oldDevice = device;
		device = newDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLxcConf() {
		return lxcConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLxcConf(String newLxcConf) {
		String oldLxcConf = lxcConf;
		lxcConf = newLxcConf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__LXC_CONF, oldLxcConf, lxcConf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublishAll() {
		return publishAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishAll(boolean newPublishAll) {
		boolean oldPublishAll = publishAll;
		publishAll = newPublishAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__PUBLISH_ALL, oldPublishAll, publishAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMonitored() {
		return monitored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitored(boolean newMonitored) {
		boolean oldMonitored = monitored;
		monitored = newMonitored;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__MONITORED, oldMonitored, monitored));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCpuUsed() {
		return cpuUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuUsed(BigInteger newCpuUsed) {
		BigInteger oldCpuUsed = cpuUsed;
		cpuUsed = newCpuUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__CPU_USED, oldCpuUsed, cpuUsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMemoryUsed() {
		return memoryUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryUsed(BigInteger newMemoryUsed) {
		BigInteger oldMemoryUsed = memoryUsed;
		memoryUsed = newMemoryUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__MEMORY_USED, oldMemoryUsed, memoryUsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCpuPercent() {
		return cpuPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuPercent(String newCpuPercent) {
		String oldCpuPercent = cpuPercent;
		cpuPercent = newCpuPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__CPU_PERCENT, oldCpuPercent, cpuPercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemoryPercent() {
		return memoryPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryPercent(String newMemoryPercent) {
		String oldMemoryPercent = memoryPercent;
		memoryPercent = newMemoryPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__MEMORY_PERCENT, oldMemoryPercent, memoryPercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDiskUsed() {
		return diskUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiskUsed(BigInteger newDiskUsed) {
		BigInteger oldDiskUsed = diskUsed;
		diskUsed = newDiskUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__DISK_USED, oldDiskUsed, diskUsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiskPercent() {
		return diskPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiskPercent(String newDiskPercent) {
		String oldDiskPercent = diskPercent;
		diskPercent = newDiskPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__DISK_PERCENT, oldDiskPercent, diskPercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBandwidthUsed() {
		return bandwidthUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBandwidthUsed(BigInteger newBandwidthUsed) {
		BigInteger oldBandwidthUsed = bandwidthUsed;
		bandwidthUsed = newBandwidthUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__BANDWIDTH_USED, oldBandwidthUsed, bandwidthUsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBandwidthPercent() {
		return bandwidthPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBandwidthPercent(String newBandwidthPercent) {
		String oldBandwidthPercent = bandwidthPercent;
		bandwidthPercent = newBandwidthPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__BANDWIDTH_PERCENT, oldBandwidthPercent, bandwidthPercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMonitoringInterval() {
		return monitoringInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoringInterval(BigInteger newMonitoringInterval) {
		BigInteger oldMonitoringInterval = monitoringInterval;
		monitoringInterval = newMonitoringInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__MONITORING_INTERVAL, oldMonitoringInterval, monitoringInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCpuMaxValue() {
		return cpuMaxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuMaxValue(BigInteger newCpuMaxValue) {
		BigInteger oldCpuMaxValue = cpuMaxValue;
		cpuMaxValue = newCpuMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__CPU_MAX_VALUE, oldCpuMaxValue, cpuMaxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMemoryMaxValue() {
		return memoryMaxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryMaxValue(BigInteger newMemoryMaxValue) {
		BigInteger oldMemoryMaxValue = memoryMaxValue;
		memoryMaxValue = newMemoryMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__MEMORY_MAX_VALUE, oldMemoryMaxValue, memoryMaxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCoreMax() {
		return coreMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreMax(BigInteger newCoreMax) {
		BigInteger oldCoreMax = coreMax;
		coreMax = newCoreMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__CORE_MAX, oldCoreMax, coreMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCpuSetCpus() {
		return cpuSetCpus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuSetCpus(String newCpuSetCpus) {
		String oldCpuSetCpus = cpuSetCpus;
		cpuSetCpus = newCpuSetCpus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__CPU_SET_CPUS, oldCpuSetCpus, cpuSetCpus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCpuSetMems() {
		return cpuSetMems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuSetMems(String newCpuSetMems) {
		String oldCpuSetMems = cpuSetMems;
		cpuSetMems = newCpuSetMems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__CPU_SET_MEMS, oldCpuSetMems, cpuSetMems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTty() {
		return tty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTty(boolean newTty) {
		boolean oldTty = tty;
		tty = newTty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__TTY, oldTty, tty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void create() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Container!create()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Container!stop()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Container!run()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pause() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Container!pause()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unpause() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Container!unpause()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void kill(final String signal) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Container!kill(String)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.CONTAINER__NAME:
				return getName();
			case DockerPackage.CONTAINER__CONTAINERID:
				return getContainerid();
			case DockerPackage.CONTAINER__IMAGE:
				return getImage();
			case DockerPackage.CONTAINER__BUILD:
				return getBuild();
			case DockerPackage.CONTAINER__COMMAND:
				return getCommand();
			case DockerPackage.CONTAINER__PORTS:
				return getPorts();
			case DockerPackage.CONTAINER__EXPOSE:
				return getExpose();
			case DockerPackage.CONTAINER__VOLUMES:
				return getVolumes();
			case DockerPackage.CONTAINER__ENVIRONMENT:
				return getEnvironment();
			case DockerPackage.CONTAINER__ENV_FILE:
				return getEnvFile();
			case DockerPackage.CONTAINER__NET:
				return getNet();
			case DockerPackage.CONTAINER__DNS:
				return getDns();
			case DockerPackage.CONTAINER__DNS_SEARCH:
				return getDnsSearch();
			case DockerPackage.CONTAINER__CAP_ADD:
				return getCapAdd();
			case DockerPackage.CONTAINER__CAP_DROP:
				return getCapDrop();
			case DockerPackage.CONTAINER__WORKING_DIR:
				return getWorkingDir();
			case DockerPackage.CONTAINER__ENTRYPOINT:
				return getEntrypoint();
			case DockerPackage.CONTAINER__USER:
				return getUser();
			case DockerPackage.CONTAINER__DOMAIN_NAME:
				return getDomainName();
			case DockerPackage.CONTAINER__MEM_LIMIT:
				return getMemLimit();
			case DockerPackage.CONTAINER__MEMORY_SWAP:
				return getMemorySwap();
			case DockerPackage.CONTAINER__PRIVILEGED:
				return isPrivileged();
			case DockerPackage.CONTAINER__RESTART:
				return getRestart();
			case DockerPackage.CONTAINER__STDIN_OPEN:
				return isStdinOpen();
			case DockerPackage.CONTAINER__INTERACTIVE:
				return isInteractive();
			case DockerPackage.CONTAINER__CPU_SHARES:
				return getCpuShares();
			case DockerPackage.CONTAINER__PID:
				return getPid();
			case DockerPackage.CONTAINER__IPC:
				return getIpc();
			case DockerPackage.CONTAINER__ADD_HOST:
				return getAddHost();
			case DockerPackage.CONTAINER__MAC_ADDRESS:
				return getMacAddress();
			case DockerPackage.CONTAINER__RM:
				return isRm();
			case DockerPackage.CONTAINER__SECURITY_OPT:
				return getSecurityOpt();
			case DockerPackage.CONTAINER__DEVICE:
				return getDevice();
			case DockerPackage.CONTAINER__LXC_CONF:
				return getLxcConf();
			case DockerPackage.CONTAINER__PUBLISH_ALL:
				return isPublishAll();
			case DockerPackage.CONTAINER__READ_ONLY:
				return isReadOnly();
			case DockerPackage.CONTAINER__MONITORED:
				return isMonitored();
			case DockerPackage.CONTAINER__CPU_USED:
				return getCpuUsed();
			case DockerPackage.CONTAINER__MEMORY_USED:
				return getMemoryUsed();
			case DockerPackage.CONTAINER__CPU_PERCENT:
				return getCpuPercent();
			case DockerPackage.CONTAINER__MEMORY_PERCENT:
				return getMemoryPercent();
			case DockerPackage.CONTAINER__DISK_USED:
				return getDiskUsed();
			case DockerPackage.CONTAINER__DISK_PERCENT:
				return getDiskPercent();
			case DockerPackage.CONTAINER__BANDWIDTH_USED:
				return getBandwidthUsed();
			case DockerPackage.CONTAINER__BANDWIDTH_PERCENT:
				return getBandwidthPercent();
			case DockerPackage.CONTAINER__MONITORING_INTERVAL:
				return getMonitoringInterval();
			case DockerPackage.CONTAINER__CPU_MAX_VALUE:
				return getCpuMaxValue();
			case DockerPackage.CONTAINER__MEMORY_MAX_VALUE:
				return getMemoryMaxValue();
			case DockerPackage.CONTAINER__CORE_MAX:
				return getCoreMax();
			case DockerPackage.CONTAINER__CPU_SET_CPUS:
				return getCpuSetCpus();
			case DockerPackage.CONTAINER__CPU_SET_MEMS:
				return getCpuSetMems();
			case DockerPackage.CONTAINER__TTY:
				return isTty();
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
			case DockerPackage.CONTAINER__NAME:
				setName((String)newValue);
				return;
			case DockerPackage.CONTAINER__CONTAINERID:
				setContainerid((String)newValue);
				return;
			case DockerPackage.CONTAINER__IMAGE:
				setImage((String)newValue);
				return;
			case DockerPackage.CONTAINER__BUILD:
				setBuild((String)newValue);
				return;
			case DockerPackage.CONTAINER__COMMAND:
				setCommand((String)newValue);
				return;
			case DockerPackage.CONTAINER__PORTS:
				setPorts((String)newValue);
				return;
			case DockerPackage.CONTAINER__EXPOSE:
				setExpose((String)newValue);
				return;
			case DockerPackage.CONTAINER__VOLUMES:
				setVolumes((String)newValue);
				return;
			case DockerPackage.CONTAINER__ENVIRONMENT:
				setEnvironment((String)newValue);
				return;
			case DockerPackage.CONTAINER__ENV_FILE:
				setEnvFile((String)newValue);
				return;
			case DockerPackage.CONTAINER__NET:
				setNet((String)newValue);
				return;
			case DockerPackage.CONTAINER__DNS:
				setDns((String)newValue);
				return;
			case DockerPackage.CONTAINER__DNS_SEARCH:
				setDnsSearch((String)newValue);
				return;
			case DockerPackage.CONTAINER__CAP_ADD:
				setCapAdd((String)newValue);
				return;
			case DockerPackage.CONTAINER__CAP_DROP:
				setCapDrop((String)newValue);
				return;
			case DockerPackage.CONTAINER__WORKING_DIR:
				setWorkingDir((String)newValue);
				return;
			case DockerPackage.CONTAINER__ENTRYPOINT:
				setEntrypoint((String)newValue);
				return;
			case DockerPackage.CONTAINER__USER:
				setUser((String)newValue);
				return;
			case DockerPackage.CONTAINER__DOMAIN_NAME:
				setDomainName((String)newValue);
				return;
			case DockerPackage.CONTAINER__MEM_LIMIT:
				setMemLimit((BigInteger)newValue);
				return;
			case DockerPackage.CONTAINER__MEMORY_SWAP:
				setMemorySwap((BigInteger)newValue);
				return;
			case DockerPackage.CONTAINER__PRIVILEGED:
				setPrivileged((Boolean)newValue);
				return;
			case DockerPackage.CONTAINER__RESTART:
				setRestart((String)newValue);
				return;
			case DockerPackage.CONTAINER__STDIN_OPEN:
				setStdinOpen((Boolean)newValue);
				return;
			case DockerPackage.CONTAINER__INTERACTIVE:
				setInteractive((Boolean)newValue);
				return;
			case DockerPackage.CONTAINER__CPU_SHARES:
				setCpuShares((BigInteger)newValue);
				return;
			case DockerPackage.CONTAINER__PID:
				setPid((String)newValue);
				return;
			case DockerPackage.CONTAINER__IPC:
				setIpc((String)newValue);
				return;
			case DockerPackage.CONTAINER__ADD_HOST:
				setAddHost((String)newValue);
				return;
			case DockerPackage.CONTAINER__MAC_ADDRESS:
				setMacAddress((String)newValue);
				return;
			case DockerPackage.CONTAINER__RM:
				setRm((Boolean)newValue);
				return;
			case DockerPackage.CONTAINER__SECURITY_OPT:
				setSecurityOpt((String)newValue);
				return;
			case DockerPackage.CONTAINER__DEVICE:
				setDevice((String)newValue);
				return;
			case DockerPackage.CONTAINER__LXC_CONF:
				setLxcConf((String)newValue);
				return;
			case DockerPackage.CONTAINER__PUBLISH_ALL:
				setPublishAll((Boolean)newValue);
				return;
			case DockerPackage.CONTAINER__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case DockerPackage.CONTAINER__MONITORED:
				setMonitored((Boolean)newValue);
				return;
			case DockerPackage.CONTAINER__CPU_USED:
				setCpuUsed((BigInteger)newValue);
				return;
			case DockerPackage.CONTAINER__MEMORY_USED:
				setMemoryUsed((BigInteger)newValue);
				return;
			case DockerPackage.CONTAINER__CPU_PERCENT:
				setCpuPercent((String)newValue);
				return;
			case DockerPackage.CONTAINER__MEMORY_PERCENT:
				setMemoryPercent((String)newValue);
				return;
			case DockerPackage.CONTAINER__DISK_USED:
				setDiskUsed((BigInteger)newValue);
				return;
			case DockerPackage.CONTAINER__DISK_PERCENT:
				setDiskPercent((String)newValue);
				return;
			case DockerPackage.CONTAINER__BANDWIDTH_USED:
				setBandwidthUsed((BigInteger)newValue);
				return;
			case DockerPackage.CONTAINER__BANDWIDTH_PERCENT:
				setBandwidthPercent((String)newValue);
				return;
			case DockerPackage.CONTAINER__MONITORING_INTERVAL:
				setMonitoringInterval((BigInteger)newValue);
				return;
			case DockerPackage.CONTAINER__CPU_MAX_VALUE:
				setCpuMaxValue((BigInteger)newValue);
				return;
			case DockerPackage.CONTAINER__MEMORY_MAX_VALUE:
				setMemoryMaxValue((BigInteger)newValue);
				return;
			case DockerPackage.CONTAINER__CORE_MAX:
				setCoreMax((BigInteger)newValue);
				return;
			case DockerPackage.CONTAINER__CPU_SET_CPUS:
				setCpuSetCpus((String)newValue);
				return;
			case DockerPackage.CONTAINER__CPU_SET_MEMS:
				setCpuSetMems((String)newValue);
				return;
			case DockerPackage.CONTAINER__TTY:
				setTty((Boolean)newValue);
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
			case DockerPackage.CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__CONTAINERID:
				setContainerid(CONTAINERID_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__BUILD:
				setBuild(BUILD_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__COMMAND:
				setCommand(COMMAND_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__PORTS:
				setPorts(PORTS_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__EXPOSE:
				setExpose(EXPOSE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__VOLUMES:
				setVolumes(VOLUMES_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__ENVIRONMENT:
				setEnvironment(ENVIRONMENT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__ENV_FILE:
				setEnvFile(ENV_FILE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__NET:
				setNet(NET_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__DNS:
				setDns(DNS_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__DNS_SEARCH:
				setDnsSearch(DNS_SEARCH_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__CAP_ADD:
				setCapAdd(CAP_ADD_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__CAP_DROP:
				setCapDrop(CAP_DROP_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__WORKING_DIR:
				setWorkingDir(WORKING_DIR_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__ENTRYPOINT:
				setEntrypoint(ENTRYPOINT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__USER:
				setUser(USER_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__DOMAIN_NAME:
				setDomainName(DOMAIN_NAME_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__MEM_LIMIT:
				setMemLimit(MEM_LIMIT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__MEMORY_SWAP:
				setMemorySwap(MEMORY_SWAP_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__PRIVILEGED:
				setPrivileged(PRIVILEGED_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__RESTART:
				setRestart(RESTART_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__STDIN_OPEN:
				setStdinOpen(STDIN_OPEN_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__INTERACTIVE:
				setInteractive(INTERACTIVE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__CPU_SHARES:
				setCpuShares(CPU_SHARES_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__PID:
				setPid(PID_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__IPC:
				setIpc(IPC_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__ADD_HOST:
				setAddHost(ADD_HOST_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__MAC_ADDRESS:
				setMacAddress(MAC_ADDRESS_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__RM:
				setRm(RM_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__SECURITY_OPT:
				setSecurityOpt(SECURITY_OPT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__DEVICE:
				setDevice(DEVICE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__LXC_CONF:
				setLxcConf(LXC_CONF_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__PUBLISH_ALL:
				setPublishAll(PUBLISH_ALL_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__MONITORED:
				setMonitored(MONITORED_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__CPU_USED:
				setCpuUsed(CPU_USED_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__MEMORY_USED:
				setMemoryUsed(MEMORY_USED_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__CPU_PERCENT:
				setCpuPercent(CPU_PERCENT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__MEMORY_PERCENT:
				setMemoryPercent(MEMORY_PERCENT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__DISK_USED:
				setDiskUsed(DISK_USED_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__DISK_PERCENT:
				setDiskPercent(DISK_PERCENT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__BANDWIDTH_USED:
				setBandwidthUsed(BANDWIDTH_USED_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__BANDWIDTH_PERCENT:
				setBandwidthPercent(BANDWIDTH_PERCENT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__MONITORING_INTERVAL:
				setMonitoringInterval(MONITORING_INTERVAL_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__CPU_MAX_VALUE:
				setCpuMaxValue(CPU_MAX_VALUE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__MEMORY_MAX_VALUE:
				setMemoryMaxValue(MEMORY_MAX_VALUE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__CORE_MAX:
				setCoreMax(CORE_MAX_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__CPU_SET_CPUS:
				setCpuSetCpus(CPU_SET_CPUS_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__CPU_SET_MEMS:
				setCpuSetMems(CPU_SET_MEMS_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__TTY:
				setTty(TTY_EDEFAULT);
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
			case DockerPackage.CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DockerPackage.CONTAINER__CONTAINERID:
				return CONTAINERID_EDEFAULT == null ? containerid != null : !CONTAINERID_EDEFAULT.equals(containerid);
			case DockerPackage.CONTAINER__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case DockerPackage.CONTAINER__BUILD:
				return BUILD_EDEFAULT == null ? build != null : !BUILD_EDEFAULT.equals(build);
			case DockerPackage.CONTAINER__COMMAND:
				return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
			case DockerPackage.CONTAINER__PORTS:
				return PORTS_EDEFAULT == null ? ports != null : !PORTS_EDEFAULT.equals(ports);
			case DockerPackage.CONTAINER__EXPOSE:
				return EXPOSE_EDEFAULT == null ? expose != null : !EXPOSE_EDEFAULT.equals(expose);
			case DockerPackage.CONTAINER__VOLUMES:
				return VOLUMES_EDEFAULT == null ? volumes != null : !VOLUMES_EDEFAULT.equals(volumes);
			case DockerPackage.CONTAINER__ENVIRONMENT:
				return ENVIRONMENT_EDEFAULT == null ? environment != null : !ENVIRONMENT_EDEFAULT.equals(environment);
			case DockerPackage.CONTAINER__ENV_FILE:
				return ENV_FILE_EDEFAULT == null ? envFile != null : !ENV_FILE_EDEFAULT.equals(envFile);
			case DockerPackage.CONTAINER__NET:
				return NET_EDEFAULT == null ? net != null : !NET_EDEFAULT.equals(net);
			case DockerPackage.CONTAINER__DNS:
				return DNS_EDEFAULT == null ? dns != null : !DNS_EDEFAULT.equals(dns);
			case DockerPackage.CONTAINER__DNS_SEARCH:
				return DNS_SEARCH_EDEFAULT == null ? dnsSearch != null : !DNS_SEARCH_EDEFAULT.equals(dnsSearch);
			case DockerPackage.CONTAINER__CAP_ADD:
				return CAP_ADD_EDEFAULT == null ? capAdd != null : !CAP_ADD_EDEFAULT.equals(capAdd);
			case DockerPackage.CONTAINER__CAP_DROP:
				return CAP_DROP_EDEFAULT == null ? capDrop != null : !CAP_DROP_EDEFAULT.equals(capDrop);
			case DockerPackage.CONTAINER__WORKING_DIR:
				return WORKING_DIR_EDEFAULT == null ? workingDir != null : !WORKING_DIR_EDEFAULT.equals(workingDir);
			case DockerPackage.CONTAINER__ENTRYPOINT:
				return ENTRYPOINT_EDEFAULT == null ? entrypoint != null : !ENTRYPOINT_EDEFAULT.equals(entrypoint);
			case DockerPackage.CONTAINER__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case DockerPackage.CONTAINER__DOMAIN_NAME:
				return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
			case DockerPackage.CONTAINER__MEM_LIMIT:
				return MEM_LIMIT_EDEFAULT == null ? memLimit != null : !MEM_LIMIT_EDEFAULT.equals(memLimit);
			case DockerPackage.CONTAINER__MEMORY_SWAP:
				return MEMORY_SWAP_EDEFAULT == null ? memorySwap != null : !MEMORY_SWAP_EDEFAULT.equals(memorySwap);
			case DockerPackage.CONTAINER__PRIVILEGED:
				return privileged != PRIVILEGED_EDEFAULT;
			case DockerPackage.CONTAINER__RESTART:
				return RESTART_EDEFAULT == null ? restart != null : !RESTART_EDEFAULT.equals(restart);
			case DockerPackage.CONTAINER__STDIN_OPEN:
				return stdinOpen != STDIN_OPEN_EDEFAULT;
			case DockerPackage.CONTAINER__INTERACTIVE:
				return interactive != INTERACTIVE_EDEFAULT;
			case DockerPackage.CONTAINER__CPU_SHARES:
				return CPU_SHARES_EDEFAULT == null ? cpuShares != null : !CPU_SHARES_EDEFAULT.equals(cpuShares);
			case DockerPackage.CONTAINER__PID:
				return PID_EDEFAULT == null ? pid != null : !PID_EDEFAULT.equals(pid);
			case DockerPackage.CONTAINER__IPC:
				return IPC_EDEFAULT == null ? ipc != null : !IPC_EDEFAULT.equals(ipc);
			case DockerPackage.CONTAINER__ADD_HOST:
				return ADD_HOST_EDEFAULT == null ? addHost != null : !ADD_HOST_EDEFAULT.equals(addHost);
			case DockerPackage.CONTAINER__MAC_ADDRESS:
				return MAC_ADDRESS_EDEFAULT == null ? macAddress != null : !MAC_ADDRESS_EDEFAULT.equals(macAddress);
			case DockerPackage.CONTAINER__RM:
				return rm != RM_EDEFAULT;
			case DockerPackage.CONTAINER__SECURITY_OPT:
				return SECURITY_OPT_EDEFAULT == null ? securityOpt != null : !SECURITY_OPT_EDEFAULT.equals(securityOpt);
			case DockerPackage.CONTAINER__DEVICE:
				return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
			case DockerPackage.CONTAINER__LXC_CONF:
				return LXC_CONF_EDEFAULT == null ? lxcConf != null : !LXC_CONF_EDEFAULT.equals(lxcConf);
			case DockerPackage.CONTAINER__PUBLISH_ALL:
				return publishAll != PUBLISH_ALL_EDEFAULT;
			case DockerPackage.CONTAINER__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case DockerPackage.CONTAINER__MONITORED:
				return monitored != MONITORED_EDEFAULT;
			case DockerPackage.CONTAINER__CPU_USED:
				return CPU_USED_EDEFAULT == null ? cpuUsed != null : !CPU_USED_EDEFAULT.equals(cpuUsed);
			case DockerPackage.CONTAINER__MEMORY_USED:
				return MEMORY_USED_EDEFAULT == null ? memoryUsed != null : !MEMORY_USED_EDEFAULT.equals(memoryUsed);
			case DockerPackage.CONTAINER__CPU_PERCENT:
				return CPU_PERCENT_EDEFAULT == null ? cpuPercent != null : !CPU_PERCENT_EDEFAULT.equals(cpuPercent);
			case DockerPackage.CONTAINER__MEMORY_PERCENT:
				return MEMORY_PERCENT_EDEFAULT == null ? memoryPercent != null : !MEMORY_PERCENT_EDEFAULT.equals(memoryPercent);
			case DockerPackage.CONTAINER__DISK_USED:
				return DISK_USED_EDEFAULT == null ? diskUsed != null : !DISK_USED_EDEFAULT.equals(diskUsed);
			case DockerPackage.CONTAINER__DISK_PERCENT:
				return DISK_PERCENT_EDEFAULT == null ? diskPercent != null : !DISK_PERCENT_EDEFAULT.equals(diskPercent);
			case DockerPackage.CONTAINER__BANDWIDTH_USED:
				return BANDWIDTH_USED_EDEFAULT == null ? bandwidthUsed != null : !BANDWIDTH_USED_EDEFAULT.equals(bandwidthUsed);
			case DockerPackage.CONTAINER__BANDWIDTH_PERCENT:
				return BANDWIDTH_PERCENT_EDEFAULT == null ? bandwidthPercent != null : !BANDWIDTH_PERCENT_EDEFAULT.equals(bandwidthPercent);
			case DockerPackage.CONTAINER__MONITORING_INTERVAL:
				return MONITORING_INTERVAL_EDEFAULT == null ? monitoringInterval != null : !MONITORING_INTERVAL_EDEFAULT.equals(monitoringInterval);
			case DockerPackage.CONTAINER__CPU_MAX_VALUE:
				return CPU_MAX_VALUE_EDEFAULT == null ? cpuMaxValue != null : !CPU_MAX_VALUE_EDEFAULT.equals(cpuMaxValue);
			case DockerPackage.CONTAINER__MEMORY_MAX_VALUE:
				return MEMORY_MAX_VALUE_EDEFAULT == null ? memoryMaxValue != null : !MEMORY_MAX_VALUE_EDEFAULT.equals(memoryMaxValue);
			case DockerPackage.CONTAINER__CORE_MAX:
				return CORE_MAX_EDEFAULT == null ? coreMax != null : !CORE_MAX_EDEFAULT.equals(coreMax);
			case DockerPackage.CONTAINER__CPU_SET_CPUS:
				return CPU_SET_CPUS_EDEFAULT == null ? cpuSetCpus != null : !CPU_SET_CPUS_EDEFAULT.equals(cpuSetCpus);
			case DockerPackage.CONTAINER__CPU_SET_MEMS:
				return CPU_SET_MEMS_EDEFAULT == null ? cpuSetMems != null : !CPU_SET_MEMS_EDEFAULT.equals(cpuSetMems);
			case DockerPackage.CONTAINER__TTY:
				return tty != TTY_EDEFAULT;
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
			case DockerPackage.CONTAINER___CREATE:
				create();
				return null;
			case DockerPackage.CONTAINER___STOP:
				stop();
				return null;
			case DockerPackage.CONTAINER___RUN:
				run();
				return null;
			case DockerPackage.CONTAINER___PAUSE:
				pause();
				return null;
			case DockerPackage.CONTAINER___UNPAUSE:
				unpause();
				return null;
			case DockerPackage.CONTAINER___KILL__STRING:
				kill((String)arguments.get(0));
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
		result.append(", containerid: ");
		result.append(containerid);
		result.append(", image: ");
		result.append(image);
		result.append(", build: ");
		result.append(build);
		result.append(", command: ");
		result.append(command);
		result.append(", ports: ");
		result.append(ports);
		result.append(", expose: ");
		result.append(expose);
		result.append(", volumes: ");
		result.append(volumes);
		result.append(", environment: ");
		result.append(environment);
		result.append(", envFile: ");
		result.append(envFile);
		result.append(", net: ");
		result.append(net);
		result.append(", dns: ");
		result.append(dns);
		result.append(", dnsSearch: ");
		result.append(dnsSearch);
		result.append(", capAdd: ");
		result.append(capAdd);
		result.append(", capDrop: ");
		result.append(capDrop);
		result.append(", workingDir: ");
		result.append(workingDir);
		result.append(", entrypoint: ");
		result.append(entrypoint);
		result.append(", user: ");
		result.append(user);
		result.append(", domainName: ");
		result.append(domainName);
		result.append(", memLimit: ");
		result.append(memLimit);
		result.append(", memorySwap: ");
		result.append(memorySwap);
		result.append(", privileged: ");
		result.append(privileged);
		result.append(", restart: ");
		result.append(restart);
		result.append(", stdinOpen: ");
		result.append(stdinOpen);
		result.append(", interactive: ");
		result.append(interactive);
		result.append(", cpuShares: ");
		result.append(cpuShares);
		result.append(", pid: ");
		result.append(pid);
		result.append(", ipc: ");
		result.append(ipc);
		result.append(", addHost: ");
		result.append(addHost);
		result.append(", macAddress: ");
		result.append(macAddress);
		result.append(", rm: ");
		result.append(rm);
		result.append(", securityOpt: ");
		result.append(securityOpt);
		result.append(", device: ");
		result.append(device);
		result.append(", lxcConf: ");
		result.append(lxcConf);
		result.append(", publishAll: ");
		result.append(publishAll);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(", monitored: ");
		result.append(monitored);
		result.append(", cpuUsed: ");
		result.append(cpuUsed);
		result.append(", memoryUsed: ");
		result.append(memoryUsed);
		result.append(", cpuPercent: ");
		result.append(cpuPercent);
		result.append(", memoryPercent: ");
		result.append(memoryPercent);
		result.append(", diskUsed: ");
		result.append(diskUsed);
		result.append(", diskPercent: ");
		result.append(diskPercent);
		result.append(", bandwidthUsed: ");
		result.append(bandwidthUsed);
		result.append(", bandwidthPercent: ");
		result.append(bandwidthPercent);
		result.append(", monitoringInterval: ");
		result.append(monitoringInterval);
		result.append(", cpuMaxValue: ");
		result.append(cpuMaxValue);
		result.append(", memoryMaxValue: ");
		result.append(memoryMaxValue);
		result.append(", coreMax: ");
		result.append(coreMax);
		result.append(", cpuSetCpus: ");
		result.append(cpuSetCpus);
		result.append(", cpuSetMems: ");
		result.append(cpuSetMems);
		result.append(", tty: ");
		result.append(tty);
		result.append(')');
		return result.toString();
	}

} //ContainerImpl
