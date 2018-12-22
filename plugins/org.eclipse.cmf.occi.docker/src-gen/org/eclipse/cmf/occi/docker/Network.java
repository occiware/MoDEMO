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
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Network resource
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.Network#getNetworkId <em>Network Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Network#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Network#getAuxAddress <em>Aux Address</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Network#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Network#getGateway <em>Gateway</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Network#isInternal <em>Internal</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Network#getIpRange <em>Ip Range</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Network#getIpamDriver <em>Ipam Driver</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Network#getIpamOpt <em>Ipam Opt</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Network#isIpv6 <em>Ipv6</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Network#getOpt <em>Opt</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Network#getSubnet <em>Subnet</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.docker.DockerPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends org.eclipse.cmf.occi.infrastructure.Network {
	/**
	 * Returns the value of the '<em><b>Network Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network Id</em>' attribute.
	 * @see #setNetworkId(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getNetwork_NetworkId()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Network!networkId'"
	 * @generated
	 */
	String getNetworkId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Network#getNetworkId <em>Network Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Id</em>' attribute.
	 * @see #getNetworkId()
	 * @generated
	 */
	void setNetworkId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getNetwork_Name()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Network!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Network#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Aux Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aux Address</em>' attribute.
	 * @see #setAuxAddress(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getNetwork_AuxAddress()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Network!auxAddress'"
	 * @generated
	 */
	String getAuxAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Network#getAuxAddress <em>Aux Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux Address</em>' attribute.
	 * @see #getAuxAddress()
	 * @generated
	 */
	void setAuxAddress(String value);

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Driver</em>' attribute.
	 * @see #setDriver(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getNetwork_Driver()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Network!driver'"
	 * @generated
	 */
	String getDriver();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Network#getDriver <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' attribute.
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(String value);

	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gateway</em>' attribute.
	 * @see #setGateway(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getNetwork_Gateway()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Network!gateway'"
	 * @generated
	 */
	String getGateway();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Network#getGateway <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway</em>' attribute.
	 * @see #getGateway()
	 * @generated
	 */
	void setGateway(String value);

	/**
	 * Returns the value of the '<em><b>Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internal</em>' attribute.
	 * @see #setInternal(boolean)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getNetwork_Internal()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Network!internal'"
	 * @generated
	 */
	boolean isInternal();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Network#isInternal <em>Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal</em>' attribute.
	 * @see #isInternal()
	 * @generated
	 */
	void setInternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Ip Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ip Range</em>' attribute.
	 * @see #setIpRange(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getNetwork_IpRange()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Network!ipRange'"
	 * @generated
	 */
	String getIpRange();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Network#getIpRange <em>Ip Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Range</em>' attribute.
	 * @see #getIpRange()
	 * @generated
	 */
	void setIpRange(String value);

	/**
	 * Returns the value of the '<em><b>Ipam Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ipam Driver</em>' attribute.
	 * @see #setIpamDriver(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getNetwork_IpamDriver()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Network!ipamDriver'"
	 * @generated
	 */
	String getIpamDriver();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Network#getIpamDriver <em>Ipam Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ipam Driver</em>' attribute.
	 * @see #getIpamDriver()
	 * @generated
	 */
	void setIpamDriver(String value);

	/**
	 * Returns the value of the '<em><b>Ipam Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ipam Opt</em>' attribute.
	 * @see #setIpamOpt(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getNetwork_IpamOpt()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Network!ipamOpt'"
	 * @generated
	 */
	String getIpamOpt();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Network#getIpamOpt <em>Ipam Opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ipam Opt</em>' attribute.
	 * @see #getIpamOpt()
	 * @generated
	 */
	void setIpamOpt(String value);

	/**
	 * Returns the value of the '<em><b>Ipv6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ipv6</em>' attribute.
	 * @see #setIpv6(boolean)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getNetwork_Ipv6()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Network!ipv6'"
	 * @generated
	 */
	boolean isIpv6();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Network#isIpv6 <em>Ipv6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ipv6</em>' attribute.
	 * @see #isIpv6()
	 * @generated
	 */
	void setIpv6(boolean value);

	/**
	 * Returns the value of the '<em><b>Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Opt</em>' attribute.
	 * @see #setOpt(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getNetwork_Opt()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Network!opt'"
	 * @generated
	 */
	String getOpt();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Network#getOpt <em>Opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opt</em>' attribute.
	 * @see #getOpt()
	 * @generated
	 */
	void setOpt(String value);

	/**
	 * Returns the value of the '<em><b>Subnet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subnet</em>' attribute.
	 * @see #setSubnet(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getNetwork_Subnet()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Network!subnet'"
	 * @generated
	 */
	String getSubnet();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Network#getSubnet <em>Subnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet</em>' attribute.
	 * @see #getSubnet()
	 * @generated
	 */
	void setSubnet(String value);

} // Network
