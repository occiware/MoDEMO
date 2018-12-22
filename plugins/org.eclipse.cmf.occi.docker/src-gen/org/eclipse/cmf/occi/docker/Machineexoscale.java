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
 * A representation of the model object '<em><b>Machineexoscale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Machine Exoscale
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineexoscale#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineexoscale#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineexoscale#getApiSecretKey <em>Api Secret Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineexoscale#getInstanceProfile <em>Instance Profile</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineexoscale#getImage <em>Image</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineexoscale#getSecurityGroup <em>Security Group</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineexoscale#getAvailabilityZone <em>Availability Zone</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineexoscale#getSshUser <em>Ssh User</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineexoscale#getUserData <em>User Data</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineexoscale#getAffinityGroup <em>Affinity Group</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineexoscale()
 * @model
 * @generated
 */
public interface Machineexoscale extends Machine {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * The default value is <code>"https://api.exoscale.ch/compute"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineexoscale_Url()
	 * @model default="https://api.exoscale.ch/compute"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineexoscale!url'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineexoscale#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Api Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Key</em>' attribute.
	 * @see #setApiKey(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineexoscale_ApiKey()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineexoscale!apiKey'"
	 * @generated
	 */
	String getApiKey();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineexoscale#getApiKey <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Key</em>' attribute.
	 * @see #getApiKey()
	 * @generated
	 */
	void setApiKey(String value);

	/**
	 * Returns the value of the '<em><b>Api Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Secret Key</em>' attribute.
	 * @see #setApiSecretKey(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineexoscale_ApiSecretKey()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineexoscale!apiSecretKey'"
	 * @generated
	 */
	String getApiSecretKey();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineexoscale#getApiSecretKey <em>Api Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Secret Key</em>' attribute.
	 * @see #getApiSecretKey()
	 * @generated
	 */
	void setApiSecretKey(String value);

	/**
	 * Returns the value of the '<em><b>Instance Profile</b></em>' attribute.
	 * The default value is <code>"small"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Profile</em>' attribute.
	 * @see #setInstanceProfile(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineexoscale_InstanceProfile()
	 * @model default="small"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineexoscale!instanceProfile'"
	 * @generated
	 */
	String getInstanceProfile();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineexoscale#getInstanceProfile <em>Instance Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Profile</em>' attribute.
	 * @see #getInstanceProfile()
	 * @generated
	 */
	void setInstanceProfile(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * The default value is <code>"ubuntu-16.04"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineexoscale_Image()
	 * @model default="ubuntu-16.04"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineexoscale!image'"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineexoscale#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Security Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Group</em>' attribute.
	 * @see #setSecurityGroup(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineexoscale_SecurityGroup()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineexoscale!securityGroup'"
	 * @generated
	 */
	String getSecurityGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineexoscale#getSecurityGroup <em>Security Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Group</em>' attribute.
	 * @see #getSecurityGroup()
	 * @generated
	 */
	void setSecurityGroup(String value);

	/**
	 * Returns the value of the '<em><b>Availability Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability Zone</em>' attribute.
	 * @see #setAvailabilityZone(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineexoscale_AvailabilityZone()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineexoscale!availabilityZone'"
	 * @generated
	 */
	String getAvailabilityZone();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineexoscale#getAvailabilityZone <em>Availability Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Zone</em>' attribute.
	 * @see #getAvailabilityZone()
	 * @generated
	 */
	void setAvailabilityZone(String value);

	/**
	 * Returns the value of the '<em><b>Ssh User</b></em>' attribute.
	 * The default value is <code>"ubuntu"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ssh User</em>' attribute.
	 * @see #setSshUser(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineexoscale_SshUser()
	 * @model default="ubuntu"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineexoscale!sshUser'"
	 * @generated
	 */
	String getSshUser();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineexoscale#getSshUser <em>Ssh User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh User</em>' attribute.
	 * @see #getSshUser()
	 * @generated
	 */
	void setSshUser(String value);

	/**
	 * Returns the value of the '<em><b>User Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Data</em>' attribute.
	 * @see #setUserData(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineexoscale_UserData()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineexoscale!userData'"
	 * @generated
	 */
	String getUserData();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineexoscale#getUserData <em>User Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Data</em>' attribute.
	 * @see #getUserData()
	 * @generated
	 */
	void setUserData(String value);

	/**
	 * Returns the value of the '<em><b>Affinity Group</b></em>' attribute.
	 * The default value is <code>"docker-machine"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affinity Group</em>' attribute.
	 * @see #setAffinityGroup(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineexoscale_AffinityGroup()
	 * @model default="docker-machine"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineexoscale!affinityGroup'"
	 * @generated
	 */
	String getAffinityGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineexoscale#getAffinityGroup <em>Affinity Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affinity Group</em>' attribute.
	 * @see #getAffinityGroup()
	 * @generated
	 */
	void setAffinityGroup(String value);

} // Machineexoscale
