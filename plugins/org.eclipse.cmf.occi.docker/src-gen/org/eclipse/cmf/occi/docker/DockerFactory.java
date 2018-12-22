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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.docker.DockerPackage
 * @generated
 */
public interface DockerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DockerFactory eINSTANCE = org.eclipse.cmf.occi.docker.impl.DockerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Array Of String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Of String</em>'.
	 * @generated
	 */
	ArrayOfString createArrayOfString();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Networklink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Networklink</em>'.
	 * @generated
	 */
	Networklink createNetworklink();

	/**
	 * Returns a new object of class '<em>Volumesfrom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volumesfrom</em>'.
	 * @generated
	 */
	Volumesfrom createVolumesfrom();

	/**
	 * Returns a new object of class '<em>Contains</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contains</em>'.
	 * @generated
	 */
	Contains createContains();

	/**
	 * Returns a new object of class '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine</em>'.
	 * @generated
	 */
	Machine createMachine();

	/**
	 * Returns a new object of class '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volume</em>'.
	 * @generated
	 */
	Volume createVolume();

	/**
	 * Returns a new object of class '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network</em>'.
	 * @generated
	 */
	Network createNetwork();

	/**
	 * Returns a new object of class '<em>Machinegeneric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machinegeneric</em>'.
	 * @generated
	 */
	Machinegeneric createMachinegeneric();

	/**
	 * Returns a new object of class '<em>Machineamazonec2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machineamazonec2</em>'.
	 * @generated
	 */
	Machineamazonec2 createMachineamazonec2();

	/**
	 * Returns a new object of class '<em>Machinedigitalocean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machinedigitalocean</em>'.
	 * @generated
	 */
	Machinedigitalocean createMachinedigitalocean();

	/**
	 * Returns a new object of class '<em>Machinegooglecomputeengine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machinegooglecomputeengine</em>'.
	 * @generated
	 */
	Machinegooglecomputeengine createMachinegooglecomputeengine();

	/**
	 * Returns a new object of class '<em>Machineibmsoftlayer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machineibmsoftlayer</em>'.
	 * @generated
	 */
	Machineibmsoftlayer createMachineibmsoftlayer();

	/**
	 * Returns a new object of class '<em>Machinemicrosoftazure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machinemicrosoftazure</em>'.
	 * @generated
	 */
	Machinemicrosoftazure createMachinemicrosoftazure();

	/**
	 * Returns a new object of class '<em>Machinemicrosofthyperv</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machinemicrosofthyperv</em>'.
	 * @generated
	 */
	Machinemicrosofthyperv createMachinemicrosofthyperv();

	/**
	 * Returns a new object of class '<em>Machineopenstack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machineopenstack</em>'.
	 * @generated
	 */
	Machineopenstack createMachineopenstack();

	/**
	 * Returns a new object of class '<em>Machinerackspace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machinerackspace</em>'.
	 * @generated
	 */
	Machinerackspace createMachinerackspace();

	/**
	 * Returns a new object of class '<em>Machinevirtualbox</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machinevirtualbox</em>'.
	 * @generated
	 */
	Machinevirtualbox createMachinevirtualbox();

	/**
	 * Returns a new object of class '<em>Machinevmwarefusion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machinevmwarefusion</em>'.
	 * @generated
	 */
	Machinevmwarefusion createMachinevmwarefusion();

	/**
	 * Returns a new object of class '<em>Machinevmwarevcloudair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machinevmwarevcloudair</em>'.
	 * @generated
	 */
	Machinevmwarevcloudair createMachinevmwarevcloudair();

	/**
	 * Returns a new object of class '<em>Machinevmwarevsphere</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machinevmwarevsphere</em>'.
	 * @generated
	 */
	Machinevmwarevsphere createMachinevmwarevsphere();

	/**
	 * Returns a new object of class '<em>Machineexoscale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machineexoscale</em>'.
	 * @generated
	 */
	Machineexoscale createMachineexoscale();

	/**
	 * Returns a new object of class '<em>Machinegrid5000</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machinegrid5000</em>'.
	 * @generated
	 */
	Machinegrid5000 createMachinegrid5000();

	/**
	 * Returns a new object of class '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster</em>'.
	 * @generated
	 */
	Cluster createCluster();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DockerPackage getDockerPackage();

} //DockerFactory
