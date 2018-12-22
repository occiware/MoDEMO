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
package org.eclipse.cmf.occi.multicloud.modemo;

import java.math.BigInteger;

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Horizontalgroup</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupName <em>Horizontalgroup Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupGroupSize <em>Horizontalgroup Group Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupMaximum <em>Horizontalgroup Maximum</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupMinimum <em>Horizontalgroup Minimum</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupTemplateName <em>Horizontalgroup Template Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupLoadBalancer <em>Horizontalgroup Load Balancer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getHorizontalgroup()
 * @model
 * @generated
 */
public interface Horizontalgroup extends Resource {
	/**
	 * Returns the value of the '<em><b>Horizontalgroup Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontalgroup Name</em>' attribute.
	 * @see #setHorizontalgroupName(String)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getHorizontalgroup_HorizontalgroupName()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemo/ecore!Horizontalgroup!horizontalgroupName'"
	 * @generated
	 */
	String getHorizontalgroupName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupName <em>Horizontalgroup Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontalgroup Name</em>' attribute.
	 * @see #getHorizontalgroupName()
	 * @generated
	 */
	void setHorizontalgroupName(String value);

	/**
	 * Returns the value of the '<em><b>Horizontalgroup Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontalgroup Group Size</em>' attribute.
	 * @see #setHorizontalgroupGroupSize(int)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getHorizontalgroup_HorizontalgroupGroupSize()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemo/ecore!Horizontalgroup!horizontalgroupGroupSize'"
	 * @generated
	 */
	int getHorizontalgroupGroupSize();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupGroupSize <em>Horizontalgroup Group Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontalgroup Group Size</em>' attribute.
	 * @see #getHorizontalgroupGroupSize()
	 * @generated
	 */
	void setHorizontalgroupGroupSize(int value);

	/**
	 * Returns the value of the '<em><b>Horizontalgroup Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontalgroup Maximum</em>' attribute.
	 * @see #setHorizontalgroupMaximum(int)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getHorizontalgroup_HorizontalgroupMaximum()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemo/ecore!Horizontalgroup!horizontalgroupMaximum'"
	 * @generated
	 */
	int getHorizontalgroupMaximum();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupMaximum <em>Horizontalgroup Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontalgroup Maximum</em>' attribute.
	 * @see #getHorizontalgroupMaximum()
	 * @generated
	 */
	void setHorizontalgroupMaximum(int value);

	/**
	 * Returns the value of the '<em><b>Horizontalgroup Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontalgroup Minimum</em>' attribute.
	 * @see #setHorizontalgroupMinimum(int)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getHorizontalgroup_HorizontalgroupMinimum()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemo/ecore!Horizontalgroup!horizontalgroupMinimum'"
	 * @generated
	 */
	int getHorizontalgroupMinimum();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupMinimum <em>Horizontalgroup Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontalgroup Minimum</em>' attribute.
	 * @see #getHorizontalgroupMinimum()
	 * @generated
	 */
	void setHorizontalgroupMinimum(int value);

	/**
	 * Returns the value of the '<em><b>Horizontalgroup Template Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontalgroup Template Name</em>' attribute.
	 * @see #setHorizontalgroupTemplateName(String)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getHorizontalgroup_HorizontalgroupTemplateName()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemo/ecore!Horizontalgroup!horizontalgroupTemplateName'"
	 * @generated
	 */
	String getHorizontalgroupTemplateName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupTemplateName <em>Horizontalgroup Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontalgroup Template Name</em>' attribute.
	 * @see #getHorizontalgroupTemplateName()
	 * @generated
	 */
	void setHorizontalgroupTemplateName(String value);

	/**
	 * Returns the value of the '<em><b>Horizontalgroup Load Balancer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontalgroup Load Balancer</em>' attribute.
	 * @see #setHorizontalgroupLoadBalancer(String)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getHorizontalgroup_HorizontalgroupLoadBalancer()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemo/ecore!Horizontalgroup!horizontalgroupLoadBalancer'"
	 * @generated
	 */
	String getHorizontalgroupLoadBalancer();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupLoadBalancer <em>Horizontalgroup Load Balancer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontalgroup Load Balancer</em>' attribute.
	 * @see #getHorizontalgroupLoadBalancer()
	 * @generated
	 */
	void setHorizontalgroupLoadBalancer(String value);

} // Horizontalgroup
