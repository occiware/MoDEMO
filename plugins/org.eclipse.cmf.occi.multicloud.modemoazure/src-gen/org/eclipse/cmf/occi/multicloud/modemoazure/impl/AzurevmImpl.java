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
package org.eclipse.cmf.occi.multicloud.modemoazure.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl;

import org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm;
import org.eclipse.cmf.occi.multicloud.modemoazure.ModemoazurePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Azurevm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoazure.impl.AzurevmImpl#getAzureVmazureId <em>Azure Vmazure Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoazure.impl.AzurevmImpl#getAzureVmazureImageID <em>Azure Vmazure Image ID</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoazure.impl.AzurevmImpl#getAzureVmazurePublicIP <em>Azure Vmazure Public IP</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoazure.impl.AzurevmImpl#getAzureVmazureSizeType <em>Azure Vmazure Size Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoazure.impl.AzurevmImpl#getAzureVmazureResourceGroup <em>Azure Vmazure Resource Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AzurevmImpl extends ComputeImpl implements Azurevm {
	/**
	 * The default value of the '{@link #getAzureVmazureId() <em>Azure Vmazure Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureVmazureId()
	 * @generated
	 * @ordered
	 */
	protected static final String AZURE_VMAZURE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAzureVmazureId() <em>Azure Vmazure Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureVmazureId()
	 * @generated
	 * @ordered
	 */
	protected String azureVmazureId = AZURE_VMAZURE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAzureVmazureImageID() <em>Azure Vmazure Image ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureVmazureImageID()
	 * @generated
	 * @ordered
	 */
	protected static final String AZURE_VMAZURE_IMAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAzureVmazureImageID() <em>Azure Vmazure Image ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureVmazureImageID()
	 * @generated
	 * @ordered
	 */
	protected String azureVmazureImageID = AZURE_VMAZURE_IMAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAzureVmazurePublicIP() <em>Azure Vmazure Public IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureVmazurePublicIP()
	 * @generated
	 * @ordered
	 */
	protected static final String AZURE_VMAZURE_PUBLIC_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAzureVmazurePublicIP() <em>Azure Vmazure Public IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureVmazurePublicIP()
	 * @generated
	 * @ordered
	 */
	protected String azureVmazurePublicIP = AZURE_VMAZURE_PUBLIC_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAzureVmazureSizeType() <em>Azure Vmazure Size Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureVmazureSizeType()
	 * @generated
	 * @ordered
	 */
	protected static final String AZURE_VMAZURE_SIZE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAzureVmazureSizeType() <em>Azure Vmazure Size Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureVmazureSizeType()
	 * @generated
	 * @ordered
	 */
	protected String azureVmazureSizeType = AZURE_VMAZURE_SIZE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAzureVmazureResourceGroup() <em>Azure Vmazure Resource Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureVmazureResourceGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String AZURE_VMAZURE_RESOURCE_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAzureVmazureResourceGroup() <em>Azure Vmazure Resource Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureVmazureResourceGroup()
	 * @generated
	 * @ordered
	 */
	protected String azureVmazureResourceGroup = AZURE_VMAZURE_RESOURCE_GROUP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AzurevmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModemoazurePackage.Literals.AZUREVM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAzureVmazureId() {
		return azureVmazureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureVmazureId(String newAzureVmazureId) {
		String oldAzureVmazureId = azureVmazureId;
		azureVmazureId = newAzureVmazureId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModemoazurePackage.AZUREVM__AZURE_VMAZURE_ID, oldAzureVmazureId, azureVmazureId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAzureVmazureImageID() {
		return azureVmazureImageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureVmazureImageID(String newAzureVmazureImageID) {
		String oldAzureVmazureImageID = azureVmazureImageID;
		azureVmazureImageID = newAzureVmazureImageID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModemoazurePackage.AZUREVM__AZURE_VMAZURE_IMAGE_ID, oldAzureVmazureImageID, azureVmazureImageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAzureVmazurePublicIP() {
		return azureVmazurePublicIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureVmazurePublicIP(String newAzureVmazurePublicIP) {
		String oldAzureVmazurePublicIP = azureVmazurePublicIP;
		azureVmazurePublicIP = newAzureVmazurePublicIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModemoazurePackage.AZUREVM__AZURE_VMAZURE_PUBLIC_IP, oldAzureVmazurePublicIP, azureVmazurePublicIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAzureVmazureSizeType() {
		return azureVmazureSizeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureVmazureSizeType(String newAzureVmazureSizeType) {
		String oldAzureVmazureSizeType = azureVmazureSizeType;
		azureVmazureSizeType = newAzureVmazureSizeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModemoazurePackage.AZUREVM__AZURE_VMAZURE_SIZE_TYPE, oldAzureVmazureSizeType, azureVmazureSizeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAzureVmazureResourceGroup() {
		return azureVmazureResourceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureVmazureResourceGroup(String newAzureVmazureResourceGroup) {
		String oldAzureVmazureResourceGroup = azureVmazureResourceGroup;
		azureVmazureResourceGroup = newAzureVmazureResourceGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModemoazurePackage.AZUREVM__AZURE_VMAZURE_RESOURCE_GROUP, oldAzureVmazureResourceGroup, azureVmazureResourceGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void poweroff() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemoazure/ecore!Azurevm!poweroff()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void restart() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemoazure/ecore!Azurevm!restart()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_ID:
				return getAzureVmazureId();
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_IMAGE_ID:
				return getAzureVmazureImageID();
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_PUBLIC_IP:
				return getAzureVmazurePublicIP();
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_SIZE_TYPE:
				return getAzureVmazureSizeType();
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_RESOURCE_GROUP:
				return getAzureVmazureResourceGroup();
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
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_ID:
				setAzureVmazureId((String)newValue);
				return;
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_IMAGE_ID:
				setAzureVmazureImageID((String)newValue);
				return;
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_PUBLIC_IP:
				setAzureVmazurePublicIP((String)newValue);
				return;
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_SIZE_TYPE:
				setAzureVmazureSizeType((String)newValue);
				return;
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_RESOURCE_GROUP:
				setAzureVmazureResourceGroup((String)newValue);
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
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_ID:
				setAzureVmazureId(AZURE_VMAZURE_ID_EDEFAULT);
				return;
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_IMAGE_ID:
				setAzureVmazureImageID(AZURE_VMAZURE_IMAGE_ID_EDEFAULT);
				return;
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_PUBLIC_IP:
				setAzureVmazurePublicIP(AZURE_VMAZURE_PUBLIC_IP_EDEFAULT);
				return;
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_SIZE_TYPE:
				setAzureVmazureSizeType(AZURE_VMAZURE_SIZE_TYPE_EDEFAULT);
				return;
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_RESOURCE_GROUP:
				setAzureVmazureResourceGroup(AZURE_VMAZURE_RESOURCE_GROUP_EDEFAULT);
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
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_ID:
				return AZURE_VMAZURE_ID_EDEFAULT == null ? azureVmazureId != null : !AZURE_VMAZURE_ID_EDEFAULT.equals(azureVmazureId);
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_IMAGE_ID:
				return AZURE_VMAZURE_IMAGE_ID_EDEFAULT == null ? azureVmazureImageID != null : !AZURE_VMAZURE_IMAGE_ID_EDEFAULT.equals(azureVmazureImageID);
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_PUBLIC_IP:
				return AZURE_VMAZURE_PUBLIC_IP_EDEFAULT == null ? azureVmazurePublicIP != null : !AZURE_VMAZURE_PUBLIC_IP_EDEFAULT.equals(azureVmazurePublicIP);
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_SIZE_TYPE:
				return AZURE_VMAZURE_SIZE_TYPE_EDEFAULT == null ? azureVmazureSizeType != null : !AZURE_VMAZURE_SIZE_TYPE_EDEFAULT.equals(azureVmazureSizeType);
			case ModemoazurePackage.AZUREVM__AZURE_VMAZURE_RESOURCE_GROUP:
				return AZURE_VMAZURE_RESOURCE_GROUP_EDEFAULT == null ? azureVmazureResourceGroup != null : !AZURE_VMAZURE_RESOURCE_GROUP_EDEFAULT.equals(azureVmazureResourceGroup);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModemoazurePackage.AZUREVM___POWEROFF:
				poweroff();
				return null;
			case ModemoazurePackage.AZUREVM___RESTART:
				restart();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (azureVmazureId: ");
		result.append(azureVmazureId);
		result.append(", azureVmazureImageID: ");
		result.append(azureVmazureImageID);
		result.append(", azureVmazurePublicIP: ");
		result.append(azureVmazurePublicIP);
		result.append(", azureVmazureSizeType: ");
		result.append(azureVmazureSizeType);
		result.append(", azureVmazureResourceGroup: ");
		result.append(azureVmazureResourceGroup);
		result.append(')');
		return result.toString();
	}

} //AzurevmImpl
