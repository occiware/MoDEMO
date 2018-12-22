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
package org.eclipse.cmf.occi.docker;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.docker.DockerFactory
 * @model kind="package"
 * @generated
 */
public interface DockerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "docker";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/occi/docker/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "docker";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DockerPackage eINSTANCE = org.eclipse.cmf.occi.docker.impl.DockerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.ArrayOfStringImpl <em>Array Of String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.ArrayOfStringImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getArrayOfString()
	 * @generated
	 */
	int ARRAY_OF_STRING = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OF_STRING__VALUES = 0;

	/**
	 * The number of structural features of the '<em>Array Of String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OF_STRING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Array Of String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OF_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.ContainerImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ID = InfrastructurePackage.COMPUTE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TITLE = InfrastructurePackage.COMPUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__KIND = InfrastructurePackage.COMPUTE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LOCATION = InfrastructurePackage.COMPUTE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ATTRIBUTES = InfrastructurePackage.COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MIXINS = InfrastructurePackage.COMPUTE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PARTS = InfrastructurePackage.COMPUTE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__SUMMARY = InfrastructurePackage.COMPUTE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LINKS = InfrastructurePackage.COMPUTE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__RLINKS = InfrastructurePackage.COMPUTE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OCCI_COMPUTE_ARCHITECTURE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OCCI_COMPUTE_CORES = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OCCI_COMPUTE_HOSTNAME = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OCCI_COMPUTE_SHARE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OCCI_COMPUTE_SPEED = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OCCI_COMPUTE_MEMORY = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OCCI_COMPUTE_STATE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OCCI_COMPUTE_STATE_MESSAGE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containerid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTAINERID = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IMAGE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Build</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__BUILD = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__COMMAND = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PORTS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Expose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__EXPOSE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__VOLUMES = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ENVIRONMENT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Env File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ENV_FILE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Net</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NET = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Dns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DNS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Dns Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DNS_SEARCH = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Cap Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CAP_ADD = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Cap Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CAP_DROP = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Working Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__WORKING_DIR = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Entrypoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ENTRYPOINT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__USER = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DOMAIN_NAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Mem Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MEM_LIMIT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Memory Swap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MEMORY_SWAP = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Privileged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PRIVILEGED = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__RESTART = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Stdin Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STDIN_OPEN = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Interactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__INTERACTIVE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Cpu Shares</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CPU_SHARES = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PID = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Ipc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IPC = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Add Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ADD_HOST = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Mac Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MAC_ADDRESS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Rm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__RM = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Security Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__SECURITY_OPT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DEVICE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Lxc Conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LXC_CONF = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Publish All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PUBLISH_ALL = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__READ_ONLY = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Monitored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MONITORED = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Cpu Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CPU_USED = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Memory Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MEMORY_USED = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Cpu Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CPU_PERCENT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Memory Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MEMORY_PERCENT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Disk Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DISK_USED = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Disk Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DISK_PERCENT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Bandwidth Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__BANDWIDTH_USED = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Bandwidth Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__BANDWIDTH_PERCENT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Monitoring Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MONITORING_INTERVAL = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Cpu Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CPU_MAX_VALUE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Memory Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MEMORY_MAX_VALUE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Core Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CORE_MAX = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>Cpu Set Cpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CPU_SET_CPUS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>Cpu Set Mems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CPU_SET_MEMS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 50;

	/**
	 * The feature id for the '<em><b>Tty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TTY = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 51;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 52;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___OCCI_CREATE = InfrastructurePackage.COMPUTE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___OCCI_RETRIEVE = InfrastructurePackage.COMPUTE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___OCCI_UPDATE = InfrastructurePackage.COMPUTE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___OCCI_DELETE = InfrastructurePackage.COMPUTE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___START = InfrastructurePackage.COMPUTE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___STOP__STOPMETHOD = InfrastructurePackage.COMPUTE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___RESTART__RESTARTMETHOD = InfrastructurePackage.COMPUTE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___SUSPEND__SUSPENDMETHOD = InfrastructurePackage.COMPUTE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___SAVE__SAVEMETHOD_STRING = InfrastructurePackage.COMPUTE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___CREATE = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___STOP = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___RUN = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Pause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___PAUSE = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Unpause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___UNPAUSE = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Kill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___KILL__STRING = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.LinkImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ALIAS = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.NetworklinkImpl <em>Networklink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.NetworklinkImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getNetworklink()
	 * @generated
	 */
	int NETWORKLINK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKLINK__ID = LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKLINK__TITLE = LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKLINK__KIND = LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKLINK__LOCATION = LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKLINK__ATTRIBUTES = LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKLINK__MIXINS = LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKLINK__PARTS = LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKLINK__SOURCE = LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKLINK__TARGET = LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKLINK__ALIAS = LINK__ALIAS;

	/**
	 * The number of structural features of the '<em>Networklink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKLINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKLINK___OCCI_CREATE = LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKLINK___OCCI_RETRIEVE = LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKLINK___OCCI_UPDATE = LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKLINK___OCCI_DELETE = LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKLINK___LINK_TARGET_INVARIANT__KIND_KIND = LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKLINK___LINK_SOURCE_INVARIANT__KIND_KIND = LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The number of operations of the '<em>Networklink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKLINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.VolumesfromImpl <em>Volumesfrom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.VolumesfromImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getVolumesfrom()
	 * @generated
	 */
	int VOLUMESFROM = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM__MODE = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Volumesfrom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The number of operations of the '<em>Volumesfrom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.ContainsImpl <em>Contains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.ContainsImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getContains()
	 * @generated
	 */
	int CONTAINS = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The number of operations of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.MachineImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ID = InfrastructurePackage.COMPUTE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__TITLE = InfrastructurePackage.COMPUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__KIND = InfrastructurePackage.COMPUTE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__LOCATION = InfrastructurePackage.COMPUTE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ATTRIBUTES = InfrastructurePackage.COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__MIXINS = InfrastructurePackage.COMPUTE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__PARTS = InfrastructurePackage.COMPUTE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SUMMARY = InfrastructurePackage.COMPUTE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__LINKS = InfrastructurePackage.COMPUTE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__RLINKS = InfrastructurePackage.COMPUTE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__OCCI_COMPUTE_ARCHITECTURE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__OCCI_COMPUTE_CORES = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__OCCI_COMPUTE_HOSTNAME = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__OCCI_COMPUTE_SHARE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__OCCI_COMPUTE_SPEED = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__OCCI_COMPUTE_MEMORY = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__OCCI_COMPUTE_STATE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__OCCI_COMPUTE_STATE_MESSAGE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Engine Install URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ENGINE_INSTALL_URL = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Engine Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ENGINE_OPT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Engine Insecure Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ENGINE_INSECURE_REGISTRY = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Engine Registry Mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ENGINE_REGISTRY_MIRROR = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Engine Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ENGINE_LABEL = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Engine Storage Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ENGINE_STORAGE_DRIVER = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Engine Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ENGINE_ENV = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SWARM = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Swarm Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SWARM_IMAGE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Swarm Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SWARM_MASTER = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Swarm Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SWARM_DISCOVERY = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Swarm Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SWARM_STRATEGY = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Swarm Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SWARM_OPT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Swarm Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SWARM_HOST = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Swarm Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SWARM_ADDR = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Swarm Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SWARM_EXPERIMENTAL = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Tls San</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__TLS_SAN = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 18;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___OCCI_CREATE = InfrastructurePackage.COMPUTE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___OCCI_RETRIEVE = InfrastructurePackage.COMPUTE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___OCCI_UPDATE = InfrastructurePackage.COMPUTE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___OCCI_DELETE = InfrastructurePackage.COMPUTE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___START = InfrastructurePackage.COMPUTE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___STOP__STOPMETHOD = InfrastructurePackage.COMPUTE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___RESTART__RESTARTMETHOD = InfrastructurePackage.COMPUTE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___SUSPEND__SUSPENDMETHOD = InfrastructurePackage.COMPUTE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___SAVE__SAVEMETHOD_STRING = InfrastructurePackage.COMPUTE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Startall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___STARTALL = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.VolumeImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__ID = InfrastructurePackage.STORAGE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__TITLE = InfrastructurePackage.STORAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__KIND = InfrastructurePackage.STORAGE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__LOCATION = InfrastructurePackage.STORAGE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__ATTRIBUTES = InfrastructurePackage.STORAGE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__MIXINS = InfrastructurePackage.STORAGE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__PARTS = InfrastructurePackage.STORAGE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__SUMMARY = InfrastructurePackage.STORAGE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__LINKS = InfrastructurePackage.STORAGE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__RLINKS = InfrastructurePackage.STORAGE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__OCCI_STORAGE_SIZE = InfrastructurePackage.STORAGE__OCCI_STORAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Occi Storage State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__OCCI_STORAGE_STATE = InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Storage State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__OCCI_STORAGE_STATE_MESSAGE = InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__DRIVER = InfrastructurePackage.STORAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__LABELS = InfrastructurePackage.STORAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__OPTIONS = InfrastructurePackage.STORAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__SOURCE = InfrastructurePackage.STORAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__DESTINATION = InfrastructurePackage.STORAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__MODE = InfrastructurePackage.STORAGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__RW = InfrastructurePackage.STORAGE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Propagation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__PROPAGATION = InfrastructurePackage.STORAGE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__NAME = InfrastructurePackage.STORAGE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = InfrastructurePackage.STORAGE_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME___OCCI_CREATE = InfrastructurePackage.STORAGE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME___OCCI_RETRIEVE = InfrastructurePackage.STORAGE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME___OCCI_UPDATE = InfrastructurePackage.STORAGE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME___OCCI_DELETE = InfrastructurePackage.STORAGE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Online</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME___ONLINE = InfrastructurePackage.STORAGE___ONLINE;

	/**
	 * The operation id for the '<em>Offline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME___OFFLINE = InfrastructurePackage.STORAGE___OFFLINE;

	/**
	 * The number of operations of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = InfrastructurePackage.STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.NetworkImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ID = InfrastructurePackage.NETWORK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__TITLE = InfrastructurePackage.NETWORK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__KIND = InfrastructurePackage.NETWORK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__LOCATION = InfrastructurePackage.NETWORK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ATTRIBUTES = InfrastructurePackage.NETWORK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__MIXINS = InfrastructurePackage.NETWORK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__PARTS = InfrastructurePackage.NETWORK__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__SUMMARY = InfrastructurePackage.NETWORK__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__LINKS = InfrastructurePackage.NETWORK__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__RLINKS = InfrastructurePackage.NETWORK__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Network Vlan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__OCCI_NETWORK_VLAN = InfrastructurePackage.NETWORK__OCCI_NETWORK_VLAN;

	/**
	 * The feature id for the '<em><b>Occi Network Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__OCCI_NETWORK_LABEL = InfrastructurePackage.NETWORK__OCCI_NETWORK_LABEL;

	/**
	 * The feature id for the '<em><b>Occi Network State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__OCCI_NETWORK_STATE = InfrastructurePackage.NETWORK__OCCI_NETWORK_STATE;

	/**
	 * The feature id for the '<em><b>Occi Network State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__OCCI_NETWORK_STATE_MESSAGE = InfrastructurePackage.NETWORK__OCCI_NETWORK_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Network Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NETWORK_ID = InfrastructurePackage.NETWORK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = InfrastructurePackage.NETWORK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aux Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__AUX_ADDRESS = InfrastructurePackage.NETWORK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__DRIVER = InfrastructurePackage.NETWORK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__GATEWAY = InfrastructurePackage.NETWORK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__INTERNAL = InfrastructurePackage.NETWORK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ip Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__IP_RANGE = InfrastructurePackage.NETWORK_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ipam Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__IPAM_DRIVER = InfrastructurePackage.NETWORK_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ipam Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__IPAM_OPT = InfrastructurePackage.NETWORK_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ipv6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__IPV6 = InfrastructurePackage.NETWORK_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__OPT = InfrastructurePackage.NETWORK_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Subnet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__SUBNET = InfrastructurePackage.NETWORK_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = InfrastructurePackage.NETWORK_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___OCCI_CREATE = InfrastructurePackage.NETWORK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___OCCI_RETRIEVE = InfrastructurePackage.NETWORK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___OCCI_UPDATE = InfrastructurePackage.NETWORK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___OCCI_DELETE = InfrastructurePackage.NETWORK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___UP = InfrastructurePackage.NETWORK___UP;

	/**
	 * The operation id for the '<em>Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___DOWN = InfrastructurePackage.NETWORK___DOWN;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = InfrastructurePackage.NETWORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.MachinegenericImpl <em>Machinegeneric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.MachinegenericImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinegeneric()
	 * @generated
	 */
	int MACHINEGENERIC = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__LOCATION = MACHINE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__PARTS = MACHINE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__RLINKS = MACHINE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__OCCI_COMPUTE_ARCHITECTURE = MACHINE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__OCCI_COMPUTE_CORES = MACHINE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__OCCI_COMPUTE_HOSTNAME = MACHINE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__OCCI_COMPUTE_SHARE = MACHINE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__OCCI_COMPUTE_SPEED = MACHINE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__OCCI_COMPUTE_MEMORY = MACHINE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__OCCI_COMPUTE_STATE = MACHINE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__OCCI_COMPUTE_STATE_MESSAGE = MACHINE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine Install URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine Insecure Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine Registry Mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine Storage Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls San</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Engine Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__ENGINE_PORT = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__IP_ADDRESS = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ssh Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__SSH_KEY = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ssh User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__SSH_USER = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ssh Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC__SSH_PORT = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Machinegeneric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Startall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC___STARTALL = MACHINE___STARTALL;

	/**
	 * The number of operations of the '<em>Machinegeneric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGENERIC_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.Machineamazonec2Impl <em>Machineamazonec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.Machineamazonec2Impl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachineamazonec2()
	 * @generated
	 */
	int MACHINEAMAZONEC2 = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__LOCATION = MACHINE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__PARTS = MACHINE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__RLINKS = MACHINE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__OCCI_COMPUTE_ARCHITECTURE = MACHINE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__OCCI_COMPUTE_CORES = MACHINE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__OCCI_COMPUTE_HOSTNAME = MACHINE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__OCCI_COMPUTE_SHARE = MACHINE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__OCCI_COMPUTE_SPEED = MACHINE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__OCCI_COMPUTE_MEMORY = MACHINE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__OCCI_COMPUTE_STATE = MACHINE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__OCCI_COMPUTE_STATE_MESSAGE = MACHINE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine Install URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine Insecure Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine Registry Mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine Storage Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls San</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Access Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__ACCESS_KEY = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ami</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__AMI = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__INSTANCE_TYPE = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__REGION = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Root Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__ROOT_SIZE = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__SECRET_KEY = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Security Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__SECURITY_GROUP = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Session Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__SESSION_TOKEN = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Subnet Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__SUBNET_ID = MACHINE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Vpc Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__VPC_ID = MACHINE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2__ZONE = MACHINE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Machineamazonec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Startall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2___STARTALL = MACHINE___STARTALL;

	/**
	 * The number of operations of the '<em>Machineamazonec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEAMAZONEC2_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.MachinedigitaloceanImpl <em>Machinedigitalocean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.MachinedigitaloceanImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinedigitalocean()
	 * @generated
	 */
	int MACHINEDIGITALOCEAN = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__LOCATION = MACHINE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__PARTS = MACHINE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__RLINKS = MACHINE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__OCCI_COMPUTE_ARCHITECTURE = MACHINE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__OCCI_COMPUTE_CORES = MACHINE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__OCCI_COMPUTE_HOSTNAME = MACHINE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__OCCI_COMPUTE_SHARE = MACHINE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__OCCI_COMPUTE_SPEED = MACHINE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__OCCI_COMPUTE_MEMORY = MACHINE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__OCCI_COMPUTE_STATE = MACHINE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__OCCI_COMPUTE_STATE_MESSAGE = MACHINE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine Install URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine Insecure Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine Registry Mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine Storage Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls San</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__ACCESS_TOKEN = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__IMAGE = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__REGION = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN__SIZE = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Machinedigitalocean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Startall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN___STARTALL = MACHINE___STARTALL;

	/**
	 * The number of operations of the '<em>Machinedigitalocean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEDIGITALOCEAN_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.MachinegooglecomputeengineImpl <em>Machinegooglecomputeengine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.MachinegooglecomputeengineImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinegooglecomputeengine()
	 * @generated
	 */
	int MACHINEGOOGLECOMPUTEENGINE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__LOCATION = MACHINE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__PARTS = MACHINE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__RLINKS = MACHINE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__OCCI_COMPUTE_ARCHITECTURE = MACHINE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__OCCI_COMPUTE_CORES = MACHINE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__OCCI_COMPUTE_HOSTNAME = MACHINE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__OCCI_COMPUTE_SHARE = MACHINE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__OCCI_COMPUTE_SPEED = MACHINE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__OCCI_COMPUTE_MEMORY = MACHINE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__OCCI_COMPUTE_STATE = MACHINE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__OCCI_COMPUTE_STATE_MESSAGE = MACHINE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine Install URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine Insecure Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine Registry Mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine Storage Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls San</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__ZONE = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Machine Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__MACHINE_TYPE = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__USERNAME = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__INSTANCE_NAME = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE__PROJECT = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Machinegooglecomputeengine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Startall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE___STARTALL = MACHINE___STARTALL;

	/**
	 * The number of operations of the '<em>Machinegooglecomputeengine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGOOGLECOMPUTEENGINE_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.MachineibmsoftlayerImpl <em>Machineibmsoftlayer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.MachineibmsoftlayerImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachineibmsoftlayer()
	 * @generated
	 */
	int MACHINEIBMSOFTLAYER = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__LOCATION = MACHINE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__PARTS = MACHINE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__RLINKS = MACHINE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__OCCI_COMPUTE_ARCHITECTURE = MACHINE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__OCCI_COMPUTE_CORES = MACHINE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__OCCI_COMPUTE_HOSTNAME = MACHINE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__OCCI_COMPUTE_SHARE = MACHINE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__OCCI_COMPUTE_SPEED = MACHINE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__OCCI_COMPUTE_MEMORY = MACHINE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__OCCI_COMPUTE_STATE = MACHINE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__OCCI_COMPUTE_STATE_MESSAGE = MACHINE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine Install URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine Insecure Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine Registry Mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine Storage Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls San</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Api Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__API_ENDPOINT = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__USER = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Api Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__API_KEY = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__CPU = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__DISK_SIZE = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__DOMAIN = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Hourly Billing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__HOURLY_BILLING = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__IMAGE = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Local Disk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__LOCAL_DISK = MACHINE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Private Net Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__PRIVATE_NET_ONLY = MACHINE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__REGION = MACHINE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Public Vlan Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__PUBLIC_VLAN_ID = MACHINE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Private Vlan Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER__PRIVATE_VLAN_ID = MACHINE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Machineibmsoftlayer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Startall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER___STARTALL = MACHINE___STARTALL;

	/**
	 * The number of operations of the '<em>Machineibmsoftlayer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEIBMSOFTLAYER_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl <em>Machinemicrosoftazure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinemicrosoftazure()
	 * @generated
	 */
	int MACHINEMICROSOFTAZURE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__LOCATION = MACHINE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__PARTS = MACHINE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__RLINKS = MACHINE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__OCCI_COMPUTE_ARCHITECTURE = MACHINE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__OCCI_COMPUTE_CORES = MACHINE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__OCCI_COMPUTE_HOSTNAME = MACHINE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__OCCI_COMPUTE_SHARE = MACHINE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__OCCI_COMPUTE_SPEED = MACHINE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__OCCI_COMPUTE_MEMORY = MACHINE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__OCCI_COMPUTE_STATE = MACHINE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__OCCI_COMPUTE_STATE_MESSAGE = MACHINE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine Install URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine Insecure Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine Registry Mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine Storage Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls San</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Subscription Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__SUBSCRIPTION_ID = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subscription Cert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__SUBSCRIPTION_CERT = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__ENVIRONMENT = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Machine Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__MACHINE_LOCATION = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resource Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__RESOURCE_GROUP = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__SIZE = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ssh User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__SSH_USER = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Vnet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__VNET = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Subnet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__SUBNET = MACHINE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Subnet Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__SUBNET_PREFIX = MACHINE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Availability Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__AVAILABILITY_SET = MACHINE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Open Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__OPEN_PORT = MACHINE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Private Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__PRIVATE_IP_ADDRESS = MACHINE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>No Public Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__NO_PUBLIC_IP = MACHINE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Static Public Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__STATIC_PUBLIC_IP = MACHINE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Docker Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__DOCKER_PORT = MACHINE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Use Private Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__USE_PRIVATE_IP = MACHINE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE__IMAGE = MACHINE_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Machinemicrosoftazure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 18;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Startall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE___STARTALL = MACHINE___STARTALL;

	/**
	 * The number of operations of the '<em>Machinemicrosoftazure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTAZURE_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosofthypervImpl <em>Machinemicrosofthyperv</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.MachinemicrosofthypervImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinemicrosofthyperv()
	 * @generated
	 */
	int MACHINEMICROSOFTHYPERV = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__LOCATION = MACHINE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__PARTS = MACHINE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__RLINKS = MACHINE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__OCCI_COMPUTE_ARCHITECTURE = MACHINE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__OCCI_COMPUTE_CORES = MACHINE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__OCCI_COMPUTE_HOSTNAME = MACHINE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__OCCI_COMPUTE_SHARE = MACHINE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__OCCI_COMPUTE_SPEED = MACHINE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__OCCI_COMPUTE_MEMORY = MACHINE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__OCCI_COMPUTE_STATE = MACHINE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__OCCI_COMPUTE_STATE_MESSAGE = MACHINE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine Install URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine Insecure Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine Registry Mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine Storage Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls San</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Virtual Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__VIRTUAL_SWITCH = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boot2docker URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__BOOT2DOCKER_URL = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__DISK_SIZE = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Static Mac Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__STATIC_MAC_ADDRESS = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Vlan Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV__VLAN_ID = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Machinemicrosofthyperv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Startall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV___STARTALL = MACHINE___STARTALL;

	/**
	 * The number of operations of the '<em>Machinemicrosofthyperv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEMICROSOFTHYPERV_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl <em>Machineopenstack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachineopenstack()
	 * @generated
	 */
	int MACHINEOPENSTACK = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__LOCATION = MACHINE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__PARTS = MACHINE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__RLINKS = MACHINE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__OCCI_COMPUTE_ARCHITECTURE = MACHINE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__OCCI_COMPUTE_CORES = MACHINE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__OCCI_COMPUTE_HOSTNAME = MACHINE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__OCCI_COMPUTE_SHARE = MACHINE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__OCCI_COMPUTE_SPEED = MACHINE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__OCCI_COMPUTE_MEMORY = MACHINE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__OCCI_COMPUTE_STATE = MACHINE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__OCCI_COMPUTE_STATE_MESSAGE = MACHINE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine Install URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine Insecure Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine Registry Mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine Storage Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls San</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Flavor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__FLAVOR_ID = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flavor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__FLAVOR_NAME = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__IMAGE_ID = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Image Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__IMAGE_NAME = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Auth Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__AUTH_URL = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__USERNAME = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__PASSWORD = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tenant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__TENANT_NAME = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Tenant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__TENANT_ID = MACHINE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__REGION = MACHINE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Endpoint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__ENDPOINT_TYPE = MACHINE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Net Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__NET_ID = MACHINE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Net Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__NET_NAME = MACHINE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Sec Groups</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__SEC_GROUPS = MACHINE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Floating Ip Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__FLOATING_IP_POOL = MACHINE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Active Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__ACTIVE_TIME_OUT = MACHINE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Availability Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__AVAILABILITY_ZONE = MACHINE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Domain Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__DOMAIN_ID = MACHINE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__DOMAIN_NAME = MACHINE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Insecure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__INSECURE = MACHINE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Ip Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__IP_VERSION = MACHINE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Keypair Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__KEYPAIR_NAME = MACHINE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Private Key File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__PRIVATE_KEY_FILE = MACHINE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Ssh Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__SSH_PORT = MACHINE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Ssh User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK__SSH_USER = MACHINE_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>Machineopenstack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 25;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Startall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK___STARTALL = MACHINE___STARTALL;

	/**
	 * The number of operations of the '<em>Machineopenstack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEOPENSTACK_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.MachinerackspaceImpl <em>Machinerackspace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.MachinerackspaceImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinerackspace()
	 * @generated
	 */
	int MACHINERACKSPACE = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__LOCATION = MACHINE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__PARTS = MACHINE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__RLINKS = MACHINE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__OCCI_COMPUTE_ARCHITECTURE = MACHINE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__OCCI_COMPUTE_CORES = MACHINE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__OCCI_COMPUTE_HOSTNAME = MACHINE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__OCCI_COMPUTE_SHARE = MACHINE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__OCCI_COMPUTE_SPEED = MACHINE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__OCCI_COMPUTE_MEMORY = MACHINE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__OCCI_COMPUTE_STATE = MACHINE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__OCCI_COMPUTE_STATE_MESSAGE = MACHINE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine Install URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine Insecure Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine Registry Mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine Storage Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls San</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__USERNAME = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Api Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__API_KEY = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__REGION = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Point Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__END_POINT_TYPE = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__IMAGE_ID = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Flavor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__FLAVOR_ID = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ssh User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__SSH_USER = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ssh Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__SSH_PORT = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Docker Install</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE__DOCKER_INSTALL = MACHINE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Machinerackspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Startall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE___STARTALL = MACHINE___STARTALL;

	/**
	 * The number of operations of the '<em>Machinerackspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINERACKSPACE_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.MachinevirtualboxImpl <em>Machinevirtualbox</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.MachinevirtualboxImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinevirtualbox()
	 * @generated
	 */
	int MACHINEVIRTUALBOX = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__LOCATION = MACHINE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__PARTS = MACHINE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__RLINKS = MACHINE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__OCCI_COMPUTE_ARCHITECTURE = MACHINE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__OCCI_COMPUTE_CORES = MACHINE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__OCCI_COMPUTE_HOSTNAME = MACHINE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__OCCI_COMPUTE_SHARE = MACHINE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__OCCI_COMPUTE_SPEED = MACHINE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__OCCI_COMPUTE_MEMORY = MACHINE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__OCCI_COMPUTE_STATE = MACHINE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__OCCI_COMPUTE_STATE_MESSAGE = MACHINE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine Install URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine Insecure Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine Registry Mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine Storage Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls San</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Boot2docker URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__BOOT2DOCKER_URL = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__DISK_SIZE = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Host DNS Resolver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__HOST_DNS_RESOLVER = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Import Boot2 Docker VM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__IMPORT_BOOT2_DOCKER_VM = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Host Only CIDR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__HOST_ONLY_CIDR = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Host Only NIC Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__HOST_ONLY_NIC_TYPE = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Host Only NIC Promisc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__HOST_ONLY_NIC_PROMISC = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>No Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__NO_SHARE = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>No DNS Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__NO_DNS_PROXY = MACHINE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>No VTX Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__NO_VTX_CHECK = MACHINE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Share Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX__SHARE_FOLDER = MACHINE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Machinevirtualbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Startall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX___STARTALL = MACHINE___STARTALL;

	/**
	 * The number of operations of the '<em>Machinevirtualbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVIRTUALBOX_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarefusionImpl <em>Machinevmwarefusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.MachinevmwarefusionImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinevmwarefusion()
	 * @generated
	 */
	int MACHINEVMWAREFUSION = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__LOCATION = MACHINE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__PARTS = MACHINE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__RLINKS = MACHINE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__OCCI_COMPUTE_ARCHITECTURE = MACHINE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__OCCI_COMPUTE_CORES = MACHINE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__OCCI_COMPUTE_HOSTNAME = MACHINE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__OCCI_COMPUTE_SHARE = MACHINE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__OCCI_COMPUTE_SPEED = MACHINE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__OCCI_COMPUTE_MEMORY = MACHINE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__OCCI_COMPUTE_STATE = MACHINE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__OCCI_COMPUTE_STATE_MESSAGE = MACHINE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine Install URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine Insecure Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine Registry Mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine Storage Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls San</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Boot2docker URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__BOOT2DOCKER_URL = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__DISK_SIZE = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__MEMORY_SIZE = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>No Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION__NO_SHARE = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Machinevmwarefusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Startall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION___STARTALL = MACHINE___STARTALL;

	/**
	 * The number of operations of the '<em>Machinevmwarefusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREFUSION_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevcloudairImpl <em>Machinevmwarevcloudair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.MachinevmwarevcloudairImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinevmwarevcloudair()
	 * @generated
	 */
	int MACHINEVMWAREVCLOUDAIR = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__LOCATION = MACHINE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__PARTS = MACHINE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__RLINKS = MACHINE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__OCCI_COMPUTE_ARCHITECTURE = MACHINE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__OCCI_COMPUTE_CORES = MACHINE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__OCCI_COMPUTE_HOSTNAME = MACHINE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__OCCI_COMPUTE_SHARE = MACHINE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__OCCI_COMPUTE_SPEED = MACHINE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__OCCI_COMPUTE_MEMORY = MACHINE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__OCCI_COMPUTE_STATE = MACHINE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__OCCI_COMPUTE_STATE_MESSAGE = MACHINE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine Install URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine Insecure Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine Registry Mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine Storage Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls San</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__USERNAME = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__PASSWORD = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__CATALOG = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Catalog Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__CATALOG_ITEM = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Compute Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__COMPUTE_ID = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cpu Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__CPU_COUNT = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Docker Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__DOCKER_PORT = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Edgegateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__EDGEGATEWAY = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__MEMORY_SIZE = MACHINE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Vapp Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__VAPP_NAME = MACHINE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Orgvdcnetwork</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__ORGVDCNETWORK = MACHINE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Provision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__PROVISION = MACHINE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Public Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__PUBLIC_IP = MACHINE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Ssh Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__SSH_PORT = MACHINE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Vdc Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR__VDC_ID = MACHINE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Machinevmwarevcloudair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 15;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Startall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR___STARTALL = MACHINE___STARTALL;

	/**
	 * The number of operations of the '<em>Machinevmwarevcloudair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVCLOUDAIR_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevsphereImpl <em>Machinevmwarevsphere</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.MachinevmwarevsphereImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinevmwarevsphere()
	 * @generated
	 */
	int MACHINEVMWAREVSPHERE = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__LOCATION = MACHINE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__PARTS = MACHINE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__RLINKS = MACHINE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__OCCI_COMPUTE_ARCHITECTURE = MACHINE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__OCCI_COMPUTE_CORES = MACHINE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__OCCI_COMPUTE_HOSTNAME = MACHINE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__OCCI_COMPUTE_SHARE = MACHINE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__OCCI_COMPUTE_SPEED = MACHINE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__OCCI_COMPUTE_MEMORY = MACHINE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__OCCI_COMPUTE_STATE = MACHINE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__OCCI_COMPUTE_STATE_MESSAGE = MACHINE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine Install URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine Insecure Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine Registry Mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine Storage Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls San</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__USERNAME = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__PASSWORD = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Boot2docker URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__BOOT2DOCKER_URL = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compute Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__COMPUTE_IP = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cpu Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__CPU_COUNT = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Datacenter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__DATACENTER = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Datastore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__DATASTORE = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__DISK_SIZE = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__MEMORY_SIZE = MACHINE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__NETWORK = MACHINE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__POOL = MACHINE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Vcenter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE__VCENTER = MACHINE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Machinevmwarevsphere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Startall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE___STARTALL = MACHINE___STARTALL;

	/**
	 * The number of operations of the '<em>Machinevmwarevsphere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEVMWAREVSPHERE_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.MachineexoscaleImpl <em>Machineexoscale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.MachineexoscaleImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachineexoscale()
	 * @generated
	 */
	int MACHINEEXOSCALE = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__LOCATION = MACHINE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__PARTS = MACHINE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__RLINKS = MACHINE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__OCCI_COMPUTE_ARCHITECTURE = MACHINE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__OCCI_COMPUTE_CORES = MACHINE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__OCCI_COMPUTE_HOSTNAME = MACHINE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__OCCI_COMPUTE_SHARE = MACHINE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__OCCI_COMPUTE_SPEED = MACHINE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__OCCI_COMPUTE_MEMORY = MACHINE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__OCCI_COMPUTE_STATE = MACHINE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__OCCI_COMPUTE_STATE_MESSAGE = MACHINE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine Install URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine Insecure Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine Registry Mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine Storage Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls San</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__URL = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Api Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__API_KEY = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Api Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__API_SECRET_KEY = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instance Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__INSTANCE_PROFILE = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__IMAGE = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Security Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__SECURITY_GROUP = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Availability Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__AVAILABILITY_ZONE = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ssh User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__SSH_USER = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>User Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__USER_DATA = MACHINE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Affinity Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE__AFFINITY_GROUP = MACHINE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Machineexoscale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Startall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE___STARTALL = MACHINE___STARTALL;

	/**
	 * The number of operations of the '<em>Machineexoscale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEEXOSCALE_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.Machinegrid5000Impl <em>Machinegrid5000</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.Machinegrid5000Impl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinegrid5000()
	 * @generated
	 */
	int MACHINEGRID5000 = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__LOCATION = MACHINE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__PARTS = MACHINE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__RLINKS = MACHINE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__OCCI_COMPUTE_ARCHITECTURE = MACHINE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__OCCI_COMPUTE_CORES = MACHINE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__OCCI_COMPUTE_HOSTNAME = MACHINE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__OCCI_COMPUTE_SHARE = MACHINE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__OCCI_COMPUTE_SPEED = MACHINE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__OCCI_COMPUTE_MEMORY = MACHINE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__OCCI_COMPUTE_STATE = MACHINE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__OCCI_COMPUTE_STATE_MESSAGE = MACHINE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine Install URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine Insecure Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine Registry Mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine Storage Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls San</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__USERNAME = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__PASSWORD = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Site</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__SITE = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Walltime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__WALLTIME = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ssh Private Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__SSH_PRIVATE_KEY = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ssh Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__SSH_PUBLIC_KEY = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__IMAGE = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Resource Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__RESOURCE_PROPERTIES = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Use Job Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__USE_JOB_RESERVATION = MACHINE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Host To Provision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000__HOST_TO_PROVISION = MACHINE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Machinegrid5000</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Startall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000___STARTALL = MACHINE___STARTALL;

	/**
	 * The number of operations of the '<em>Machinegrid5000</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINEGRID5000_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.impl.ClusterImpl <em>Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.impl.ClusterImpl
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getCluster()
	 * @generated
	 */
	int CLUSTER = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__ID = InfrastructurePackage.COMPUTE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__TITLE = InfrastructurePackage.COMPUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__KIND = InfrastructurePackage.COMPUTE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__LOCATION = InfrastructurePackage.COMPUTE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__ATTRIBUTES = InfrastructurePackage.COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__MIXINS = InfrastructurePackage.COMPUTE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__PARTS = InfrastructurePackage.COMPUTE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__SUMMARY = InfrastructurePackage.COMPUTE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__LINKS = InfrastructurePackage.COMPUTE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__RLINKS = InfrastructurePackage.COMPUTE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__OCCI_COMPUTE_ARCHITECTURE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__OCCI_COMPUTE_CORES = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__OCCI_COMPUTE_HOSTNAME = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__OCCI_COMPUTE_SHARE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__OCCI_COMPUTE_SPEED = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__OCCI_COMPUTE_MEMORY = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__OCCI_COMPUTE_STATE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__OCCI_COMPUTE_STATE_MESSAGE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__NAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___OCCI_CREATE = InfrastructurePackage.COMPUTE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___OCCI_RETRIEVE = InfrastructurePackage.COMPUTE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___OCCI_UPDATE = InfrastructurePackage.COMPUTE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___OCCI_DELETE = InfrastructurePackage.COMPUTE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___START = InfrastructurePackage.COMPUTE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___STOP__STOPMETHOD = InfrastructurePackage.COMPUTE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___RESTART__RESTARTMETHOD = InfrastructurePackage.COMPUTE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___SUSPEND__SUSPENDMETHOD = InfrastructurePackage.COMPUTE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___SAVE__SAVEMETHOD_STRING = InfrastructurePackage.COMPUTE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_OPERATION_COUNT = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.docker.Mode <em>Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.docker.Mode
	 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 25;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.ArrayOfString <em>Array Of String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Of String</em>'.
	 * @see org.eclipse.cmf.occi.docker.ArrayOfString
	 * @generated
	 */
	EClass getArrayOfString();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.cmf.occi.docker.ArrayOfString#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.eclipse.cmf.occi.docker.ArrayOfString#getValues()
	 * @see #getArrayOfString()
	 * @generated
	 */
	EAttribute getArrayOfString_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getName()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getContainerid <em>Containerid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containerid</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getContainerid()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Containerid();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getImage()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Image();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getBuild <em>Build</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getBuild()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Build();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getCommand()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Command();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ports</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getPorts()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Ports();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getExpose <em>Expose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expose</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getExpose()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Expose();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volumes</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getVolumes()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Volumes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getEnvironment()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Environment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getEnvFile <em>Env File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Env File</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getEnvFile()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_EnvFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getNet()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Net();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getDns <em>Dns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dns</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getDns()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Dns();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getDnsSearch <em>Dns Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dns Search</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getDnsSearch()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_DnsSearch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getCapAdd <em>Cap Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cap Add</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getCapAdd()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_CapAdd();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getCapDrop <em>Cap Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cap Drop</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getCapDrop()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_CapDrop();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getWorkingDir <em>Working Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working Dir</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getWorkingDir()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_WorkingDir();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getEntrypoint <em>Entrypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entrypoint</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getEntrypoint()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Entrypoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getUser()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_User();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getDomainName()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getMemLimit <em>Mem Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mem Limit</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getMemLimit()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_MemLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getMemorySwap <em>Memory Swap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Swap</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getMemorySwap()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_MemorySwap();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#isPrivileged <em>Privileged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Privileged</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#isPrivileged()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Privileged();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getRestart <em>Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getRestart()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Restart();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#isStdinOpen <em>Stdin Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stdin Open</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#isStdinOpen()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_StdinOpen();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#isInteractive <em>Interactive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interactive</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#isInteractive()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Interactive();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getCpuShares <em>Cpu Shares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Shares</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getCpuShares()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_CpuShares();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getPid <em>Pid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pid</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getPid()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Pid();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getIpc <em>Ipc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ipc</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getIpc()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Ipc();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getAddHost <em>Add Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add Host</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getAddHost()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_AddHost();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getMacAddress <em>Mac Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac Address</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getMacAddress()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_MacAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#isRm <em>Rm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rm</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#isRm()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Rm();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getSecurityOpt <em>Security Opt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Opt</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getSecurityOpt()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_SecurityOpt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getDevice()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Device();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getLxcConf <em>Lxc Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lxc Conf</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getLxcConf()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_LxcConf();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#isPublishAll <em>Publish All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publish All</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#isPublishAll()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_PublishAll();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#isReadOnly()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#isMonitored <em>Monitored</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitored</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#isMonitored()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Monitored();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getCpuUsed <em>Cpu Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Used</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getCpuUsed()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_CpuUsed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getMemoryUsed <em>Memory Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Used</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getMemoryUsed()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_MemoryUsed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getCpuPercent <em>Cpu Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Percent</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getCpuPercent()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_CpuPercent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getMemoryPercent <em>Memory Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Percent</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getMemoryPercent()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_MemoryPercent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getDiskUsed <em>Disk Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk Used</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getDiskUsed()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_DiskUsed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getDiskPercent <em>Disk Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk Percent</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getDiskPercent()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_DiskPercent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getBandwidthUsed <em>Bandwidth Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bandwidth Used</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getBandwidthUsed()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_BandwidthUsed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getBandwidthPercent <em>Bandwidth Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bandwidth Percent</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getBandwidthPercent()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_BandwidthPercent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getMonitoringInterval <em>Monitoring Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitoring Interval</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getMonitoringInterval()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_MonitoringInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getCpuMaxValue <em>Cpu Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Max Value</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getCpuMaxValue()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_CpuMaxValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getMemoryMaxValue <em>Memory Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Max Value</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getMemoryMaxValue()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_MemoryMaxValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getCoreMax <em>Core Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Max</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getCoreMax()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_CoreMax();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getCpuSetCpus <em>Cpu Set Cpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Set Cpus</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getCpuSetCpus()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_CpuSetCpus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#getCpuSetMems <em>Cpu Set Mems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Set Mems</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#getCpuSetMems()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_CpuSetMems();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Container#isTty <em>Tty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tty</em>'.
	 * @see org.eclipse.cmf.occi.docker.Container#isTty()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Tty();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.docker.Container#create() <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see org.eclipse.cmf.occi.docker.Container#create()
	 * @generated
	 */
	EOperation getContainer__Create();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.docker.Container#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see org.eclipse.cmf.occi.docker.Container#stop()
	 * @generated
	 */
	EOperation getContainer__Stop();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.docker.Container#run() <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see org.eclipse.cmf.occi.docker.Container#run()
	 * @generated
	 */
	EOperation getContainer__Run();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.docker.Container#pause() <em>Pause</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pause</em>' operation.
	 * @see org.eclipse.cmf.occi.docker.Container#pause()
	 * @generated
	 */
	EOperation getContainer__Pause();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.docker.Container#unpause() <em>Unpause</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unpause</em>' operation.
	 * @see org.eclipse.cmf.occi.docker.Container#unpause()
	 * @generated
	 */
	EOperation getContainer__Unpause();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.docker.Container#kill(java.lang.String) <em>Kill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Kill</em>' operation.
	 * @see org.eclipse.cmf.occi.docker.Container#kill(java.lang.String)
	 * @generated
	 */
	EOperation getContainer__Kill__String();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.eclipse.cmf.occi.docker.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Link#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.eclipse.cmf.occi.docker.Link#getAlias()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Alias();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Networklink <em>Networklink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Networklink</em>'.
	 * @see org.eclipse.cmf.occi.docker.Networklink
	 * @generated
	 */
	EClass getNetworklink();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Volumesfrom <em>Volumesfrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volumesfrom</em>'.
	 * @see org.eclipse.cmf.occi.docker.Volumesfrom
	 * @generated
	 */
	EClass getVolumesfrom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Volumesfrom#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.eclipse.cmf.occi.docker.Volumesfrom#getMode()
	 * @see #getVolumesfrom()
	 * @generated
	 */
	EAttribute getVolumesfrom_Mode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains</em>'.
	 * @see org.eclipse.cmf.occi.docker.Contains
	 * @generated
	 */
	EClass getContains();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machine#getName()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machine#getEngineInstallURL <em>Engine Install URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine Install URL</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machine#getEngineInstallURL()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_EngineInstallURL();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machine#getEngineOpt <em>Engine Opt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine Opt</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machine#getEngineOpt()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_EngineOpt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machine#getEngineInsecureRegistry <em>Engine Insecure Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine Insecure Registry</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machine#getEngineInsecureRegistry()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_EngineInsecureRegistry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machine#getEngineRegistryMirror <em>Engine Registry Mirror</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine Registry Mirror</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machine#getEngineRegistryMirror()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_EngineRegistryMirror();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machine#getEngineLabel <em>Engine Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine Label</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machine#getEngineLabel()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_EngineLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machine#getEngineStorageDriver <em>Engine Storage Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine Storage Driver</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machine#getEngineStorageDriver()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_EngineStorageDriver();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machine#getEngineEnv <em>Engine Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine Env</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machine#getEngineEnv()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_EngineEnv();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machine#isSwarm <em>Swarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swarm</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machine#isSwarm()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Swarm();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machine#getSwarmImage <em>Swarm Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swarm Image</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machine#getSwarmImage()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_SwarmImage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machine#isSwarmMaster <em>Swarm Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swarm Master</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machine#isSwarmMaster()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_SwarmMaster();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machine#getSwarmDiscovery <em>Swarm Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swarm Discovery</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machine#getSwarmDiscovery()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_SwarmDiscovery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machine#getSwarmStrategy <em>Swarm Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swarm Strategy</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machine#getSwarmStrategy()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_SwarmStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machine#getSwarmOpt <em>Swarm Opt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swarm Opt</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machine#getSwarmOpt()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_SwarmOpt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machine#getSwarmHost <em>Swarm Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swarm Host</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machine#getSwarmHost()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_SwarmHost();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machine#getSwarmAddr <em>Swarm Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swarm Addr</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machine#getSwarmAddr()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_SwarmAddr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machine#getSwarmExperimental <em>Swarm Experimental</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swarm Experimental</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machine#getSwarmExperimental()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_SwarmExperimental();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machine#getTlsSan <em>Tls San</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tls San</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machine#getTlsSan()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_TlsSan();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.docker.Machine#startall() <em>Startall</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Startall</em>' operation.
	 * @see org.eclipse.cmf.occi.docker.Machine#startall()
	 * @generated
	 */
	EOperation getMachine__Startall();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume</em>'.
	 * @see org.eclipse.cmf.occi.docker.Volume
	 * @generated
	 */
	EClass getVolume();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Volume#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver</em>'.
	 * @see org.eclipse.cmf.occi.docker.Volume#getDriver()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Driver();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Volume#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labels</em>'.
	 * @see org.eclipse.cmf.occi.docker.Volume#getLabels()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Labels();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Volume#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see org.eclipse.cmf.occi.docker.Volume#getOptions()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Options();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Volume#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.eclipse.cmf.occi.docker.Volume#getSource()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Volume#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see org.eclipse.cmf.occi.docker.Volume#getDestination()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Destination();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Volume#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.eclipse.cmf.occi.docker.Volume#getMode()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Mode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Volume#getRw <em>Rw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rw</em>'.
	 * @see org.eclipse.cmf.occi.docker.Volume#getRw()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Rw();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Volume#getPropagation <em>Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Propagation</em>'.
	 * @see org.eclipse.cmf.occi.docker.Volume#getPropagation()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Propagation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Volume#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cmf.occi.docker.Volume#getName()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see org.eclipse.cmf.occi.docker.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Network#getNetworkId <em>Network Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Id</em>'.
	 * @see org.eclipse.cmf.occi.docker.Network#getNetworkId()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_NetworkId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Network#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cmf.occi.docker.Network#getName()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Network#getAuxAddress <em>Aux Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux Address</em>'.
	 * @see org.eclipse.cmf.occi.docker.Network#getAuxAddress()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_AuxAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Network#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver</em>'.
	 * @see org.eclipse.cmf.occi.docker.Network#getDriver()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Driver();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Network#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway</em>'.
	 * @see org.eclipse.cmf.occi.docker.Network#getGateway()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Gateway();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Network#isInternal <em>Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal</em>'.
	 * @see org.eclipse.cmf.occi.docker.Network#isInternal()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Internal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Network#getIpRange <em>Ip Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Range</em>'.
	 * @see org.eclipse.cmf.occi.docker.Network#getIpRange()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_IpRange();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Network#getIpamDriver <em>Ipam Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ipam Driver</em>'.
	 * @see org.eclipse.cmf.occi.docker.Network#getIpamDriver()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_IpamDriver();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Network#getIpamOpt <em>Ipam Opt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ipam Opt</em>'.
	 * @see org.eclipse.cmf.occi.docker.Network#getIpamOpt()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_IpamOpt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Network#isIpv6 <em>Ipv6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ipv6</em>'.
	 * @see org.eclipse.cmf.occi.docker.Network#isIpv6()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Ipv6();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Network#getOpt <em>Opt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opt</em>'.
	 * @see org.eclipse.cmf.occi.docker.Network#getOpt()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Opt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Network#getSubnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet</em>'.
	 * @see org.eclipse.cmf.occi.docker.Network#getSubnet()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Subnet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Machinegeneric <em>Machinegeneric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machinegeneric</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegeneric
	 * @generated
	 */
	EClass getMachinegeneric();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinegeneric#getEnginePort <em>Engine Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine Port</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegeneric#getEnginePort()
	 * @see #getMachinegeneric()
	 * @generated
	 */
	EAttribute getMachinegeneric_EnginePort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinegeneric#getIpAddress <em>Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Address</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegeneric#getIpAddress()
	 * @see #getMachinegeneric()
	 * @generated
	 */
	EAttribute getMachinegeneric_IpAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinegeneric#getSshKey <em>Ssh Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh Key</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegeneric#getSshKey()
	 * @see #getMachinegeneric()
	 * @generated
	 */
	EAttribute getMachinegeneric_SshKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinegeneric#getSshUser <em>Ssh User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh User</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegeneric#getSshUser()
	 * @see #getMachinegeneric()
	 * @generated
	 */
	EAttribute getMachinegeneric_SshUser();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinegeneric#getSshPort <em>Ssh Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh Port</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegeneric#getSshPort()
	 * @see #getMachinegeneric()
	 * @generated
	 */
	EAttribute getMachinegeneric_SshPort();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Machineamazonec2 <em>Machineamazonec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machineamazonec2</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineamazonec2
	 * @generated
	 */
	EClass getMachineamazonec2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getAccessKey <em>Access Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Key</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineamazonec2#getAccessKey()
	 * @see #getMachineamazonec2()
	 * @generated
	 */
	EAttribute getMachineamazonec2_AccessKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getAmi <em>Ami</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ami</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineamazonec2#getAmi()
	 * @see #getMachineamazonec2()
	 * @generated
	 */
	EAttribute getMachineamazonec2_Ami();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineamazonec2#getInstanceType()
	 * @see #getMachineamazonec2()
	 * @generated
	 */
	EAttribute getMachineamazonec2_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineamazonec2#getRegion()
	 * @see #getMachineamazonec2()
	 * @generated
	 */
	EAttribute getMachineamazonec2_Region();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getRootSize <em>Root Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Size</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineamazonec2#getRootSize()
	 * @see #getMachineamazonec2()
	 * @generated
	 */
	EAttribute getMachineamazonec2_RootSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getSecretKey <em>Secret Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secret Key</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineamazonec2#getSecretKey()
	 * @see #getMachineamazonec2()
	 * @generated
	 */
	EAttribute getMachineamazonec2_SecretKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getSecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Group</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineamazonec2#getSecurityGroup()
	 * @see #getMachineamazonec2()
	 * @generated
	 */
	EAttribute getMachineamazonec2_SecurityGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getSessionToken <em>Session Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session Token</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineamazonec2#getSessionToken()
	 * @see #getMachineamazonec2()
	 * @generated
	 */
	EAttribute getMachineamazonec2_SessionToken();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getSubnetId <em>Subnet Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Id</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineamazonec2#getSubnetId()
	 * @see #getMachineamazonec2()
	 * @generated
	 */
	EAttribute getMachineamazonec2_SubnetId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getVpcId <em>Vpc Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Id</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineamazonec2#getVpcId()
	 * @see #getMachineamazonec2()
	 * @generated
	 */
	EAttribute getMachineamazonec2_VpcId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineamazonec2#getZone()
	 * @see #getMachineamazonec2()
	 * @generated
	 */
	EAttribute getMachineamazonec2_Zone();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Machinedigitalocean <em>Machinedigitalocean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machinedigitalocean</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinedigitalocean
	 * @generated
	 */
	EClass getMachinedigitalocean();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinedigitalocean#getAccessToken <em>Access Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Token</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinedigitalocean#getAccessToken()
	 * @see #getMachinedigitalocean()
	 * @generated
	 */
	EAttribute getMachinedigitalocean_AccessToken();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinedigitalocean#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinedigitalocean#getImage()
	 * @see #getMachinedigitalocean()
	 * @generated
	 */
	EAttribute getMachinedigitalocean_Image();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinedigitalocean#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinedigitalocean#getRegion()
	 * @see #getMachinedigitalocean()
	 * @generated
	 */
	EAttribute getMachinedigitalocean_Region();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinedigitalocean#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinedigitalocean#getSize()
	 * @see #getMachinedigitalocean()
	 * @generated
	 */
	EAttribute getMachinedigitalocean_Size();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Machinegooglecomputeengine <em>Machinegooglecomputeengine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machinegooglecomputeengine</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegooglecomputeengine
	 * @generated
	 */
	EClass getMachinegooglecomputeengine();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinegooglecomputeengine#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegooglecomputeengine#getZone()
	 * @see #getMachinegooglecomputeengine()
	 * @generated
	 */
	EAttribute getMachinegooglecomputeengine_Zone();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinegooglecomputeengine#getMachineType <em>Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machine Type</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegooglecomputeengine#getMachineType()
	 * @see #getMachinegooglecomputeengine()
	 * @generated
	 */
	EAttribute getMachinegooglecomputeengine_MachineType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinegooglecomputeengine#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegooglecomputeengine#getUsername()
	 * @see #getMachinegooglecomputeengine()
	 * @generated
	 */
	EAttribute getMachinegooglecomputeengine_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinegooglecomputeengine#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegooglecomputeengine#getInstanceName()
	 * @see #getMachinegooglecomputeengine()
	 * @generated
	 */
	EAttribute getMachinegooglecomputeengine_InstanceName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinegooglecomputeengine#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegooglecomputeengine#getProject()
	 * @see #getMachinegooglecomputeengine()
	 * @generated
	 */
	EAttribute getMachinegooglecomputeengine_Project();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer <em>Machineibmsoftlayer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machineibmsoftlayer</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineibmsoftlayer
	 * @generated
	 */
	EClass getMachineibmsoftlayer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getApiEndpoint <em>Api Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Endpoint</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getApiEndpoint()
	 * @see #getMachineibmsoftlayer()
	 * @generated
	 */
	EAttribute getMachineibmsoftlayer_ApiEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getUser()
	 * @see #getMachineibmsoftlayer()
	 * @generated
	 */
	EAttribute getMachineibmsoftlayer_User();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getApiKey <em>Api Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Key</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getApiKey()
	 * @see #getMachineibmsoftlayer()
	 * @generated
	 */
	EAttribute getMachineibmsoftlayer_ApiKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getCpu <em>Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getCpu()
	 * @see #getMachineibmsoftlayer()
	 * @generated
	 */
	EAttribute getMachineibmsoftlayer_Cpu();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getDiskSize <em>Disk Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk Size</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getDiskSize()
	 * @see #getMachineibmsoftlayer()
	 * @generated
	 */
	EAttribute getMachineibmsoftlayer_DiskSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getDomain()
	 * @see #getMachineibmsoftlayer()
	 * @generated
	 */
	EAttribute getMachineibmsoftlayer_Domain();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#isHourlyBilling <em>Hourly Billing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hourly Billing</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineibmsoftlayer#isHourlyBilling()
	 * @see #getMachineibmsoftlayer()
	 * @generated
	 */
	EAttribute getMachineibmsoftlayer_HourlyBilling();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getImage()
	 * @see #getMachineibmsoftlayer()
	 * @generated
	 */
	EAttribute getMachineibmsoftlayer_Image();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#isLocalDisk <em>Local Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Disk</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineibmsoftlayer#isLocalDisk()
	 * @see #getMachineibmsoftlayer()
	 * @generated
	 */
	EAttribute getMachineibmsoftlayer_LocalDisk();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#isPrivateNetOnly <em>Private Net Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Net Only</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineibmsoftlayer#isPrivateNetOnly()
	 * @see #getMachineibmsoftlayer()
	 * @generated
	 */
	EAttribute getMachineibmsoftlayer_PrivateNetOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getRegion()
	 * @see #getMachineibmsoftlayer()
	 * @generated
	 */
	EAttribute getMachineibmsoftlayer_Region();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getPublicVlanId <em>Public Vlan Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Vlan Id</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getPublicVlanId()
	 * @see #getMachineibmsoftlayer()
	 * @generated
	 */
	EAttribute getMachineibmsoftlayer_PublicVlanId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getPrivateVlanId <em>Private Vlan Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Vlan Id</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getPrivateVlanId()
	 * @see #getMachineibmsoftlayer()
	 * @generated
	 */
	EAttribute getMachineibmsoftlayer_PrivateVlanId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure <em>Machinemicrosoftazure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machinemicrosoftazure</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosoftazure
	 * @generated
	 */
	EClass getMachinemicrosoftazure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSubscriptionId <em>Subscription Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscription Id</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSubscriptionId()
	 * @see #getMachinemicrosoftazure()
	 * @generated
	 */
	EAttribute getMachinemicrosoftazure_SubscriptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSubscriptionCert <em>Subscription Cert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscription Cert</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSubscriptionCert()
	 * @see #getMachinemicrosoftazure()
	 * @generated
	 */
	EAttribute getMachinemicrosoftazure_SubscriptionCert();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getEnvironment()
	 * @see #getMachinemicrosoftazure()
	 * @generated
	 */
	EAttribute getMachinemicrosoftazure_Environment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getMachineLocation <em>Machine Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machine Location</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getMachineLocation()
	 * @see #getMachinemicrosoftazure()
	 * @generated
	 */
	EAttribute getMachinemicrosoftazure_MachineLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getResourceGroup <em>Resource Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Group</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getResourceGroup()
	 * @see #getMachinemicrosoftazure()
	 * @generated
	 */
	EAttribute getMachinemicrosoftazure_ResourceGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSize()
	 * @see #getMachinemicrosoftazure()
	 * @generated
	 */
	EAttribute getMachinemicrosoftazure_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSshUser <em>Ssh User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh User</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSshUser()
	 * @see #getMachinemicrosoftazure()
	 * @generated
	 */
	EAttribute getMachinemicrosoftazure_SshUser();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getVnet <em>Vnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vnet</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getVnet()
	 * @see #getMachinemicrosoftazure()
	 * @generated
	 */
	EAttribute getMachinemicrosoftazure_Vnet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSubnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSubnet()
	 * @see #getMachinemicrosoftazure()
	 * @generated
	 */
	EAttribute getMachinemicrosoftazure_Subnet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSubnetPrefix <em>Subnet Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Prefix</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSubnetPrefix()
	 * @see #getMachinemicrosoftazure()
	 * @generated
	 */
	EAttribute getMachinemicrosoftazure_SubnetPrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getAvailabilitySet <em>Availability Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Set</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getAvailabilitySet()
	 * @see #getMachinemicrosoftazure()
	 * @generated
	 */
	EAttribute getMachinemicrosoftazure_AvailabilitySet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getOpenPort <em>Open Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open Port</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getOpenPort()
	 * @see #getMachinemicrosoftazure()
	 * @generated
	 */
	EAttribute getMachinemicrosoftazure_OpenPort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getPrivateIpAddress <em>Private Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Ip Address</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getPrivateIpAddress()
	 * @see #getMachinemicrosoftazure()
	 * @generated
	 */
	EAttribute getMachinemicrosoftazure_PrivateIpAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getNoPublicIp <em>No Public Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Public Ip</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getNoPublicIp()
	 * @see #getMachinemicrosoftazure()
	 * @generated
	 */
	EAttribute getMachinemicrosoftazure_NoPublicIp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getStaticPublicIp <em>Static Public Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Public Ip</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getStaticPublicIp()
	 * @see #getMachinemicrosoftazure()
	 * @generated
	 */
	EAttribute getMachinemicrosoftazure_StaticPublicIp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getDockerPort <em>Docker Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docker Port</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getDockerPort()
	 * @see #getMachinemicrosoftazure()
	 * @generated
	 */
	EAttribute getMachinemicrosoftazure_DockerPort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getUsePrivateIp <em>Use Private Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Private Ip</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getUsePrivateIp()
	 * @see #getMachinemicrosoftazure()
	 * @generated
	 */
	EAttribute getMachinemicrosoftazure_UsePrivateIp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getImage()
	 * @see #getMachinemicrosoftazure()
	 * @generated
	 */
	EAttribute getMachinemicrosoftazure_Image();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Machinemicrosofthyperv <em>Machinemicrosofthyperv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machinemicrosofthyperv</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosofthyperv
	 * @generated
	 */
	EClass getMachinemicrosofthyperv();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosofthyperv#getVirtualSwitch <em>Virtual Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual Switch</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosofthyperv#getVirtualSwitch()
	 * @see #getMachinemicrosofthyperv()
	 * @generated
	 */
	EAttribute getMachinemicrosofthyperv_VirtualSwitch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosofthyperv#getBoot2dockerURL <em>Boot2docker URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boot2docker URL</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosofthyperv#getBoot2dockerURL()
	 * @see #getMachinemicrosofthyperv()
	 * @generated
	 */
	EAttribute getMachinemicrosofthyperv_Boot2dockerURL();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosofthyperv#getDiskSize <em>Disk Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk Size</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosofthyperv#getDiskSize()
	 * @see #getMachinemicrosofthyperv()
	 * @generated
	 */
	EAttribute getMachinemicrosofthyperv_DiskSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosofthyperv#getStaticMacAddress <em>Static Mac Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Mac Address</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosofthyperv#getStaticMacAddress()
	 * @see #getMachinemicrosofthyperv()
	 * @generated
	 */
	EAttribute getMachinemicrosofthyperv_StaticMacAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinemicrosofthyperv#getVlanId <em>Vlan Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vlan Id</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinemicrosofthyperv#getVlanId()
	 * @see #getMachinemicrosofthyperv()
	 * @generated
	 */
	EAttribute getMachinemicrosofthyperv_VlanId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Machineopenstack <em>Machineopenstack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machineopenstack</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack
	 * @generated
	 */
	EClass getMachineopenstack();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getFlavorId <em>Flavor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flavor Id</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getFlavorId()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_FlavorId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getFlavorName <em>Flavor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flavor Name</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getFlavorName()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_FlavorName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getImageId <em>Image Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Id</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getImageId()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_ImageId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getImageName <em>Image Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Name</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getImageName()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_ImageName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getAuthUrl <em>Auth Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auth Url</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getAuthUrl()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_AuthUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getUsername()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getPassword()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getTenantName <em>Tenant Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant Name</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getTenantName()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_TenantName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getTenantId <em>Tenant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant Id</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getTenantId()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_TenantId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getRegion()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_Region();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getEndpointType <em>Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint Type</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getEndpointType()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_EndpointType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getNetId <em>Net Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Id</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getNetId()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_NetId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getNetName <em>Net Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Name</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getNetName()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_NetName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getSecGroups <em>Sec Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sec Groups</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getSecGroups()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_SecGroups();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getFloatingIpPool <em>Floating Ip Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floating Ip Pool</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getFloatingIpPool()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_FloatingIpPool();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getActiveTimeOut <em>Active Time Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Time Out</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getActiveTimeOut()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_ActiveTimeOut();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getAvailabilityZone <em>Availability Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getAvailabilityZone()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_AvailabilityZone();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getDomainId <em>Domain Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Id</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getDomainId()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_DomainId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getDomainName()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#isInsecure <em>Insecure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insecure</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#isInsecure()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_Insecure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getIpVersion <em>Ip Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Version</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getIpVersion()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_IpVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getKeypairName <em>Keypair Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keypair Name</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getKeypairName()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_KeypairName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getPrivateKeyFile <em>Private Key File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Key File</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getPrivateKeyFile()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_PrivateKeyFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getSshPort <em>Ssh Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh Port</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getSshPort()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_SshPort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getSshUser <em>Ssh User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh User</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineopenstack#getSshUser()
	 * @see #getMachineopenstack()
	 * @generated
	 */
	EAttribute getMachineopenstack_SshUser();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Machinerackspace <em>Machinerackspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machinerackspace</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinerackspace
	 * @generated
	 */
	EClass getMachinerackspace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinerackspace#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinerackspace#getUsername()
	 * @see #getMachinerackspace()
	 * @generated
	 */
	EAttribute getMachinerackspace_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinerackspace#getApiKey <em>Api Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Key</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinerackspace#getApiKey()
	 * @see #getMachinerackspace()
	 * @generated
	 */
	EAttribute getMachinerackspace_ApiKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinerackspace#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinerackspace#getRegion()
	 * @see #getMachinerackspace()
	 * @generated
	 */
	EAttribute getMachinerackspace_Region();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinerackspace#getEndPointType <em>End Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Point Type</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinerackspace#getEndPointType()
	 * @see #getMachinerackspace()
	 * @generated
	 */
	EAttribute getMachinerackspace_EndPointType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinerackspace#getImageId <em>Image Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Id</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinerackspace#getImageId()
	 * @see #getMachinerackspace()
	 * @generated
	 */
	EAttribute getMachinerackspace_ImageId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinerackspace#getFlavorId <em>Flavor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flavor Id</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinerackspace#getFlavorId()
	 * @see #getMachinerackspace()
	 * @generated
	 */
	EAttribute getMachinerackspace_FlavorId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinerackspace#getSshUser <em>Ssh User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh User</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinerackspace#getSshUser()
	 * @see #getMachinerackspace()
	 * @generated
	 */
	EAttribute getMachinerackspace_SshUser();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinerackspace#getSshPort <em>Ssh Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh Port</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinerackspace#getSshPort()
	 * @see #getMachinerackspace()
	 * @generated
	 */
	EAttribute getMachinerackspace_SshPort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinerackspace#isDockerInstall <em>Docker Install</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docker Install</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinerackspace#isDockerInstall()
	 * @see #getMachinerackspace()
	 * @generated
	 */
	EAttribute getMachinerackspace_DockerInstall();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Machinevirtualbox <em>Machinevirtualbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machinevirtualbox</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevirtualbox
	 * @generated
	 */
	EClass getMachinevirtualbox();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevirtualbox#getBoot2dockerURL <em>Boot2docker URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boot2docker URL</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevirtualbox#getBoot2dockerURL()
	 * @see #getMachinevirtualbox()
	 * @generated
	 */
	EAttribute getMachinevirtualbox_Boot2dockerURL();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevirtualbox#getDiskSize <em>Disk Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk Size</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevirtualbox#getDiskSize()
	 * @see #getMachinevirtualbox()
	 * @generated
	 */
	EAttribute getMachinevirtualbox_DiskSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevirtualbox#isHostDNSResolver <em>Host DNS Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host DNS Resolver</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevirtualbox#isHostDNSResolver()
	 * @see #getMachinevirtualbox()
	 * @generated
	 */
	EAttribute getMachinevirtualbox_HostDNSResolver();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevirtualbox#getImportBoot2DockerVM <em>Import Boot2 Docker VM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Boot2 Docker VM</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevirtualbox#getImportBoot2DockerVM()
	 * @see #getMachinevirtualbox()
	 * @generated
	 */
	EAttribute getMachinevirtualbox_ImportBoot2DockerVM();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevirtualbox#getHostOnlyCIDR <em>Host Only CIDR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Only CIDR</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevirtualbox#getHostOnlyCIDR()
	 * @see #getMachinevirtualbox()
	 * @generated
	 */
	EAttribute getMachinevirtualbox_HostOnlyCIDR();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevirtualbox#getHostOnlyNICType <em>Host Only NIC Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Only NIC Type</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevirtualbox#getHostOnlyNICType()
	 * @see #getMachinevirtualbox()
	 * @generated
	 */
	EAttribute getMachinevirtualbox_HostOnlyNICType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevirtualbox#getHostOnlyNICPromisc <em>Host Only NIC Promisc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Only NIC Promisc</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevirtualbox#getHostOnlyNICPromisc()
	 * @see #getMachinevirtualbox()
	 * @generated
	 */
	EAttribute getMachinevirtualbox_HostOnlyNICPromisc();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevirtualbox#isNoShare <em>No Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Share</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevirtualbox#isNoShare()
	 * @see #getMachinevirtualbox()
	 * @generated
	 */
	EAttribute getMachinevirtualbox_NoShare();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevirtualbox#isNoDNSProxy <em>No DNS Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No DNS Proxy</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevirtualbox#isNoDNSProxy()
	 * @see #getMachinevirtualbox()
	 * @generated
	 */
	EAttribute getMachinevirtualbox_NoDNSProxy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevirtualbox#isNoVTXCheck <em>No VTX Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No VTX Check</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevirtualbox#isNoVTXCheck()
	 * @see #getMachinevirtualbox()
	 * @generated
	 */
	EAttribute getMachinevirtualbox_NoVTXCheck();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevirtualbox#getShareFolder <em>Share Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Share Folder</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevirtualbox#getShareFolder()
	 * @see #getMachinevirtualbox()
	 * @generated
	 */
	EAttribute getMachinevirtualbox_ShareFolder();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Machinevmwarefusion <em>Machinevmwarefusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machinevmwarefusion</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarefusion
	 * @generated
	 */
	EClass getMachinevmwarefusion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarefusion#getBoot2dockerURL <em>Boot2docker URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boot2docker URL</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarefusion#getBoot2dockerURL()
	 * @see #getMachinevmwarefusion()
	 * @generated
	 */
	EAttribute getMachinevmwarefusion_Boot2dockerURL();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarefusion#getDiskSize <em>Disk Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk Size</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarefusion#getDiskSize()
	 * @see #getMachinevmwarefusion()
	 * @generated
	 */
	EAttribute getMachinevmwarefusion_DiskSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarefusion#getMemorySize <em>Memory Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Size</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarefusion#getMemorySize()
	 * @see #getMachinevmwarefusion()
	 * @generated
	 */
	EAttribute getMachinevmwarefusion_MemorySize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarefusion#isNoShare <em>No Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Share</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarefusion#isNoShare()
	 * @see #getMachinevmwarefusion()
	 * @generated
	 */
	EAttribute getMachinevmwarefusion_NoShare();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair <em>Machinevmwarevcloudair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machinevmwarevcloudair</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevcloudair
	 * @generated
	 */
	EClass getMachinevmwarevcloudair();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getUsername()
	 * @see #getMachinevmwarevcloudair()
	 * @generated
	 */
	EAttribute getMachinevmwarevcloudair_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getPassword()
	 * @see #getMachinevmwarevcloudair()
	 * @generated
	 */
	EAttribute getMachinevmwarevcloudair_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getCatalog()
	 * @see #getMachinevmwarevcloudair()
	 * @generated
	 */
	EAttribute getMachinevmwarevcloudair_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getCatalogItem <em>Catalog Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Item</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getCatalogItem()
	 * @see #getMachinevmwarevcloudair()
	 * @generated
	 */
	EAttribute getMachinevmwarevcloudair_CatalogItem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getComputeId <em>Compute Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compute Id</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getComputeId()
	 * @see #getMachinevmwarevcloudair()
	 * @generated
	 */
	EAttribute getMachinevmwarevcloudair_ComputeId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getCpuCount <em>Cpu Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Count</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getCpuCount()
	 * @see #getMachinevmwarevcloudair()
	 * @generated
	 */
	EAttribute getMachinevmwarevcloudair_CpuCount();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getDockerPort <em>Docker Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docker Port</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getDockerPort()
	 * @see #getMachinevmwarevcloudair()
	 * @generated
	 */
	EAttribute getMachinevmwarevcloudair_DockerPort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getEdgegateway <em>Edgegateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edgegateway</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getEdgegateway()
	 * @see #getMachinevmwarevcloudair()
	 * @generated
	 */
	EAttribute getMachinevmwarevcloudair_Edgegateway();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getMemorySize <em>Memory Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Size</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getMemorySize()
	 * @see #getMachinevmwarevcloudair()
	 * @generated
	 */
	EAttribute getMachinevmwarevcloudair_MemorySize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getVappName <em>Vapp Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vapp Name</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getVappName()
	 * @see #getMachinevmwarevcloudair()
	 * @generated
	 */
	EAttribute getMachinevmwarevcloudair_VappName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getOrgvdcnetwork <em>Orgvdcnetwork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orgvdcnetwork</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getOrgvdcnetwork()
	 * @see #getMachinevmwarevcloudair()
	 * @generated
	 */
	EAttribute getMachinevmwarevcloudair_Orgvdcnetwork();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#isProvision <em>Provision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provision</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#isProvision()
	 * @see #getMachinevmwarevcloudair()
	 * @generated
	 */
	EAttribute getMachinevmwarevcloudair_Provision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getPublicIp <em>Public Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Ip</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getPublicIp()
	 * @see #getMachinevmwarevcloudair()
	 * @generated
	 */
	EAttribute getMachinevmwarevcloudair_PublicIp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getSshPort <em>Ssh Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh Port</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getSshPort()
	 * @see #getMachinevmwarevcloudair()
	 * @generated
	 */
	EAttribute getMachinevmwarevcloudair_SshPort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getVdcId <em>Vdc Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vdc Id</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getVdcId()
	 * @see #getMachinevmwarevcloudair()
	 * @generated
	 */
	EAttribute getMachinevmwarevcloudair_VdcId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Machinevmwarevsphere <em>Machinevmwarevsphere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machinevmwarevsphere</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevsphere
	 * @generated
	 */
	EClass getMachinevmwarevsphere();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getUsername()
	 * @see #getMachinevmwarevsphere()
	 * @generated
	 */
	EAttribute getMachinevmwarevsphere_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getPassword()
	 * @see #getMachinevmwarevsphere()
	 * @generated
	 */
	EAttribute getMachinevmwarevsphere_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getBoot2dockerURL <em>Boot2docker URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boot2docker URL</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getBoot2dockerURL()
	 * @see #getMachinevmwarevsphere()
	 * @generated
	 */
	EAttribute getMachinevmwarevsphere_Boot2dockerURL();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getComputeIp <em>Compute Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compute Ip</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getComputeIp()
	 * @see #getMachinevmwarevsphere()
	 * @generated
	 */
	EAttribute getMachinevmwarevsphere_ComputeIp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getCpuCount <em>Cpu Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Count</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getCpuCount()
	 * @see #getMachinevmwarevsphere()
	 * @generated
	 */
	EAttribute getMachinevmwarevsphere_CpuCount();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getDatacenter <em>Datacenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datacenter</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getDatacenter()
	 * @see #getMachinevmwarevsphere()
	 * @generated
	 */
	EAttribute getMachinevmwarevsphere_Datacenter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getDatastore <em>Datastore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datastore</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getDatastore()
	 * @see #getMachinevmwarevsphere()
	 * @generated
	 */
	EAttribute getMachinevmwarevsphere_Datastore();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getDiskSize <em>Disk Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk Size</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getDiskSize()
	 * @see #getMachinevmwarevsphere()
	 * @generated
	 */
	EAttribute getMachinevmwarevsphere_DiskSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getMemorySize <em>Memory Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Size</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getMemorySize()
	 * @see #getMachinevmwarevsphere()
	 * @generated
	 */
	EAttribute getMachinevmwarevsphere_MemorySize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getNetwork()
	 * @see #getMachinevmwarevsphere()
	 * @generated
	 */
	EAttribute getMachinevmwarevsphere_Network();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getPool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pool</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getPool()
	 * @see #getMachinevmwarevsphere()
	 * @generated
	 */
	EAttribute getMachinevmwarevsphere_Pool();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getVcenter <em>Vcenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vcenter</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinevmwarevsphere#getVcenter()
	 * @see #getMachinevmwarevsphere()
	 * @generated
	 */
	EAttribute getMachinevmwarevsphere_Vcenter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Machineexoscale <em>Machineexoscale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machineexoscale</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineexoscale
	 * @generated
	 */
	EClass getMachineexoscale();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineexoscale#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineexoscale#getUrl()
	 * @see #getMachineexoscale()
	 * @generated
	 */
	EAttribute getMachineexoscale_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineexoscale#getApiKey <em>Api Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Key</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineexoscale#getApiKey()
	 * @see #getMachineexoscale()
	 * @generated
	 */
	EAttribute getMachineexoscale_ApiKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineexoscale#getApiSecretKey <em>Api Secret Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Secret Key</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineexoscale#getApiSecretKey()
	 * @see #getMachineexoscale()
	 * @generated
	 */
	EAttribute getMachineexoscale_ApiSecretKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineexoscale#getInstanceProfile <em>Instance Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Profile</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineexoscale#getInstanceProfile()
	 * @see #getMachineexoscale()
	 * @generated
	 */
	EAttribute getMachineexoscale_InstanceProfile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineexoscale#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineexoscale#getImage()
	 * @see #getMachineexoscale()
	 * @generated
	 */
	EAttribute getMachineexoscale_Image();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineexoscale#getSecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Group</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineexoscale#getSecurityGroup()
	 * @see #getMachineexoscale()
	 * @generated
	 */
	EAttribute getMachineexoscale_SecurityGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineexoscale#getAvailabilityZone <em>Availability Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineexoscale#getAvailabilityZone()
	 * @see #getMachineexoscale()
	 * @generated
	 */
	EAttribute getMachineexoscale_AvailabilityZone();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineexoscale#getSshUser <em>Ssh User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh User</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineexoscale#getSshUser()
	 * @see #getMachineexoscale()
	 * @generated
	 */
	EAttribute getMachineexoscale_SshUser();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineexoscale#getUserData <em>User Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Data</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineexoscale#getUserData()
	 * @see #getMachineexoscale()
	 * @generated
	 */
	EAttribute getMachineexoscale_UserData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machineexoscale#getAffinityGroup <em>Affinity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Affinity Group</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machineexoscale#getAffinityGroup()
	 * @see #getMachineexoscale()
	 * @generated
	 */
	EAttribute getMachineexoscale_AffinityGroup();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Machinegrid5000 <em>Machinegrid5000</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machinegrid5000</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegrid5000
	 * @generated
	 */
	EClass getMachinegrid5000();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegrid5000#getUsername()
	 * @see #getMachinegrid5000()
	 * @generated
	 */
	EAttribute getMachinegrid5000_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegrid5000#getPassword()
	 * @see #getMachinegrid5000()
	 * @generated
	 */
	EAttribute getMachinegrid5000_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegrid5000#getSite()
	 * @see #getMachinegrid5000()
	 * @generated
	 */
	EAttribute getMachinegrid5000_Site();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getWalltime <em>Walltime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Walltime</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegrid5000#getWalltime()
	 * @see #getMachinegrid5000()
	 * @generated
	 */
	EAttribute getMachinegrid5000_Walltime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getSshPrivateKey <em>Ssh Private Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh Private Key</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegrid5000#getSshPrivateKey()
	 * @see #getMachinegrid5000()
	 * @generated
	 */
	EAttribute getMachinegrid5000_SshPrivateKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getSshPublicKey <em>Ssh Public Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh Public Key</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegrid5000#getSshPublicKey()
	 * @see #getMachinegrid5000()
	 * @generated
	 */
	EAttribute getMachinegrid5000_SshPublicKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegrid5000#getImage()
	 * @see #getMachinegrid5000()
	 * @generated
	 */
	EAttribute getMachinegrid5000_Image();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getResourceProperties <em>Resource Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Properties</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegrid5000#getResourceProperties()
	 * @see #getMachinegrid5000()
	 * @generated
	 */
	EAttribute getMachinegrid5000_ResourceProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getUseJobReservation <em>Use Job Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Job Reservation</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegrid5000#getUseJobReservation()
	 * @see #getMachinegrid5000()
	 * @generated
	 */
	EAttribute getMachinegrid5000_UseJobReservation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getHostToProvision <em>Host To Provision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host To Provision</em>'.
	 * @see org.eclipse.cmf.occi.docker.Machinegrid5000#getHostToProvision()
	 * @see #getMachinegrid5000()
	 * @generated
	 */
	EAttribute getMachinegrid5000_HostToProvision();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.docker.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster</em>'.
	 * @see org.eclipse.cmf.occi.docker.Cluster
	 * @generated
	 */
	EClass getCluster();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.docker.Cluster#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cmf.occi.docker.Cluster#getName()
	 * @see #getCluster()
	 * @generated
	 */
	EAttribute getCluster_Name();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.docker.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode</em>'.
	 * @see org.eclipse.cmf.occi.docker.Mode
	 * @generated
	 */
	EEnum getMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DockerFactory getDockerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.ArrayOfStringImpl <em>Array Of String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.ArrayOfStringImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getArrayOfString()
		 * @generated
		 */
		EClass ARRAY_OF_STRING = eINSTANCE.getArrayOfString();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_OF_STRING__VALUES = eINSTANCE.getArrayOfString_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.ContainerImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__NAME = eINSTANCE.getContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Containerid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CONTAINERID = eINSTANCE.getContainer_Containerid();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__IMAGE = eINSTANCE.getContainer_Image();

		/**
		 * The meta object literal for the '<em><b>Build</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__BUILD = eINSTANCE.getContainer_Build();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__COMMAND = eINSTANCE.getContainer_Command();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__PORTS = eINSTANCE.getContainer_Ports();

		/**
		 * The meta object literal for the '<em><b>Expose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__EXPOSE = eINSTANCE.getContainer_Expose();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__VOLUMES = eINSTANCE.getContainer_Volumes();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__ENVIRONMENT = eINSTANCE.getContainer_Environment();

		/**
		 * The meta object literal for the '<em><b>Env File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__ENV_FILE = eINSTANCE.getContainer_EnvFile();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__NET = eINSTANCE.getContainer_Net();

		/**
		 * The meta object literal for the '<em><b>Dns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__DNS = eINSTANCE.getContainer_Dns();

		/**
		 * The meta object literal for the '<em><b>Dns Search</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__DNS_SEARCH = eINSTANCE.getContainer_DnsSearch();

		/**
		 * The meta object literal for the '<em><b>Cap Add</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CAP_ADD = eINSTANCE.getContainer_CapAdd();

		/**
		 * The meta object literal for the '<em><b>Cap Drop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CAP_DROP = eINSTANCE.getContainer_CapDrop();

		/**
		 * The meta object literal for the '<em><b>Working Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__WORKING_DIR = eINSTANCE.getContainer_WorkingDir();

		/**
		 * The meta object literal for the '<em><b>Entrypoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__ENTRYPOINT = eINSTANCE.getContainer_Entrypoint();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__USER = eINSTANCE.getContainer_User();

		/**
		 * The meta object literal for the '<em><b>Domain Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__DOMAIN_NAME = eINSTANCE.getContainer_DomainName();

		/**
		 * The meta object literal for the '<em><b>Mem Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__MEM_LIMIT = eINSTANCE.getContainer_MemLimit();

		/**
		 * The meta object literal for the '<em><b>Memory Swap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__MEMORY_SWAP = eINSTANCE.getContainer_MemorySwap();

		/**
		 * The meta object literal for the '<em><b>Privileged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__PRIVILEGED = eINSTANCE.getContainer_Privileged();

		/**
		 * The meta object literal for the '<em><b>Restart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__RESTART = eINSTANCE.getContainer_Restart();

		/**
		 * The meta object literal for the '<em><b>Stdin Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__STDIN_OPEN = eINSTANCE.getContainer_StdinOpen();

		/**
		 * The meta object literal for the '<em><b>Interactive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__INTERACTIVE = eINSTANCE.getContainer_Interactive();

		/**
		 * The meta object literal for the '<em><b>Cpu Shares</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CPU_SHARES = eINSTANCE.getContainer_CpuShares();

		/**
		 * The meta object literal for the '<em><b>Pid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__PID = eINSTANCE.getContainer_Pid();

		/**
		 * The meta object literal for the '<em><b>Ipc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__IPC = eINSTANCE.getContainer_Ipc();

		/**
		 * The meta object literal for the '<em><b>Add Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__ADD_HOST = eINSTANCE.getContainer_AddHost();

		/**
		 * The meta object literal for the '<em><b>Mac Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__MAC_ADDRESS = eINSTANCE.getContainer_MacAddress();

		/**
		 * The meta object literal for the '<em><b>Rm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__RM = eINSTANCE.getContainer_Rm();

		/**
		 * The meta object literal for the '<em><b>Security Opt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__SECURITY_OPT = eINSTANCE.getContainer_SecurityOpt();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__DEVICE = eINSTANCE.getContainer_Device();

		/**
		 * The meta object literal for the '<em><b>Lxc Conf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__LXC_CONF = eINSTANCE.getContainer_LxcConf();

		/**
		 * The meta object literal for the '<em><b>Publish All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__PUBLISH_ALL = eINSTANCE.getContainer_PublishAll();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__READ_ONLY = eINSTANCE.getContainer_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Monitored</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__MONITORED = eINSTANCE.getContainer_Monitored();

		/**
		 * The meta object literal for the '<em><b>Cpu Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CPU_USED = eINSTANCE.getContainer_CpuUsed();

		/**
		 * The meta object literal for the '<em><b>Memory Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__MEMORY_USED = eINSTANCE.getContainer_MemoryUsed();

		/**
		 * The meta object literal for the '<em><b>Cpu Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CPU_PERCENT = eINSTANCE.getContainer_CpuPercent();

		/**
		 * The meta object literal for the '<em><b>Memory Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__MEMORY_PERCENT = eINSTANCE.getContainer_MemoryPercent();

		/**
		 * The meta object literal for the '<em><b>Disk Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__DISK_USED = eINSTANCE.getContainer_DiskUsed();

		/**
		 * The meta object literal for the '<em><b>Disk Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__DISK_PERCENT = eINSTANCE.getContainer_DiskPercent();

		/**
		 * The meta object literal for the '<em><b>Bandwidth Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__BANDWIDTH_USED = eINSTANCE.getContainer_BandwidthUsed();

		/**
		 * The meta object literal for the '<em><b>Bandwidth Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__BANDWIDTH_PERCENT = eINSTANCE.getContainer_BandwidthPercent();

		/**
		 * The meta object literal for the '<em><b>Monitoring Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__MONITORING_INTERVAL = eINSTANCE.getContainer_MonitoringInterval();

		/**
		 * The meta object literal for the '<em><b>Cpu Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CPU_MAX_VALUE = eINSTANCE.getContainer_CpuMaxValue();

		/**
		 * The meta object literal for the '<em><b>Memory Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__MEMORY_MAX_VALUE = eINSTANCE.getContainer_MemoryMaxValue();

		/**
		 * The meta object literal for the '<em><b>Core Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CORE_MAX = eINSTANCE.getContainer_CoreMax();

		/**
		 * The meta object literal for the '<em><b>Cpu Set Cpus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CPU_SET_CPUS = eINSTANCE.getContainer_CpuSetCpus();

		/**
		 * The meta object literal for the '<em><b>Cpu Set Mems</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CPU_SET_MEMS = eINSTANCE.getContainer_CpuSetMems();

		/**
		 * The meta object literal for the '<em><b>Tty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__TTY = eINSTANCE.getContainer_Tty();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___CREATE = eINSTANCE.getContainer__Create();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___STOP = eINSTANCE.getContainer__Stop();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___RUN = eINSTANCE.getContainer__Run();

		/**
		 * The meta object literal for the '<em><b>Pause</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___PAUSE = eINSTANCE.getContainer__Pause();

		/**
		 * The meta object literal for the '<em><b>Unpause</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___UNPAUSE = eINSTANCE.getContainer__Unpause();

		/**
		 * The meta object literal for the '<em><b>Kill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___KILL__STRING = eINSTANCE.getContainer__Kill__String();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.LinkImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__ALIAS = eINSTANCE.getLink_Alias();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.NetworklinkImpl <em>Networklink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.NetworklinkImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getNetworklink()
		 * @generated
		 */
		EClass NETWORKLINK = eINSTANCE.getNetworklink();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.VolumesfromImpl <em>Volumesfrom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.VolumesfromImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getVolumesfrom()
		 * @generated
		 */
		EClass VOLUMESFROM = eINSTANCE.getVolumesfrom();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUMESFROM__MODE = eINSTANCE.getVolumesfrom_Mode();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.ContainsImpl <em>Contains</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.ContainsImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getContains()
		 * @generated
		 */
		EClass CONTAINS = eINSTANCE.getContains();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.MachineImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__NAME = eINSTANCE.getMachine_Name();

		/**
		 * The meta object literal for the '<em><b>Engine Install URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__ENGINE_INSTALL_URL = eINSTANCE.getMachine_EngineInstallURL();

		/**
		 * The meta object literal for the '<em><b>Engine Opt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__ENGINE_OPT = eINSTANCE.getMachine_EngineOpt();

		/**
		 * The meta object literal for the '<em><b>Engine Insecure Registry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__ENGINE_INSECURE_REGISTRY = eINSTANCE.getMachine_EngineInsecureRegistry();

		/**
		 * The meta object literal for the '<em><b>Engine Registry Mirror</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__ENGINE_REGISTRY_MIRROR = eINSTANCE.getMachine_EngineRegistryMirror();

		/**
		 * The meta object literal for the '<em><b>Engine Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__ENGINE_LABEL = eINSTANCE.getMachine_EngineLabel();

		/**
		 * The meta object literal for the '<em><b>Engine Storage Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__ENGINE_STORAGE_DRIVER = eINSTANCE.getMachine_EngineStorageDriver();

		/**
		 * The meta object literal for the '<em><b>Engine Env</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__ENGINE_ENV = eINSTANCE.getMachine_EngineEnv();

		/**
		 * The meta object literal for the '<em><b>Swarm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__SWARM = eINSTANCE.getMachine_Swarm();

		/**
		 * The meta object literal for the '<em><b>Swarm Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__SWARM_IMAGE = eINSTANCE.getMachine_SwarmImage();

		/**
		 * The meta object literal for the '<em><b>Swarm Master</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__SWARM_MASTER = eINSTANCE.getMachine_SwarmMaster();

		/**
		 * The meta object literal for the '<em><b>Swarm Discovery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__SWARM_DISCOVERY = eINSTANCE.getMachine_SwarmDiscovery();

		/**
		 * The meta object literal for the '<em><b>Swarm Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__SWARM_STRATEGY = eINSTANCE.getMachine_SwarmStrategy();

		/**
		 * The meta object literal for the '<em><b>Swarm Opt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__SWARM_OPT = eINSTANCE.getMachine_SwarmOpt();

		/**
		 * The meta object literal for the '<em><b>Swarm Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__SWARM_HOST = eINSTANCE.getMachine_SwarmHost();

		/**
		 * The meta object literal for the '<em><b>Swarm Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__SWARM_ADDR = eINSTANCE.getMachine_SwarmAddr();

		/**
		 * The meta object literal for the '<em><b>Swarm Experimental</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__SWARM_EXPERIMENTAL = eINSTANCE.getMachine_SwarmExperimental();

		/**
		 * The meta object literal for the '<em><b>Tls San</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__TLS_SAN = eINSTANCE.getMachine_TlsSan();

		/**
		 * The meta object literal for the '<em><b>Startall</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MACHINE___STARTALL = eINSTANCE.getMachine__Startall();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.VolumeImpl <em>Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.VolumeImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getVolume()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__DRIVER = eINSTANCE.getVolume_Driver();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__LABELS = eINSTANCE.getVolume_Labels();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__OPTIONS = eINSTANCE.getVolume_Options();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__SOURCE = eINSTANCE.getVolume_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__DESTINATION = eINSTANCE.getVolume_Destination();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__MODE = eINSTANCE.getVolume_Mode();

		/**
		 * The meta object literal for the '<em><b>Rw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__RW = eINSTANCE.getVolume_Rw();

		/**
		 * The meta object literal for the '<em><b>Propagation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__PROPAGATION = eINSTANCE.getVolume_Propagation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__NAME = eINSTANCE.getVolume_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.NetworkImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Network Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__NETWORK_ID = eINSTANCE.getNetwork_NetworkId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__NAME = eINSTANCE.getNetwork_Name();

		/**
		 * The meta object literal for the '<em><b>Aux Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__AUX_ADDRESS = eINSTANCE.getNetwork_AuxAddress();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__DRIVER = eINSTANCE.getNetwork_Driver();

		/**
		 * The meta object literal for the '<em><b>Gateway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__GATEWAY = eINSTANCE.getNetwork_Gateway();

		/**
		 * The meta object literal for the '<em><b>Internal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__INTERNAL = eINSTANCE.getNetwork_Internal();

		/**
		 * The meta object literal for the '<em><b>Ip Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__IP_RANGE = eINSTANCE.getNetwork_IpRange();

		/**
		 * The meta object literal for the '<em><b>Ipam Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__IPAM_DRIVER = eINSTANCE.getNetwork_IpamDriver();

		/**
		 * The meta object literal for the '<em><b>Ipam Opt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__IPAM_OPT = eINSTANCE.getNetwork_IpamOpt();

		/**
		 * The meta object literal for the '<em><b>Ipv6</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__IPV6 = eINSTANCE.getNetwork_Ipv6();

		/**
		 * The meta object literal for the '<em><b>Opt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__OPT = eINSTANCE.getNetwork_Opt();

		/**
		 * The meta object literal for the '<em><b>Subnet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__SUBNET = eINSTANCE.getNetwork_Subnet();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.MachinegenericImpl <em>Machinegeneric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.MachinegenericImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinegeneric()
		 * @generated
		 */
		EClass MACHINEGENERIC = eINSTANCE.getMachinegeneric();

		/**
		 * The meta object literal for the '<em><b>Engine Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEGENERIC__ENGINE_PORT = eINSTANCE.getMachinegeneric_EnginePort();

		/**
		 * The meta object literal for the '<em><b>Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEGENERIC__IP_ADDRESS = eINSTANCE.getMachinegeneric_IpAddress();

		/**
		 * The meta object literal for the '<em><b>Ssh Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEGENERIC__SSH_KEY = eINSTANCE.getMachinegeneric_SshKey();

		/**
		 * The meta object literal for the '<em><b>Ssh User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEGENERIC__SSH_USER = eINSTANCE.getMachinegeneric_SshUser();

		/**
		 * The meta object literal for the '<em><b>Ssh Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEGENERIC__SSH_PORT = eINSTANCE.getMachinegeneric_SshPort();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.Machineamazonec2Impl <em>Machineamazonec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.Machineamazonec2Impl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachineamazonec2()
		 * @generated
		 */
		EClass MACHINEAMAZONEC2 = eINSTANCE.getMachineamazonec2();

		/**
		 * The meta object literal for the '<em><b>Access Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEAMAZONEC2__ACCESS_KEY = eINSTANCE.getMachineamazonec2_AccessKey();

		/**
		 * The meta object literal for the '<em><b>Ami</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEAMAZONEC2__AMI = eINSTANCE.getMachineamazonec2_Ami();

		/**
		 * The meta object literal for the '<em><b>Instance Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEAMAZONEC2__INSTANCE_TYPE = eINSTANCE.getMachineamazonec2_InstanceType();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEAMAZONEC2__REGION = eINSTANCE.getMachineamazonec2_Region();

		/**
		 * The meta object literal for the '<em><b>Root Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEAMAZONEC2__ROOT_SIZE = eINSTANCE.getMachineamazonec2_RootSize();

		/**
		 * The meta object literal for the '<em><b>Secret Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEAMAZONEC2__SECRET_KEY = eINSTANCE.getMachineamazonec2_SecretKey();

		/**
		 * The meta object literal for the '<em><b>Security Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEAMAZONEC2__SECURITY_GROUP = eINSTANCE.getMachineamazonec2_SecurityGroup();

		/**
		 * The meta object literal for the '<em><b>Session Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEAMAZONEC2__SESSION_TOKEN = eINSTANCE.getMachineamazonec2_SessionToken();

		/**
		 * The meta object literal for the '<em><b>Subnet Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEAMAZONEC2__SUBNET_ID = eINSTANCE.getMachineamazonec2_SubnetId();

		/**
		 * The meta object literal for the '<em><b>Vpc Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEAMAZONEC2__VPC_ID = eINSTANCE.getMachineamazonec2_VpcId();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEAMAZONEC2__ZONE = eINSTANCE.getMachineamazonec2_Zone();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.MachinedigitaloceanImpl <em>Machinedigitalocean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.MachinedigitaloceanImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinedigitalocean()
		 * @generated
		 */
		EClass MACHINEDIGITALOCEAN = eINSTANCE.getMachinedigitalocean();

		/**
		 * The meta object literal for the '<em><b>Access Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEDIGITALOCEAN__ACCESS_TOKEN = eINSTANCE.getMachinedigitalocean_AccessToken();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEDIGITALOCEAN__IMAGE = eINSTANCE.getMachinedigitalocean_Image();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEDIGITALOCEAN__REGION = eINSTANCE.getMachinedigitalocean_Region();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEDIGITALOCEAN__SIZE = eINSTANCE.getMachinedigitalocean_Size();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.MachinegooglecomputeengineImpl <em>Machinegooglecomputeengine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.MachinegooglecomputeengineImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinegooglecomputeengine()
		 * @generated
		 */
		EClass MACHINEGOOGLECOMPUTEENGINE = eINSTANCE.getMachinegooglecomputeengine();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEGOOGLECOMPUTEENGINE__ZONE = eINSTANCE.getMachinegooglecomputeengine_Zone();

		/**
		 * The meta object literal for the '<em><b>Machine Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEGOOGLECOMPUTEENGINE__MACHINE_TYPE = eINSTANCE.getMachinegooglecomputeengine_MachineType();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEGOOGLECOMPUTEENGINE__USERNAME = eINSTANCE.getMachinegooglecomputeengine_Username();

		/**
		 * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEGOOGLECOMPUTEENGINE__INSTANCE_NAME = eINSTANCE.getMachinegooglecomputeengine_InstanceName();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEGOOGLECOMPUTEENGINE__PROJECT = eINSTANCE.getMachinegooglecomputeengine_Project();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.MachineibmsoftlayerImpl <em>Machineibmsoftlayer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.MachineibmsoftlayerImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachineibmsoftlayer()
		 * @generated
		 */
		EClass MACHINEIBMSOFTLAYER = eINSTANCE.getMachineibmsoftlayer();

		/**
		 * The meta object literal for the '<em><b>Api Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEIBMSOFTLAYER__API_ENDPOINT = eINSTANCE.getMachineibmsoftlayer_ApiEndpoint();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEIBMSOFTLAYER__USER = eINSTANCE.getMachineibmsoftlayer_User();

		/**
		 * The meta object literal for the '<em><b>Api Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEIBMSOFTLAYER__API_KEY = eINSTANCE.getMachineibmsoftlayer_ApiKey();

		/**
		 * The meta object literal for the '<em><b>Cpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEIBMSOFTLAYER__CPU = eINSTANCE.getMachineibmsoftlayer_Cpu();

		/**
		 * The meta object literal for the '<em><b>Disk Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEIBMSOFTLAYER__DISK_SIZE = eINSTANCE.getMachineibmsoftlayer_DiskSize();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEIBMSOFTLAYER__DOMAIN = eINSTANCE.getMachineibmsoftlayer_Domain();

		/**
		 * The meta object literal for the '<em><b>Hourly Billing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEIBMSOFTLAYER__HOURLY_BILLING = eINSTANCE.getMachineibmsoftlayer_HourlyBilling();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEIBMSOFTLAYER__IMAGE = eINSTANCE.getMachineibmsoftlayer_Image();

		/**
		 * The meta object literal for the '<em><b>Local Disk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEIBMSOFTLAYER__LOCAL_DISK = eINSTANCE.getMachineibmsoftlayer_LocalDisk();

		/**
		 * The meta object literal for the '<em><b>Private Net Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEIBMSOFTLAYER__PRIVATE_NET_ONLY = eINSTANCE.getMachineibmsoftlayer_PrivateNetOnly();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEIBMSOFTLAYER__REGION = eINSTANCE.getMachineibmsoftlayer_Region();

		/**
		 * The meta object literal for the '<em><b>Public Vlan Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEIBMSOFTLAYER__PUBLIC_VLAN_ID = eINSTANCE.getMachineibmsoftlayer_PublicVlanId();

		/**
		 * The meta object literal for the '<em><b>Private Vlan Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEIBMSOFTLAYER__PRIVATE_VLAN_ID = eINSTANCE.getMachineibmsoftlayer_PrivateVlanId();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl <em>Machinemicrosoftazure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.MachinemicrosoftazureImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinemicrosoftazure()
		 * @generated
		 */
		EClass MACHINEMICROSOFTAZURE = eINSTANCE.getMachinemicrosoftazure();

		/**
		 * The meta object literal for the '<em><b>Subscription Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTAZURE__SUBSCRIPTION_ID = eINSTANCE.getMachinemicrosoftazure_SubscriptionId();

		/**
		 * The meta object literal for the '<em><b>Subscription Cert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTAZURE__SUBSCRIPTION_CERT = eINSTANCE.getMachinemicrosoftazure_SubscriptionCert();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTAZURE__ENVIRONMENT = eINSTANCE.getMachinemicrosoftazure_Environment();

		/**
		 * The meta object literal for the '<em><b>Machine Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTAZURE__MACHINE_LOCATION = eINSTANCE.getMachinemicrosoftazure_MachineLocation();

		/**
		 * The meta object literal for the '<em><b>Resource Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTAZURE__RESOURCE_GROUP = eINSTANCE.getMachinemicrosoftazure_ResourceGroup();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTAZURE__SIZE = eINSTANCE.getMachinemicrosoftazure_Size();

		/**
		 * The meta object literal for the '<em><b>Ssh User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTAZURE__SSH_USER = eINSTANCE.getMachinemicrosoftazure_SshUser();

		/**
		 * The meta object literal for the '<em><b>Vnet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTAZURE__VNET = eINSTANCE.getMachinemicrosoftazure_Vnet();

		/**
		 * The meta object literal for the '<em><b>Subnet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTAZURE__SUBNET = eINSTANCE.getMachinemicrosoftazure_Subnet();

		/**
		 * The meta object literal for the '<em><b>Subnet Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTAZURE__SUBNET_PREFIX = eINSTANCE.getMachinemicrosoftazure_SubnetPrefix();

		/**
		 * The meta object literal for the '<em><b>Availability Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTAZURE__AVAILABILITY_SET = eINSTANCE.getMachinemicrosoftazure_AvailabilitySet();

		/**
		 * The meta object literal for the '<em><b>Open Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTAZURE__OPEN_PORT = eINSTANCE.getMachinemicrosoftazure_OpenPort();

		/**
		 * The meta object literal for the '<em><b>Private Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTAZURE__PRIVATE_IP_ADDRESS = eINSTANCE.getMachinemicrosoftazure_PrivateIpAddress();

		/**
		 * The meta object literal for the '<em><b>No Public Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTAZURE__NO_PUBLIC_IP = eINSTANCE.getMachinemicrosoftazure_NoPublicIp();

		/**
		 * The meta object literal for the '<em><b>Static Public Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTAZURE__STATIC_PUBLIC_IP = eINSTANCE.getMachinemicrosoftazure_StaticPublicIp();

		/**
		 * The meta object literal for the '<em><b>Docker Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTAZURE__DOCKER_PORT = eINSTANCE.getMachinemicrosoftazure_DockerPort();

		/**
		 * The meta object literal for the '<em><b>Use Private Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTAZURE__USE_PRIVATE_IP = eINSTANCE.getMachinemicrosoftazure_UsePrivateIp();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTAZURE__IMAGE = eINSTANCE.getMachinemicrosoftazure_Image();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.MachinemicrosofthypervImpl <em>Machinemicrosofthyperv</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.MachinemicrosofthypervImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinemicrosofthyperv()
		 * @generated
		 */
		EClass MACHINEMICROSOFTHYPERV = eINSTANCE.getMachinemicrosofthyperv();

		/**
		 * The meta object literal for the '<em><b>Virtual Switch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTHYPERV__VIRTUAL_SWITCH = eINSTANCE.getMachinemicrosofthyperv_VirtualSwitch();

		/**
		 * The meta object literal for the '<em><b>Boot2docker URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTHYPERV__BOOT2DOCKER_URL = eINSTANCE.getMachinemicrosofthyperv_Boot2dockerURL();

		/**
		 * The meta object literal for the '<em><b>Disk Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTHYPERV__DISK_SIZE = eINSTANCE.getMachinemicrosofthyperv_DiskSize();

		/**
		 * The meta object literal for the '<em><b>Static Mac Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTHYPERV__STATIC_MAC_ADDRESS = eINSTANCE.getMachinemicrosofthyperv_StaticMacAddress();

		/**
		 * The meta object literal for the '<em><b>Vlan Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEMICROSOFTHYPERV__VLAN_ID = eINSTANCE.getMachinemicrosofthyperv_VlanId();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl <em>Machineopenstack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.MachineopenstackImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachineopenstack()
		 * @generated
		 */
		EClass MACHINEOPENSTACK = eINSTANCE.getMachineopenstack();

		/**
		 * The meta object literal for the '<em><b>Flavor Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__FLAVOR_ID = eINSTANCE.getMachineopenstack_FlavorId();

		/**
		 * The meta object literal for the '<em><b>Flavor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__FLAVOR_NAME = eINSTANCE.getMachineopenstack_FlavorName();

		/**
		 * The meta object literal for the '<em><b>Image Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__IMAGE_ID = eINSTANCE.getMachineopenstack_ImageId();

		/**
		 * The meta object literal for the '<em><b>Image Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__IMAGE_NAME = eINSTANCE.getMachineopenstack_ImageName();

		/**
		 * The meta object literal for the '<em><b>Auth Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__AUTH_URL = eINSTANCE.getMachineopenstack_AuthUrl();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__USERNAME = eINSTANCE.getMachineopenstack_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__PASSWORD = eINSTANCE.getMachineopenstack_Password();

		/**
		 * The meta object literal for the '<em><b>Tenant Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__TENANT_NAME = eINSTANCE.getMachineopenstack_TenantName();

		/**
		 * The meta object literal for the '<em><b>Tenant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__TENANT_ID = eINSTANCE.getMachineopenstack_TenantId();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__REGION = eINSTANCE.getMachineopenstack_Region();

		/**
		 * The meta object literal for the '<em><b>Endpoint Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__ENDPOINT_TYPE = eINSTANCE.getMachineopenstack_EndpointType();

		/**
		 * The meta object literal for the '<em><b>Net Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__NET_ID = eINSTANCE.getMachineopenstack_NetId();

		/**
		 * The meta object literal for the '<em><b>Net Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__NET_NAME = eINSTANCE.getMachineopenstack_NetName();

		/**
		 * The meta object literal for the '<em><b>Sec Groups</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__SEC_GROUPS = eINSTANCE.getMachineopenstack_SecGroups();

		/**
		 * The meta object literal for the '<em><b>Floating Ip Pool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__FLOATING_IP_POOL = eINSTANCE.getMachineopenstack_FloatingIpPool();

		/**
		 * The meta object literal for the '<em><b>Active Time Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__ACTIVE_TIME_OUT = eINSTANCE.getMachineopenstack_ActiveTimeOut();

		/**
		 * The meta object literal for the '<em><b>Availability Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__AVAILABILITY_ZONE = eINSTANCE.getMachineopenstack_AvailabilityZone();

		/**
		 * The meta object literal for the '<em><b>Domain Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__DOMAIN_ID = eINSTANCE.getMachineopenstack_DomainId();

		/**
		 * The meta object literal for the '<em><b>Domain Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__DOMAIN_NAME = eINSTANCE.getMachineopenstack_DomainName();

		/**
		 * The meta object literal for the '<em><b>Insecure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__INSECURE = eINSTANCE.getMachineopenstack_Insecure();

		/**
		 * The meta object literal for the '<em><b>Ip Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__IP_VERSION = eINSTANCE.getMachineopenstack_IpVersion();

		/**
		 * The meta object literal for the '<em><b>Keypair Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__KEYPAIR_NAME = eINSTANCE.getMachineopenstack_KeypairName();

		/**
		 * The meta object literal for the '<em><b>Private Key File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__PRIVATE_KEY_FILE = eINSTANCE.getMachineopenstack_PrivateKeyFile();

		/**
		 * The meta object literal for the '<em><b>Ssh Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__SSH_PORT = eINSTANCE.getMachineopenstack_SshPort();

		/**
		 * The meta object literal for the '<em><b>Ssh User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEOPENSTACK__SSH_USER = eINSTANCE.getMachineopenstack_SshUser();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.MachinerackspaceImpl <em>Machinerackspace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.MachinerackspaceImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinerackspace()
		 * @generated
		 */
		EClass MACHINERACKSPACE = eINSTANCE.getMachinerackspace();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINERACKSPACE__USERNAME = eINSTANCE.getMachinerackspace_Username();

		/**
		 * The meta object literal for the '<em><b>Api Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINERACKSPACE__API_KEY = eINSTANCE.getMachinerackspace_ApiKey();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINERACKSPACE__REGION = eINSTANCE.getMachinerackspace_Region();

		/**
		 * The meta object literal for the '<em><b>End Point Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINERACKSPACE__END_POINT_TYPE = eINSTANCE.getMachinerackspace_EndPointType();

		/**
		 * The meta object literal for the '<em><b>Image Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINERACKSPACE__IMAGE_ID = eINSTANCE.getMachinerackspace_ImageId();

		/**
		 * The meta object literal for the '<em><b>Flavor Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINERACKSPACE__FLAVOR_ID = eINSTANCE.getMachinerackspace_FlavorId();

		/**
		 * The meta object literal for the '<em><b>Ssh User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINERACKSPACE__SSH_USER = eINSTANCE.getMachinerackspace_SshUser();

		/**
		 * The meta object literal for the '<em><b>Ssh Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINERACKSPACE__SSH_PORT = eINSTANCE.getMachinerackspace_SshPort();

		/**
		 * The meta object literal for the '<em><b>Docker Install</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINERACKSPACE__DOCKER_INSTALL = eINSTANCE.getMachinerackspace_DockerInstall();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.MachinevirtualboxImpl <em>Machinevirtualbox</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.MachinevirtualboxImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinevirtualbox()
		 * @generated
		 */
		EClass MACHINEVIRTUALBOX = eINSTANCE.getMachinevirtualbox();

		/**
		 * The meta object literal for the '<em><b>Boot2docker URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVIRTUALBOX__BOOT2DOCKER_URL = eINSTANCE.getMachinevirtualbox_Boot2dockerURL();

		/**
		 * The meta object literal for the '<em><b>Disk Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVIRTUALBOX__DISK_SIZE = eINSTANCE.getMachinevirtualbox_DiskSize();

		/**
		 * The meta object literal for the '<em><b>Host DNS Resolver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVIRTUALBOX__HOST_DNS_RESOLVER = eINSTANCE.getMachinevirtualbox_HostDNSResolver();

		/**
		 * The meta object literal for the '<em><b>Import Boot2 Docker VM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVIRTUALBOX__IMPORT_BOOT2_DOCKER_VM = eINSTANCE.getMachinevirtualbox_ImportBoot2DockerVM();

		/**
		 * The meta object literal for the '<em><b>Host Only CIDR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVIRTUALBOX__HOST_ONLY_CIDR = eINSTANCE.getMachinevirtualbox_HostOnlyCIDR();

		/**
		 * The meta object literal for the '<em><b>Host Only NIC Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVIRTUALBOX__HOST_ONLY_NIC_TYPE = eINSTANCE.getMachinevirtualbox_HostOnlyNICType();

		/**
		 * The meta object literal for the '<em><b>Host Only NIC Promisc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVIRTUALBOX__HOST_ONLY_NIC_PROMISC = eINSTANCE.getMachinevirtualbox_HostOnlyNICPromisc();

		/**
		 * The meta object literal for the '<em><b>No Share</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVIRTUALBOX__NO_SHARE = eINSTANCE.getMachinevirtualbox_NoShare();

		/**
		 * The meta object literal for the '<em><b>No DNS Proxy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVIRTUALBOX__NO_DNS_PROXY = eINSTANCE.getMachinevirtualbox_NoDNSProxy();

		/**
		 * The meta object literal for the '<em><b>No VTX Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVIRTUALBOX__NO_VTX_CHECK = eINSTANCE.getMachinevirtualbox_NoVTXCheck();

		/**
		 * The meta object literal for the '<em><b>Share Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVIRTUALBOX__SHARE_FOLDER = eINSTANCE.getMachinevirtualbox_ShareFolder();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarefusionImpl <em>Machinevmwarefusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.MachinevmwarefusionImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinevmwarefusion()
		 * @generated
		 */
		EClass MACHINEVMWAREFUSION = eINSTANCE.getMachinevmwarefusion();

		/**
		 * The meta object literal for the '<em><b>Boot2docker URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREFUSION__BOOT2DOCKER_URL = eINSTANCE.getMachinevmwarefusion_Boot2dockerURL();

		/**
		 * The meta object literal for the '<em><b>Disk Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREFUSION__DISK_SIZE = eINSTANCE.getMachinevmwarefusion_DiskSize();

		/**
		 * The meta object literal for the '<em><b>Memory Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREFUSION__MEMORY_SIZE = eINSTANCE.getMachinevmwarefusion_MemorySize();

		/**
		 * The meta object literal for the '<em><b>No Share</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREFUSION__NO_SHARE = eINSTANCE.getMachinevmwarefusion_NoShare();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevcloudairImpl <em>Machinevmwarevcloudair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.MachinevmwarevcloudairImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinevmwarevcloudair()
		 * @generated
		 */
		EClass MACHINEVMWAREVCLOUDAIR = eINSTANCE.getMachinevmwarevcloudair();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVCLOUDAIR__USERNAME = eINSTANCE.getMachinevmwarevcloudair_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVCLOUDAIR__PASSWORD = eINSTANCE.getMachinevmwarevcloudair_Password();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVCLOUDAIR__CATALOG = eINSTANCE.getMachinevmwarevcloudair_Catalog();

		/**
		 * The meta object literal for the '<em><b>Catalog Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVCLOUDAIR__CATALOG_ITEM = eINSTANCE.getMachinevmwarevcloudair_CatalogItem();

		/**
		 * The meta object literal for the '<em><b>Compute Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVCLOUDAIR__COMPUTE_ID = eINSTANCE.getMachinevmwarevcloudair_ComputeId();

		/**
		 * The meta object literal for the '<em><b>Cpu Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVCLOUDAIR__CPU_COUNT = eINSTANCE.getMachinevmwarevcloudair_CpuCount();

		/**
		 * The meta object literal for the '<em><b>Docker Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVCLOUDAIR__DOCKER_PORT = eINSTANCE.getMachinevmwarevcloudair_DockerPort();

		/**
		 * The meta object literal for the '<em><b>Edgegateway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVCLOUDAIR__EDGEGATEWAY = eINSTANCE.getMachinevmwarevcloudair_Edgegateway();

		/**
		 * The meta object literal for the '<em><b>Memory Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVCLOUDAIR__MEMORY_SIZE = eINSTANCE.getMachinevmwarevcloudair_MemorySize();

		/**
		 * The meta object literal for the '<em><b>Vapp Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVCLOUDAIR__VAPP_NAME = eINSTANCE.getMachinevmwarevcloudair_VappName();

		/**
		 * The meta object literal for the '<em><b>Orgvdcnetwork</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVCLOUDAIR__ORGVDCNETWORK = eINSTANCE.getMachinevmwarevcloudair_Orgvdcnetwork();

		/**
		 * The meta object literal for the '<em><b>Provision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVCLOUDAIR__PROVISION = eINSTANCE.getMachinevmwarevcloudair_Provision();

		/**
		 * The meta object literal for the '<em><b>Public Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVCLOUDAIR__PUBLIC_IP = eINSTANCE.getMachinevmwarevcloudair_PublicIp();

		/**
		 * The meta object literal for the '<em><b>Ssh Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVCLOUDAIR__SSH_PORT = eINSTANCE.getMachinevmwarevcloudair_SshPort();

		/**
		 * The meta object literal for the '<em><b>Vdc Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVCLOUDAIR__VDC_ID = eINSTANCE.getMachinevmwarevcloudair_VdcId();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.MachinevmwarevsphereImpl <em>Machinevmwarevsphere</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.MachinevmwarevsphereImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinevmwarevsphere()
		 * @generated
		 */
		EClass MACHINEVMWAREVSPHERE = eINSTANCE.getMachinevmwarevsphere();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVSPHERE__USERNAME = eINSTANCE.getMachinevmwarevsphere_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVSPHERE__PASSWORD = eINSTANCE.getMachinevmwarevsphere_Password();

		/**
		 * The meta object literal for the '<em><b>Boot2docker URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVSPHERE__BOOT2DOCKER_URL = eINSTANCE.getMachinevmwarevsphere_Boot2dockerURL();

		/**
		 * The meta object literal for the '<em><b>Compute Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVSPHERE__COMPUTE_IP = eINSTANCE.getMachinevmwarevsphere_ComputeIp();

		/**
		 * The meta object literal for the '<em><b>Cpu Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVSPHERE__CPU_COUNT = eINSTANCE.getMachinevmwarevsphere_CpuCount();

		/**
		 * The meta object literal for the '<em><b>Datacenter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVSPHERE__DATACENTER = eINSTANCE.getMachinevmwarevsphere_Datacenter();

		/**
		 * The meta object literal for the '<em><b>Datastore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVSPHERE__DATASTORE = eINSTANCE.getMachinevmwarevsphere_Datastore();

		/**
		 * The meta object literal for the '<em><b>Disk Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVSPHERE__DISK_SIZE = eINSTANCE.getMachinevmwarevsphere_DiskSize();

		/**
		 * The meta object literal for the '<em><b>Memory Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVSPHERE__MEMORY_SIZE = eINSTANCE.getMachinevmwarevsphere_MemorySize();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVSPHERE__NETWORK = eINSTANCE.getMachinevmwarevsphere_Network();

		/**
		 * The meta object literal for the '<em><b>Pool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVSPHERE__POOL = eINSTANCE.getMachinevmwarevsphere_Pool();

		/**
		 * The meta object literal for the '<em><b>Vcenter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEVMWAREVSPHERE__VCENTER = eINSTANCE.getMachinevmwarevsphere_Vcenter();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.MachineexoscaleImpl <em>Machineexoscale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.MachineexoscaleImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachineexoscale()
		 * @generated
		 */
		EClass MACHINEEXOSCALE = eINSTANCE.getMachineexoscale();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEEXOSCALE__URL = eINSTANCE.getMachineexoscale_Url();

		/**
		 * The meta object literal for the '<em><b>Api Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEEXOSCALE__API_KEY = eINSTANCE.getMachineexoscale_ApiKey();

		/**
		 * The meta object literal for the '<em><b>Api Secret Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEEXOSCALE__API_SECRET_KEY = eINSTANCE.getMachineexoscale_ApiSecretKey();

		/**
		 * The meta object literal for the '<em><b>Instance Profile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEEXOSCALE__INSTANCE_PROFILE = eINSTANCE.getMachineexoscale_InstanceProfile();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEEXOSCALE__IMAGE = eINSTANCE.getMachineexoscale_Image();

		/**
		 * The meta object literal for the '<em><b>Security Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEEXOSCALE__SECURITY_GROUP = eINSTANCE.getMachineexoscale_SecurityGroup();

		/**
		 * The meta object literal for the '<em><b>Availability Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEEXOSCALE__AVAILABILITY_ZONE = eINSTANCE.getMachineexoscale_AvailabilityZone();

		/**
		 * The meta object literal for the '<em><b>Ssh User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEEXOSCALE__SSH_USER = eINSTANCE.getMachineexoscale_SshUser();

		/**
		 * The meta object literal for the '<em><b>User Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEEXOSCALE__USER_DATA = eINSTANCE.getMachineexoscale_UserData();

		/**
		 * The meta object literal for the '<em><b>Affinity Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEEXOSCALE__AFFINITY_GROUP = eINSTANCE.getMachineexoscale_AffinityGroup();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.Machinegrid5000Impl <em>Machinegrid5000</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.Machinegrid5000Impl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMachinegrid5000()
		 * @generated
		 */
		EClass MACHINEGRID5000 = eINSTANCE.getMachinegrid5000();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEGRID5000__USERNAME = eINSTANCE.getMachinegrid5000_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEGRID5000__PASSWORD = eINSTANCE.getMachinegrid5000_Password();

		/**
		 * The meta object literal for the '<em><b>Site</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEGRID5000__SITE = eINSTANCE.getMachinegrid5000_Site();

		/**
		 * The meta object literal for the '<em><b>Walltime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEGRID5000__WALLTIME = eINSTANCE.getMachinegrid5000_Walltime();

		/**
		 * The meta object literal for the '<em><b>Ssh Private Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEGRID5000__SSH_PRIVATE_KEY = eINSTANCE.getMachinegrid5000_SshPrivateKey();

		/**
		 * The meta object literal for the '<em><b>Ssh Public Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEGRID5000__SSH_PUBLIC_KEY = eINSTANCE.getMachinegrid5000_SshPublicKey();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEGRID5000__IMAGE = eINSTANCE.getMachinegrid5000_Image();

		/**
		 * The meta object literal for the '<em><b>Resource Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEGRID5000__RESOURCE_PROPERTIES = eINSTANCE.getMachinegrid5000_ResourceProperties();

		/**
		 * The meta object literal for the '<em><b>Use Job Reservation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEGRID5000__USE_JOB_RESERVATION = eINSTANCE.getMachinegrid5000_UseJobReservation();

		/**
		 * The meta object literal for the '<em><b>Host To Provision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINEGRID5000__HOST_TO_PROVISION = eINSTANCE.getMachinegrid5000_HostToProvision();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.impl.ClusterImpl <em>Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.impl.ClusterImpl
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getCluster()
		 * @generated
		 */
		EClass CLUSTER = eINSTANCE.getCluster();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER__NAME = eINSTANCE.getCluster_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.docker.Mode <em>Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.docker.Mode
		 * @see org.eclipse.cmf.occi.docker.impl.DockerPackageImpl#getMode()
		 * @generated
		 */
		EEnum MODE = eINSTANCE.getMode();

	}

} //DockerPackage
