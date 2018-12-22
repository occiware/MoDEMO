/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *
 * Generated at Sat Nov 17 14:44:00 CET 2018 from platform:/resource/org.eclipse.cmf.occi.multicloud.modemoazure/model/modemoazure.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.modemoazure.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: modemoazure
 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemoazure#
 */
public class ConnectorFactory extends org.eclipse.cmf.occi.multicloud.modemoazure.impl.ModemoazureFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.modemoazure#
	 * - term: azurevm
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.modemoazure.Azurevm createAzurevm() {
		return new AzurevmConnector();
	}

}
