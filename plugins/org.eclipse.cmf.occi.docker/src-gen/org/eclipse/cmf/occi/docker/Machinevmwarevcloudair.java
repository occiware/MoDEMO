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
 * A representation of the model object '<em><b>Machinevmwarevcloudair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Machine on VMware vCloud Air
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getUsername <em>Username</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getCatalogItem <em>Catalog Item</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getComputeId <em>Compute Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getCpuCount <em>Cpu Count</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getDockerPort <em>Docker Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getEdgegateway <em>Edgegateway</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getMemorySize <em>Memory Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getVappName <em>Vapp Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getOrgvdcnetwork <em>Orgvdcnetwork</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#isProvision <em>Provision</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getPublicIp <em>Public Ip</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getSshPort <em>Ssh Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getVdcId <em>Vdc Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinevmwarevcloudair()
 * @model
 * @generated
 */
public interface Machinevmwarevcloudair extends Machine {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinevmwarevcloudair_Username()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinevmwarevcloudair!username'"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getUsername <em>Username</em>}' attribute.
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
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinevmwarevcloudair_Password()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinevmwarevcloudair!password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' attribute.
	 * The default value is <code>"Public Catalog"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Catalog</em>' attribute.
	 * @see #setCatalog(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinevmwarevcloudair_Catalog()
	 * @model default="Public Catalog"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinevmwarevcloudair!catalog'"
	 * @generated
	 */
	String getCatalog();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getCatalog <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog</em>' attribute.
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(String value);

	/**
	 * Returns the value of the '<em><b>Catalog Item</b></em>' attribute.
	 * The default value is <code>"Ubuntu Server 12.04 LTS (amd64 20140927)"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Catalog Item</em>' attribute.
	 * @see #setCatalogItem(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinevmwarevcloudair_CatalogItem()
	 * @model default="Ubuntu Server 12.04 LTS (amd64 20140927)"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinevmwarevcloudair!catalogItem'"
	 * @generated
	 */
	String getCatalogItem();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getCatalogItem <em>Catalog Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog Item</em>' attribute.
	 * @see #getCatalogItem()
	 * @generated
	 */
	void setCatalogItem(String value);

	/**
	 * Returns the value of the '<em><b>Compute Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compute Id</em>' attribute.
	 * @see #setComputeId(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinevmwarevcloudair_ComputeId()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinevmwarevcloudair!computeId'"
	 * @generated
	 */
	String getComputeId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getComputeId <em>Compute Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compute Id</em>' attribute.
	 * @see #getComputeId()
	 * @generated
	 */
	void setComputeId(String value);

	/**
	 * Returns the value of the '<em><b>Cpu Count</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cpu Count</em>' attribute.
	 * @see #setCpuCount(BigInteger)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinevmwarevcloudair_CpuCount()
	 * @model default="1"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinevmwarevcloudair!cpuCount'"
	 * @generated
	 */
	BigInteger getCpuCount();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getCpuCount <em>Cpu Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Count</em>' attribute.
	 * @see #getCpuCount()
	 * @generated
	 */
	void setCpuCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Docker Port</b></em>' attribute.
	 * The default value is <code>"2376"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Docker Port</em>' attribute.
	 * @see #setDockerPort(BigInteger)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinevmwarevcloudair_DockerPort()
	 * @model default="2376"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinevmwarevcloudair!dockerPort'"
	 * @generated
	 */
	BigInteger getDockerPort();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getDockerPort <em>Docker Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker Port</em>' attribute.
	 * @see #getDockerPort()
	 * @generated
	 */
	void setDockerPort(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Edgegateway</b></em>' attribute.
	 * The default value is <code>"&lt;vdcid>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edgegateway</em>' attribute.
	 * @see #setEdgegateway(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinevmwarevcloudair_Edgegateway()
	 * @model default="&amp;lt;vdcid&gt;"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinevmwarevcloudair!edgegateway'"
	 * @generated
	 */
	String getEdgegateway();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getEdgegateway <em>Edgegateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edgegateway</em>' attribute.
	 * @see #getEdgegateway()
	 * @generated
	 */
	void setEdgegateway(String value);

	/**
	 * Returns the value of the '<em><b>Memory Size</b></em>' attribute.
	 * The default value is <code>"2048"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Size</em>' attribute.
	 * @see #setMemorySize(BigInteger)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinevmwarevcloudair_MemorySize()
	 * @model default="2048"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinevmwarevcloudair!memorySize'"
	 * @generated
	 */
	BigInteger getMemorySize();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getMemorySize <em>Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Size</em>' attribute.
	 * @see #getMemorySize()
	 * @generated
	 */
	void setMemorySize(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Vapp Name</b></em>' attribute.
	 * The default value is <code>"&lt;autogenerated>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vapp Name</em>' attribute.
	 * @see #setVappName(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinevmwarevcloudair_VappName()
	 * @model default="&amp;lt;autogenerated&gt;"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinevmwarevcloudair!vappName'"
	 * @generated
	 */
	String getVappName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getVappName <em>Vapp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vapp Name</em>' attribute.
	 * @see #getVappName()
	 * @generated
	 */
	void setVappName(String value);

	/**
	 * Returns the value of the '<em><b>Orgvdcnetwork</b></em>' attribute.
	 * The default value is <code>"&lt;vdcid>-default-routed"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orgvdcnetwork</em>' attribute.
	 * @see #setOrgvdcnetwork(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinevmwarevcloudair_Orgvdcnetwork()
	 * @model default="&amp;lt;vdcid&gt;-default-routed"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinevmwarevcloudair!orgvdcnetwork'"
	 * @generated
	 */
	String getOrgvdcnetwork();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getOrgvdcnetwork <em>Orgvdcnetwork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orgvdcnetwork</em>' attribute.
	 * @see #getOrgvdcnetwork()
	 * @generated
	 */
	void setOrgvdcnetwork(String value);

	/**
	 * Returns the value of the '<em><b>Provision</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provision</em>' attribute.
	 * @see #setProvision(boolean)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinevmwarevcloudair_Provision()
	 * @model default="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinevmwarevcloudair!provision'"
	 * @generated
	 */
	boolean isProvision();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#isProvision <em>Provision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provision</em>' attribute.
	 * @see #isProvision()
	 * @generated
	 */
	void setProvision(boolean value);

	/**
	 * Returns the value of the '<em><b>Public Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public Ip</em>' attribute.
	 * @see #setPublicIp(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinevmwarevcloudair_PublicIp()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinevmwarevcloudair!publicIp'"
	 * @generated
	 */
	String getPublicIp();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getPublicIp <em>Public Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Ip</em>' attribute.
	 * @see #getPublicIp()
	 * @generated
	 */
	void setPublicIp(String value);

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
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinevmwarevcloudair_SshPort()
	 * @model default="22"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinevmwarevcloudair!sshPort'"
	 * @generated
	 */
	BigInteger getSshPort();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getSshPort <em>Ssh Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh Port</em>' attribute.
	 * @see #getSshPort()
	 * @generated
	 */
	void setSshPort(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Vdc Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vdc Id</em>' attribute.
	 * @see #setVdcId(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinevmwarevcloudair_VdcId()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinevmwarevcloudair!vdcId'"
	 * @generated
	 */
	String getVdcId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair#getVdcId <em>Vdc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vdc Id</em>' attribute.
	 * @see #getVdcId()
	 * @generated
	 */
	void setVdcId(String value);

} // Machinevmwarevcloudair
