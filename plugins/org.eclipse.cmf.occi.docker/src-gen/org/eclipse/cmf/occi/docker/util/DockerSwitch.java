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
package org.eclipse.cmf.occi.docker.util;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Resource;

import org.eclipse.cmf.occi.docker.*;

import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.Storage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.docker.DockerPackage
 * @generated
 */
public class DockerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DockerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerSwitch() {
		if (modelPackage == null) {
			modelPackage = DockerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DockerPackage.ARRAY_OF_STRING: {
				ArrayOfString arrayOfString = (ArrayOfString)theEObject;
				T result = caseArrayOfString(arrayOfString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseCompute(container);
				if (result == null) result = caseResource(container);
				if (result == null) result = caseEntity(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseOCCI_Link(link);
				if (result == null) result = caseEntity(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.NETWORKLINK: {
				Networklink networklink = (Networklink)theEObject;
				T result = caseNetworklink(networklink);
				if (result == null) result = caseLink(networklink);
				if (result == null) result = caseOCCI_Link(networklink);
				if (result == null) result = caseEntity(networklink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.VOLUMESFROM: {
				Volumesfrom volumesfrom = (Volumesfrom)theEObject;
				T result = caseVolumesfrom(volumesfrom);
				if (result == null) result = caseOCCI_Link(volumesfrom);
				if (result == null) result = caseEntity(volumesfrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.CONTAINS: {
				Contains contains = (Contains)theEObject;
				T result = caseContains(contains);
				if (result == null) result = caseOCCI_Link(contains);
				if (result == null) result = caseEntity(contains);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINE: {
				Machine machine = (Machine)theEObject;
				T result = caseMachine(machine);
				if (result == null) result = caseCompute(machine);
				if (result == null) result = caseResource(machine);
				if (result == null) result = caseEntity(machine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.VOLUME: {
				Volume volume = (Volume)theEObject;
				T result = caseVolume(volume);
				if (result == null) result = caseStorage(volume);
				if (result == null) result = caseResource(volume);
				if (result == null) result = caseEntity(volume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.NETWORK: {
				Network network = (Network)theEObject;
				T result = caseNetwork(network);
				if (result == null) result = caseInfrastructure_Network(network);
				if (result == null) result = caseResource(network);
				if (result == null) result = caseEntity(network);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINEGENERIC: {
				Machinegeneric machinegeneric = (Machinegeneric)theEObject;
				T result = caseMachinegeneric(machinegeneric);
				if (result == null) result = caseMachine(machinegeneric);
				if (result == null) result = caseCompute(machinegeneric);
				if (result == null) result = caseResource(machinegeneric);
				if (result == null) result = caseEntity(machinegeneric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINEAMAZONEC2: {
				Machineamazonec2 machineamazonec2 = (Machineamazonec2)theEObject;
				T result = caseMachineamazonec2(machineamazonec2);
				if (result == null) result = caseMachine(machineamazonec2);
				if (result == null) result = caseCompute(machineamazonec2);
				if (result == null) result = caseResource(machineamazonec2);
				if (result == null) result = caseEntity(machineamazonec2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINEDIGITALOCEAN: {
				Machinedigitalocean machinedigitalocean = (Machinedigitalocean)theEObject;
				T result = caseMachinedigitalocean(machinedigitalocean);
				if (result == null) result = caseMachine(machinedigitalocean);
				if (result == null) result = caseCompute(machinedigitalocean);
				if (result == null) result = caseResource(machinedigitalocean);
				if (result == null) result = caseEntity(machinedigitalocean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINEGOOGLECOMPUTEENGINE: {
				Machinegooglecomputeengine machinegooglecomputeengine = (Machinegooglecomputeengine)theEObject;
				T result = caseMachinegooglecomputeengine(machinegooglecomputeengine);
				if (result == null) result = caseMachine(machinegooglecomputeengine);
				if (result == null) result = caseCompute(machinegooglecomputeengine);
				if (result == null) result = caseResource(machinegooglecomputeengine);
				if (result == null) result = caseEntity(machinegooglecomputeengine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINEIBMSOFTLAYER: {
				Machineibmsoftlayer machineibmsoftlayer = (Machineibmsoftlayer)theEObject;
				T result = caseMachineibmsoftlayer(machineibmsoftlayer);
				if (result == null) result = caseMachine(machineibmsoftlayer);
				if (result == null) result = caseCompute(machineibmsoftlayer);
				if (result == null) result = caseResource(machineibmsoftlayer);
				if (result == null) result = caseEntity(machineibmsoftlayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINEMICROSOFTAZURE: {
				Machinemicrosoftazure machinemicrosoftazure = (Machinemicrosoftazure)theEObject;
				T result = caseMachinemicrosoftazure(machinemicrosoftazure);
				if (result == null) result = caseMachine(machinemicrosoftazure);
				if (result == null) result = caseCompute(machinemicrosoftazure);
				if (result == null) result = caseResource(machinemicrosoftazure);
				if (result == null) result = caseEntity(machinemicrosoftazure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINEMICROSOFTHYPERV: {
				Machinemicrosofthyperv machinemicrosofthyperv = (Machinemicrosofthyperv)theEObject;
				T result = caseMachinemicrosofthyperv(machinemicrosofthyperv);
				if (result == null) result = caseMachine(machinemicrosofthyperv);
				if (result == null) result = caseCompute(machinemicrosofthyperv);
				if (result == null) result = caseResource(machinemicrosofthyperv);
				if (result == null) result = caseEntity(machinemicrosofthyperv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINEOPENSTACK: {
				Machineopenstack machineopenstack = (Machineopenstack)theEObject;
				T result = caseMachineopenstack(machineopenstack);
				if (result == null) result = caseMachine(machineopenstack);
				if (result == null) result = caseCompute(machineopenstack);
				if (result == null) result = caseResource(machineopenstack);
				if (result == null) result = caseEntity(machineopenstack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINERACKSPACE: {
				Machinerackspace machinerackspace = (Machinerackspace)theEObject;
				T result = caseMachinerackspace(machinerackspace);
				if (result == null) result = caseMachine(machinerackspace);
				if (result == null) result = caseCompute(machinerackspace);
				if (result == null) result = caseResource(machinerackspace);
				if (result == null) result = caseEntity(machinerackspace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINEVIRTUALBOX: {
				Machinevirtualbox machinevirtualbox = (Machinevirtualbox)theEObject;
				T result = caseMachinevirtualbox(machinevirtualbox);
				if (result == null) result = caseMachine(machinevirtualbox);
				if (result == null) result = caseCompute(machinevirtualbox);
				if (result == null) result = caseResource(machinevirtualbox);
				if (result == null) result = caseEntity(machinevirtualbox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINEVMWAREFUSION: {
				Machinevmwarefusion machinevmwarefusion = (Machinevmwarefusion)theEObject;
				T result = caseMachinevmwarefusion(machinevmwarefusion);
				if (result == null) result = caseMachine(machinevmwarefusion);
				if (result == null) result = caseCompute(machinevmwarefusion);
				if (result == null) result = caseResource(machinevmwarefusion);
				if (result == null) result = caseEntity(machinevmwarefusion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINEVMWAREVCLOUDAIR: {
				Machinevmwarevcloudair machinevmwarevcloudair = (Machinevmwarevcloudair)theEObject;
				T result = caseMachinevmwarevcloudair(machinevmwarevcloudair);
				if (result == null) result = caseMachine(machinevmwarevcloudair);
				if (result == null) result = caseCompute(machinevmwarevcloudair);
				if (result == null) result = caseResource(machinevmwarevcloudair);
				if (result == null) result = caseEntity(machinevmwarevcloudair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINEVMWAREVSPHERE: {
				Machinevmwarevsphere machinevmwarevsphere = (Machinevmwarevsphere)theEObject;
				T result = caseMachinevmwarevsphere(machinevmwarevsphere);
				if (result == null) result = caseMachine(machinevmwarevsphere);
				if (result == null) result = caseCompute(machinevmwarevsphere);
				if (result == null) result = caseResource(machinevmwarevsphere);
				if (result == null) result = caseEntity(machinevmwarevsphere);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINEEXOSCALE: {
				Machineexoscale machineexoscale = (Machineexoscale)theEObject;
				T result = caseMachineexoscale(machineexoscale);
				if (result == null) result = caseMachine(machineexoscale);
				if (result == null) result = caseCompute(machineexoscale);
				if (result == null) result = caseResource(machineexoscale);
				if (result == null) result = caseEntity(machineexoscale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINEGRID5000: {
				Machinegrid5000 machinegrid5000 = (Machinegrid5000)theEObject;
				T result = caseMachinegrid5000(machinegrid5000);
				if (result == null) result = caseMachine(machinegrid5000);
				if (result == null) result = caseCompute(machinegrid5000);
				if (result == null) result = caseResource(machinegrid5000);
				if (result == null) result = caseEntity(machinegrid5000);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.CLUSTER: {
				Cluster cluster = (Cluster)theEObject;
				T result = caseCluster(cluster);
				if (result == null) result = caseCompute(cluster);
				if (result == null) result = caseResource(cluster);
				if (result == null) result = caseEntity(cluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Of String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Of String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayOfString(ArrayOfString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Networklink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Networklink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworklink(Networklink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volumesfrom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volumesfrom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolumesfrom(Volumesfrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contains</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contains</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContains(Contains object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine(Machine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolume(Volume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machinegeneric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machinegeneric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachinegeneric(Machinegeneric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machineamazonec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machineamazonec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachineamazonec2(Machineamazonec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machinedigitalocean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machinedigitalocean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachinedigitalocean(Machinedigitalocean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machinegooglecomputeengine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machinegooglecomputeengine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachinegooglecomputeengine(Machinegooglecomputeengine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machineibmsoftlayer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machineibmsoftlayer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachineibmsoftlayer(Machineibmsoftlayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machinemicrosoftazure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machinemicrosoftazure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachinemicrosoftazure(Machinemicrosoftazure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machinemicrosofthyperv</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machinemicrosofthyperv</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachinemicrosofthyperv(Machinemicrosofthyperv object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machineopenstack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machineopenstack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachineopenstack(Machineopenstack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machinerackspace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machinerackspace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachinerackspace(Machinerackspace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machinevirtualbox</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machinevirtualbox</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachinevirtualbox(Machinevirtualbox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machinevmwarefusion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machinevmwarefusion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachinevmwarefusion(Machinevmwarefusion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machinevmwarevcloudair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machinevmwarevcloudair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachinevmwarevcloudair(Machinevmwarevcloudair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machinevmwarevsphere</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machinevmwarevsphere</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachinevmwarevsphere(Machinevmwarevsphere object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machineexoscale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machineexoscale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachineexoscale(Machineexoscale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machinegrid5000</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machinegrid5000</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachinegrid5000(Machinegrid5000 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCluster(Cluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompute(Compute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCCI_Link(org.eclipse.cmf.occi.core.Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorage(Storage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructure_Network(org.eclipse.cmf.occi.infrastructure.Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DockerSwitch
