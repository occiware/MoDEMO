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
 * A representation of the model object '<em><b>Machineamazonec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getAccessKey <em>Access Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getAmi <em>Ami</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getInstanceType <em>Instance Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getRegion <em>Region</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getRootSize <em>Root Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getSecretKey <em>Secret Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getSecurityGroup <em>Security Group</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getSessionToken <em>Session Token</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getSubnetId <em>Subnet Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getVpcId <em>Vpc Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getZone <em>Zone</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineamazonec2()
 * @model
 * @generated
 */
public interface Machineamazonec2 extends Machine {
	/**
	 * Returns the value of the '<em><b>Access Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Key</em>' attribute.
	 * @see #setAccessKey(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineamazonec2_AccessKey()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineamazonec2!accessKey'"
	 * @generated
	 */
	String getAccessKey();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getAccessKey <em>Access Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Key</em>' attribute.
	 * @see #getAccessKey()
	 * @generated
	 */
	void setAccessKey(String value);

	/**
	 * Returns the value of the '<em><b>Ami</b></em>' attribute.
	 * The default value is <code>"ami-4ae27e22"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ami</em>' attribute.
	 * @see #setAmi(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineamazonec2_Ami()
	 * @model default="ami-4ae27e22"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineamazonec2!ami'"
	 * @generated
	 */
	String getAmi();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getAmi <em>Ami</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ami</em>' attribute.
	 * @see #getAmi()
	 * @generated
	 */
	void setAmi(String value);

	/**
	 * Returns the value of the '<em><b>Instance Type</b></em>' attribute.
	 * The default value is <code>"t2.micro"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Type</em>' attribute.
	 * @see #setInstanceType(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineamazonec2_InstanceType()
	 * @model default="t2.micro"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineamazonec2!instanceType'"
	 * @generated
	 */
	String getInstanceType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getInstanceType <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type</em>' attribute.
	 * @see #getInstanceType()
	 * @generated
	 */
	void setInstanceType(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * The default value is <code>"us-east-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineamazonec2_Region()
	 * @model default="us-east-1"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineamazonec2!region'"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Root Size</b></em>' attribute.
	 * The default value is <code>"16"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Size</em>' attribute.
	 * @see #setRootSize(BigInteger)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineamazonec2_RootSize()
	 * @model default="16"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineamazonec2!rootSize'"
	 * @generated
	 */
	BigInteger getRootSize();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getRootSize <em>Root Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Size</em>' attribute.
	 * @see #getRootSize()
	 * @generated
	 */
	void setRootSize(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secret Key</em>' attribute.
	 * @see #setSecretKey(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineamazonec2_SecretKey()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineamazonec2!secretKey'"
	 * @generated
	 */
	String getSecretKey();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getSecretKey <em>Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret Key</em>' attribute.
	 * @see #getSecretKey()
	 * @generated
	 */
	void setSecretKey(String value);

	/**
	 * Returns the value of the '<em><b>Security Group</b></em>' attribute.
	 * The default value is <code>"docker-machine"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Group</em>' attribute.
	 * @see #setSecurityGroup(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineamazonec2_SecurityGroup()
	 * @model default="docker-machine"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineamazonec2!securityGroup'"
	 * @generated
	 */
	String getSecurityGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getSecurityGroup <em>Security Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Group</em>' attribute.
	 * @see #getSecurityGroup()
	 * @generated
	 */
	void setSecurityGroup(String value);

	/**
	 * Returns the value of the '<em><b>Session Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Session Token</em>' attribute.
	 * @see #setSessionToken(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineamazonec2_SessionToken()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineamazonec2!sessionToken'"
	 * @generated
	 */
	String getSessionToken();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getSessionToken <em>Session Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Token</em>' attribute.
	 * @see #getSessionToken()
	 * @generated
	 */
	void setSessionToken(String value);

	/**
	 * Returns the value of the '<em><b>Subnet Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subnet Id</em>' attribute.
	 * @see #setSubnetId(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineamazonec2_SubnetId()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineamazonec2!subnetId'"
	 * @generated
	 */
	String getSubnetId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getSubnetId <em>Subnet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Id</em>' attribute.
	 * @see #getSubnetId()
	 * @generated
	 */
	void setSubnetId(String value);

	/**
	 * Returns the value of the '<em><b>Vpc Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vpc Id</em>' attribute.
	 * @see #setVpcId(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineamazonec2_VpcId()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineamazonec2!vpcId'"
	 * @generated
	 */
	String getVpcId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getVpcId <em>Vpc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc Id</em>' attribute.
	 * @see #getVpcId()
	 * @generated
	 */
	void setVpcId(String value);

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' attribute.
	 * The default value is <code>"a"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zone</em>' attribute.
	 * @see #setZone(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineamazonec2_Zone()
	 * @model default="a"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machineamazonec2!zone'"
	 * @generated
	 */
	String getZone();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineamazonec2#getZone <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' attribute.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(String value);

} // Machineamazonec2
