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
 * A representation of the model object '<em><b>Elasticitycontroller</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Elasticitycontroller#getElasticitycontrollerMinimumLimit <em>Elasticitycontroller Minimum Limit</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Elasticitycontroller#getElasticitycontrollerMaximumLimit <em>Elasticitycontroller Maximum Limit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getElasticitycontroller()
 * @model
 * @generated
 */
public interface Elasticitycontroller extends Resource {
	/**
	 * Returns the value of the '<em><b>Elasticitycontroller Minimum Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elasticitycontroller Minimum Limit</em>' attribute.
	 * @see #setElasticitycontrollerMinimumLimit(int)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getElasticitycontroller_ElasticitycontrollerMinimumLimit()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemo/ecore!Elasticitycontroller!ElasticitycontrollerMinimumLimit'"
	 * @generated
	 */
	int getElasticitycontrollerMinimumLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Elasticitycontroller#getElasticitycontrollerMinimumLimit <em>Elasticitycontroller Minimum Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elasticitycontroller Minimum Limit</em>' attribute.
	 * @see #getElasticitycontrollerMinimumLimit()
	 * @generated
	 */
	void setElasticitycontrollerMinimumLimit(int value);

	/**
	 * Returns the value of the '<em><b>Elasticitycontroller Maximum Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elasticitycontroller Maximum Limit</em>' attribute.
	 * @see #setElasticitycontrollerMaximumLimit(int)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getElasticitycontroller_ElasticitycontrollerMaximumLimit()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemo/ecore!Elasticitycontroller!ElasticitycontrollerMaximumLimit'"
	 * @generated
	 */
	int getElasticitycontrollerMaximumLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Elasticitycontroller#getElasticitycontrollerMaximumLimit <em>Elasticitycontroller Maximum Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elasticitycontroller Maximum Limit</em>' attribute.
	 * @see #getElasticitycontrollerMaximumLimit()
	 * @generated
	 */
	void setElasticitycontrollerMaximumLimit(int value);

} // Elasticitycontroller
