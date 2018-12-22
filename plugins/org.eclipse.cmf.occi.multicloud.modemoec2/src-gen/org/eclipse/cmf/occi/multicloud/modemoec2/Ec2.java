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

import org.eclipse.cmf.occi.infrastructure.Compute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ec2</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instanceKey <em>Aws Ec2instance Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instancePublicIP <em>Aws Ec2instance Public IP</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instanceAMI <em>Aws Ec2instance AMI</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instanceSG <em>Aws Ec2instance SG</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instanceInstanceType <em>Aws Ec2instance Instance Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instanceInstanceID <em>Aws Ec2instance Instance ID</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instacneDnsName <em>Aws Ec2instacne Dns Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instancePrivateIP <em>Aws Ec2instance Private IP</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.modemoec2.Modemoec2Package#getEc2()
 * @model
 * @generated
 */
public interface Ec2 extends Compute {
	/**
	 * Returns the value of the '<em><b>Aws Ec2instance Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aws Ec2instance Key</em>' attribute.
	 * @see #setAwsEc2instanceKey(String)
	 * @see org.eclipse.cmf.occi.multicloud.modemoec2.Modemoec2Package#getEc2_AwsEc2instanceKey()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemoec2/ecore!Ec2!awsEc2instanceKey'"
	 * @generated
	 */
	String getAwsEc2instanceKey();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instanceKey <em>Aws Ec2instance Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aws Ec2instance Key</em>' attribute.
	 * @see #getAwsEc2instanceKey()
	 * @generated
	 */
	void setAwsEc2instanceKey(String value);

	/**
	 * Returns the value of the '<em><b>Aws Ec2instance Public IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aws Ec2instance Public IP</em>' attribute.
	 * @see #setAwsEc2instancePublicIP(String)
	 * @see org.eclipse.cmf.occi.multicloud.modemoec2.Modemoec2Package#getEc2_AwsEc2instancePublicIP()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemoec2/ecore!Ec2!awsEc2instancePublicIP'"
	 * @generated
	 */
	String getAwsEc2instancePublicIP();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instancePublicIP <em>Aws Ec2instance Public IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aws Ec2instance Public IP</em>' attribute.
	 * @see #getAwsEc2instancePublicIP()
	 * @generated
	 */
	void setAwsEc2instancePublicIP(String value);

	/**
	 * Returns the value of the '<em><b>Aws Ec2instance AMI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aws Ec2instance AMI</em>' attribute.
	 * @see #setAwsEc2instanceAMI(String)
	 * @see org.eclipse.cmf.occi.multicloud.modemoec2.Modemoec2Package#getEc2_AwsEc2instanceAMI()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemoec2/ecore!Ec2!awsEc2instanceAMI'"
	 * @generated
	 */
	String getAwsEc2instanceAMI();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instanceAMI <em>Aws Ec2instance AMI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aws Ec2instance AMI</em>' attribute.
	 * @see #getAwsEc2instanceAMI()
	 * @generated
	 */
	void setAwsEc2instanceAMI(String value);

	/**
	 * Returns the value of the '<em><b>Aws Ec2instance SG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aws Ec2instance SG</em>' attribute.
	 * @see #setAwsEc2instanceSG(String)
	 * @see org.eclipse.cmf.occi.multicloud.modemoec2.Modemoec2Package#getEc2_AwsEc2instanceSG()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemoec2/ecore!Ec2!awsEc2instanceSG'"
	 * @generated
	 */
	String getAwsEc2instanceSG();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instanceSG <em>Aws Ec2instance SG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aws Ec2instance SG</em>' attribute.
	 * @see #getAwsEc2instanceSG()
	 * @generated
	 */
	void setAwsEc2instanceSG(String value);

	/**
	 * Returns the value of the '<em><b>Aws Ec2instance Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aws Ec2instance Instance Type</em>' attribute.
	 * @see #setAwsEc2instanceInstanceType(String)
	 * @see org.eclipse.cmf.occi.multicloud.modemoec2.Modemoec2Package#getEc2_AwsEc2instanceInstanceType()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemoec2/ecore!Ec2!awsEc2instanceInstanceType'"
	 * @generated
	 */
	String getAwsEc2instanceInstanceType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instanceInstanceType <em>Aws Ec2instance Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aws Ec2instance Instance Type</em>' attribute.
	 * @see #getAwsEc2instanceInstanceType()
	 * @generated
	 */
	void setAwsEc2instanceInstanceType(String value);

	/**
	 * Returns the value of the '<em><b>Aws Ec2instance Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aws Ec2instance Instance ID</em>' attribute.
	 * @see #setAwsEc2instanceInstanceID(String)
	 * @see org.eclipse.cmf.occi.multicloud.modemoec2.Modemoec2Package#getEc2_AwsEc2instanceInstanceID()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemoec2/ecore!Ec2!awsEc2instanceInstanceID'"
	 * @generated
	 */
	String getAwsEc2instanceInstanceID();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instanceInstanceID <em>Aws Ec2instance Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aws Ec2instance Instance ID</em>' attribute.
	 * @see #getAwsEc2instanceInstanceID()
	 * @generated
	 */
	void setAwsEc2instanceInstanceID(String value);

	/**
	 * Returns the value of the '<em><b>Aws Ec2instacne Dns Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aws Ec2instacne Dns Name</em>' attribute.
	 * @see #setAwsEc2instacneDnsName(String)
	 * @see org.eclipse.cmf.occi.multicloud.modemoec2.Modemoec2Package#getEc2_AwsEc2instacneDnsName()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemoec2/ecore!Ec2!awsEc2instacneDnsName'"
	 * @generated
	 */
	String getAwsEc2instacneDnsName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instacneDnsName <em>Aws Ec2instacne Dns Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aws Ec2instacne Dns Name</em>' attribute.
	 * @see #getAwsEc2instacneDnsName()
	 * @generated
	 */
	void setAwsEc2instacneDnsName(String value);

	/**
	 * Returns the value of the '<em><b>Aws Ec2instance Private IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aws Ec2instance Private IP</em>' attribute.
	 * @see #setAwsEc2instancePrivateIP(String)
	 * @see org.eclipse.cmf.occi.multicloud.modemoec2.Modemoec2Package#getEc2_AwsEc2instancePrivateIP()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemoec2/ecore!Ec2!awsEc2instancePrivateIP'"
	 * @generated
	 */
	String getAwsEc2instancePrivateIP();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemoec2.Ec2#getAwsEc2instancePrivateIP <em>Aws Ec2instance Private IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aws Ec2instance Private IP</em>' attribute.
	 * @see #getAwsEc2instancePrivateIP()
	 * @generated
	 */
	void setAwsEc2instancePrivateIP(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemoec2/ecore!Ec2!restart()'"
	 * @generated
	 */
	void restart();

} // Ec2
