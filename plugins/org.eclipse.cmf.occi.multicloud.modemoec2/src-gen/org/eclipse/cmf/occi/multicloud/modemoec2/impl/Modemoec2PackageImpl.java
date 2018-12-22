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
package org.eclipse.cmf.occi.multicloud.modemoec2.impl;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.cmf.occi.multicloud.modemoec2.Ec2;
import org.eclipse.cmf.occi.multicloud.modemoec2.Modemoec2Factory;
import org.eclipse.cmf.occi.multicloud.modemoec2.Modemoec2Package;

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
public class Modemoec2PackageImpl extends EPackageImpl implements Modemoec2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ec2EClass = null;

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
	 * @see org.eclipse.cmf.occi.multicloud.modemoec2.Modemoec2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Modemoec2PackageImpl() {
		super(eNS_URI, Modemoec2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Modemoec2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Modemoec2Package init() {
		if (isInited) return (Modemoec2Package)EPackage.Registry.INSTANCE.getEPackage(Modemoec2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredModemoec2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Modemoec2PackageImpl theModemoec2Package = registeredModemoec2Package instanceof Modemoec2PackageImpl ? (Modemoec2PackageImpl)registeredModemoec2Package : new Modemoec2PackageImpl();

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModemoec2Package.createPackageContents();

		// Initialize created meta-data
		theModemoec2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModemoec2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Modemoec2Package.eNS_URI, theModemoec2Package);
		return theModemoec2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEc2() {
		return ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEc2_AwsEc2instanceKey() {
		return (EAttribute)ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEc2_AwsEc2instancePublicIP() {
		return (EAttribute)ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEc2_AwsEc2instanceAMI() {
		return (EAttribute)ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEc2_AwsEc2instanceSG() {
		return (EAttribute)ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEc2_AwsEc2instanceInstanceType() {
		return (EAttribute)ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEc2_AwsEc2instanceInstanceID() {
		return (EAttribute)ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEc2_AwsEc2instacneDnsName() {
		return (EAttribute)ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEc2_AwsEc2instancePrivateIP() {
		return (EAttribute)ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEc2__Restart() {
		return ec2EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modemoec2Factory getModemoec2Factory() {
		return (Modemoec2Factory)getEFactoryInstance();
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
		ec2EClass = createEClass(EC2);
		createEAttribute(ec2EClass, EC2__AWS_EC2INSTANCE_KEY);
		createEAttribute(ec2EClass, EC2__AWS_EC2INSTANCE_PUBLIC_IP);
		createEAttribute(ec2EClass, EC2__AWS_EC2INSTANCE_AMI);
		createEAttribute(ec2EClass, EC2__AWS_EC2INSTANCE_SG);
		createEAttribute(ec2EClass, EC2__AWS_EC2INSTANCE_INSTANCE_TYPE);
		createEAttribute(ec2EClass, EC2__AWS_EC2INSTANCE_INSTANCE_ID);
		createEAttribute(ec2EClass, EC2__AWS_EC2INSTACNE_DNS_NAME);
		createEAttribute(ec2EClass, EC2__AWS_EC2INSTANCE_PRIVATE_IP);
		createEOperation(ec2EClass, EC2___RESTART);
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
		ec2EClass.getESuperTypes().add(theInfrastructurePackage.getCompute());

		// Initialize classes, features, and operations; add parameters
		initEClass(ec2EClass, Ec2.class, "Ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEc2_AwsEc2instanceKey(), ecorePackage.getEString(), "awsEc2instanceKey", null, 0, 1, Ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEc2_AwsEc2instancePublicIP(), ecorePackage.getEString(), "awsEc2instancePublicIP", null, 0, 1, Ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEc2_AwsEc2instanceAMI(), ecorePackage.getEString(), "awsEc2instanceAMI", null, 0, 1, Ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEc2_AwsEc2instanceSG(), ecorePackage.getEString(), "awsEc2instanceSG", null, 0, 1, Ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEc2_AwsEc2instanceInstanceType(), ecorePackage.getEString(), "awsEc2instanceInstanceType", null, 0, 1, Ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEc2_AwsEc2instanceInstanceID(), ecorePackage.getEString(), "awsEc2instanceInstanceID", null, 0, 1, Ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEc2_AwsEc2instacneDnsName(), ecorePackage.getEString(), "awsEc2instacneDnsName", null, 0, 1, Ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEc2_AwsEc2instancePrivateIP(), ecorePackage.getEString(), "awsEc2instancePrivateIP", null, 0, 1, Ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEc2__Restart(), null, "restart", 0, 1, IS_UNIQUE, IS_ORDERED);

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

} //Modemoec2PackageImpl
