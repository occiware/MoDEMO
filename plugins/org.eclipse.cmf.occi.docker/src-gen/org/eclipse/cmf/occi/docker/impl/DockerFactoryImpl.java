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

import org.eclipse.cmf.occi.docker.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerFactoryImpl extends EFactoryImpl implements DockerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DockerFactory init() {
		try {
			DockerFactory theDockerFactory = (DockerFactory)EPackage.Registry.INSTANCE.getEFactory(DockerPackage.eNS_URI);
			if (theDockerFactory != null) {
				return theDockerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DockerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DockerPackage.ARRAY_OF_STRING: return createArrayOfString();
			case DockerPackage.CONTAINER: return createContainer();
			case DockerPackage.LINK: return createLink();
			case DockerPackage.NETWORKLINK: return createNetworklink();
			case DockerPackage.VOLUMESFROM: return createVolumesfrom();
			case DockerPackage.CONTAINS: return createContains();
			case DockerPackage.MACHINE: return createMachine();
			case DockerPackage.VOLUME: return createVolume();
			case DockerPackage.NETWORK: return createNetwork();
			case DockerPackage.MACHINEGENERIC: return createMachinegeneric();
			case DockerPackage.MACHINEAMAZONEC2: return createMachineamazonec2();
			case DockerPackage.MACHINEDIGITALOCEAN: return createMachinedigitalocean();
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE: return createMachinegooglecomputeengine();
			case DockerPackage.MACHINEIBMSOFTLAYER: return createMachineibmsoftlayer();
			case DockerPackage.MACHINEMICROSOFTAZURE: return createMachinemicrosoftazure();
			case DockerPackage.MACHINEMICROSOFTHYPERV: return createMachinemicrosofthyperv();
			case DockerPackage.MACHINEOPENSTACK: return createMachineopenstack();
			case DockerPackage.MACHINERACKSPACE: return createMachinerackspace();
			case DockerPackage.MACHINEVIRTUALBOX: return createMachinevirtualbox();
			case DockerPackage.MACHINEVMWAREFUSION: return createMachinevmwarefusion();
			case DockerPackage.MACHINEVMWAREVCLOUDAIR: return createMachinevmwarevcloudair();
			case DockerPackage.MACHINEVMWAREVSPHERE: return createMachinevmwarevsphere();
			case DockerPackage.MACHINEEXOSCALE: return createMachineexoscale();
			case DockerPackage.MACHINEGRID5000: return createMachinegrid5000();
			case DockerPackage.CLUSTER: return createCluster();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DockerPackage.MODE:
				return createModeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DockerPackage.MODE:
				return convertModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayOfString createArrayOfString() {
		ArrayOfStringImpl arrayOfString = new ArrayOfStringImpl();
		return arrayOfString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.cmf.occi.docker.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Networklink createNetworklink() {
		NetworklinkImpl networklink = new NetworklinkImpl();
		return networklink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volumesfrom createVolumesfrom() {
		VolumesfromImpl volumesfrom = new VolumesfromImpl();
		return volumesfrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contains createContains() {
		ContainsImpl contains = new ContainsImpl();
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine createMachine() {
		MachineImpl machine = new MachineImpl();
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume createVolume() {
		VolumeImpl volume = new VolumeImpl();
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machinegeneric createMachinegeneric() {
		MachinegenericImpl machinegeneric = new MachinegenericImpl();
		return machinegeneric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machineamazonec2 createMachineamazonec2() {
		Machineamazonec2Impl machineamazonec2 = new Machineamazonec2Impl();
		return machineamazonec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machinedigitalocean createMachinedigitalocean() {
		MachinedigitaloceanImpl machinedigitalocean = new MachinedigitaloceanImpl();
		return machinedigitalocean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machinegooglecomputeengine createMachinegooglecomputeengine() {
		MachinegooglecomputeengineImpl machinegooglecomputeengine = new MachinegooglecomputeengineImpl();
		return machinegooglecomputeengine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machineibmsoftlayer createMachineibmsoftlayer() {
		MachineibmsoftlayerImpl machineibmsoftlayer = new MachineibmsoftlayerImpl();
		return machineibmsoftlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machinemicrosoftazure createMachinemicrosoftazure() {
		MachinemicrosoftazureImpl machinemicrosoftazure = new MachinemicrosoftazureImpl();
		return machinemicrosoftazure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machinemicrosofthyperv createMachinemicrosofthyperv() {
		MachinemicrosofthypervImpl machinemicrosofthyperv = new MachinemicrosofthypervImpl();
		return machinemicrosofthyperv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machineopenstack createMachineopenstack() {
		MachineopenstackImpl machineopenstack = new MachineopenstackImpl();
		return machineopenstack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machinerackspace createMachinerackspace() {
		MachinerackspaceImpl machinerackspace = new MachinerackspaceImpl();
		return machinerackspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machinevirtualbox createMachinevirtualbox() {
		MachinevirtualboxImpl machinevirtualbox = new MachinevirtualboxImpl();
		return machinevirtualbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machinevmwarefusion createMachinevmwarefusion() {
		MachinevmwarefusionImpl machinevmwarefusion = new MachinevmwarefusionImpl();
		return machinevmwarefusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machinevmwarevcloudair createMachinevmwarevcloudair() {
		MachinevmwarevcloudairImpl machinevmwarevcloudair = new MachinevmwarevcloudairImpl();
		return machinevmwarevcloudair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machinevmwarevsphere createMachinevmwarevsphere() {
		MachinevmwarevsphereImpl machinevmwarevsphere = new MachinevmwarevsphereImpl();
		return machinevmwarevsphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machineexoscale createMachineexoscale() {
		MachineexoscaleImpl machineexoscale = new MachineexoscaleImpl();
		return machineexoscale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machinegrid5000 createMachinegrid5000() {
		Machinegrid5000Impl machinegrid5000 = new Machinegrid5000Impl();
		return machinegrid5000;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster createCluster() {
		ClusterImpl cluster = new ClusterImpl();
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createModeFromString(EDataType eDataType, String initialValue) {
		Mode result = Mode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerPackage getDockerPackage() {
		return (DockerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DockerPackage getPackage() {
		return DockerPackage.eINSTANCE;
	}

} //DockerFactoryImpl
