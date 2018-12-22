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
 * A representation of the model object '<em><b>Machinemicrosofthyperv</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Machine on Microsoft Hyper-V
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosofthyperv#getVirtualSwitch <em>Virtual Switch</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosofthyperv#getBoot2dockerURL <em>Boot2docker URL</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosofthyperv#getDiskSize <em>Disk Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosofthyperv#getStaticMacAddress <em>Static Mac Address</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinemicrosofthyperv#getVlanId <em>Vlan Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosofthyperv()
 * @model
 * @generated
 */
public interface Machinemicrosofthyperv extends Machine {
	/**
	 * Returns the value of the '<em><b>Virtual Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Switch</em>' attribute.
	 * @see #setVirtualSwitch(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosofthyperv_VirtualSwitch()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosofthyperv!virtualSwitch'"
	 * @generated
	 */
	String getVirtualSwitch();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosofthyperv#getVirtualSwitch <em>Virtual Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Switch</em>' attribute.
	 * @see #getVirtualSwitch()
	 * @generated
	 */
	void setVirtualSwitch(String value);

	/**
	 * Returns the value of the '<em><b>Boot2docker URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boot2docker URL</em>' attribute.
	 * @see #setBoot2dockerURL(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosofthyperv_Boot2dockerURL()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosofthyperv!boot2dockerURL'"
	 * @generated
	 */
	String getBoot2dockerURL();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosofthyperv#getBoot2dockerURL <em>Boot2docker URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boot2docker URL</em>' attribute.
	 * @see #getBoot2dockerURL()
	 * @generated
	 */
	void setBoot2dockerURL(String value);

	/**
	 * Returns the value of the '<em><b>Disk Size</b></em>' attribute.
	 * The default value is <code>"20000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disk Size</em>' attribute.
	 * @see #setDiskSize(BigInteger)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosofthyperv_DiskSize()
	 * @model default="20000"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosofthyperv!diskSize'"
	 * @generated
	 */
	BigInteger getDiskSize();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosofthyperv#getDiskSize <em>Disk Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk Size</em>' attribute.
	 * @see #getDiskSize()
	 * @generated
	 */
	void setDiskSize(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Static Mac Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Mac Address</em>' attribute.
	 * @see #setStaticMacAddress(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosofthyperv_StaticMacAddress()
	 * @model dataType="org.eclipse.cmf.occi.infrastructure.Mac"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosofthyperv!staticMacAddress'"
	 * @generated
	 */
	String getStaticMacAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosofthyperv#getStaticMacAddress <em>Static Mac Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Mac Address</em>' attribute.
	 * @see #getStaticMacAddress()
	 * @generated
	 */
	void setStaticMacAddress(String value);

	/**
	 * Returns the value of the '<em><b>Vlan Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vlan Id</em>' attribute.
	 * @see #setVlanId(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinemicrosofthyperv_VlanId()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinemicrosofthyperv!vlanId'"
	 * @generated
	 */
	String getVlanId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinemicrosofthyperv#getVlanId <em>Vlan Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vlan Id</em>' attribute.
	 * @see #getVlanId()
	 * @generated
	 */
	void setVlanId(String value);

} // Machinemicrosofthyperv
