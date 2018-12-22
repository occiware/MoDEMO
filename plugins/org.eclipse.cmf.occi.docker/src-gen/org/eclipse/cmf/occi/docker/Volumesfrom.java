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

import org.eclipse.cmf.occi.core.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volumesfrom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * VolumsFrom
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.Volumesfrom#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.docker.DockerPackage#getVolumesfrom()
 * @model
 * @generated
 */
public interface Volumesfrom extends Link {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The default value is <code>"readWrite"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.docker.Mode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.eclipse.cmf.occi.docker.Mode
	 * @see #setMode(Mode)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getVolumesfrom_Mode()
	 * @model default="readWrite"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/docker/ecore!Volumesfrom!mode'"
	 * @generated
	 */
	Mode getMode();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Volumesfrom#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.eclipse.cmf.occi.docker.Mode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Mode value);

} // Volumesfrom
