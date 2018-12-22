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
 * A representation of the model object '<em><b>Machinemicrosoftazure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Machine on Microsoft Azure
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSubscriptionCert <em>Subscription Cert</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getMachineLocation <em>Machine Location</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getResourceGroup <em>Resource Group</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSshUser <em>Ssh User</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getVnet <em>Vnet</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSubnet <em>Subnet</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSubnetPrefix <em>Subnet Prefix</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getAvailabilitySet <em>Availability Set</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getOpenPort <em>Open Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getPrivateIpAddress <em>Private Ip Address</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getNoPublicIp <em>No Public Ip</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getStaticPublicIp <em>Static Public Ip</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getDockerPort <em>Docker Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getUsePrivateIp <em>Use Private Ip</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosoftazure()
 * @model
 * @generated
 */
public interface Machinemicrosoftazure extends Machine {
	/**
	 * Returns the value of the '<em><b>Subscription Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscription Id</em>' attribute.
	 * @see #setSubscriptionId(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosoftazure_SubscriptionId()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosoftazure!subscriptionId'"
	 * @generated
	 */
	String getSubscriptionId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSubscriptionId <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Id</em>' attribute.
	 * @see #getSubscriptionId()
	 * @generated
	 */
	void setSubscriptionId(String value);

	/**
	 * Returns the value of the '<em><b>Subscription Cert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscription Cert</em>' attribute.
	 * @see #setSubscriptionCert(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosoftazure_SubscriptionCert()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosoftazure!subscriptionCert'"
	 * @generated
	 */
	String getSubscriptionCert();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSubscriptionCert <em>Subscription Cert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Cert</em>' attribute.
	 * @see #getSubscriptionCert()
	 * @generated
	 */
	void setSubscriptionCert(String value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * The default value is <code>"AzurePublicCloud"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosoftazure_Environment()
	 * @model default="AzurePublicCloud"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosoftazure!environment'"
	 * @generated
	 */
	String getEnvironment();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getEnvironment <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(String value);

	/**
	 * Returns the value of the '<em><b>Machine Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Machine Location</em>' attribute.
	 * @see #setMachineLocation(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosoftazure_MachineLocation()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosoftazure!machineLocation'"
	 * @generated
	 */
	String getMachineLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getMachineLocation <em>Machine Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine Location</em>' attribute.
	 * @see #getMachineLocation()
	 * @generated
	 */
	void setMachineLocation(String value);

	/**
	 * Returns the value of the '<em><b>Resource Group</b></em>' attribute.
	 * The default value is <code>"docker-machine"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Group</em>' attribute.
	 * @see #setResourceGroup(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosoftazure_ResourceGroup()
	 * @model default="docker-machine"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosoftazure!resourceGroup'"
	 * @generated
	 */
	String getResourceGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getResourceGroup <em>Resource Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Group</em>' attribute.
	 * @see #getResourceGroup()
	 * @generated
	 */
	void setResourceGroup(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosoftazure_Size()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosoftazure!size'"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Ssh User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ssh User</em>' attribute.
	 * @see #setSshUser(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosoftazure_SshUser()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosoftazure!sshUser'"
	 * @generated
	 */
	String getSshUser();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSshUser <em>Ssh User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh User</em>' attribute.
	 * @see #getSshUser()
	 * @generated
	 */
	void setSshUser(String value);

	/**
	 * Returns the value of the '<em><b>Vnet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vnet</em>' attribute.
	 * @see #setVnet(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosoftazure_Vnet()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosoftazure!vnet'"
	 * @generated
	 */
	String getVnet();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getVnet <em>Vnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vnet</em>' attribute.
	 * @see #getVnet()
	 * @generated
	 */
	void setVnet(String value);

	/**
	 * Returns the value of the '<em><b>Subnet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subnet</em>' attribute.
	 * @see #setSubnet(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosoftazure_Subnet()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosoftazure!subnet'"
	 * @generated
	 */
	String getSubnet();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSubnet <em>Subnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet</em>' attribute.
	 * @see #getSubnet()
	 * @generated
	 */
	void setSubnet(String value);

	/**
	 * Returns the value of the '<em><b>Subnet Prefix</b></em>' attribute.
	 * The default value is <code>"192.168.0.0/16"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subnet Prefix</em>' attribute.
	 * @see #setSubnetPrefix(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosoftazure_SubnetPrefix()
	 * @model default="192.168.0.0/16"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosoftazure!subnetPrefix'"
	 * @generated
	 */
	String getSubnetPrefix();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getSubnetPrefix <em>Subnet Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Prefix</em>' attribute.
	 * @see #getSubnetPrefix()
	 * @generated
	 */
	void setSubnetPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Availability Set</b></em>' attribute.
	 * The default value is <code>"docker-machine"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability Set</em>' attribute.
	 * @see #setAvailabilitySet(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosoftazure_AvailabilitySet()
	 * @model default="docker-machine"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosoftazure!availabilitySet'"
	 * @generated
	 */
	String getAvailabilitySet();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getAvailabilitySet <em>Availability Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Set</em>' attribute.
	 * @see #getAvailabilitySet()
	 * @generated
	 */
	void setAvailabilitySet(String value);

	/**
	 * Returns the value of the '<em><b>Open Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Open Port</em>' attribute.
	 * @see #setOpenPort(BigInteger)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosoftazure_OpenPort()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosoftazure!openPort'"
	 * @generated
	 */
	BigInteger getOpenPort();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getOpenPort <em>Open Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Port</em>' attribute.
	 * @see #getOpenPort()
	 * @generated
	 */
	void setOpenPort(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Private Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private Ip Address</em>' attribute.
	 * @see #setPrivateIpAddress(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosoftazure_PrivateIpAddress()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosoftazure!privateIpAddress'"
	 * @generated
	 */
	String getPrivateIpAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getPrivateIpAddress <em>Private Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Ip Address</em>' attribute.
	 * @see #getPrivateIpAddress()
	 * @generated
	 */
	void setPrivateIpAddress(String value);

	/**
	 * Returns the value of the '<em><b>No Public Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Public Ip</em>' attribute.
	 * @see #setNoPublicIp(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosoftazure_NoPublicIp()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosoftazure!noPublicIp'"
	 * @generated
	 */
	String getNoPublicIp();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getNoPublicIp <em>No Public Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Public Ip</em>' attribute.
	 * @see #getNoPublicIp()
	 * @generated
	 */
	void setNoPublicIp(String value);

	/**
	 * Returns the value of the '<em><b>Static Public Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Public Ip</em>' attribute.
	 * @see #setStaticPublicIp(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosoftazure_StaticPublicIp()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosoftazure!staticPublicIp'"
	 * @generated
	 */
	String getStaticPublicIp();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getStaticPublicIp <em>Static Public Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Public Ip</em>' attribute.
	 * @see #getStaticPublicIp()
	 * @generated
	 */
	void setStaticPublicIp(String value);

	/**
	 * Returns the value of the '<em><b>Docker Port</b></em>' attribute.
	 * The default value is <code>"2376"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Docker Port</em>' attribute.
	 * @see #setDockerPort(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosoftazure_DockerPort()
	 * @model default="2376"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosoftazure!dockerPort'"
	 * @generated
	 */
	String getDockerPort();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getDockerPort <em>Docker Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker Port</em>' attribute.
	 * @see #getDockerPort()
	 * @generated
	 */
	void setDockerPort(String value);

	/**
	 * Returns the value of the '<em><b>Use Private Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Private Ip</em>' attribute.
	 * @see #setUsePrivateIp(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosoftazure_UsePrivateIp()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosoftazure!usePrivateIp'"
	 * @generated
	 */
	String getUsePrivateIp();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getUsePrivateIp <em>Use Private Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Private Ip</em>' attribute.
	 * @see #getUsePrivateIp()
	 * @generated
	 */
	void setUsePrivateIp(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosoftazure_Image()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosoftazure!image'"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

} // Machinemicrosoftazure
