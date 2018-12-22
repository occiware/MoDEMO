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
 * A representation of the model object '<em><b>Machinedigitalocean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Machine on Digital Ocean
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinedigitalocean#getAccessToken <em>Access Token</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinedigitalocean#getImage <em>Image</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinedigitalocean#getRegion <em>Region</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinedigitalocean#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinedigitalocean()
 * @model
 * @generated
 */
public interface Machinedigitalocean extends Machine {
	/**
	 * Returns the value of the '<em><b>Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Token</em>' attribute.
	 * @see #setAccessToken(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinedigitalocean_AccessToken()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinedigitalocean!accessToken'"
	 * @generated
	 */
	String getAccessToken();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinedigitalocean#getAccessToken <em>Access Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Token</em>' attribute.
	 * @see #getAccessToken()
	 * @generated
	 */
	void setAccessToken(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * The default value is <code>"docker"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinedigitalocean_Image()
	 * @model default="docker"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinedigitalocean!image'"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinedigitalocean#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * The default value is <code>"nyc3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinedigitalocean_Region()
	 * @model default="nyc3"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinedigitalocean!region'"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinedigitalocean#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"512mb"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinedigitalocean_Size()
	 * @model default="512mb"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Machinedigitalocean!size'"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinedigitalocean#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

} // Machinedigitalocean
