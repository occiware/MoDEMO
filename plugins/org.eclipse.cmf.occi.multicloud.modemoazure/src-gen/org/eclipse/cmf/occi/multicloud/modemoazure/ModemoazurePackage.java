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

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.modemoazure.ModemoazureFactory
 * @model kind="package"
 * @generated
 */
public interface ModemoazurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modemoazure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.cmf.occi.multicloud.modemoazure/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modemoazure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModemoazurePackage eINSTANCE = org.eclipse.cmf.occi.multicloud.modemoazure.impl.ModemoazurePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemoazure.impl.AzurevmImpl <em>Azurevm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemoazure.impl.AzurevmImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemoazure.impl.ModemoazurePackageImpl#getAzurevm()
	 * @generated
	 */
	int AZUREVM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__ID = InfrastructurePackage.COMPUTE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__TITLE = InfrastructurePackage.COMPUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__KIND = InfrastructurePackage.COMPUTE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__LOCATION = InfrastructurePackage.COMPUTE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__ATTRIBUTES = InfrastructurePackage.COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__MIXINS = InfrastructurePackage.COMPUTE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__PARTS = InfrastructurePackage.COMPUTE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__SUMMARY = InfrastructurePackage.COMPUTE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__LINKS = InfrastructurePackage.COMPUTE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__RLINKS = InfrastructurePackage.COMPUTE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__OCCI_COMPUTE_ARCHITECTURE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__OCCI_COMPUTE_CORES = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__OCCI_COMPUTE_HOSTNAME = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__OCCI_COMPUTE_SHARE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__OCCI_COMPUTE_SPEED = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__OCCI_COMPUTE_MEMORY = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__OCCI_COMPUTE_STATE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__OCCI_COMPUTE_STATE_MESSAGE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Azure Vmazure Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__AZURE_VMAZURE_ID = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Azure Vmazure Image ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__AZURE_VMAZURE_IMAGE_ID = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Azure Vmazure Public IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__AZURE_VMAZURE_PUBLIC_IP = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Azure Vmazure Size Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__AZURE_VMAZURE_SIZE_TYPE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Azure Vmazure Resource Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM__AZURE_VMAZURE_RESOURCE_GROUP = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Azurevm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM___OCCI_CREATE = InfrastructurePackage.COMPUTE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM___OCCI_RETRIEVE = InfrastructurePackage.COMPUTE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM___OCCI_UPDATE = InfrastructurePackage.COMPUTE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM___OCCI_DELETE = InfrastructurePackage.COMPUTE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM___START = InfrastructurePackage.COMPUTE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM___STOP__STOPMETHOD = InfrastructurePackage.COMPUTE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM___RESTART__RESTARTMETHOD = InfrastructurePackage.COMPUTE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM___SUSPEND__SUSPENDMETHOD = InfrastructurePackage.COMPUTE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM___SAVE__SAVEMETHOD_STRING = InfrastructurePackage.COMPUTE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Poweroff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM___POWEROFF = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM___RESTART = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Azurevm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZUREVM_OPERATION_COUNT = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm <em>Azurevm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Azurevm</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm
	 * @generated
	 */
	EClass getAzurevm();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#getAzureVmazureId <em>Azure Vmazure Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Vmazure Id</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#getAzureVmazureId()
	 * @see #getAzurevm()
	 * @generated
	 */
	EAttribute getAzurevm_AzureVmazureId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#getAzureVmazureImageID <em>Azure Vmazure Image ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Vmazure Image ID</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#getAzureVmazureImageID()
	 * @see #getAzurevm()
	 * @generated
	 */
	EAttribute getAzurevm_AzureVmazureImageID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#getAzureVmazurePublicIP <em>Azure Vmazure Public IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Vmazure Public IP</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#getAzureVmazurePublicIP()
	 * @see #getAzurevm()
	 * @generated
	 */
	EAttribute getAzurevm_AzureVmazurePublicIP();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#getAzureVmazureSizeType <em>Azure Vmazure Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Vmazure Size Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#getAzureVmazureSizeType()
	 * @see #getAzurevm()
	 * @generated
	 */
	EAttribute getAzurevm_AzureVmazureSizeType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#getAzureVmazureResourceGroup <em>Azure Vmazure Resource Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Vmazure Resource Group</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#getAzureVmazureResourceGroup()
	 * @see #getAzurevm()
	 * @generated
	 */
	EAttribute getAzurevm_AzureVmazureResourceGroup();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#poweroff() <em>Poweroff</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Poweroff</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#poweroff()
	 * @generated
	 */
	EOperation getAzurevm__Poweroff();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#restart() <em>Restart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Restart</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm#restart()
	 * @generated
	 */
	EOperation getAzurevm__Restart();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModemoazureFactory getModemoazureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemoazure.impl.AzurevmImpl <em>Azurevm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemoazure.impl.AzurevmImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemoazure.impl.ModemoazurePackageImpl#getAzurevm()
		 * @generated
		 */
		EClass AZUREVM = eINSTANCE.getAzurevm();

		/**
		 * The meta object literal for the '<em><b>Azure Vmazure Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AZUREVM__AZURE_VMAZURE_ID = eINSTANCE.getAzurevm_AzureVmazureId();

		/**
		 * The meta object literal for the '<em><b>Azure Vmazure Image ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AZUREVM__AZURE_VMAZURE_IMAGE_ID = eINSTANCE.getAzurevm_AzureVmazureImageID();

		/**
		 * The meta object literal for the '<em><b>Azure Vmazure Public IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AZUREVM__AZURE_VMAZURE_PUBLIC_IP = eINSTANCE.getAzurevm_AzureVmazurePublicIP();

		/**
		 * The meta object literal for the '<em><b>Azure Vmazure Size Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AZUREVM__AZURE_VMAZURE_SIZE_TYPE = eINSTANCE.getAzurevm_AzureVmazureSizeType();

		/**
		 * The meta object literal for the '<em><b>Azure Vmazure Resource Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AZUREVM__AZURE_VMAZURE_RESOURCE_GROUP = eINSTANCE.getAzurevm_AzureVmazureResourceGroup();

		/**
		 * The meta object literal for the '<em><b>Poweroff</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AZUREVM___POWEROFF = eINSTANCE.getAzurevm__Poweroff();

		/**
		 * The meta object literal for the '<em><b>Restart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AZUREVM___RESTART = eINSTANCE.getAzurevm__Restart();

	}

} //ModemoazurePackage
