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
package org.eclipse.cmf.occi.multicloud.modemoec2;

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
 * @see org.eclipse.cmf.occi.multicloud.modemoec2.Modemoec2Factory
 * @model kind="package"
 * @generated
 */
public interface Modemoec2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modemoec2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.cmf.occi.multicloud.modemoec2/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modemoec2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Modemoec2Package eINSTANCE = org.eclipse.cmf.occi.multicloud.modemoec2.impl.Modemoec2PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemoec2.impl.Ec2Impl <em>Ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemoec2.impl.Ec2Impl
	 * @see org.eclipse.cmf.occi.multicloud.modemoec2.impl.Modemoec2PackageImpl#getEc2()
	 * @generated
	 */
	int EC2 = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__ID = InfrastructurePackage.COMPUTE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__TITLE = InfrastructurePackage.COMPUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__KIND = InfrastructurePackage.COMPUTE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__LOCATION = InfrastructurePackage.COMPUTE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__ATTRIBUTES = InfrastructurePackage.COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__MIXINS = InfrastructurePackage.COMPUTE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__PARTS = InfrastructurePackage.COMPUTE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__SUMMARY = InfrastructurePackage.COMPUTE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__LINKS = InfrastructurePackage.COMPUTE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__RLINKS = InfrastructurePackage.COMPUTE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__OCCI_COMPUTE_ARCHITECTURE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__OCCI_COMPUTE_CORES = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__OCCI_COMPUTE_HOSTNAME = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__OCCI_COMPUTE_SHARE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__OCCI_COMPUTE_SPEED = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__OCCI_COMPUTE_MEMORY = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__OCCI_COMPUTE_STATE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__OCCI_COMPUTE_STATE_MESSAGE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Aws Ec2instance Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__AWS_EC2INSTANCE_KEY = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aws Ec2instance Public IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__AWS_EC2INSTANCE_PUBLIC_IP = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aws Ec2instance AMI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__AWS_EC2INSTANCE_AMI = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aws Ec2instance SG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__AWS_EC2INSTANCE_SG = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Aws Ec2instance Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__AWS_EC2INSTANCE_INSTANCE_TYPE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Aws Ec2instance Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__AWS_EC2INSTANCE_INSTANCE_ID = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Aws Ec2instacne Dns Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__AWS_EC2INSTACNE_DNS_NAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Aws Ec2instance Private IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2__AWS_EC2INSTANCE_PRIVATE_IP = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2___OCCI_CREATE = InfrastructurePackage.COMPUTE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2___OCCI_RETRIEVE = InfrastructurePackage.COMPUTE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2___OCCI_UPDATE = InfrastructurePackage.COMPUTE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2___OCCI_DELETE = InfrastructurePackage.COMPUTE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2___START = InfrastructurePackage.COMPUTE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2___STOP__STOPMETHOD = InfrastructurePackage.COMPUTE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2___RESTART__RESTARTMETHOD = InfrastructurePackage.COMPUTE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2___SUSPEND__SUSPENDMETHOD = InfrastructurePackage.COMPUTE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2___SAVE__SAVEMETHOD_STRING = InfrastructurePackage.COMPUTE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2___RESTART = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2_OPERATION_COUNT = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2 <em>Ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ec2</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemoec2.Ec2
	 * @generated
	 */
	EClass getEc2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instanceKey <em>Aws Ec2instance Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aws Ec2instance Key</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instanceKey()
	 * @see #getEc2()
	 * @generated
	 */
	EAttribute getEc2_AwsEc2instanceKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instancePublicIP <em>Aws Ec2instance Public IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aws Ec2instance Public IP</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instancePublicIP()
	 * @see #getEc2()
	 * @generated
	 */
	EAttribute getEc2_AwsEc2instancePublicIP();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instanceAMI <em>Aws Ec2instance AMI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aws Ec2instance AMI</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instanceAMI()
	 * @see #getEc2()
	 * @generated
	 */
	EAttribute getEc2_AwsEc2instanceAMI();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instanceSG <em>Aws Ec2instance SG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aws Ec2instance SG</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instanceSG()
	 * @see #getEc2()
	 * @generated
	 */
	EAttribute getEc2_AwsEc2instanceSG();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instanceInstanceType <em>Aws Ec2instance Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aws Ec2instance Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instanceInstanceType()
	 * @see #getEc2()
	 * @generated
	 */
	EAttribute getEc2_AwsEc2instanceInstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instanceInstanceID <em>Aws Ec2instance Instance ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aws Ec2instance Instance ID</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instanceInstanceID()
	 * @see #getEc2()
	 * @generated
	 */
	EAttribute getEc2_AwsEc2instanceInstanceID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instacneDnsName <em>Aws Ec2instacne Dns Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aws Ec2instacne Dns Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instacneDnsName()
	 * @see #getEc2()
	 * @generated
	 */
	EAttribute getEc2_AwsEc2instacneDnsName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instancePrivateIP <em>Aws Ec2instance Private IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aws Ec2instance Private IP</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instancePrivateIP()
	 * @see #getEc2()
	 * @generated
	 */
	EAttribute getEc2_AwsEc2instancePrivateIP();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#restart() <em>Restart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Restart</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#restart()
	 * @generated
	 */
	EOperation getEc2__Restart();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Modemoec2Factory getModemoec2Factory();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemoec2.impl.Ec2Impl <em>Ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemoec2.impl.Ec2Impl
		 * @see org.eclipse.cmf.occi.multicloud.modemoec2.impl.Modemoec2PackageImpl#getEc2()
		 * @generated
		 */
		EClass EC2 = eINSTANCE.getEc2();

		/**
		 * The meta object literal for the '<em><b>Aws Ec2instance Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EC2__AWS_EC2INSTANCE_KEY = eINSTANCE.getEc2_AwsEc2instanceKey();

		/**
		 * The meta object literal for the '<em><b>Aws Ec2instance Public IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EC2__AWS_EC2INSTANCE_PUBLIC_IP = eINSTANCE.getEc2_AwsEc2instancePublicIP();

		/**
		 * The meta object literal for the '<em><b>Aws Ec2instance AMI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EC2__AWS_EC2INSTANCE_AMI = eINSTANCE.getEc2_AwsEc2instanceAMI();

		/**
		 * The meta object literal for the '<em><b>Aws Ec2instance SG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EC2__AWS_EC2INSTANCE_SG = eINSTANCE.getEc2_AwsEc2instanceSG();

		/**
		 * The meta object literal for the '<em><b>Aws Ec2instance Instance Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EC2__AWS_EC2INSTANCE_INSTANCE_TYPE = eINSTANCE.getEc2_AwsEc2instanceInstanceType();

		/**
		 * The meta object literal for the '<em><b>Aws Ec2instance Instance ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EC2__AWS_EC2INSTANCE_INSTANCE_ID = eINSTANCE.getEc2_AwsEc2instanceInstanceID();

		/**
		 * The meta object literal for the '<em><b>Aws Ec2instacne Dns Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EC2__AWS_EC2INSTACNE_DNS_NAME = eINSTANCE.getEc2_AwsEc2instacneDnsName();

		/**
		 * The meta object literal for the '<em><b>Aws Ec2instance Private IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EC2__AWS_EC2INSTANCE_PRIVATE_IP = eINSTANCE.getEc2_AwsEc2instancePrivateIP();

		/**
		 * The meta object literal for the '<em><b>Restart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EC2___RESTART = eINSTANCE.getEc2__Restart();

	}

} //Modemoec2Package
