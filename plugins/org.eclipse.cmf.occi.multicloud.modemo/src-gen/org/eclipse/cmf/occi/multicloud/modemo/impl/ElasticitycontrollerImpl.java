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
package org.eclipse.cmf.occi.multicloud.modemo.impl;

import java.math.BigInteger;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.cmf.occi.multicloud.modemo.Elasticitycontroller;
import org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elasticitycontroller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ElasticitycontrollerImpl#getElasticitycontrollerMinimumLimit <em>Elasticitycontroller Minimum Limit</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ElasticitycontrollerImpl#getElasticitycontrollerMaximumLimit <em>Elasticitycontroller Maximum Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElasticitycontrollerImpl extends ResourceImpl implements Elasticitycontroller {
	/**
	 * The default value of the '{@link #getElasticitycontrollerMinimumLimit() <em>Elasticitycontroller Minimum Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElasticitycontrollerMinimumLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int ELASTICITYCONTROLLER_MINIMUM_LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getElasticitycontrollerMinimumLimit() <em>Elasticitycontroller Minimum Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElasticitycontrollerMinimumLimit()
	 * @generated
	 * @ordered
	 */
	protected int elasticitycontrollerMinimumLimit = ELASTICITYCONTROLLER_MINIMUM_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getElasticitycontrollerMaximumLimit() <em>Elasticitycontroller Maximum Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElasticitycontrollerMaximumLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int ELASTICITYCONTROLLER_MAXIMUM_LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getElasticitycontrollerMaximumLimit() <em>Elasticitycontroller Maximum Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElasticitycontrollerMaximumLimit()
	 * @generated
	 * @ordered
	 */
	protected int elasticitycontrollerMaximumLimit = ELASTICITYCONTROLLER_MAXIMUM_LIMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElasticitycontrollerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModemoPackage.Literals.ELASTICITYCONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getElasticitycontrollerMinimumLimit() {
		return elasticitycontrollerMinimumLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElasticitycontrollerMinimumLimit(int newElasticitycontrollerMinimumLimit) {
		int oldElasticitycontrollerMinimumLimit = elasticitycontrollerMinimumLimit;
		elasticitycontrollerMinimumLimit = newElasticitycontrollerMinimumLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModemoPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MINIMUM_LIMIT, oldElasticitycontrollerMinimumLimit, elasticitycontrollerMinimumLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getElasticitycontrollerMaximumLimit() {
		return elasticitycontrollerMaximumLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElasticitycontrollerMaximumLimit(int newElasticitycontrollerMaximumLimit) {
		int oldElasticitycontrollerMaximumLimit = elasticitycontrollerMaximumLimit;
		elasticitycontrollerMaximumLimit = newElasticitycontrollerMaximumLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModemoPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MAXIMUM_LIMIT, oldElasticitycontrollerMaximumLimit, elasticitycontrollerMaximumLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModemoPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MINIMUM_LIMIT:
				return getElasticitycontrollerMinimumLimit();
			case ModemoPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MAXIMUM_LIMIT:
				return getElasticitycontrollerMaximumLimit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModemoPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MINIMUM_LIMIT:
				setElasticitycontrollerMinimumLimit((Integer)newValue);
				return;
			case ModemoPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MAXIMUM_LIMIT:
				setElasticitycontrollerMaximumLimit((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModemoPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MINIMUM_LIMIT:
				setElasticitycontrollerMinimumLimit(ELASTICITYCONTROLLER_MINIMUM_LIMIT_EDEFAULT);
				return;
			case ModemoPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MAXIMUM_LIMIT:
				setElasticitycontrollerMaximumLimit(ELASTICITYCONTROLLER_MAXIMUM_LIMIT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModemoPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MINIMUM_LIMIT:
				return elasticitycontrollerMinimumLimit != ELASTICITYCONTROLLER_MINIMUM_LIMIT_EDEFAULT;
			case ModemoPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MAXIMUM_LIMIT:
				return elasticitycontrollerMaximumLimit != ELASTICITYCONTROLLER_MAXIMUM_LIMIT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ElasticitycontrollerMinimumLimit: ");
		result.append(elasticitycontrollerMinimumLimit);
		result.append(", ElasticitycontrollerMaximumLimit: ");
		result.append(elasticitycontrollerMaximumLimit);
		result.append(')');
		return result.toString();
	}

} //ElasticitycontrollerImpl
