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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machinegooglecomputeengine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Machine on Google Compute Engine
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinegooglecomputeengine#getZone <em>Zone</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinegooglecomputeengine#getMachineType <em>Machine Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinegooglecomputeengine#getUsername <em>Username</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinegooglecomputeengine#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinegooglecomputeengine#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegooglecomputeengine()
 * @model
 * @generated
 */
public interface Machinegooglecomputeengine extends Machine {
	/**
	 * Returns the value of the '<em><b>Zone</b></em>' attribute.
	 * The default value is <code>"us-central1-a"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zone</em>' attribute.
	 * @see #setZone(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegooglecomputeengine_Zone()
	 * @model default="us-central1-a"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinegooglecomputeengine!zone'"
	 * @generated
	 */
	String getZone();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinegooglecomputeengine#getZone <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' attribute.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(String value);

	/**
	 * Returns the value of the '<em><b>Machine Type</b></em>' attribute.
	 * The default value is <code>"f1-micro"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Machine Type</em>' attribute.
	 * @see #setMachineType(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegooglecomputeengine_MachineType()
	 * @model default="f1-micro"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinegooglecomputeengine!machineType'"
	 * @generated
	 */
	String getMachineType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinegooglecomputeengine#getMachineType <em>Machine Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine Type</em>' attribute.
	 * @see #getMachineType()
	 * @generated
	 */
	void setMachineType(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * The default value is <code>"docker-user"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegooglecomputeengine_Username()
	 * @model default="docker-user"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinegooglecomputeengine!username'"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinegooglecomputeengine#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
	 * The default value is <code>"docker-machine"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Name</em>' attribute.
	 * @see #setInstanceName(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegooglecomputeengine_InstanceName()
	 * @model default="docker-machine"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinegooglecomputeengine!instanceName'"
	 * @generated
	 */
	String getInstanceName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinegooglecomputeengine#getInstanceName <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Name</em>' attribute.
	 * @see #getInstanceName()
	 * @generated
	 */
	void setInstanceName(String value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Project</em>' attribute.
	 * @see #setProject(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegooglecomputeengine_Project()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinegooglecomputeengine!project'"
	 * @generated
	 */
	String getProject();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinegooglecomputeengine#getProject <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' attribute.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(String value);

} // Machinegooglecomputeengine
