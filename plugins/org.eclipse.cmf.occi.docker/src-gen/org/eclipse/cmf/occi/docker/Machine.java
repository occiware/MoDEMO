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

import org.eclipse.cmf.occi.infrastructure.Compute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Machine Resource
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machine#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machine#getEngineInstallURL <em>Engine Install URL</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machine#getEngineOpt <em>Engine Opt</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machine#getEngineInsecureRegistry <em>Engine Insecure Registry</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machine#getEngineRegistryMirror <em>Engine Registry Mirror</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machine#getEngineLabel <em>Engine Label</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machine#getEngineStorageDriver <em>Engine Storage Driver</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machine#getEngineEnv <em>Engine Env</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machine#isSwarm <em>Swarm</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machine#getSwarmImage <em>Swarm Image</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machine#isSwarmMaster <em>Swarm Master</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machine#getSwarmDiscovery <em>Swarm Discovery</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machine#getSwarmStrategy <em>Swarm Strategy</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machine#getSwarmOpt <em>Swarm Opt</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machine#getSwarmHost <em>Swarm Host</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machine#getSwarmAddr <em>Swarm Addr</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machine#getSwarmExperimental <em>Swarm Experimental</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machine#getTlsSan <em>Tls San</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends Compute {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachine_Name()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machine!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Engine Install URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engine Install URL</em>' attribute.
	 * @see #setEngineInstallURL(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachine_EngineInstallURL()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machine!engineInstallURL'"
	 * @generated
	 */
	String getEngineInstallURL();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machine#getEngineInstallURL <em>Engine Install URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine Install URL</em>' attribute.
	 * @see #getEngineInstallURL()
	 * @generated
	 */
	void setEngineInstallURL(String value);

	/**
	 * Returns the value of the '<em><b>Engine Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engine Opt</em>' attribute.
	 * @see #setEngineOpt(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachine_EngineOpt()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machine!engineOpt'"
	 * @generated
	 */
	String getEngineOpt();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machine#getEngineOpt <em>Engine Opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine Opt</em>' attribute.
	 * @see #getEngineOpt()
	 * @generated
	 */
	void setEngineOpt(String value);

	/**
	 * Returns the value of the '<em><b>Engine Insecure Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engine Insecure Registry</em>' attribute.
	 * @see #setEngineInsecureRegistry(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachine_EngineInsecureRegistry()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machine!engineInsecureRegistry'"
	 * @generated
	 */
	String getEngineInsecureRegistry();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machine#getEngineInsecureRegistry <em>Engine Insecure Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine Insecure Registry</em>' attribute.
	 * @see #getEngineInsecureRegistry()
	 * @generated
	 */
	void setEngineInsecureRegistry(String value);

	/**
	 * Returns the value of the '<em><b>Engine Registry Mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engine Registry Mirror</em>' attribute.
	 * @see #setEngineRegistryMirror(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachine_EngineRegistryMirror()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machine!engineRegistryMirror'"
	 * @generated
	 */
	String getEngineRegistryMirror();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machine#getEngineRegistryMirror <em>Engine Registry Mirror</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine Registry Mirror</em>' attribute.
	 * @see #getEngineRegistryMirror()
	 * @generated
	 */
	void setEngineRegistryMirror(String value);

	/**
	 * Returns the value of the '<em><b>Engine Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engine Label</em>' attribute.
	 * @see #setEngineLabel(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachine_EngineLabel()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machine!engineLabel'"
	 * @generated
	 */
	String getEngineLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machine#getEngineLabel <em>Engine Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine Label</em>' attribute.
	 * @see #getEngineLabel()
	 * @generated
	 */
	void setEngineLabel(String value);

	/**
	 * Returns the value of the '<em><b>Engine Storage Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engine Storage Driver</em>' attribute.
	 * @see #setEngineStorageDriver(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachine_EngineStorageDriver()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machine!engineStorageDriver'"
	 * @generated
	 */
	String getEngineStorageDriver();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machine#getEngineStorageDriver <em>Engine Storage Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine Storage Driver</em>' attribute.
	 * @see #getEngineStorageDriver()
	 * @generated
	 */
	void setEngineStorageDriver(String value);

	/**
	 * Returns the value of the '<em><b>Engine Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engine Env</em>' attribute.
	 * @see #setEngineEnv(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachine_EngineEnv()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machine!engineEnv'"
	 * @generated
	 */
	String getEngineEnv();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machine#getEngineEnv <em>Engine Env</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine Env</em>' attribute.
	 * @see #getEngineEnv()
	 * @generated
	 */
	void setEngineEnv(String value);

	/**
	 * Returns the value of the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Swarm</em>' attribute.
	 * @see #setSwarm(boolean)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachine_Swarm()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machine!swarm'"
	 * @generated
	 */
	boolean isSwarm();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machine#isSwarm <em>Swarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swarm</em>' attribute.
	 * @see #isSwarm()
	 * @generated
	 */
	void setSwarm(boolean value);

	/**
	 * Returns the value of the '<em><b>Swarm Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Swarm Image</em>' attribute.
	 * @see #setSwarmImage(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachine_SwarmImage()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machine!swarmImage'"
	 * @generated
	 */
	String getSwarmImage();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machine#getSwarmImage <em>Swarm Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swarm Image</em>' attribute.
	 * @see #getSwarmImage()
	 * @generated
	 */
	void setSwarmImage(String value);

	/**
	 * Returns the value of the '<em><b>Swarm Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Swarm Master</em>' attribute.
	 * @see #setSwarmMaster(boolean)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachine_SwarmMaster()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machine!swarmMaster'"
	 * @generated
	 */
	boolean isSwarmMaster();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machine#isSwarmMaster <em>Swarm Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swarm Master</em>' attribute.
	 * @see #isSwarmMaster()
	 * @generated
	 */
	void setSwarmMaster(boolean value);

	/**
	 * Returns the value of the '<em><b>Swarm Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Swarm Discovery</em>' attribute.
	 * @see #setSwarmDiscovery(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachine_SwarmDiscovery()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machine!swarmDiscovery'"
	 * @generated
	 */
	String getSwarmDiscovery();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machine#getSwarmDiscovery <em>Swarm Discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swarm Discovery</em>' attribute.
	 * @see #getSwarmDiscovery()
	 * @generated
	 */
	void setSwarmDiscovery(String value);

	/**
	 * Returns the value of the '<em><b>Swarm Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Swarm Strategy</em>' attribute.
	 * @see #setSwarmStrategy(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachine_SwarmStrategy()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machine!swarmStrategy'"
	 * @generated
	 */
	String getSwarmStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machine#getSwarmStrategy <em>Swarm Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swarm Strategy</em>' attribute.
	 * @see #getSwarmStrategy()
	 * @generated
	 */
	void setSwarmStrategy(String value);

	/**
	 * Returns the value of the '<em><b>Swarm Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Swarm Opt</em>' attribute.
	 * @see #setSwarmOpt(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachine_SwarmOpt()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machine!swarmOpt'"
	 * @generated
	 */
	String getSwarmOpt();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machine#getSwarmOpt <em>Swarm Opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swarm Opt</em>' attribute.
	 * @see #getSwarmOpt()
	 * @generated
	 */
	void setSwarmOpt(String value);

	/**
	 * Returns the value of the '<em><b>Swarm Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Swarm Host</em>' attribute.
	 * @see #setSwarmHost(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachine_SwarmHost()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machine!swarmHost'"
	 * @generated
	 */
	String getSwarmHost();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machine#getSwarmHost <em>Swarm Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swarm Host</em>' attribute.
	 * @see #getSwarmHost()
	 * @generated
	 */
	void setSwarmHost(String value);

	/**
	 * Returns the value of the '<em><b>Swarm Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Swarm Addr</em>' attribute.
	 * @see #setSwarmAddr(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachine_SwarmAddr()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machine!swarmAddr'"
	 * @generated
	 */
	String getSwarmAddr();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machine#getSwarmAddr <em>Swarm Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swarm Addr</em>' attribute.
	 * @see #getSwarmAddr()
	 * @generated
	 */
	void setSwarmAddr(String value);

	/**
	 * Returns the value of the '<em><b>Swarm Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Swarm Experimental</em>' attribute.
	 * @see #setSwarmExperimental(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachine_SwarmExperimental()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machine!swarmExperimental'"
	 * @generated
	 */
	String getSwarmExperimental();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machine#getSwarmExperimental <em>Swarm Experimental</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swarm Experimental</em>' attribute.
	 * @see #getSwarmExperimental()
	 * @generated
	 */
	void setSwarmExperimental(String value);

	/**
	 * Returns the value of the '<em><b>Tls San</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tls San</em>' attribute.
	 * @see #setTlsSan(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachine_TlsSan()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machine!tlsSan'"
	 * @generated
	 */
	String getTlsSan();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machine#getTlsSan <em>Tls San</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tls San</em>' attribute.
	 * @see #getTlsSan()
	 * @generated
	 */
	void setTlsSan(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start all implies this machine AND all containers inside
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machine!startall()'"
	 * @generated
	 */
	void startall();

} // Machine
