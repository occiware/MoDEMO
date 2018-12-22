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

import java.math.BigInteger;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machineibmsoftlayer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Machine on IBM SoftLayer
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getApiEndpoint <em>Api Endpoint</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getUser <em>User</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getCpu <em>Cpu</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getDiskSize <em>Disk Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#isHourlyBilling <em>Hourly Billing</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getImage <em>Image</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#isLocalDisk <em>Local Disk</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#isPrivateNetOnly <em>Private Net Only</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getRegion <em>Region</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getPublicVlanId <em>Public Vlan Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getPrivateVlanId <em>Private Vlan Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineibmsoftlayer()
 * @model
 * @generated
 */
public interface Machineibmsoftlayer extends Machine {
	/**
	 * Returns the value of the '<em><b>Api Endpoint</b></em>' attribute.
	 * The default value is <code>"api.softlayer.com/rest/v3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Endpoint</em>' attribute.
	 * @see #setApiEndpoint(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineibmsoftlayer_ApiEndpoint()
	 * @model default="api.softlayer.com/rest/v3"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineibmsoftlayer!apiEndpoint'"
	 * @generated
	 */
	String getApiEndpoint();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getApiEndpoint <em>Api Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Endpoint</em>' attribute.
	 * @see #getApiEndpoint()
	 * @generated
	 */
	void setApiEndpoint(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineibmsoftlayer_User()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineibmsoftlayer!user'"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Api Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Key</em>' attribute.
	 * @see #setApiKey(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineibmsoftlayer_ApiKey()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineibmsoftlayer!apiKey'"
	 * @generated
	 */
	String getApiKey();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getApiKey <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Key</em>' attribute.
	 * @see #getApiKey()
	 * @generated
	 */
	void setApiKey(String value);

	/**
	 * Returns the value of the '<em><b>Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cpu</em>' attribute.
	 * @see #setCpu(BigInteger)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineibmsoftlayer_Cpu()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineibmsoftlayer!cpu'"
	 * @generated
	 */
	BigInteger getCpu();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getCpu <em>Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu</em>' attribute.
	 * @see #getCpu()
	 * @generated
	 */
	void setCpu(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disk Size</em>' attribute.
	 * @see #setDiskSize(BigInteger)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineibmsoftlayer_DiskSize()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineibmsoftlayer!diskSize'"
	 * @generated
	 */
	BigInteger getDiskSize();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getDiskSize <em>Disk Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk Size</em>' attribute.
	 * @see #getDiskSize()
	 * @generated
	 */
	void setDiskSize(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineibmsoftlayer_Domain()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineibmsoftlayer!domain'"
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

	/**
	 * Returns the value of the '<em><b>Hourly Billing</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hourly Billing</em>' attribute.
	 * @see #setHourlyBilling(boolean)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineibmsoftlayer_HourlyBilling()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineibmsoftlayer!hourlyBilling'"
	 * @generated
	 */
	boolean isHourlyBilling();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#isHourlyBilling <em>Hourly Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hourly Billing</em>' attribute.
	 * @see #isHourlyBilling()
	 * @generated
	 */
	void setHourlyBilling(boolean value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * The default value is <code>"UBUNTU_LATEST"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineibmsoftlayer_Image()
	 * @model default="UBUNTU_LATEST"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineibmsoftlayer!image'"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Local Disk</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Disk</em>' attribute.
	 * @see #setLocalDisk(boolean)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineibmsoftlayer_LocalDisk()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineibmsoftlayer!localDisk'"
	 * @generated
	 */
	boolean isLocalDisk();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#isLocalDisk <em>Local Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Disk</em>' attribute.
	 * @see #isLocalDisk()
	 * @generated
	 */
	void setLocalDisk(boolean value);

	/**
	 * Returns the value of the '<em><b>Private Net Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private Net Only</em>' attribute.
	 * @see #setPrivateNetOnly(boolean)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineibmsoftlayer_PrivateNetOnly()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineibmsoftlayer!privateNetOnly'"
	 * @generated
	 */
	boolean isPrivateNetOnly();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#isPrivateNetOnly <em>Private Net Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Net Only</em>' attribute.
	 * @see #isPrivateNetOnly()
	 * @generated
	 */
	void setPrivateNetOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineibmsoftlayer_Region()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineibmsoftlayer!region'"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Public Vlan Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public Vlan Id</em>' attribute.
	 * @see #setPublicVlanId(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineibmsoftlayer_PublicVlanId()
	 * @model default="0"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineibmsoftlayer!publicVlanId'"
	 * @generated
	 */
	String getPublicVlanId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getPublicVlanId <em>Public Vlan Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Vlan Id</em>' attribute.
	 * @see #getPublicVlanId()
	 * @generated
	 */
	void setPublicVlanId(String value);

	/**
	 * Returns the value of the '<em><b>Private Vlan Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private Vlan Id</em>' attribute.
	 * @see #setPrivateVlanId(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineibmsoftlayer_PrivateVlanId()
	 * @model default="0"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineibmsoftlayer!privateVlanId'"
	 * @generated
	 */
	String getPrivateVlanId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer#getPrivateVlanId <em>Private Vlan Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Vlan Id</em>' attribute.
	 * @see #getPrivateVlanId()
	 * @generated
	 */
	void setPrivateVlanId(String value);

} // Machineibmsoftlayer
