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
 * A representation of the model object '<em><b>Machinegrid5000</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Grid5000
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getUsername <em>Username</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getSite <em>Site</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getWalltime <em>Walltime</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getSshPrivateKey <em>Ssh Private Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getSshPublicKey <em>Ssh Public Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getImage <em>Image</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getResourceProperties <em>Resource Properties</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getUseJobReservation <em>Use Job Reservation</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getHostToProvision <em>Host To Provision</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegrid5000()
 * @model
 * @generated
 */
public interface Machinegrid5000 extends Machine {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegrid5000_Username()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinegrid5000!username'"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegrid5000_Password()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinegrid5000!password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Site</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site</em>' attribute.
	 * @see #setSite(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegrid5000_Site()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinegrid5000!site'"
	 * @generated
	 */
	String getSite();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getSite <em>Site</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site</em>' attribute.
	 * @see #getSite()
	 * @generated
	 */
	void setSite(String value);

	/**
	 * Returns the value of the '<em><b>Walltime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Walltime</em>' attribute.
	 * @see #setWalltime(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegrid5000_Walltime()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinegrid5000!walltime'"
	 * @generated
	 */
	String getWalltime();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getWalltime <em>Walltime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Walltime</em>' attribute.
	 * @see #getWalltime()
	 * @generated
	 */
	void setWalltime(String value);

	/**
	 * Returns the value of the '<em><b>Ssh Private Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ssh Private Key</em>' attribute.
	 * @see #setSshPrivateKey(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegrid5000_SshPrivateKey()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinegrid5000!sshPrivateKey'"
	 * @generated
	 */
	String getSshPrivateKey();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getSshPrivateKey <em>Ssh Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh Private Key</em>' attribute.
	 * @see #getSshPrivateKey()
	 * @generated
	 */
	void setSshPrivateKey(String value);

	/**
	 * Returns the value of the '<em><b>Ssh Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ssh Public Key</em>' attribute.
	 * @see #setSshPublicKey(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegrid5000_SshPublicKey()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinegrid5000!sshPublicKey'"
	 * @generated
	 */
	String getSshPublicKey();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getSshPublicKey <em>Ssh Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh Public Key</em>' attribute.
	 * @see #getSshPublicKey()
	 * @generated
	 */
	void setSshPublicKey(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegrid5000_Image()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinegrid5000!image'"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Resource Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Properties</em>' attribute.
	 * @see #setResourceProperties(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegrid5000_ResourceProperties()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinegrid5000!resourceProperties'"
	 * @generated
	 */
	String getResourceProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getResourceProperties <em>Resource Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Properties</em>' attribute.
	 * @see #getResourceProperties()
	 * @generated
	 */
	void setResourceProperties(String value);

	/**
	 * Returns the value of the '<em><b>Use Job Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Job Reservation</em>' attribute.
	 * @see #setUseJobReservation(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegrid5000_UseJobReservation()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinegrid5000!useJobReservation'"
	 * @generated
	 */
	String getUseJobReservation();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getUseJobReservation <em>Use Job Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Job Reservation</em>' attribute.
	 * @see #getUseJobReservation()
	 * @generated
	 */
	void setUseJobReservation(String value);

	/**
	 * Returns the value of the '<em><b>Host To Provision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host To Provision</em>' attribute.
	 * @see #setHostToProvision(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegrid5000_HostToProvision()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinegrid5000!hostToProvision'"
	 * @generated
	 */
	String getHostToProvision();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinegrid5000#getHostToProvision <em>Host To Provision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host To Provision</em>' attribute.
	 * @see #getHostToProvision()
	 * @generated
	 */
	void setHostToProvision(String value);

} // Machinegrid5000
