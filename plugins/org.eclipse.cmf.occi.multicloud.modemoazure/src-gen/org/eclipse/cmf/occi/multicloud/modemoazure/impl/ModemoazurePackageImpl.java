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

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm;
import org.eclipse.cmf.occi.multicloud.modemoazure.ModemoazureFactory;
import org.eclipse.cmf.occi.multicloud.modemoazure.ModemoazurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModemoazurePackageImpl extends EPackageImpl implements ModemoazurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass azurevmEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.cmf.occi.multicloud.modemoazure.ModemoazurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModemoazurePackageImpl() {
		super(eNS_URI, ModemoazureFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ModemoazurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModemoazurePackage init() {
		if (isInited) return (ModemoazurePackage)EPackage.Registry.INSTANCE.getEPackage(ModemoazurePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModemoazurePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModemoazurePackageImpl theModemoazurePackage = registeredModemoazurePackage instanceof ModemoazurePackageImpl ? (ModemoazurePackageImpl)registeredModemoazurePackage : new ModemoazurePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModemoazurePackage.createPackageContents();

		// Initialize created meta-data
		theModemoazurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModemoazurePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModemoazurePackage.eNS_URI, theModemoazurePackage);
		return theModemoazurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAzurevm() {
		return azurevmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAzurevm_AzureVmazureId() {
		return (EAttribute)azurevmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAzurevm_AzureVmazureImageID() {
		return (EAttribute)azurevmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAzurevm_AzureVmazurePublicIP() {
		return (EAttribute)azurevmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAzurevm_AzureVmazureSizeType() {
		return (EAttribute)azurevmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAzurevm_AzureVmazureResourceGroup() {
		return (EAttribute)azurevmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAzurevm__Poweroff() {
		return azurevmEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAzurevm__Restart() {
		return azurevmEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModemoazureFactory getModemoazureFactory() {
		return (ModemoazureFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		azurevmEClass = createEClass(AZUREVM);
		createEAttribute(azurevmEClass, AZUREVM__AZURE_VMAZURE_ID);
		createEAttribute(azurevmEClass, AZUREVM__AZURE_VMAZURE_IMAGE_ID);
		createEAttribute(azurevmEClass, AZUREVM__AZURE_VMAZURE_PUBLIC_IP);
		createEAttribute(azurevmEClass, AZUREVM__AZURE_VMAZURE_SIZE_TYPE);
		createEAttribute(azurevmEClass, AZUREVM__AZURE_VMAZURE_RESOURCE_GROUP);
		createEOperation(azurevmEClass, AZUREVM___POWEROFF);
		createEOperation(azurevmEClass, AZUREVM___RESTART);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		azurevmEClass.getESuperTypes().add(theInfrastructurePackage.getCompute());

		// Initialize classes, features, and operations; add parameters
		initEClass(azurevmEClass, Azurevm.class, "Azurevm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAzurevm_AzureVmazureId(), ecorePackage.getEString(), "azureVmazureId", null, 0, 1, Azurevm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAzurevm_AzureVmazureImageID(), ecorePackage.getEString(), "azureVmazureImageID", null, 0, 1, Azurevm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAzurevm_AzureVmazurePublicIP(), ecorePackage.getEString(), "azureVmazurePublicIP", null, 0, 1, Azurevm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAzurevm_AzureVmazureSizeType(), ecorePackage.getEString(), "azureVmazureSizeType", null, 0, 1, Azurevm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAzurevm_AzureVmazureResourceGroup(), ecorePackage.getEString(), "azureVmazureResourceGroup", null, 0, 1, Azurevm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAzurevm__Poweroff(), null, "poweroff", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAzurevm__Restart(), null, "restart", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

} //ModemoazurePackageImpl
