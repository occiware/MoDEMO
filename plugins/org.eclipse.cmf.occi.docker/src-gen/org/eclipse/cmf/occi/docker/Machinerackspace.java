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
 * A representation of the model object '<em><b>Machinerackspace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Machine on Rackspace cloud
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinerackspace#getUsername <em>Username</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinerackspace#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinerackspace#getRegion <em>Region</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinerackspace#getEndPointType <em>End Point Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinerackspace#getImageId <em>Image Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinerackspace#getFlavorId <em>Flavor Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinerackspace#getSshUser <em>Ssh User</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinerackspace#getSshPort <em>Ssh Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinerackspace#isDockerInstall <em>Docker Install</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinerackspace()
 * @model
 * @generated
 */
public interface Machinerackspace extends Machine {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinerackspace_Username()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinerackspace!username'"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinerackspace#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Api Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Key</em>' attribute.
	 * @see #setApiKey(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinerackspace_ApiKey()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinerackspace!apiKey'"
	 * @generated
	 */
	String getApiKey();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinerackspace#getApiKey <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Key</em>' attribute.
	 * @see #getApiKey()
	 * @generated
	 */
	void setApiKey(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinerackspace_Region()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinerackspace!region'"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinerackspace#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>End Point Type</b></em>' attribute.
	 * The default value is <code>"publicURL"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Point Type</em>' attribute.
	 * @see #setEndPointType(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinerackspace_EndPointType()
	 * @model default="publicURL"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinerackspace!endPointType'"
	 * @generated
	 */
	String getEndPointType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinerackspace#getEndPointType <em>End Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point Type</em>' attribute.
	 * @see #getEndPointType()
	 * @generated
	 */
	void setEndPointType(String value);

	/**
	 * Returns the value of the '<em><b>Image Id</b></em>' attribute.
	 * The default value is <code>"59a3fadd-93e7-4674-886a-64883e17115f"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Id</em>' attribute.
	 * @see #setImageId(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinerackspace_ImageId()
	 * @model default="59a3fadd-93e7-4674-886a-64883e17115f"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinerackspace!imageId'"
	 * @generated
	 */
	String getImageId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinerackspace#getImageId <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Id</em>' attribute.
	 * @see #getImageId()
	 * @generated
	 */
	void setImageId(String value);

	/**
	 * Returns the value of the '<em><b>Flavor Id</b></em>' attribute.
	 * The default value is <code>"general1-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flavor Id</em>' attribute.
	 * @see #setFlavorId(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinerackspace_FlavorId()
	 * @model default="general1-1"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinerackspace!flavorId'"
	 * @generated
	 */
	String getFlavorId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinerackspace#getFlavorId <em>Flavor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flavor Id</em>' attribute.
	 * @see #getFlavorId()
	 * @generated
	 */
	void setFlavorId(String value);

	/**
	 * Returns the value of the '<em><b>Ssh User</b></em>' attribute.
	 * The default value is <code>"root"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ssh User</em>' attribute.
	 * @see #setSshUser(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinerackspace_SshUser()
	 * @model default="root"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinerackspace!sshUser'"
	 * @generated
	 */
	String getSshUser();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinerackspace#getSshUser <em>Ssh User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh User</em>' attribute.
	 * @see #getSshUser()
	 * @generated
	 */
	void setSshUser(String value);

	/**
	 * Returns the value of the '<em><b>Ssh Port</b></em>' attribute.
	 * The default value is <code>"22"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ssh Port</em>' attribute.
	 * @see #setSshPort(BigInteger)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinerackspace_SshPort()
	 * @model default="22"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinerackspace!sshPort'"
	 * @generated
	 */
	BigInteger getSshPort();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinerackspace#getSshPort <em>Ssh Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh Port</em>' attribute.
	 * @see #getSshPort()
	 * @generated
	 */
	void setSshPort(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Docker Install</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Docker Install</em>' attribute.
	 * @see #setDockerInstall(boolean)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinerackspace_DockerInstall()
	 * @model default="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinerackspace!dockerInstall'"
	 * @generated
	 */
	boolean isDockerInstall();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinerackspace#isDockerInstall <em>Docker Install</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker Install</em>' attribute.
	 * @see #isDockerInstall()
	 * @generated
	 */
	void setDockerInstall(boolean value);

} // Machinerackspace
