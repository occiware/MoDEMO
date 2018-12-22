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
 * A representation of the model object '<em><b>Machinevmwarefusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Machine on VMware Fusion
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinevmwarefusion#getBoot2dockerURL <em>Boot2docker URL</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinevmwarefusion#getDiskSize <em>Disk Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinevmwarefusion#getMemorySize <em>Memory Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinevmwarefusion#isNoShare <em>No Share</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinevmwarefusion()
 * @model
 * @generated
 */
public interface Machinevmwarefusion extends Machine {
	/**
	 * Returns the value of the '<em><b>Boot2docker URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boot2docker URL</em>' attribute.
	 * @see #setBoot2dockerURL(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinevmwarefusion_Boot2dockerURL()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinevmwarefusion!boot2dockerURL'"
	 * @generated
	 */
	String getBoot2dockerURL();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinevmwarefusion#getBoot2dockerURL <em>Boot2docker URL</em>}' attribute.
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
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinevmwarefusion_DiskSize()
	 * @model default="20000"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinevmwarefusion!diskSize'"
	 * @generated
	 */
	BigInteger getDiskSize();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinevmwarefusion#getDiskSize <em>Disk Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk Size</em>' attribute.
	 * @see #getDiskSize()
	 * @generated
	 */
	void setDiskSize(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Memory Size</b></em>' attribute.
	 * The default value is <code>"1024"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Size</em>' attribute.
	 * @see #setMemorySize(BigInteger)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinevmwarefusion_MemorySize()
	 * @model default="1024"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinevmwarefusion!memorySize'"
	 * @generated
	 */
	BigInteger getMemorySize();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinevmwarefusion#getMemorySize <em>Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Size</em>' attribute.
	 * @see #getMemorySize()
	 * @generated
	 */
	void setMemorySize(BigInteger value);

	/**
	 * Returns the value of the '<em><b>No Share</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Share</em>' attribute.
	 * @see #setNoShare(boolean)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinevmwarefusion_NoShare()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinevmwarefusion!noShare'"
	 * @generated
	 */
	boolean isNoShare();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinevmwarefusion#isNoShare <em>No Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Share</em>' attribute.
	 * @see #isNoShare()
	 * @generated
	 */
	void setNoShare(boolean value);

} // Machinevmwarefusion
