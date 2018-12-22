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
package org.eclipse.cmf.occi.multicloud.modemoazure;

import org.eclipse.cmf.occi.infrastructure.Compute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Azurevm</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#getAzureVmazureId <em>Azure Vmazure Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#getAzureVmazureImageID <em>Azure Vmazure Image ID</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#getAzureVmazurePublicIP <em>Azure Vmazure Public IP</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#getAzureVmazureSizeType <em>Azure Vmazure Size Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#getAzureVmazureResourceGroup <em>Azure Vmazure Resource Group</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.modemoazure.ModemoazurePackage#getAzurevm()
 * @model
 * @generated
 */
public interface Azurevm extends Compute {
	/**
	 * Returns the value of the '<em><b>Azure Vmazure Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Azure Vmazure Id</em>' attribute.
	 * @see #setAzureVmazureId(String)
	 * @see org.eclipse.cmf.occi.multicloud.modemoazure.ModemoazurePackage#getAzurevm_AzureVmazureId()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemoazure/ecore!Azurevm!azureVmazureId'"
	 * @generated
	 */
	String getAzureVmazureId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#getAzureVmazureId <em>Azure Vmazure Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Vmazure Id</em>' attribute.
	 * @see #getAzureVmazureId()
	 * @generated
	 */
	void setAzureVmazureId(String value);

	/**
	 * Returns the value of the '<em><b>Azure Vmazure Image ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Azure Vmazure Image ID</em>' attribute.
	 * @see #setAzureVmazureImageID(String)
	 * @see org.eclipse.cmf.occi.multicloud.modemoazure.ModemoazurePackage#getAzurevm_AzureVmazureImageID()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemoazure/ecore!Azurevm!azureVmazureImageID'"
	 * @generated
	 */
	String getAzureVmazureImageID();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#getAzureVmazureImageID <em>Azure Vmazure Image ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Vmazure Image ID</em>' attribute.
	 * @see #getAzureVmazureImageID()
	 * @generated
	 */
	void setAzureVmazureImageID(String value);

	/**
	 * Returns the value of the '<em><b>Azure Vmazure Public IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Azure Vmazure Public IP</em>' attribute.
	 * @see #setAzureVmazurePublicIP(String)
	 * @see org.eclipse.cmf.occi.multicloud.modemoazure.ModemoazurePackage#getAzurevm_AzureVmazurePublicIP()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemoazure/ecore!Azurevm!azureVmazurePublicIP'"
	 * @generated
	 */
	String getAzureVmazurePublicIP();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#getAzureVmazurePublicIP <em>Azure Vmazure Public IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Vmazure Public IP</em>' attribute.
	 * @see #getAzureVmazurePublicIP()
	 * @generated
	 */
	void setAzureVmazurePublicIP(String value);

	/**
	 * Returns the value of the '<em><b>Azure Vmazure Size Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Azure Vmazure Size Type</em>' attribute.
	 * @see #setAzureVmazureSizeType(String)
	 * @see org.eclipse.cmf.occi.multicloud.modemoazure.ModemoazurePackage#getAzurevm_AzureVmazureSizeType()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemoazure/ecore!Azurevm!azureVmazureSizeType'"
	 * @generated
	 */
	String getAzureVmazureSizeType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#getAzureVmazureSizeType <em>Azure Vmazure Size Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Vmazure Size Type</em>' attribute.
	 * @see #getAzureVmazureSizeType()
	 * @generated
	 */
	void setAzureVmazureSizeType(String value);

	/**
	 * Returns the value of the '<em><b>Azure Vmazure Resource Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Azure Vmazure Resource Group</em>' attribute.
	 * @see #setAzureVmazureResourceGroup(String)
	 * @see org.eclipse.cmf.occi.multicloud.modemoazure.ModemoazurePackage#getAzurevm_AzureVmazureResourceGroup()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemoazure/ecore!Azurevm!azureVmazureResourceGroup'"
	 * @generated
	 */
	String getAzureVmazureResourceGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#getAzureVmazureResourceGroup <em>Azure Vmazure Resource Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Vmazure Resource Group</em>' attribute.
	 * @see #getAzureVmazureResourceGroup()
	 * @generated
	 */
	void setAzureVmazureResourceGroup(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemoazure/ecore!Azurevm!poweroff()'"
	 * @generated
	 */
	void poweroff();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemoazure/ecore!Azurevm!restart()'"
	 * @generated
	 */
	void restart();

} // Azurevm
